package X;

public abstract class OSG {
    public static final 0bY A00 = DbW.A0G();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = (r1 = X.0cp.A01(A00, X.002.A0R("ig://", r4))).getQueryParameter(com.facebook.proxygen.TraceFieldType.TransportType);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.lang.String r4) {
        /*
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x002b
            int r0 = r4.length()
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "ig://"
            java.lang.String r1 = X.002.A0R(r0, r4)
            X.0bY r0 = A00
            android.net.Uri r1 = X.0cp.A01(r0, r1)
            if (r1 == 0) goto L_0x002b
            java.lang.String r0 = "transport_type"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0029
            X.3tH r1 = X.C254923tH.ACT
            X.3tH r0 = X.C395269zU.A00(r0)
            if (r1 != r0) goto L_0x0029
            return r3
        L_0x0029:
            r3 = 0
            return r3
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OSG.A00(java.lang.String):boolean");
    }
}
