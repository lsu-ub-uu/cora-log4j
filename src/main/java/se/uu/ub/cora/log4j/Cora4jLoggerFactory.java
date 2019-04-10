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

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;

import se.uu.ub.cora.logger.Logger;
import se.uu.ub.cora.logger.LoggerFactory;

public class Cora4jLoggerFactory implements LoggerFactory {
	private static Map<String, Logger> startedLoggers = new HashMap<>();

	@Override
	public Logger factorForClass(Class<? extends Object> javaClass) {
		String className = javaClass.getName();
		ensureLoggerIsFactored(javaClass, className);
		return startedLoggers.get(className);
	}

	private static void ensureLoggerIsFactored(Class<? extends Object> javaClass,
			String className) {
		if (!startedLoggers.containsKey(className)) {
			Cora4jLogger log4jLogger = createCora4jLoggerUsingClass(javaClass);
			startedLoggers.put(className, log4jLogger);
		}
	}

	private static Cora4jLogger createCora4jLoggerUsingClass(Class<? extends Object> javaClass) {
		org.apache.logging.log4j.Logger log4j = LogManager.getLogger(javaClass);
		return Cora4jLogger.usingLog4jLogger(log4j);
	}
}
