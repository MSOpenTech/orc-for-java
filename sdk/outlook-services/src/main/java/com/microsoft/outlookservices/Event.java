/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices;

/**
 * The type Event.
*/
public class Event extends Item {

    public Event(){
        setODataType("#Microsoft.OutlookServices.Event");
    }
            
    private String Subject;
     
    /**
    * Gets the Subject.
    *
    * @return the String
    */
    public String getSubject() {
        return this.Subject; 
    }

    /**
    * Sets the Subject.
    *
    * @param value the String
    */
    public void setSubject(String value) { 
        this.Subject = value; 
    }
            
    private ItemBody Body;
     
    /**
    * Gets the Body.
    *
    * @return the ItemBody
    */
    public ItemBody getBody() {
        return this.Body; 
    }

    /**
    * Sets the Body.
    *
    * @param value the ItemBody
    */
    public void setBody(ItemBody value) { 
        this.Body = value; 
    }
            
    private String BodyPreview;
     
    /**
    * Gets the Body Preview.
    *
    * @return the String
    */
    public String getBodyPreview() {
        return this.BodyPreview; 
    }

    /**
    * Sets the Body Preview.
    *
    * @param value the String
    */
    public void setBodyPreview(String value) { 
        this.BodyPreview = value; 
    }
            
    private Importance Importance;
     
    /**
    * Gets the Importance.
    *
    * @return the Importance
    */
    public Importance getImportance() {
        return this.Importance; 
    }

    /**
    * Sets the Importance.
    *
    * @param value the Importance
    */
    public void setImportance(Importance value) { 
        this.Importance = value; 
    }
            
    private Boolean HasAttachments;
     
    /**
    * Gets the Has Attachments.
    *
    * @return the Boolean
    */
    public Boolean getHasAttachments() {
        return this.HasAttachments; 
    }

    /**
    * Sets the Has Attachments.
    *
    * @param value the Boolean
    */
    public void setHasAttachments(Boolean value) { 
        this.HasAttachments = value; 
    }
            
    private java.util.Calendar Start;
     
    /**
    * Gets the Start.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getStart() {
        return this.Start; 
    }

    /**
    * Sets the Start.
    *
    * @param value the java.util.Calendar
    */
    public void setStart(java.util.Calendar value) { 
        this.Start = value; 
    }
            
    private java.util.Calendar End;
     
    /**
    * Gets the End.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getEnd() {
        return this.End; 
    }

    /**
    * Sets the End.
    *
    * @param value the java.util.Calendar
    */
    public void setEnd(java.util.Calendar value) { 
        this.End = value; 
    }
            
    private Location Location;
     
    /**
    * Gets the Location.
    *
    * @return the Location
    */
    public Location getLocation() {
        return this.Location; 
    }

    /**
    * Sets the Location.
    *
    * @param value the Location
    */
    public void setLocation(Location value) { 
        this.Location = value; 
    }
            
    private FreeBusyStatus ShowAs;
     
    /**
    * Gets the Show As.
    *
    * @return the FreeBusyStatus
    */
    public FreeBusyStatus getShowAs() {
        return this.ShowAs; 
    }

    /**
    * Sets the Show As.
    *
    * @param value the FreeBusyStatus
    */
    public void setShowAs(FreeBusyStatus value) { 
        this.ShowAs = value; 
    }
            
    private Boolean IsAllDay;
     
    /**
    * Gets the Is All Day.
    *
    * @return the Boolean
    */
    public Boolean getIsAllDay() {
        return this.IsAllDay; 
    }

    /**
    * Sets the Is All Day.
    *
    * @param value the Boolean
    */
    public void setIsAllDay(Boolean value) { 
        this.IsAllDay = value; 
    }
            
    private Boolean IsCancelled;
     
    /**
    * Gets the Is Cancelled.
    *
    * @return the Boolean
    */
    public Boolean getIsCancelled() {
        return this.IsCancelled; 
    }

    /**
    * Sets the Is Cancelled.
    *
    * @param value the Boolean
    */
    public void setIsCancelled(Boolean value) { 
        this.IsCancelled = value; 
    }
            
    private Boolean IsOrganizer;
     
    /**
    * Gets the Is Organizer.
    *
    * @return the Boolean
    */
    public Boolean getIsOrganizer() {
        return this.IsOrganizer; 
    }

    /**
    * Sets the Is Organizer.
    *
    * @param value the Boolean
    */
    public void setIsOrganizer(Boolean value) { 
        this.IsOrganizer = value; 
    }
            
    private Boolean ResponseRequested;
     
    /**
    * Gets the Response Requested.
    *
    * @return the Boolean
    */
    public Boolean getResponseRequested() {
        return this.ResponseRequested; 
    }

    /**
    * Sets the Response Requested.
    *
    * @param value the Boolean
    */
    public void setResponseRequested(Boolean value) { 
        this.ResponseRequested = value; 
    }
            
    private EventType Type;
     
    /**
    * Gets the Type.
    *
    * @return the EventType
    */
    public EventType getType() {
        return this.Type; 
    }

    /**
    * Sets the Type.
    *
    * @param value the EventType
    */
    public void setType(EventType value) { 
        this.Type = value; 
    }
            
    private String SeriesMasterId;
     
    /**
    * Gets the Series Master Id.
    *
    * @return the String
    */
    public String getSeriesMasterId() {
        return this.SeriesMasterId; 
    }

    /**
    * Sets the Series Master Id.
    *
    * @param value the String
    */
    public void setSeriesMasterId(String value) { 
        this.SeriesMasterId = value; 
    }
    
    private java.util.List<Attendee> Attendees = new java.util.ArrayList<Attendee>();
     
    /**
    * Gets the Attendees.
    *
    * @return the java.util.List<Attendee>
    */
    public java.util.List<Attendee> getAttendees() {
        return this.Attendees; 
    }

    /**
    * Sets the Attendees.
    *
    * @param value the java.util.List<Attendee>
    */
    public void setAttendees(java.util.List<Attendee> value) { 
        this.Attendees = value; 
    }
            
    private PatternedRecurrence Recurrence;
     
    /**
    * Gets the Recurrence.
    *
    * @return the PatternedRecurrence
    */
    public PatternedRecurrence getRecurrence() {
        return this.Recurrence; 
    }

    /**
    * Sets the Recurrence.
    *
    * @param value the PatternedRecurrence
    */
    public void setRecurrence(PatternedRecurrence value) { 
        this.Recurrence = value; 
    }
            
    private Recipient Organizer;
     
    /**
    * Gets the Organizer.
    *
    * @return the Recipient
    */
    public Recipient getOrganizer() {
        return this.Organizer; 
    }

    /**
    * Sets the Organizer.
    *
    * @param value the Recipient
    */
    public void setOrganizer(Recipient value) { 
        this.Organizer = value; 
    }
    
    private java.util.List<Attachment> Attachments = new java.util.ArrayList<Attachment>();
     
    /**
    * Gets the Attachments.
    *
    * @return the java.util.List<Attachment>
    */
    public java.util.List<Attachment> getAttachments() {
        return this.Attachments; 
    }

    /**
    * Sets the Attachments.
    *
    * @param value the java.util.List<Attachment>
    */
    public void setAttachments(java.util.List<Attachment> value) { 
        this.Attachments = value; 
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
    
    private java.util.List<Event> Instances = new java.util.ArrayList<Event>();
     
    /**
    * Gets the Instances.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getInstances() {
        return this.Instances; 
    }

    /**
    * Sets the Instances.
    *
    * @param value the java.util.List<Event>
    */
    public void setInstances(java.util.List<Event> value) { 
        this.Instances = value; 
    }
}

