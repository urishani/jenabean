/* CVS $Id: $ */
package test; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*; 
/**
 * Vocabulary definitions from file:src/test/ical.owl 
 * @author Auto-generated by schemagen on 27 Nov 2007 21:45 
 */
public class Vocabulary {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.w3.org/2002/12/cal/ical#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The property provides the capability to associate a document object with a 
     *  calendar component.default value type: URI</p>
     */
    public static final ObjectProperty attach = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#attach" );
    
    /** <p>value type: CAL-ADDRESSThe property defines the organizer for a calendar component.</p> */
    public static final ObjectProperty organizer = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#organizer" );
    
    /** <p>value type: DATE-TIMEThe property indicates the date/time that the instance 
     *  of the iCalendar object was created.</p>
     */
    public static final ObjectProperty dtstamp = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#dtstamp" );
    
    /** <p>value type: URIThe TZURL provides a means for a VTIMEZONE component to point 
     *  to a network location that can be used to retrieve an up-to- date version 
     *  of itself.</p>
     */
    public static final ObjectProperty tzurl = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#tzurl" );
    
    /** <p>This property specifies the date and time that the calendar information was 
     *  created by the calendar user agent in the calendar store. Note: This is analogous 
     *  to the creation date and time for a file in the file system.value type: DATE-TIME</p>
     */
    public static final ObjectProperty created = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#created" );
    
    /** <p>value type: DATE-TIMEThis property defines the date and time that a to-do 
     *  was actually completed.</p>
     */
    public static final ObjectProperty completed = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#completed" );
    
    /** <p>This property specifies the date and time that a calendar component ends.default 
     *  value type: DATE-TIME</p>
     */
    public static final ObjectProperty dtend = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#dtend" );
    
    /** <p>value type: RECURThis property defines a rule or repeating pattern for recurring 
     *  events, to-dos, or time zone definitions.</p>
     */
    public static final ObjectProperty rrule = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#rrule" );
    
    /** <p>The property defines an "Attendee" within a calendar component.value type: 
     *  CAL-ADDRESS</p>
     */
    public static final ObjectProperty attendee = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#attendee" );
    
    /** <p>The property defines one or more free or busy time intervals.value type: PERIOD</p> */
    public static final ObjectProperty freebusy = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#freebusy" );
    
    /** <p>default value type: DATE-TIMEThis property is used in conjunction with the 
     *  "UID" and "SEQUENCE" property to identify a specific instance of a recurring 
     *  "VEVENT", "VTODO" or "VJOURNAL" calendar component. The property value is 
     *  the effective value of the "DTSTART" property of the recurrence instance.</p>
     */
    public static final ObjectProperty recurrenceId = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#recurrenceId" );
    
    /** <p>This property defines the list of date/time exceptions for a recurring calendar 
     *  component.default value type: DATE-TIME</p>
     */
    public static final ObjectProperty exdate = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#exdate" );
    
    /** <p>value type: list of FLOATThis property specifies information related to the 
     *  global position for the activity specified by a calendar component.</p>
     */
    public static final ObjectProperty geo = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#geo" );
    
    /** <p>This property defines the list of date/times for a recurrence set.default 
     *  value type: DATE-TIME</p>
     */
    public static final ObjectProperty rdate = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#rdate" );
    
    /** <p>value type: DURATIONThe property specifies a positive duration of time.</p> */
    public static final ObjectProperty duration = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#duration" );
    
    /** <p>This property defines a Uniform Resource Locator (URL) associated with the 
     *  iCalendar object.value type: URI</p>
     */
    public static final ObjectProperty url = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#url" );
    
    /** <p>value type: DATE-TIMEThe property specifies the date and time that the information 
     *  associated with the calendar component was last revised in the calendar store. 
     *  Note: This is analogous to the modification date and time for a file in the 
     *  file system.</p>
     */
    public static final ObjectProperty lastModified = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#lastModified" );
    
    /** <p>default value type: DATE-TIMEThis property defines the date and time that 
     *  a to-do is expected to be completed.</p>
     */
    public static final ObjectProperty due = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#due" );
    
    /** <p>This property specifies when an alarm will trigger.default value type: DURATION</p> */
    public static final ObjectProperty trigger = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#trigger" );
    
    /** <p>default value type: DATE-TIMEThis property specifies when the calendar component 
     *  begins.</p>
     */
    public static final ObjectProperty dtstart = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#dtstart" );
    
    /** <p>value type: RECURThis property defines a rule or repeating pattern for an 
     *  exception to a recurrence set.</p>
     */
    public static final ObjectProperty exrule = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal/ical#exrule" );
    
    /** <p>value type: UTC-OFFSETThis property specifies the offset which is in use prior 
     *  to this time zone observance.</p>
     */
    public static final DatatypeProperty tzoffsetfrom = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#tzoffsetfrom" );
    
    /** <p>The property defines the intended venue for the activity defined by a calendar 
     *  component.value type: TEXT</p>
     */
    public static final DatatypeProperty location = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#location" );
    
    /** <p>value type: INTEGERThe property defines the relative priority for a calendar 
     *  component.</p>
     */
    public static final DatatypeProperty priority = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#priority" );
    
    /** <p>This property defines the equipment or resources anticipated for an activity 
     *  specified by a calendar entity..value type: TEXT</p>
     */
    public static final DatatypeProperty resources = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#resources" );
    
    /** <p>This property provides a more complete description of the calendar component, 
     *  than that provided by the "SUMMARY" property.value type: TEXT</p>
     */
    public static final DatatypeProperty description = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#description" );
    
    /** <p>This property specifies the text value that uniquely identifies the "VTIMEZONE" 
     *  calendar component.value type: TEXT</p>
     */
    public static final DatatypeProperty tzid = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#tzid" );
    
