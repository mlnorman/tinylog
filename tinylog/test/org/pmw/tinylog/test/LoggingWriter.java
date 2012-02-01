/*
 * Copyright 2012 Martin Winandy
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.pmw.tinylog.test;

import org.pmw.tinylog.ELoggingLevel;
import org.pmw.tinylog.ILoggingWriter;

/**
 * A logging writer that just save the written log entry as string.
 */
class LoggingWriter implements ILoggingWriter {

	private String entry;

	/** */
	public LoggingWriter() {
	}

	@Override
	public final void write(final ELoggingLevel level, final String logEntry) {
		entry = logEntry;
	}

	/**
	 * Consume the last written log entry and remove it.
	 * 
	 * @return The last log entry
	 */
	public String consumeEntry() {
		String copy = entry;
		entry = null;
		return copy;
	}

}