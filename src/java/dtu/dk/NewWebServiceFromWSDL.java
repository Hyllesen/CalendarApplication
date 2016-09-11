/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtu.dk;

import javax.jws.WebService;

/**
 *
 * @author stefan
 */
@WebService(serviceName = "calendarServiceService", portName = "calendarServicePort", endpointInterface = "dk.dtu.imm.ws.calendar.CalendarServicePortType", targetNamespace = "http://ws.imm.dtu.dk/calendar", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/calendarWrapper.wsdl")
public class NewWebServiceFromWSDL {

    public java.lang.String addAppointment(javax.xml.datatype.XMLGregorianCalendar part1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
