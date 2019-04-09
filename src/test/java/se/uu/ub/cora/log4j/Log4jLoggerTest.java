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

import static org.testng.Assert.assertSame;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.uu.ub.cora.logger.Logger;

public class Log4jLoggerTest {
	private Log4jLoggerSpy log4jLogger;
	private Log4jLogger logger;

	@BeforeMethod
	public void beforeMethod() {
		log4jLogger = new Log4jLoggerSpy();
		logger = Log4jLogger.usingLog4jLogger(log4jLogger);
	}

	@Test
	public void testInit() throws Exception {
		org.apache.logging.log4j.Logger log4jLogger = new Log4jLoggerSpy();
		Logger logger = Log4jLogger.usingLog4jLogger(log4jLogger);
	}

	@Test
	public void testGetLogger() throws Exception {
		org.apache.logging.log4j.Logger log = logger.getLog4jLogger();
		assertSame(log, log4jLogger);
	}
}
