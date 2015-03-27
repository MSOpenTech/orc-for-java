/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices.odata;

import com.microsoft.outlookservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type ItemAttachmentOperations.
 */
public class ItemAttachmentOperations extends AttachmentOperations {

     /**
      * Instantiates a new ItemAttachmentOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public ItemAttachmentOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ItemAttachmentOperations addParameter(String name, Object value) {
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
    public ItemAttachmentOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

}
