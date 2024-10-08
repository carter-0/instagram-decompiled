package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass00P;
import X.C269024eS;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@JacksonStdImpl
public class DateDeserializers$CalendarDeserializer extends DateDeserializers$DateBasedDeserializer {
    public final Constructor A00;

    public final Object A0K(C269674fV r4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0);
        return gregorianCalendar;
    }

    public DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer dateDeserializers$CalendarDeserializer, String str, DateFormat dateFormat) {
        super(dateDeserializers$CalendarDeserializer, str, dateFormat);
        this.A00 = dateDeserializers$CalendarDeserializer.A00;
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r5, C269674fV r6) {
        Date A0m = A0m(r5, r6);
        if (A0m == null) {
            return null;
        }
        Constructor constructor = this.A00;
        if (constructor == null) {
            TimeZone timeZone = r6.A02.A01.A0A;
            if (timeZone == null) {
                timeZone = C269024eS.A0B;
            }
            Calendar instance = Calendar.getInstance(timeZone);
            instance.setTime(A0m);
            return instance;
        }
        try {
            Calendar calendar = (Calendar) constructor.newInstance(new Object[0]);
            calendar.setTimeInMillis(A0m.getTime());
            TimeZone timeZone2 = r6.A02.A01.A0A;
            if (timeZone2 == null) {
                timeZone2 = C269024eS.A0B;
            }
            if (timeZone2 == null) {
                return calendar;
            }
            calendar.setTimeZone(timeZone2);
            return calendar;
        } catch (Exception e) {
            r6.A0f(A0H(), e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DateDeserializers$CalendarDeserializer(java.lang.Class r3) {
        /*
            r2 = this;
            java.lang.Class<java.util.GregorianCalendar> r1 = java.util.GregorianCalendar.class
            r2.<init>(r1)
            r0 = 0
            java.lang.reflect.Constructor r0 = X.C269574fL.A0A(r1, r0)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer.<init>(java.lang.Class):void");
    }

    public DateDeserializers$CalendarDeserializer() {
        super(Calendar.class);
        this.A00 = null;
    }
}
