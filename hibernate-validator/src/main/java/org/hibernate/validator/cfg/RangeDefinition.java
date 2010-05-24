// $Id$
/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and/or its affiliates, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hibernate.validator.cfg;

import java.lang.annotation.ElementType;
import javax.validation.Payload;

import org.hibernate.validator.constraints.Range;

/**
 * @author Hardy Ferentschik
 */
public class RangeDefinition extends ConstraintDefinition<Range> {

	public RangeDefinition(Class<?> beanType, String property, ElementType elementType, ConstraintMapping mapping) {
		super( beanType, Range.class, property, elementType, mapping );
	}

	public RangeDefinition message(String message) {
		addParameter( "message", message );
		return this;
	}

	public RangeDefinition groups(Class<?>... groups) {
		addParameter( "groups", groups );
		return this;
	}

	public RangeDefinition payload(Class<? extends Payload>... payload) {
		addParameter( "payload", payload );
		return this;
	}

	public RangeDefinition min(long min) {
		addParameter( "value", min );
		return this;
	}

	public RangeDefinition max(long max) {
		addParameter( "value", max );
		return this;
	}
}