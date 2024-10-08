package com.fasterxml.jackson.databind.ser.std;

import X.C8245Qkz;
import X.SIF;

public class StdKeySerializers$Dynamic extends StdSerializer {
    public transient SIF A00 = C8245Qkz.A00;

    public StdKeySerializers$Dynamic() {
        super(String.class, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r2 != r0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.17Z r5, X.C269504fE r6, java.lang.Object r7) {
        /*
            r4 = this;
            java.lang.Class r3 = r7.getClass()
            X.SIF r2 = r4.A00
            com.fasterxml.jackson.databind.JsonSerializer r1 = r2.A00(r3)
            if (r1 != 0) goto L_0x001d
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 != r0) goto L_0x0021
            r0 = 8
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r1.<init>(r3, r0)
            X.SIF r0 = r2.A01(r1, r3)
        L_0x001b:
            r4.A00 = r0
        L_0x001d:
            r1.A0A(r5, r6, r7)
            return
        L_0x0021:
            r1 = 0
            X.4et r0 = r6.A05
            X.4eS r0 = r0.A01
            X.4eE r0 = r0.A07
            X.4eF r0 = r0.A09(r3)
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.A0C(r1, r0)
            X.SIF r0 = r2.A01(r1, r3)
            if (r2 == r0) goto L_0x001d
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic.A0A(X.17Z, X.4fE, java.lang.Object):void");
    }
}
