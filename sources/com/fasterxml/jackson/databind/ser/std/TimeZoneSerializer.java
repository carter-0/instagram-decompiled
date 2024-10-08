package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C10798RyK;
import X.C269504fE;
import X.SPK;
import java.util.TimeZone;

public class TimeZoneSerializer extends StdScalarSerializer {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        TimeZone timeZone = (TimeZone) obj;
        C10798RyK A01 = SPK.A01(r3, spk, TimeZone.class, timeZone);
        r3.A0t(timeZone.getID());
        spk.A04(r3, A01);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r2, C269504fE r3, Object obj) {
        r2.A0t(((TimeZone) obj).getID());
    }
}
