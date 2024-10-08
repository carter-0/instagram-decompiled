package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C269504fE;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Date;
import java.text.DateFormat;

@JacksonStdImpl
public class SqlDateSerializer extends DateTimeSerializerBase {
    public SqlDateSerializer() {
        super((Boolean) null, Date.class, (DateFormat) null);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        long time;
        java.util.Date date = (java.util.Date) obj;
        if (A0G(r4)) {
            if (date == null) {
                time = 0;
            } else {
                time = date.getTime();
            }
            r3.A0h(time);
        } else if (this.A00 == null) {
            r3.A0t(date.toString());
        } else {
            A0F(r3, r4, date);
        }
    }

    public final /* bridge */ /* synthetic */ DateTimeSerializerBase A0E(Boolean bool, DateFormat dateFormat) {
        return new DateTimeSerializerBase(bool, Date.class, dateFormat);
    }
}
