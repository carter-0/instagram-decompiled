package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Calendar;

@JacksonStdImpl
public class CalendarSerializer extends DateTimeSerializerBase {
    public static final CalendarSerializer A00 = new DateTimeSerializerBase((Boolean) null, Calendar.class, (DateFormat) null);

    public CalendarSerializer() {
        super((Boolean) null, Calendar.class, (DateFormat) null);
    }
}
