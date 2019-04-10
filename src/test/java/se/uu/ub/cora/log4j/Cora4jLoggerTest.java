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
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertSame;

import java.util.function.Supplier;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.uu.ub.cora.logger.Logger;

public class Cora4jLoggerTest {
	private Log4jLoggerSpy log4jSpy;
	private Cora4jLogger cora4jLogger;

	@BeforeMethod
	public void beforeMethod() {
		log4jSpy = new Log4jLoggerSpy();
		cora4jLogger = Cora4jLogger.usingLog4jLogger(log4jSpy);
	}

	@Test
	public void testInit() throws Exception {
		Logger logger = Cora4jLogger.usingLog4jLogger(log4jSpy);
		assertNotNull(logger);
	}

	@Test
	public void testGetLogger() throws Exception {
		org.apache.logging.log4j.Logger log = cora4jLogger.getLog4jLogger();
		assertSame(log, log4jSpy);
	}

	@Test
	public void testLogFatalUsingMessage() throws Exception {
		cora4jLogger.logFatalUsingMessage("some message");
		assertEquals(log4jSpy.fatalMessages.get(0), "some message");
	}

	@Test
	public void testLogFatalUsingMessageAndExcepiton() throws Exception {
		Exception e = new RuntimeException("some error");
		cora4jLogger.logFatalUsingMessageAndException("some message", e);
		assertEquals(log4jSpy.fatalMessages.get(0), "some message");
		assertSame(log4jSpy.fatalThrowables.get(0), e);
	}

	@Test
	public void testLogErrorUsingMessage() throws Exception {
		cora4jLogger.logErrorUsingMessage("some message");
		assertEquals(log4jSpy.errorMessages.get(0), "some message");
	}

	@Test
	public void testLogErrorUsingMessageAndExcepiton() throws Exception {
		Exception e = new RuntimeException("some error");
		cora4jLogger.logErrorUsingMessageAndException("some message", e);
		assertEquals(log4jSpy.errorMessages.get(0), "some message");
		assertSame(log4jSpy.errorThrowables.get(0), e);
	}

	@Test
	public void testLogWarnUsingMessage() throws Exception {
		cora4jLogger.logWarnUsingMessage("some message");
		assertEquals(log4jSpy.warnMessages.get(0), "some message");
	}

	@Test
	public void testLogWarnUsingMessageAndExcepiton() throws Exception {
		Exception e = new RuntimeException("some warning");
		cora4jLogger.logWarnUsingMessageAndException("some message", e);
		assertEquals(log4jSpy.warnMessages.get(0), "some message");
		assertSame(log4jSpy.warnThrowables.get(0), e);
	}

	@Test
	public void testLogInfoUsingMessage() throws Exception {
		cora4jLogger.logInfoUsingMessage("some message");
		assertEquals(log4jSpy.infoMessages.get(0), "some message");
	}

	@Test
	public void testLogDebugUsingMessage() throws Exception {
		cora4jLogger.logDebugUsingMessage("some message");
		assertEquals(log4jSpy.debugMessages.get(0), "some message");
	}

	@Test
	public void testLogDebugUsingMessageSupplierWhenDebugIsFalse() throws Exception {
		log4jSpy.debugEnabled = false;
		Supplier<String> supplier = () -> ("A test supplier message");
		cora4jLogger.logDebugUsingMessageSupplier(supplier);
		assertEquals(log4jSpy.debugMessages.size(), 0);
	}

	@Test
	public void testLogDebugUsingMessageSupplierWhenDebugIsTrue() throws Exception {
		log4jSpy.debugEnabled = true;
		Supplier<String> supplier = () -> ("A test supplier message");
		cora4jLogger.logDebugUsingMessageSupplier(supplier);
		assertEquals(log4jSpy.debugMessages.get(0), "A test supplier message");
	}

	@Test
	public void testLogTraceUsingMessage() throws Exception {
		cora4jLogger.logTraceUsingMessage("some message");
		assertEquals(log4jSpy.traceMessages.get(0), "some message");
	}

	@Test
	public void testLogTraceUsingMessageSupplierWhenTraceIsFalse() throws Exception {
		log4jSpy.traceEnabled = false;
		Supplier<String> supplier = () -> ("A test supplier message");
		cora4jLogger.logTraceUsingMessageSupplier(supplier);
		assertEquals(log4jSpy.traceMessages.size(), 0);
	}

	@Test
	public void testLogTraceUsingMessageSupplierWhenTraceIsTrue() throws Exception {
		log4jSpy.traceEnabled = true;
		Supplier<String> supplier = () -> ("A test supplier message");
		cora4jLogger.logTraceUsingMessageSupplier(supplier);
		assertEquals(log4jSpy.traceMessages.get(0), "A test supplier message");
	}
}
