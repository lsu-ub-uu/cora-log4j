/*
 * Copyright 2019 Uppsala University Library
 *
 * This file is part of Cora.
 *
 *     Cora is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Cora is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Cora.  If not, see <http://www.gnu.org/licenses/>.
 */

package se.uu.ub.cora.log4j;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.uu.ub.cora.logger.Logger;
import se.uu.ub.cora.logger.LoggerFactory;

public class Cora4jLoggerFactoryTest {
	private LoggerFactory factory;

	@BeforeMethod
	public void beforeMethod() {
		factory = new Cora4jLoggerFactory();
	}

	@Test
	public void testLoggerFactory() throws Exception {
		Logger logger = factory.factorForClass(String.class);
		assertTrue(logger instanceof Cora4jLogger);
	}

	@Test
	public void testLoggerContainsLog4jLogger() throws Exception {
		Cora4jLogger logger = (Cora4jLogger) factory.factorForClass(Integer.class);
		assertTrue(logger.getLog4jLogger() instanceof org.apache.logging.log4j.Logger);
	}

	@Test
	public void testLoggerContainsLog4jLoggerForEnteredClass() throws Exception {
		Cora4jLogger logger = (Cora4jLogger) factory.factorForClass(Integer.class);
		org.apache.logging.log4j.Logger log4jLogger = logger.getLog4jLogger();
		String name = log4jLogger.getName();
		assertEquals(name, "java.lang.Integer");
	}

	@Test
	public void testSameLoggerIsReturnedForMultipleFactorCalls() throws Exception {
		Cora4jLogger logger = (Cora4jLogger) factory.factorForClass(Integer.class);
		Cora4jLogger logger2 = (Cora4jLogger) factory.factorForClass(Integer.class);
		Cora4jLogger logger3 = (Cora4jLogger) factory.factorForClass(Integer.class);
		assertSame(logger, logger2);
		assertSame(logger2, logger3);
	}

	@Test
	public void testDifferentLoggerIsReturnedForDifferentClassnames() throws Exception {
		Cora4jLogger logger = (Cora4jLogger) factory.factorForClass(Integer.class);
		Cora4jLogger logger2 = (Cora4jLogger) factory.factorForClass(String.class);
		assertNotSame(logger, logger2);
	}

}
