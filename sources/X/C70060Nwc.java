package X;

/* renamed from: X.Nwc  reason: case insensitive filesystem */
public abstract class C70060Nwc {
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.5FY] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r0 != r3) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r11, com.instagram.direct.armadilloexpress.transportpayload.Text r12, X.C254703su r13) {
        /*
            X.AnonymousClass7TG.A1O(r11, r12)
            X.2FW r1 = X.2FW.A1g
            java.lang.String r0 = r12.text_
            r13.A17(r1, r0)
            int r0 = r12.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0082
            com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData r3 = r12.powerUpData_
            if (r3 != 0) goto L_0x0016
            com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData r3 = com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData.DEFAULT_INSTANCE
        L_0x0016:
            X.0qQ.A07(r3)
            int r0 = r3.bitField0_
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r4 = 0
            if (r0 == 0) goto L_0x003e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320906335167432(0x8109ac000723c8, double:3.032825646686094E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 != 0) goto L_0x003e
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r3.mediaAttachment_
            if (r0 != 0) goto L_0x0037
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0037:
            X.0qQ.A07(r0)
            android.net.Uri r4 = X.C66834MdS.A00(r4, r0, r4)
        L_0x003e:
            X.5FW r1 = X.AnonymousClass5FV.A02
            int r0 = r3.style_
            X.5FV r3 = r1.A00(r0)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0059
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320906335167432(0x8109ac000723c8, double:3.032825646686094E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0059
            X.5FV r3 = X.AnonymousClass5FV.None
        L_0x0059:
            monitor-enter(r13)
            X.5FY r0 = r13.A0V     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0066
            X.5FV r0 = r0.A00     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x0064
            X.5FV r0 = X.AnonymousClass5FV.None     // Catch:{ all -> 0x00df }
        L_0x0064:
            if (r0 == r3) goto L_0x0081
        L_0x0066:
            if (r4 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r2 = 0
            goto L_0x006f
        L_0x006b:
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00df }
        L_0x006f:
            X.5FY r1 = new X.5FY     // Catch:{ all -> 0x00df }
            r1.<init>()     // Catch:{ all -> 0x00df }
            X.5FV r0 = X.AnonymousClass5FV.None     // Catch:{ all -> 0x00df }
            r1.A00 = r0     // Catch:{ all -> 0x00df }
            r1.A00 = r3     // Catch:{ all -> 0x00df }
            r1.A01 = r2     // Catch:{ all -> 0x00df }
            r13.A0V = r1     // Catch:{ all -> 0x00df }
            r0 = 1
            r13.A2C = r0     // Catch:{ all -> 0x00df }
        L_0x0081:
            monitor-exit(r13)
        L_0x0082:
            X.TnY r3 = r12.commands_
            X.0qQ.A07(r3)
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x00f8
            r2 = 10
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x0097:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r3 = r4.next()
            com.instagram.direct.armadilloexpress.transportpayload.CommandRangeData r3 = (com.instagram.direct.armadilloexpress.transportpayload.CommandRangeData) r3
            int r10 = r3.offset_
            int r8 = r3.length_
            int r9 = r3.type_
            int r0 = r3.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r3.fbid_
        L_0x00b1:
            r7 = 0
            if (r0 == 0) goto L_0x00d0
            java.lang.Long r6 = X.00y.A0n(r2, r0)
        L_0x00b8:
            int r0 = r3.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r3.userOrThreadFbid_
            if (r0 == 0) goto L_0x00c6
            java.lang.Long r7 = X.00y.A0n(r2, r0)
        L_0x00c6:
            r11 = 0
            X.9IY r5 = new X.9IY
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r5)
            goto L_0x0097
        L_0x00d0:
            r6 = r7
            goto L_0x00b8
        L_0x00d2:
            r0 = 0
            goto L_0x00b1
        L_0x00d4:
            monitor-enter(r13)
            java.util.List r0 = r13.A21     // Catch:{ all -> 0x00df }
            if (r0 == r1) goto L_0x00e2
            r13.A21 = r1     // Catch:{ all -> 0x00df }
            r0 = 1
            r13.A2C = r0     // Catch:{ all -> 0x00df }
            goto L_0x00e2
        L_0x00df:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00e2:
            monitor-exit(r13)
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 1
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00fe
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            boolean r0 = r13.A2O
            if (r2 == r0) goto L_0x00f8
            r0 = 1
            r13.A2C = r0
            r13.A2O = r2
        L_0x00f8:
            java.lang.String r0 = r12.text_
            X.0qQ.A07(r0)
            return
        L_0x00fe:
            java.util.Iterator r1 = r1.iterator()
        L_0x0102:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r1.next()
            X.9IY r0 = (X.AnonymousClass9IY) r0
            int r0 = r0.A03
            if (r0 != r2) goto L_0x0102
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70060Nwc.A00(com.instagram.common.session.UserSession, com.instagram.direct.armadilloexpress.transportpayload.Text, X.3su):void");
    }
}
