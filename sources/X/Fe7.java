package X;

public final class Fe7 implements C51883G5v {
    public final int A00;
    public final Object A01;

    public Fe7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00be, code lost:
        X.DbU.A1B(r8, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r6.putString(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = X.1QK.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r11.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1n(android.net.Uri r8, com.instagram.common.session.UserSession r9, X.AnonymousClass2a4 r10, X.C49865FAi r11) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x00ab;
                case 2: goto L_0x008f;
                case 3: goto L_0x003f;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0015;
                case 7: goto L_0x0068;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.os.Bundle r6 = r11.A0P
            java.lang.String r1 = r8.getHost()
            java.lang.String r0 = "screen"
        L_0x000d:
            r6.putString(r0, r1)
        L_0x0010:
            X.1QK r0 = X.1QK.A0E
        L_0x0012:
            r11.A05 = r0
            return
        L_0x0015:
            android.os.Bundle r4 = r11.A0P
            X.DbW.A0v(r8, r4)
            java.lang.String r3 = "id"
            X.DbU.A1B(r8, r4, r3)
            java.lang.String r2 = "source_application"
            java.lang.String r1 = r8.getQueryParameter(r2)
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e2
            r4.putString(r2, r1)
            java.lang.String r0 = r8.getQueryParameter(r3)
            boolean r0 = X.2R8.A05(r9, r0)
            if (r0 != 0) goto L_0x0010
            X.1QK r0 = X.1QK.A0C
            goto L_0x0012
        L_0x003f:
            android.os.Bundle r6 = r11.A0P
            X.DbW.A0v(r8, r6)
            java.lang.String r0 = "order_id"
            java.lang.String r5 = r8.getQueryParameter(r0)
            java.lang.String r4 = X.Dbf.A00()
            java.lang.String r3 = r8.getQueryParameter(r4)
            java.lang.String r2 = "transaction_source"
            java.lang.String r1 = r8.getQueryParameter(r2)
            java.lang.String r0 = "id"
            r6.putString(r0, r5)
            r6.putString(r4, r3)
            r6.putString(r2, r1)
            java.lang.String r1 = r9.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            goto L_0x000d
        L_0x0068:
            android.os.Bundle r2 = r11.A0P
            java.lang.String r1 = r8.getHost()
            java.lang.String r0 = "screen"
            r2.putString(r0, r1)
            java.lang.String r0 = "audio_id"
            java.lang.String r1 = r8.getQueryParameter(r0)
            java.lang.String r0 = "id"
            r2.putString(r0, r1)
            java.lang.String r1 = "reason"
            java.lang.String r0 = r8.getQueryParameter(r1)
            r2.putString(r1, r0)
            java.lang.Object r0 = r7.A01
            X.0sJ r0 = (X.0sJ) r0
            r0.invoke(r8, r10, r11, r9)
            return
        L_0x008f:
            android.os.Bundle r1 = X.C49865FAi.A00(r11)
            X.DbW.A0v(r8, r1)
            X.DbU.A1D(r1, r9)
            java.lang.String r0 = "entry_point"
            X.DbU.A1B(r8, r1, r0)
            java.lang.String r0 = "incentive_id"
            X.DbU.A1B(r8, r1, r0)
            java.lang.String r0 = "merchant_id"
            X.DbU.A1B(r8, r1, r0)
            java.lang.String r0 = "merchant_username"
            goto L_0x00be
        L_0x00ab:
            X.1QK r0 = X.1QK.A0E
            r11.A05 = r0
            android.os.Bundle r1 = r11.A0P
            X.DbW.A0v(r8, r1)
            X.DbU.A1D(r1, r9)
            java.lang.String r0 = "entry_point"
            X.DbU.A1B(r8, r1, r0)
            java.lang.String r0 = "merchant_igid"
        L_0x00be:
            X.DbU.A1B(r8, r1, r0)
            return
        L_0x00c2:
            X.FHD.A0H(r9, r11)
            android.os.Bundle r1 = r11.A0P
            java.lang.String r0 = "business_id"
            X.DbU.A1B(r8, r1, r0)
            java.lang.String r0 = "business_name"
            X.DbU.A1B(r8, r1, r0)
            java.lang.String r0 = "banhammer_state"
            X.DbU.A1B(r8, r1, r0)
            java.lang.String r0 = "banhammer_action_date"
            X.DbU.A1B(r8, r1, r0)
            X.DbW.A0v(r8, r1)
            X.DbU.A1D(r1, r9)
            return
        L_0x00e2:
            X.FHD.A0H(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fe7.E1n(android.net.Uri, com.instagram.common.session.UserSession, X.2a4, X.FAi):void");
    }
}
