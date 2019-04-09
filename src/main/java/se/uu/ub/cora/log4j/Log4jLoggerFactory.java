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

import java.text.MessageFormat;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;

import se.uu.ub.cora.logger.Logger;
import se.uu.ub.cora.logger.LoggerFactory;

public class Log4jLoggerFactory implements LoggerFactory {

	@Override
	public Logger factorForClass(Class<? extends Object> javaClass) {
		// TODO Auto-generated method stub
		org.apache.logging.log4j.Logger log4jLogger = LogManager.getLogger(javaClass);
		// log4jLogger.fatal("Bla bla {} bla bla", () -> getString());
		// log4jLogger.fatal("Bla bla {} bla bla", () -> getInt());
		//
		// String x = lamnda("", () -> getString());
		// String x2 = lamnda("", () -> getInt());
		String pattern = "bla bla {1} bla {0}";
		MessageFormat mf = new MessageFormat(pattern);
		Object[] testArgs = { "trams1", 2345 };
		String result = mf.format(testArgs);
		Object[] testArgs2 = { "trams1" };
		String result2 = mf.format(testArgs2);
		return null;
	}

	private String lamnda(String string, Supplier<?> trams) {
		// TODO Auto-generated method stub
		// return string.concat(trams.get());
		return "";
	}

	// private String lamnda(String string, Object object) {
	// // // TODO Auto-generated method stub
	// return null;
	// }

	private String getString() {
		return "stringyyy";
	}

	private int getInt() {
		return 2342;
	}

}
