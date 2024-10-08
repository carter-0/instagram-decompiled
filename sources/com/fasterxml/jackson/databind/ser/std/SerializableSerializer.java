package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C252523pF;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class SerializableSerializer extends StdSerializer {
    public static final SerializableSerializer A00 = new SerializableSerializer();

    public SerializableSerializer() {
        super(C252523pF.class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r1, C269504fE r2, SPK spk, Object obj) {
        ((C252523pF) obj).ENF(r1, r2, spk);
    }
}