    /** <p>This property defines the access classification for a calendar component.value 
     *  type: TEXT</p>
     */
    public static final DatatypeProperty class_ = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#class" );
    
    /** <p>This property defines the number of time the alarm should be repeated, after 
     *  the initial trigger.value type: INTEGER</p>
     */
    public static final DatatypeProperty repeat = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#repeat" );
    
    /** <p>This class of property provides a framework for defining non-standard properties.value 
     *  type: TEXT</p>
     */
    public static final DatatypeProperty X_ = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#X-" );
    
    /** <p>This property defines a short summary or subject for the calendar component.value 
     *  type: TEXT</p>
     */
    public static final DatatypeProperty summary = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#summary" );
    
    /** <p>This property defines the iCalendar object method associated with the calendar 
     *  object.value type: TEXT</p>
     */
    public static final DatatypeProperty method = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#method" );
    
    /** <p>This property defines the action to be invoked when an alarm is triggered.value 
     *  type: TEXT</p>
     */
    public static final DatatypeProperty action = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#action" );
    
    /** <p>This property specifies non-processing information intended to provide a comment 
     *  to the calendar user.value type: TEXT</p>
     */
    public static final DatatypeProperty comment = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#comment" );
    
    /** <p>value type: TEXTThis property specifies the customary designation for a time 
     *  zone description.</p>
     */
    public static final DatatypeProperty tzname = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#tzname" );
    
    /** <p>This property specifies the offset which is in use in this time zone observance.value 
     *  type: UTC-OFFSET</p>
     */
    public static final DatatypeProperty tzoffsetto = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#tzoffsetto" );
    
    /** <p>value type: INTEGERThis property is used by an assignee or delegatee of a 
     *  to-do to convey the percent completion of a to-do to the Organizer.</p>
     */
    public static final DatatypeProperty percentComplete = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#percentComplete" );
    
    /** <p>value type: TEXTThis property defines the calendar scale used for the calendar 
     *  information specified in the iCalendar object.</p>
     */
    public static final DatatypeProperty calscale = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#calscale" );
    
    /** <p>This property defines the status code returned for a scheduling request.value 
     *  type: TEXT</p>
     */
    public static final DatatypeProperty requestStatus = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#requestStatus" );
    
    /** <p>The property is used to represent a relationship or reference between one 
     *  calendar component and another.value type: TEXT</p>
     */
    public static final DatatypeProperty relatedTo = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#relatedTo" );
    
    /** <p>This property specifies the identifier for the product that created the iCalendar 
     *  object.value type: TEXT</p>
     */
    public static final DatatypeProperty prodid = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#prodid" );
    
    /** <p>The property is used to represent contact information or alternately a reference 
     *  to contact information associated with the calendar component.value type: 
     *  TEXT</p>
     */
    public static final DatatypeProperty contact = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#contact" );
    
    /** <p>This property defines whether an event is transparent or not to busy time 
     *  searches.value type: TEXT</p>
     */
    public static final DatatypeProperty transp = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#transp" );
    
    /** <p>This property defines the persistent, globally unique identifier for the calendar 
     *  component.value type: TEXT</p>
     */
    public static final DatatypeProperty uid = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#uid" );
    
    /** <p>value type: integerThis property defines the revision sequence number of the 
     *  calendar component within a sequence of revisions.</p>
     */
    public static final DatatypeProperty sequence = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#sequence" );
    
    /** <p>This property defines the overall status or confirmation for the calendar 
     *  component.value type: TEXT</p>
     */
    public static final DatatypeProperty status = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#status" );
    
    /** <p>This property specifies the identifier corresponding to the highest version 
     *  number or the minimum and maximum range of the iCalendar specification that 
     *  is required in order to interpret the iCalendar object.value type: TEXT</p>
     */
    public static final DatatypeProperty version = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#version" );
    
    /** <p>This property defines the categories for a calendar component.value type: 
     *  TEXT</p>
     */
    public static final DatatypeProperty categories = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal/ical#categories" );
    
    /** <p>Provide a grouping of component properties that defines a time zone.</p> */
    public static final OntClass Vtimezone = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Vtimezone" );
    
    /** <p>Provide a grouping of component properties that describe an event.</p> */
    public static final OntClass Vevent = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Vevent" );
    
    public static final OntClass List_of_Float = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#List_of_Float" );
    
    public static final OntClass Value_RECUR = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Value_RECUR" );
    
    /** <p>Provide a grouping of component properties that define an alarm.</p> */
    public static final OntClass Valarm = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Valarm" );
    
    public static final OntClass Value_CAL_ADDRESS = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Value_CAL-ADDRESS" );
    
    public static final OntClass DomainOf_rrule = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#DomainOf_rrule" );
    
    /** <p>Provide a grouping of calendar properties that describe a to-do.</p> */
    public static final OntClass Vtodo = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Vtodo" );
    
    public static final OntClass Value_DATE = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Value_DATE" );
    
    public static final OntClass Value_DATE_TIME = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Value_DATE-TIME" );
    
    public static final OntClass Value_PERIOD = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Value_PERIOD" );
    
    /** <p>Provide a grouping of component properties that describe a journal entry.</p> */
    public static final OntClass Vjournal = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Vjournal" );
    
    public static final OntClass Value_DURATION = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Value_DURATION" );
    
    /** <p>Provide a grouping of component properties that describe either a request 
     *  for free/busy time, describe a response to a request for free/busy time or 
     *  describe a published set of busy time.</p>
     */
    public static final OntClass Vfreebusy = m_model.createClass( "http://www.w3.org/2002/12/cal/ical#Vfreebusy" );
    
}
