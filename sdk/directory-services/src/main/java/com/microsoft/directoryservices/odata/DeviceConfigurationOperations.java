/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.directoryservices.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.directoryservices.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type DeviceConfigurationOperations.
 */
public class DeviceConfigurationOperations extends DirectoryObjectOperations {

     /**
      * Instantiates a new DeviceConfigurationOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public DeviceConfigurationOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public DeviceConfigurationOperations addParameter(String name, Object value) {
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
    public DeviceConfigurationOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }


}