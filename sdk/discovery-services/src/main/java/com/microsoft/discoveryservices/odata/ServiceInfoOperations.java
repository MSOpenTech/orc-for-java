/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.discoveryservices.odata;

import com.microsoft.discoveryservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type ServiceInfoOperations.
 */
public class ServiceInfoOperations extends ODataOperations {

     /**
      * Instantiates a new ServiceInfoOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public ServiceInfoOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ServiceInfoOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ServiceInfoOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

}
