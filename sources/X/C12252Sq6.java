package X;

/* renamed from: X.Sq6  reason: case insensitive filesystem */
public final class C12252Sq6 implements C13577Td2 {
    public final SJJ A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0.isConnected() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Erp(java.util.Map r7) {
        /*
            r6 = this;
            X.SJJ r1 = r6.A00
            android.net.NetworkInfo r0 = r1.A01()
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isConnected()
            r5 = 1
            if (r0 != 0) goto L_0x001e
        L_0x000f:
            r5 = 0
            android.net.NetworkInfo r4 = r1.A01()
            java.lang.String r3 = "MqttNetworkManagerMonitor"
            if (r4 != 0) goto L_0x001f
            java.lang.String r0 = "no_info"
        L_0x001b:
            r7.put(r3, r0)
        L_0x001e:
            return r5
        L_0x001f:
            int r0 = r4.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r4.getSubtype()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.net.NetworkInfo$State r0 = r4.getState()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "%s_%s_%s"
            java.lang.String r0 = X.Pxf.A0m(r0, r1)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12252Sq6.Erp(java.util.Map):boolean");
    }

    public C12252Sq6(SJJ sjj) {
        this.A00 = sjj;
    }
}
