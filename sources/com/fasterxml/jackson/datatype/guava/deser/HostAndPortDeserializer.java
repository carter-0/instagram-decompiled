package com.fasterxml.jackson.datatype.guava.deser;

import X.C12836T9i;
import X.C269674fV;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

public class HostAndPortDeserializer extends FromStringDeserializer {
    public static final HostAndPortDeserializer A00 = new HostAndPortDeserializer();

    public HostAndPortDeserializer() {
        super(C12836T9i.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r4 > 65535) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.16F r6, X.C269674fV r7) {
        /*
            r5 = this;
            X.16L r0 = X.16L.A0D
            boolean r0 = r6.A19(r0)
            if (r0 == 0) goto L_0x006b
            X.3kc r0 = r6.A1K()
            if (r0 == 0) goto L_0x0064
            X.3pD r1 = r0.A04(r6)
            java.lang.String r0 = "host"
            X.3pD r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "hostText"
            X.3pD r0 = r1.A05(r0)
            java.lang.String r2 = r0.A06()
        L_0x0024:
            java.lang.String r0 = "port"
            X.3pD r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0037
            X.T9i r0 = X.C12836T9i.A00(r2)
            return r0
        L_0x0032:
            java.lang.String r2 = r0.A07()
            goto L_0x0024
        L_0x0037:
            int r4 = r0.A02()
            if (r4 < 0) goto L_0x0043
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = 1
            if (r4 <= r0) goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            java.lang.String r0 = "Port out of range: %s"
            X.17k.A0C(r0, r4, r1)
            X.T9i r3 = X.C12836T9i.A00(r2)
            int r0 = r3.A00
            boolean r0 = X.Pxf.A1R(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Host has a port: %s"
            X.17k.A0A(r2, r0, r1)
            java.lang.String r2 = r3.A01
            boolean r1 = r3.A02
            X.T9i r0 = new X.T9i
            r0.<init>(r2, r4, r1)
            return r0
        L_0x0064:
            java.lang.String r0 = "No ObjectCodec defined for parser, needed for deserialization"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x006b:
            java.lang.Object r0 = super.A0D(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object A10(C269674fV r2, String str) {
        return C12836T9i.A00(str);
    }
}
