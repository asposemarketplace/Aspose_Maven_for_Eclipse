/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 *
 * LICENSE: This program is free software; you can redistribute it
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not,
 * see http://opensource.org/licenses/gpl-3.0.html
 *
 * @author Adeel Ilyas <adeel.ilyas@aspose.com>
 *
 */

package com.aspose.eclipse.maven.apis.artifacts;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.aspose.maven.apis.artifacts package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.aspose.maven.apis.artifacts
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Metadata.Versioning.Versions }
	 */
	public Metadata.Versioning.Versions createMetadataVersioningVersions() {
		return new Metadata.Versioning.Versions();
	}

	/**
	 * Create an instance of {@link Metadata }
	 */
	public Metadata createMetadata() {
		return new Metadata();
	}

	/**
	 * Create an instance of {@link Metadata.Versioning }
	 */
	public Metadata.Versioning createMetadataVersioning() {
		return new Metadata.Versioning();
	}

}
