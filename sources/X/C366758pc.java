package X;

/* renamed from: X.8pc  reason: invalid class name and case insensitive filesystem */
public abstract class C366758pc {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1OC A00(android.location.Location r8, X.28D r9, com.instagram.common.session.UserSession r10, X.C279284yO r11, java.lang.Boolean r12, java.lang.Integer r13, long r14) {
        /*
            r5 = 0
            X.0qQ.A0B(r10, r5)
            r0 = 5
            X.0qQ.A0B(r9, r0)
            boolean r3 = r11 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x00c6
            java.lang.String r1 = r11.A02
            java.lang.String r0 = "_sticker_tray_v1"
            java.lang.String r7 = X.002.A0R(r1, r0)
        L_0x0014:
            r4 = 0
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r10, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A08(r0)
            java.lang.String r0 = "creatives/sticker_tray/"
            r2.A0A(r0)
            X.4nP r0 = X.C273924nP.STATIC_STICKERS
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "type"
            r2.A9m(r0, r1)
            long r0 = r9.A00
            java.lang.String r6 = "camera_entry_point"
            r2.A0D(r6, r0)
            r2.A0A = r7
            r2.A07 = r13
            java.lang.Class<X.8pd> r1 = X.C366768pd.class
            java.lang.Class<X.8pe> r0 = X.C366778pe.class
            r2.A0O(r4, r1, r0, r5)
            r0 = 1
            r2.A0R = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r13 != r0) goto L_0x0049
            r2.A01 = r14
        L_0x0049:
            java.lang.String r1 = "sticker_tray_surface"
            if (r3 == 0) goto L_0x00b8
            java.lang.String r0 = "CLIPS"
        L_0x004f:
            r2.A9m(r1, r0)
        L_0x0052:
            int r0 = r9.ordinal()
            switch(r0) {
                case 2: goto L_0x00b2;
                case 7: goto L_0x00b2;
                case 9: goto L_0x00b2;
                case 95: goto L_0x00af;
                case 96: goto L_0x00af;
                case 97: goto L_0x00af;
                case 345: goto L_0x00ac;
                case 523: goto L_0x00b2;
                case 560: goto L_0x00b2;
                default: goto L_0x0059;
            }
        L_0x0059:
            if (r8 == 0) goto L_0x009c
            double r0 = r8.getLatitude()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "lat"
            r2.A9m(r0, r1)
            double r0 = r8.getLongitude()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "lng"
            r2.A9m(r0, r1)
            float r0 = r8.getAccuracy()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "horizontalAccuracy"
            r2.A9m(r0, r1)
            double r0 = r8.getAltitude()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "alt"
            r2.A9m(r0, r1)
            float r0 = r8.getSpeed()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "speed"
            r2.A9m(r0, r1)
        L_0x009c:
            if (r12 == 0) goto L_0x00a7
            boolean r1 = r12.booleanValue()
            java.lang.String r0 = "is_ads_mode"
            r2.A0H(r0, r1)
        L_0x00a7:
            X.1OC r0 = r2.A0M()
            return r0
        L_0x00ac:
            java.lang.String r0 = "STORY_QUESTION_RESPONSE"
            goto L_0x00b4
        L_0x00af:
            java.lang.String r0 = "GROUP_STORIES"
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r0 = "DIRECT"
        L_0x00b4:
            r2.A9m(r1, r0)
            goto L_0x0059
        L_0x00b8:
            boolean r0 = r11 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "STORIES"
            goto L_0x004f
        L_0x00bf:
            boolean r0 = r11 instanceof X.C363138jC
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "FEED"
            goto L_0x004f
        L_0x00c6:
            java.lang.String r7 = "creatives/sticker_tray/sticker_tray_v1"
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366758pc.A00(android.location.Location, X.28D, com.instagram.common.session.UserSession, X.4yO, java.lang.Boolean, java.lang.Integer, long):X.1OC");
    }
}
