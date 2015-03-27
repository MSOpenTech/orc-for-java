/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.directoryservices.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.directoryservices.*; 
import com.microsoft.directoryservices.*;       

/**
 * The type  DeviceConfigurationFetcher.
 */
public class DeviceConfigurationFetcher extends ODataEntityFetcher<DeviceConfiguration,DeviceConfigurationOperations> 
                                     implements Readable<DeviceConfiguration> {

     /**
     * Instantiates a new DeviceConfigurationFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public DeviceConfigurationFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, DeviceConfiguration.class, DeviceConfigurationOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DeviceConfigurationFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DeviceConfigurationFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    	}