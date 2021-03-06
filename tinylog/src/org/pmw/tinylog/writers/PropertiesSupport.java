/*
 * Copyright 2013 Martin Winandy
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

package org.pmw.tinylog.writers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation makes a {@link org.pmw.tinylog.writers.Writer Writer} configurable by properties.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PropertiesSupport {

	/**
	 * Name of the writer that can be used for the "tinylog.writer" property.
	 *
	 * @return Name of writer
	 */
	String name();

	/**
	 * Properties to configure the writer (for example a filename of the log file). The constructor of the writer will
	 * be called according to the defined properties.
	 *
	 * @return Configurable properties 
	 */
	Property[] properties();

}
