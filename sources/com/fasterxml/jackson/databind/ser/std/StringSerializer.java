package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class StringSerializer extends StdScalarSerializer {
    public StringSerializer() {
        super(String.class);
    }

    public final void A09(17Z r1, C269504fE r2, SPK spk, Object obj) {
        r1.A0t((String) obj);
    }
}
