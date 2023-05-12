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

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.FlowMessageFactory;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

public class Log4jLoggerSpy implements Logger {

	public List<String> fatalMessages = new ArrayList<>();
	public List<Throwable> fatalThrowables = new ArrayList<>();

	public List<String> errorMessages = new ArrayList<>();
	public List<Throwable> errorThrowables = new ArrayList<>();

	public List<String> warnMessages = new ArrayList<>();
	public List<Throwable> warnThrowables = new ArrayList<>();

	public List<String> infoMessages = new ArrayList<>();

	public List<String> debugMessages = new ArrayList<>();
	boolean debugEnabled = false;

	public List<String> traceMessages = new ArrayList<>();
	boolean traceEnabled = false;

	@Override
	public void catching(Level level, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void catching(Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message) {
		debugMessages.add(message);
	}

	@Override
	public void debug(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void entry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void entry(Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message) {
		errorMessages.add(message);
	}

	@Override
	public void error(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Throwable t) {
		errorMessages.add(message);
		errorThrowables.add(t);
	}

	@Override
	public void error(Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

	@Override
	public <R> R exit(R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fatal(Marker marker, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Message msg) {
		// TODO Auto-generated method stub
	}

	@Override
	public void fatal(Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message) {
		fatalMessages.add(message);
	}

	@Override
	public void fatal(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Throwable t) {
		fatalMessages.add(message);
		fatalThrowables.add(t);
	}

	@Override
	public void fatal(Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public Level getLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <MF extends MessageFactory> MF getMessageFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void info(Marker marker, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message) {
		infoMessages.add(message);
	}

	@Override
	public void info(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return debugEnabled;
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(Level level) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(Level level, Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFatalEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFatalEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTraceEnabled() {
		return traceEnabled;
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void log(Level level, Marker marker, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2,
			Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2,
			Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2,
			Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2,
			Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2,
			Object p3, Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2,
			Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2,
			Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printf(Level level, Marker marker, String format, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printf(Level level, String format, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends Throwable> T throwing(Level level, T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Throwable> T throwing(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trace(Marker marker, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message) {
		traceMessages.add(message);
	}

	@Override
	public void trace(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public EntryMessage traceEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(String format, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(String format, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traceExit() {
		// TODO Auto-generated method stub

	}

	@Override
	public <R> R traceExit(R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R traceExit(String format, R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traceExit(EntryMessage message) {
		// TODO Auto-generated method stub

	}

	@Override
	public <R> R traceExit(EntryMessage message, R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R traceExit(Message message, R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void warn(Marker marker, Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Message msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Message msg, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(MessageSupplier msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(MessageSupplier msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(CharSequence message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Object message, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message) {
		warnMessages.add(message);
	}

	@Override
	public void warn(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Throwable t) {
		warnMessages.add(message);
		warnThrowables.add(t);
	}

	@Override
	public void warn(Supplier<?> msgSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Supplier<?> msgSupplier, Throwable t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3,
			Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public FlowMessageFactory getFlowMessageFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
