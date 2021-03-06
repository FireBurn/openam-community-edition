/**
 * Copyright 2013 ForgeRock, AS.
 *
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 */
package org.forgerock.openam.cts.impl.query;

import org.forgerock.openam.guice.InjectorHolder;

/**
 * Responsible for generating instances of a QueryBuilder to perform queries against
 * the LDAP connection.
 *
 * @author robert.wapshott@forgerock.com
 */
public class QueryFactory {
    /**
     * Generate an instance of the QueryBuilder.
     *
     * @return A non null instance of the QueryBuilder.
     */
    public QueryBuilder createInstance() {
        return InjectorHolder.getInstance(QueryBuilder.class);
    }

    /**
     * Generate an instance of the QueryFilter for use with the QueryBuilder.
     *
     * @return A non null QueryFilter instance.
     */
    public QueryFilter createFilter() {
        return InjectorHolder.getInstance(QueryFilter.class);
    }
}
