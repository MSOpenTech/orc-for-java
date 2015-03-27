/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices.odata;

import com.microsoft.outlookservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;

/**
 * The type  ItemAttachmentFetcher.
 */
public class ItemAttachmentFetcher extends ODataEntityFetcher<ItemAttachment,ItemAttachmentOperations> 
                                     implements Readable<ItemAttachment> {

     /**
     * Instantiates a new ItemAttachmentFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ItemAttachmentFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, ItemAttachment.class, ItemAttachmentOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ItemAttachmentFetcher addParameter(String name, Object value) {
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
    public ItemAttachmentFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

             /**
     * Gets item.
     *
     * @return the item
     */
    public ItemFetcher getItem() {
        return new ItemFetcher("Item", this);
    }

}
