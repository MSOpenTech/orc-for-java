/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.discoveryservices.odata;

import com.microsoft.discoveryservices.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.DependencyResolver;

/**
 * The type DiscoveryClient.
 */
public class DiscoveryClient extends BaseODataContainer {

     /**
     * Instantiates a new DiscoveryClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public DiscoveryClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public DiscoveryClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public DiscoveryClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets ServiceInfo.
     *
     * @return the ServiceInfo
     */
    public ODataCollectionFetcher<ServiceInfo, ServiceInfoFetcher, ServiceInfoCollectionOperations> getallServices() {
        return new ODataCollectionFetcher<ServiceInfo, ServiceInfoFetcher, ServiceInfoCollectionOperations>("allServices", this, ServiceInfo.class,ServiceInfoCollectionOperations.class);
    }
     /**
     * Gets ServiceInfo.
     *
     * @return the ServiceInfo
     */
    public ODataCollectionFetcher<ServiceInfo, ServiceInfoFetcher, ServiceInfoCollectionOperations> getservices() {
        return new ODataCollectionFetcher<ServiceInfo, ServiceInfoFetcher, ServiceInfoCollectionOperations>("services", this, ServiceInfo.class,ServiceInfoCollectionOperations.class);
    }
}