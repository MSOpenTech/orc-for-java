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
 * The type  FolderFetcher.
 */
public class FolderFetcher extends ODataEntityFetcher<Folder,FolderOperations> 
                                     implements Readable<Folder> {

     /**
     * Instantiates a new FolderFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public FolderFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Folder.class, FolderOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public FolderFetcher addParameter(String name, Object value) {
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
    public FolderFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets child folders.
     *
     * @return the child folders
     */
    public ODataCollectionFetcher<Folder, FolderFetcher, FolderCollectionOperations> getChildFolders() {
        return new ODataCollectionFetcher<Folder, FolderFetcher, FolderCollectionOperations>("ChildFolders", this, Folder.class, FolderCollectionOperations.class);
    }

    /**
     * Gets child folder.
     *
     * @return the child folder
     */
    public FolderFetcher getChildFolder(String id){
         return new ODataCollectionFetcher<Folder, FolderFetcher, FolderCollectionOperations>("ChildFolders", this, Folder.class, FolderCollectionOperations.class).getById(id);
    }

     /**
     * Gets messages.
     *
     * @return the messages
     */
    public ODataCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations> getMessages() {
        return new ODataCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations>("Messages", this, Message.class, MessageCollectionOperations.class);
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public MessageFetcher getMessage(String id){
         return new ODataCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations>("Messages", this, Message.class, MessageCollectionOperations.class).getById(id);
    }

}
