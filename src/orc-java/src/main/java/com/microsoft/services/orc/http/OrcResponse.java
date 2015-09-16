package com.microsoft.services.orc.http;

import java.io.IOException;
import java.io.InputStream;

/**
 * The interface OrcResponse.
 */
public interface OrcResponse {

    /**
     * Get payload.
     *
     * @return the byte [ ]
     */
    byte[] getPayload() throws IOException;

    /**
     * Gets response.
     *
     * @return the response
     */
    Response getResponse();

    /**
     * Opens a streamed response.
     *
     * @return the stream
     */
    InputStream openStreamedResponse();

    /**
     * Closes the streamed response
     * @throws IOException
     */
    void closeStreamedResponse() throws IOException;
}
