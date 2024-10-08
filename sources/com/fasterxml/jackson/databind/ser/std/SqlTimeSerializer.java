package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C269504fE;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Time;

@JacksonStdImpl
public class SqlTimeSerializer extends StdScalarSerializer {
    public SqlTimeSerializer() {
        super(Time.class);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r2, C269504fE r3, Object obj) {
        r2.A0t(obj.toString());
    }
}
