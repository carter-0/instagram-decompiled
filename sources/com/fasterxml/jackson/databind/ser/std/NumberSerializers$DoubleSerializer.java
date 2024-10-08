package com.fasterxml.jackson.databind.ser.std;

import X.16L;
import X.17Z;
import X.17g;
import X.C10798RyK;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class NumberSerializers$DoubleSerializer extends NumberSerializers$Base {
    public final void A09(17Z r4, C269504fE r5, SPK spk, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        String[] strArr = 17g.A04;
        if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
            C10798RyK A03 = spk.A03(r4, spk.A05(16L.A0H, obj));
            r4.A0e(doubleValue);
            spk.A04(r4, A03);
            return;
        }
        r4.A0e(doubleValue);
    }
}
