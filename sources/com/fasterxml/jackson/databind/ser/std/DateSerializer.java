package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Date;

@JacksonStdImpl
public class DateSerializer extends DateTimeSerializerBase {
    public static final DateSerializer A00 = new DateTimeSerializerBase((Boolean) null, Date.class, (DateFormat) null);

    public DateSerializer() {
        super((Boolean) null, Date.class, (DateFormat) null);
    }
}
