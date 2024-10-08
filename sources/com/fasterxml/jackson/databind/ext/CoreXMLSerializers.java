package com.fasterxml.jackson.databind.ext;

import X.17Z;
import X.AnonymousClass4iL;
import X.C10798RyK;
import X.C13901TjO;
import X.C268894eF;
import X.C269134ed;
import X.C269294et;
import X.C269504fE;
import X.C269714fZ;
import X.Pxi;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.GregorianCalendar;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public final class CoreXMLSerializers extends AnonymousClass4iL {

    public class XMLGregorianCalendarSerializer extends StdSerializer implements C269714fZ {
        public static final XMLGregorianCalendarSerializer A01 = new XMLGregorianCalendarSerializer();
        public final JsonSerializer A00;

        public XMLGregorianCalendarSerializer(JsonSerializer jsonSerializer) {
            super(XMLGregorianCalendar.class);
            this.A00 = jsonSerializer;
        }

        public final /* bridge */ /* synthetic */ void A09(17Z r4, C269504fE r5, SPK spk, Object obj) {
            GregorianCalendar gregorianCalendar;
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            C10798RyK A012 = SPK.A01(r4, spk, XMLGregorianCalendar.class, xMLGregorianCalendar);
            JsonSerializer jsonSerializer = this.A00;
            if (xMLGregorianCalendar == null) {
                gregorianCalendar = null;
            } else {
                gregorianCalendar = xMLGregorianCalendar.toGregorianCalendar();
            }
            jsonSerializer.A0A(r4, r5, gregorianCalendar);
            spk.A04(r4, A012);
        }

        public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
            GregorianCalendar gregorianCalendar;
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            JsonSerializer jsonSerializer = this.A00;
            if (xMLGregorianCalendar == null) {
                gregorianCalendar = null;
            } else {
                gregorianCalendar = xMLGregorianCalendar.toGregorianCalendar();
            }
            jsonSerializer.A0A(r3, r4, gregorianCalendar);
        }

        public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r3, Object obj) {
            GregorianCalendar gregorianCalendar;
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            JsonSerializer jsonSerializer = this.A00;
            if (xMLGregorianCalendar == null) {
                gregorianCalendar = null;
            } else {
                gregorianCalendar = xMLGregorianCalendar.toGregorianCalendar();
            }
            return jsonSerializer.A0B(r3, gregorianCalendar);
        }

        public final JsonSerializer ALi(C13901TjO tjO, C269504fE r5) {
            JsonSerializer jsonSerializer = this.A00;
            JsonSerializer jsonSerializer2 = jsonSerializer;
            if (jsonSerializer != null) {
                jsonSerializer2 = Pxi.A0M(tjO, jsonSerializer, r5, jsonSerializer instanceof C269714fZ ? 1 : 0);
            }
            if (jsonSerializer2 != jsonSerializer) {
                return new XMLGregorianCalendarSerializer(jsonSerializer2);
            }
            return this;
        }

        public XMLGregorianCalendarSerializer() {
            this(CalendarSerializer.A00);
        }
    }

    public final JsonSerializer AVR(C268894eF r3, C269294et r4, C269134ed r5) {
        Class cls = r3.A00;
        if (Duration.class.isAssignableFrom(cls) || QName.class.isAssignableFrom(cls)) {
            return ToStringSerializer.A00;
        }
        if (XMLGregorianCalendar.class.isAssignableFrom(cls)) {
            return XMLGregorianCalendarSerializer.A01;
        }
        return null;
    }
}
