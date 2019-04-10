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

import java.util.function.Supplier;

import se.uu.ub.cora.logger.Logger;

public class Cora4jLogger implements Logger {

	private org.apache.logging.log4j.Logger log4jLogger;

	public static Cora4jLogger usingLog4jLogger(org.apache.logging.log4j.Logger log4jLogger) {
		return new Cora4jLogger(log4jLogger);
	}

	private Cora4jLogger(org.apache.logging.log4j.Logger log4jLogger) {
		this.log4jLogger = log4jLogger;
	}

	@Override
	public void logFatalUsingMessage(String message) {
		log4jLogger.fatal(message);
	}

	@Override
	public void logFatalUsingMessageAndException(String message, Exception exception) {
		log4jLogger.fatal(message, exception);

	}

	@Override
	public void logErrorUsingMessage(String message) {
		log4jLogger.error(message);
	}

	@Override
	public void logErrorUsingMessageAndException(String message, Exception exception) {
		log4jLogger.error(message, exception);
	}

	@Override
	public void logWarnUsingMessage(String message) {
		log4jLogger.warn(message);
	}

	@Override
	public void logWarnUsingMessageAndException(String message, Exception exception) {
		log4jLogger.warn(message, exception);

	}

	@Override
	public void logInfoUsingMessage(String message) {
		log4jLogger.info(message);
	}

	@Override
	public void logDebugUsingMessage(String message) {
		log4jLogger.debug(message);
	}

	@Override
	public void logDebugUsingMessageSupplier(Supplier<String> messageSupplier) {
		if (log4jLogger.isDebugEnabled()) {
			log4jLogger.debug(messageSupplier.get());
		}
	}

	@Override
	public void logTraceUsingMessage(String message) {
		log4jLogger.trace(message);
	}

	@Override
	public void logTraceUsingMessageSupplier(Supplier<String> messageSupplier) {
		if (log4jLogger.isTraceEnabled()) {
			log4jLogger.trace(messageSupplier.get());
		}
	}

	org.apache.logging.log4j.Logger getLog4jLogger() {
		return log4jLogger;
	}

}
