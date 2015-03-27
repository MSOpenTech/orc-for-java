/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices;

/**
 * The type User.
*/
public class User extends Entity {

    public User(){
        setODataType("#Microsoft.OutlookServices.User");
    }
            
    private String DisplayName;
     
    /**
    * Gets the Display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.DisplayName; 
    }

    /**
    * Sets the Display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.DisplayName = value; 
    }
            
    private String Alias;
     
    /**
    * Gets the Alias.
    *
    * @return the String
    */
    public String getAlias() {
        return this.Alias; 
    }

    /**
    * Sets the Alias.
    *
    * @param value the String
    */
    public void setAlias(String value) { 
        this.Alias = value; 
    }
            
    private java.util.UUID MailboxGuid;
     
    /**
    * Gets the Mailbox Guid.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getMailboxGuid() {
        return this.MailboxGuid; 
    }

    /**
    * Sets the Mailbox Guid.
    *
    * @param value the java.util.UUID
    */
    public void setMailboxGuid(java.util.UUID value) { 
        this.MailboxGuid = value; 
    }
    
    private java.util.List<Folder> Folders = new java.util.ArrayList<Folder>();
     
    /**
    * Gets the Folders.
    *
    * @return the java.util.List<Folder>
    */
    public java.util.List<Folder> getFolders() {
        return this.Folders; 
    }

    /**
    * Sets the Folders.
    *
    * @param value the java.util.List<Folder>
    */
    public void setFolders(java.util.List<Folder> value) { 
        this.Folders = value; 
    }
    
    private java.util.List<Message> Messages = new java.util.ArrayList<Message>();
     
    /**
    * Gets the Messages.
    *
    * @return the java.util.List<Message>
    */
    public java.util.List<Message> getMessages() {
        return this.Messages; 
    }

    /**
    * Sets the Messages.
    *
    * @param value the java.util.List<Message>
    */
    public void setMessages(java.util.List<Message> value) { 
        this.Messages = value; 
    }
            
    private Folder RootFolder;
     
    /**
    * Gets the Root Folder.
    *
    * @return the Folder
    */
    public Folder getRootFolder() {
        return this.RootFolder; 
    }

    /**
    * Sets the Root Folder.
    *
    * @param value the Folder
    */
    public void setRootFolder(Folder value) { 
        this.RootFolder = value; 
    }
    
    private java.util.List<Calendar> Calendars = new java.util.ArrayList<Calendar>();
     
    /**
    * Gets the Calendars.
    *
    * @return the java.util.List<Calendar>
    */
    public java.util.List<Calendar> getCalendars() {
        return this.Calendars; 
    }

    /**
    * Sets the Calendars.
    *
    * @param value the java.util.List<Calendar>
    */
    public void setCalendars(java.util.List<Calendar> value) { 
        this.Calendars = value; 
    }
            
    private Calendar Calendar;
     
    /**
    * Gets the Calendar.
    *
    * @return the Calendar
    */
    public Calendar getCalendar() {
        return this.Calendar; 
    }

    /**
    * Sets the Calendar.
    *
    * @param value the Calendar
    */
    public void setCalendar(Calendar value) { 
        this.Calendar = value; 
    }
    
    private java.util.List<CalendarGroup> CalendarGroups = new java.util.ArrayList<CalendarGroup>();
     
    /**
    * Gets the Calendar Groups.
    *
    * @return the java.util.List<CalendarGroup>
    */
    public java.util.List<CalendarGroup> getCalendarGroups() {
        return this.CalendarGroups; 
    }

    /**
    * Sets the Calendar Groups.
    *
    * @param value the java.util.List<CalendarGroup>
    */
    public void setCalendarGroups(java.util.List<CalendarGroup> value) { 
        this.CalendarGroups = value; 
    }
    
    private java.util.List<Event> Events = new java.util.ArrayList<Event>();
     
    /**
    * Gets the Events.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getEvents() {
        return this.Events; 
    }

    /**
    * Sets the Events.
    *
    * @param value the java.util.List<Event>
    */
    public void setEvents(java.util.List<Event> value) { 
        this.Events = value; 
    }
    
    private java.util.List<Event> CalendarView = new java.util.ArrayList<Event>();
     
    /**
    * Gets the Calendar View.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getCalendarView() {
        return this.CalendarView; 
    }

    /**
    * Sets the Calendar View.
    *
    * @param value the java.util.List<Event>
    */
    public void setCalendarView(java.util.List<Event> value) { 
        this.CalendarView = value; 
    }
    
    private java.util.List<Contact> Contacts = new java.util.ArrayList<Contact>();
     
    /**
    * Gets the Contacts.
    *
    * @return the java.util.List<Contact>
    */
    public java.util.List<Contact> getContacts() {
        return this.Contacts; 
    }

    /**
    * Sets the Contacts.
    *
    * @param value the java.util.List<Contact>
    */
    public void setContacts(java.util.List<Contact> value) { 
        this.Contacts = value; 
    }
    
    private java.util.List<ContactFolder> ContactFolders = new java.util.ArrayList<ContactFolder>();
     
    /**
    * Gets the Contact Folders.
    *
    * @return the java.util.List<ContactFolder>
    */
    public java.util.List<ContactFolder> getContactFolders() {
        return this.ContactFolders; 
    }

    /**
    * Sets the Contact Folders.
    *
    * @param value the java.util.List<ContactFolder>
    */
    public void setContactFolders(java.util.List<ContactFolder> value) { 
        this.ContactFolders = value; 
    }
}

