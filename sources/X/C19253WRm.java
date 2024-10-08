package X;

/* renamed from: X.WRm  reason: case insensitive filesystem */
public final class C19253WRm implements 1DN {
    public final int A00;
    public final Object A01;

    public C19253WRm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DWm(java.util.Map r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0052;
                case 2: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r0 = r9.get(r0)
            X.7vz r0 = (X.C346927vz) r0
            if (r0 == 0) goto L_0x000a
            int r2 = r0.ordinal()
            r1 = 1
            r7 = 0
            if (r2 == r7) goto L_0x0158
            r0 = 2
            java.lang.String r3 = "app_permission_deny"
            if (r2 == r0) goto L_0x0030
            if (r2 != r1) goto L_0x000a
            java.lang.Object r2 = r8.A01
            X.WPk r2 = (X.C19204WPk) r2
            com.instagram.common.session.UserSession r1 = r2.A0H
            android.app.Activity r0 = r2.A08
            X.C19204WPk.A01(r0, r1, r2, r3)
            return
        L_0x0030:
            java.lang.Object r2 = r8.A01
            X.WPk r2 = (X.C19204WPk) r2
            com.instagram.common.session.UserSession r6 = r2.A0H
            android.app.Activity r5 = r2.A08
            X.C19204WPk.A01(r5, r6, r2, r3)
            boolean r0 = r2.A0Q
            if (r0 != 0) goto L_0x000a
            X.1Wr r1 = X.1Wr.A00
            if (r1 == 0) goto L_0x0140
            X.Uwa r0 = X.C16530Uwa.DISCOVERY_MAP
            boolean r0 = r1.shouldUseDevicePermissionKit(r6, r0)
            if (r0 == 0) goto L_0x0140
            boolean r0 = r1.shouldUseNewNativeReconsiderDialog(r6)
            if (r0 == 0) goto L_0x0140
            return
        L_0x0052:
            java.lang.Object r2 = r8.A01
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            java.lang.Object r1 = r9.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.resumeWith(r0)
            return
        L_0x006a:
            r4 = 0
            X.0qQ.A0B(r9, r4)
            java.util.Set r1 = r9.entrySet()
            int r0 = X.JTT.A08(r1)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r7 = r1.iterator()
        L_0x007f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.util.Map$Entry r6 = X.AnonymousClass7TE.A1J(r7)
            java.lang.String r1 = X.DbT.A13(r6)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1921431796: goto L_0x00ee;
                case -1674700861: goto L_0x00e3;
                case -5573545: goto L_0x00d8;
                case 112197485: goto L_0x00cd;
                default: goto L_0x0094;
            }
        L_0x0094:
            java.lang.String r5 = "INVALID_PERMISSION_NAME"
        L_0x0096:
            java.lang.Object r0 = r6.getValue()
            X.7vz r0 = (X.C346927vz) r0
            int r1 = r0.ordinal()
            java.lang.String r2 = "DENIED"
            if (r1 == r4) goto L_0x00ca
            r0 = 1
            if (r1 == r0) goto L_0x00ac
            r0 = 2
            if (r1 == r0) goto L_0x00b0
            java.lang.String r2 = "UNKNOWN"
        L_0x00ac:
            r3.put(r5, r2)
            goto L_0x007f
        L_0x00b0:
            java.util.Map r0 = X.C17150VKc.A00
            java.lang.String r1 = X.DbT.A13(r6)
            X.0qQ.A0B(r1, r4)
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            boolean r0 = r0.A05(r1)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ac
            java.lang.String r2 = "PERMANENTLY_DENIED"
            goto L_0x00ac
        L_0x00ca:
            java.lang.String r2 = "GRANTED"
            goto L_0x00ac
        L_0x00cd:
            java.lang.String r0 = "android.permission.CALL_PHONE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0094
            java.lang.String r5 = "CALL_PHONE"
            goto L_0x0096
        L_0x00d8:
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0094
            java.lang.String r5 = "READ_PHONE_STATE"
            goto L_0x0096
        L_0x00e3:
            java.lang.String r0 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0094
            java.lang.String r5 = "ANSWER_PHONE_CALLS"
            goto L_0x0096
        L_0x00ee:
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0094
            java.lang.String r5 = "READ_CALL_LOG"
            goto L_0x0096
        L_0x00f9:
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r9)
        L_0x00fd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0130
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)
            java.lang.String r2 = X.DbT.A13(r0)
            java.lang.Object r1 = r0.getValue()
            X.7vz r0 = X.C346927vz.DENIED_DONT_ASK_AGAIN
            if (r1 != r0) goto L_0x0126
            java.util.Map r0 = X.C17150VKc.A00
            X.0qQ.A0B(r2, r4)
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            boolean r0 = r0.A05(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00fd
        L_0x0126:
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            r0.A02(r2)
            goto L_0x00fd
        L_0x0130:
            java.lang.Object r0 = r8.A01
            X.VXn r0 = (X.C17486VXn) r0
            X.4uI r2 = r0.A02
            X.6Rx r1 = r0.A01
            X.6Tm r0 = X.Pxj.A0a(r3)
            X.C299275ur.A00(r1, r0, r2)
            return
        L_0x0140:
            java.lang.String r4 = X.AnonymousClass7TF.A0c()
            X.UpE r3 = new X.UpE
            r3.<init>(r4, r8, r7)
            X.4O6 r2 = r2.A03
            if (r2 == 0) goto L_0x0154
            java.lang.String r1 = "DISCOVERY_MAP"
            X.4O7 r0 = X.VK6.A00
            r0.A03(r6, r2, r1, r4)
        L_0x0154:
            X.W38.A05(r5, r3)
            return
        L_0x0158:
            java.lang.Object r3 = r8.A01
            X.WPk r3 = (X.C19204WPk) r3
            com.instagram.common.session.UserSession r2 = r3.A0H
            android.app.Activity r1 = r3.A08
            r0 = 2615(0xa37, float:3.664E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C19204WPk.A01(r1, r2, r3, r0)
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = r3.A0K
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x0176
            X.T6B r0 = r1.A03
            r0.A01()
        L_0x0176:
            r3.A07()
            r3.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19253WRm.DWm(java.util.Map):void");
    }
}
