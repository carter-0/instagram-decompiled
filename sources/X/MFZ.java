package X;

import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;

public final class MFZ extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01 = 0;
    public final long A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFZ(C52849Gdi gdi, AnonymousClass4D7 r3, long j, boolean z) {
        super(2, r3);
        this.A04 = z;
        this.A03 = gdi;
        this.A02 = j;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MFZ, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFZ, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        AnonymousClass4D7 r2 = r9;
        if (this.A01 != 0) {
            boolean z = this.A04;
            return new MFZ((SecurityAlertLocalDataSource) this.A03, r2, this.A00, this.A02, z);
        }
        return new MFZ((C52849Gdi) this.A03, r2, this.A02, this.A04);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            r35 = this;
            r8 = r35
            int r0 = r8.A01
            if (r0 == 0) goto L_0x0165
            X.0eS.A00(r36)
            java.lang.Object r1 = r8.A03
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r1 = (com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource) r1
            com.instagram.direct.securityalert.data.room.SecurityAlertDatabase r0 = r1.A02
            X.MWm r9 = r0.A01()
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r3 = r0.A06
            boolean r2 = r8.A04
            long r5 = r8.A02
            int r8 = r8.A00
            X.LqY r9 = (X.C65279LqY) r9
            java.lang.String r0 = "\n    SELECT *\n    FROM security_alert\n    WHERE user_id = ?\n      AND is_confirm = ?\n      AND created_timestamp_ms >= ?\n    ORDER BY created_timestamp_ms DESC\n    LIMIT ?\n  "
            r7 = 4
            X.1WY r1 = X.JTO.A0M(r0, r7)
            r0 = 1
            r1.ADh(r0, r3)
            long r2 = (long) r2
            r0 = 2
            r1.ADa(r0, r2)
            r4 = 3
            r1.ADa(r4, r5)
            long r2 = (long) r8
            android.database.Cursor r0 = X.C65279LqY.A00(r1, r9, r7, r2)
            java.lang.String r2 = "id"
            int r19 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "user_id"
            int r18 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "crypto_mailbox_type"
            int r15 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "device_change_type"
            int r14 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            r3 = 0
            r2 = 9
            java.lang.String r2 = X.AnonymousClass9NF.A02(r3, r2, r4)     // Catch:{ all -> 0x015d }
            int r13 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "created_timestamp_ms"
            int r9 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "first_read_timestamp_ms"
            int r8 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "model"
            int r7 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "platform"
            int r6 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "location"
            int r5 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            r2 = 240(0xf0, float:3.36E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)     // Catch:{ all -> 0x015d }
            int r4 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "latitude"
            int r3 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r2 = "longitude"
            int r2 = X.1Wd.A01(r0, r2)     // Catch:{ all -> 0x015d }
            java.lang.String r10 = "is_confirm"
            int r12 = X.1Wd.A01(r0, r10)     // Catch:{ all -> 0x015d }
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0o(r0)     // Catch:{ all -> 0x015d }
        L_0x0099:
            boolean r10 = r0.moveToNext()     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x013b
            r10 = r19
            java.lang.String r26 = r0.getString(r10)     // Catch:{ all -> 0x015d }
            r10 = r18
            java.lang.String r27 = r0.getString(r10)     // Catch:{ all -> 0x015d }
            int r31 = r0.getInt(r15)     // Catch:{ all -> 0x015d }
            int r32 = r0.getInt(r14)     // Catch:{ all -> 0x015d }
            int r33 = r0.getInt(r13)     // Catch:{ all -> 0x015d }
            boolean r10 = r0.isNull(r9)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x00c0
            r23 = 0
            goto L_0x00c4
        L_0x00c0:
            java.lang.Long r23 = X.JTQ.A0S(r0, r9)     // Catch:{ all -> 0x015d }
        L_0x00c4:
            boolean r10 = r0.isNull(r8)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x00cd
            r24 = 0
            goto L_0x00d1
        L_0x00cd:
            java.lang.Long r24 = X.JTQ.A0S(r0, r8)     // Catch:{ all -> 0x015d }
        L_0x00d1:
            boolean r10 = r0.isNull(r7)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x00da
            r28 = 0
            goto L_0x00de
        L_0x00da:
            java.lang.String r28 = r0.getString(r7)     // Catch:{ all -> 0x015d }
        L_0x00de:
            boolean r10 = r0.isNull(r6)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x00e7
            r29 = 0
            goto L_0x00eb
        L_0x00e7:
            java.lang.String r29 = r0.getString(r6)     // Catch:{ all -> 0x015d }
        L_0x00eb:
            boolean r10 = r0.isNull(r5)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x00f4
            r30 = 0
            goto L_0x00f8
        L_0x00f4:
            java.lang.String r30 = r0.getString(r5)     // Catch:{ all -> 0x015d }
        L_0x00f8:
            boolean r10 = r0.isNull(r4)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x0101
            r25 = 0
            goto L_0x0105
        L_0x0101:
            java.lang.Long r25 = X.JTQ.A0S(r0, r4)     // Catch:{ all -> 0x015d }
        L_0x0105:
            boolean r10 = r0.isNull(r3)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x010e
            r21 = 0
            goto L_0x0116
        L_0x010e:
            double r16 = r0.getDouble(r3)     // Catch:{ all -> 0x015d }
            java.lang.Double r21 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x015d }
        L_0x0116:
            boolean r10 = r0.isNull(r2)     // Catch:{ all -> 0x015d }
            if (r10 == 0) goto L_0x011f
            r22 = 0
            goto L_0x0127
        L_0x011f:
            double r16 = r0.getDouble(r2)     // Catch:{ all -> 0x015d }
            java.lang.Double r22 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x015d }
        L_0x0127:
            int r10 = r0.getInt(r12)     // Catch:{ all -> 0x015d }
            boolean r34 = X.AnonymousClass7TF.A1P(r10)
            X.JvI r10 = new X.JvI     // Catch:{ all -> 0x015d }
            r20 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x015d }
            r11.add(r10)     // Catch:{ all -> 0x015d }
            goto L_0x0099
        L_0x013b:
            r0.close()
            r1.A00()
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r1 = r11.iterator()
        L_0x0149:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r1.next()
            X.JvI r0 = (X.C61018JvI) r0
            X.JvM r0 = X.C63248Ktt.A00(r0)
            r7.add(r0)
            goto L_0x0149
        L_0x015d:
            r2 = move-exception
            r0.close()
            r1.A00()
            throw r2
        L_0x0165:
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0176
            if (r0 == r5) goto L_0x019b
            if (r0 == r6) goto L_0x019b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0176:
            X.0eS.A00(r36)
            boolean r1 = r8.A04
            java.lang.Object r0 = r8.A03
            X.Gdi r0 = (X.C52849Gdi) r0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = r0.A0M
            if (r1 != 0) goto L_0x0194
            r2 = 0
            long r0 = r8.A02
            r8.A00 = r5
        L_0x0189:
            r9 = r4
            r10 = r8
            r11 = r2
            r13 = r0
            java.lang.Object r0 = r9.A02(r10, r11, r13)
            if (r0 != r7) goto L_0x019e
            return r7
        L_0x0194:
            long r2 = r8.A02
            r0 = 0
            r8.A00 = r6
            goto L_0x0189
        L_0x019b:
            X.0eS.A00(r36)
        L_0x019e:
            X.0gF r7 = X.C60340gF.A00
        L_0x01a0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFZ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFZ(SecurityAlertLocalDataSource securityAlertLocalDataSource, AnonymousClass4D7 r3, int i, long j, boolean z) {
        super(2, r3);
        this.A03 = securityAlertLocalDataSource;
        this.A04 = z;
        this.A02 = j;
        this.A00 = i;
    }
}
