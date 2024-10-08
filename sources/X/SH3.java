package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class SH3 {
    public static final SH3 A02 = new SH3();
    public final C13476Tb3 A00 = new Sy5();
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r1 != 1) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13829Ti0 A00(java.lang.Class r11) {
        /*
            r10 = this;
            java.lang.String r1 = "messageType"
            java.nio.charset.Charset r0 = X.C10132Rn9.A02
            if (r11 == 0) goto L_0x00b0
            java.util.concurrent.ConcurrentMap r3 = r10.A01
            java.lang.Object r1 = r3.get(r11)
            X.Ti0 r1 = (X.C13829Ti0) r1
            if (r1 != 0) goto L_0x00af
            X.Tb3 r1 = r10.A00
            X.Sy5 r1 = (X.Sy5) r1
            X.RfN r0 = X.C11162SCw.A01
            java.lang.Class<X.QuF> r2 = X.C8424QuF.class
            boolean r0 = r2.isAssignableFrom(r11)
            if (r0 != 0) goto L_0x0030
            java.lang.Class r0 = X.C11162SCw.A02
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.isAssignableFrom(r11)
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0030:
            X.TgE r0 = r1.A00
            X.Tb1 r7 = r0.FPD(r11)
            r5 = r7
            X.Sxy r5 = (X.C12573Sxy) r5
            int r4 = r5.A00
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L_0x0067
            boolean r0 = r2.isAssignableFrom(r11)
            if (r0 == 0) goto L_0x005a
            X.RfN r4 = X.C11162SCw.A01
            X.RfJ r2 = X.C10079RmH.A00
        L_0x004a:
            X.Tb2 r0 = r5.A01
            X.Sy3 r1 = new X.Sy3
            r1.<init>(r2, r0, r4)
        L_0x0051:
            java.lang.Object r0 = r3.putIfAbsent(r11, r1)
            X.Ti0 r0 = (X.C13829Ti0) r0
            if (r0 == 0) goto L_0x00af
            return r0
        L_0x005a:
            X.RfN r4 = X.C11162SCw.A00
            X.RfJ r2 = X.C10079RmH.A01
            if (r2 != 0) goto L_0x004a
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0067:
            boolean r2 = r2.isAssignableFrom(r11)
            r0 = r4 & 1
            if (r0 == 0) goto L_0x009f
            r0 = 1
        L_0x0070:
            int r1 = r0 + -1
            r0 = 1
            if (r1 == r0) goto L_0x00a6
        L_0x0075:
            if (r2 == 0) goto L_0x008c
            X.RfL r8 = X.C10082RmK.A01
            X.RmI r5 = X.C10080RmI.A01
            X.RfN r9 = X.C11162SCw.A01
            if (r0 == 0) goto L_0x0088
            X.RfJ r4 = X.C10079RmH.A00
            X.RfK r6 = X.C10081RmJ.A01
        L_0x0083:
            X.Sy4 r1 = X.Sy4.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0051
        L_0x0088:
            r4 = 0
            X.RfK r6 = X.C10081RmJ.A01
            goto L_0x0083
        L_0x008c:
            X.RfL r8 = X.C10082RmK.A00
            X.RmI r5 = X.C10080RmI.A00
            X.RfN r9 = X.C11162SCw.A00
            if (r0 == 0) goto L_0x009b
            X.RfJ r4 = X.C10079RmH.A01
            if (r4 == 0) goto L_0x00a8
            X.RfK r6 = X.C10081RmJ.A00
            goto L_0x0083
        L_0x009b:
            r4 = 0
            X.RfK r6 = X.C10081RmJ.A00
            goto L_0x0083
        L_0x009f:
            r1 = 4
            r0 = r4 & 4
            if (r0 != r1) goto L_0x00a6
            r0 = 3
            goto L_0x0070
        L_0x00a6:
            r0 = 0
            goto L_0x0075
        L_0x00a8:
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00af:
            return r1
        L_0x00b0:
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SH3.A00(java.lang.Class):X.Ti0");
    }
}
