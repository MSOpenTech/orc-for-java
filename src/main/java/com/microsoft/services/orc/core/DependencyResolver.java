package com.microsoft.services.orc.core;

import com.microsoft.services.orc.http.Credentials;
import com.microsoft.services.orc.http.HttpTransport;
import com.microsoft.services.orc.http.OrcURL;
import com.microsoft.services.orc.http.Request;
import com.microsoft.services.orc.log.Logger;
import com.microsoft.services.orc.serialization.JsonSerializer;

/**
 * The interface Dependency resolver.
 */
public interface DependencyResolver {
    /**
     * Gets http transport.
     *
     * @return the http transport
     */
    HttpTransport getHttpTransport();

    /**
     * Gets logger.
     *
     * @return the logger
     */
    Logger getLogger();

    /**
     * Gets json serializer.
     *
     * @return the json serializer
     */
    JsonSerializer getJsonSerializer();

    /**
     * Create o data uRL.
     *
     * @return the o data uRL
     */
    OrcURL createODataURL();

    /**
     * Create request.
     *
     * @return the request
     */
    Request createRequest();

    /**
     * Gets the user agent for a specific platform
     * @param productName the product name
     * @return the user agent
     */
    String getPlatformUserAgent(String productName);

    /**
     * Gets credentials.
     *
     * @return the credentials
     */
    Credentials getCredentials();
}
