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
 * The type  UserFetcher.
 */
public class UserFetcher extends ODataEntityFetcher<User,UserOperations> 
                                     implements Readable<User> {

     /**
     * Instantiates a new UserFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public UserFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, User.class, UserOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public UserFetcher addParameter(String name, Object value) {
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
    public UserFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets folders.
     *
     * @return the folders
     */
    public ODataCollectionFetcher<Folder, FolderFetcher, FolderCollectionOperations> getFolders() {
        return new ODataCollectionFetcher<Folder, FolderFetcher, FolderCollectionOperations>("Folders", this, Folder.class, FolderCollectionOperations.class);
    }

    /**
     * Gets folder.
     *
     * @return the folder
     */
    public FolderFetcher getFolder(String id){
         return new ODataCollectionFetcher<Folder, FolderFetcher, FolderCollectionOperations>("Folders", this, Folder.class, FolderCollectionOperations.class).getById(id);
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
     /**
     * Gets rootfolder.
     *
     * @return the root folder
     */
    public FolderFetcher getRootFolder() {
        return new FolderFetcher("RootFolder", this);
    }

     /**
     * Gets calendars.
     *
     * @return the calendars
     */
    public ODataCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations> getCalendars() {
        return new ODataCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations>("Calendars", this, Calendar.class, CalendarCollectionOperations.class);
    }

    /**
     * Gets calendar.
     *
     * @return the calendar
     */
    public CalendarFetcher getCalendar(String id){
         return new ODataCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations>("Calendars", this, Calendar.class, CalendarCollectionOperations.class).getById(id);
    }
     /**
     * Gets calendar.
     *
     * @return the calendar
     */
    public CalendarFetcher getCalendar() {
        return new CalendarFetcher("Calendar", this);
    }

     /**
     * Gets calendar groups.
     *
     * @return the calendar groups
     */
    public ODataCollectionFetcher<CalendarGroup, CalendarGroupFetcher, CalendarGroupCollectionOperations> getCalendarGroups() {
        return new ODataCollectionFetcher<CalendarGroup, CalendarGroupFetcher, CalendarGroupCollectionOperations>("CalendarGroups", this, CalendarGroup.class, CalendarGroupCollectionOperations.class);
    }

    /**
     * Gets calendar group.
     *
     * @return the calendar group
     */
    public CalendarGroupFetcher getCalendarGroup(String id){
         return new ODataCollectionFetcher<CalendarGroup, CalendarGroupFetcher, CalendarGroupCollectionOperations>("CalendarGroups", this, CalendarGroup.class, CalendarGroupCollectionOperations.class).getById(id);
    }

     /**
     * Gets events.
     *
     * @return the events
     */
    public ODataCollectionFetcher<Event, EventFetcher, EventCollectionOperations> getEvents() {
        return new ODataCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("Events", this, Event.class, EventCollectionOperations.class);
    }

    /**
     * Gets event.
     *
     * @return the event
     */
    public EventFetcher getEvent(String id){
         return new ODataCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("Events", this, Event.class, EventCollectionOperations.class).getById(id);
    }

     /**
     * Gets calendar view.
     *
     * @return the calendar view
     */
    public ODataCollectionFetcher<Event, EventFetcher, EventCollectionOperations> getCalendarView() {
        return new ODataCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("CalendarView", this, Event.class, EventCollectionOperations.class);
    }

    /**
     * Gets calendar view.
     *
     * @return the calendar view
     */
    public EventFetcher getCalendarView(String id){
         return new ODataCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("CalendarView", this, Event.class, EventCollectionOperations.class).getById(id);
    }

     /**
     * Gets contacts.
     *
     * @return the contacts
     */
    public ODataCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations> getContacts() {
        return new ODataCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations>("Contacts", this, Contact.class, ContactCollectionOperations.class);
    }

    /**
     * Gets contact.
     *
     * @return the contact
     */
    public ContactFetcher getContact(String id){
         return new ODataCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations>("Contacts", this, Contact.class, ContactCollectionOperations.class).getById(id);
    }

     /**
     * Gets contact folders.
     *
     * @return the contact folders
     */
    public ODataCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations> getContactFolders() {
        return new ODataCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations>("ContactFolders", this, ContactFolder.class, ContactFolderCollectionOperations.class);
    }

    /**
     * Gets contact folder.
     *
     * @return the contact folder
     */
    public ContactFolderFetcher getContactFolder(String id){
         return new ODataCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations>("ContactFolders", this, ContactFolder.class, ContactFolderCollectionOperations.class).getById(id);
    }

}
