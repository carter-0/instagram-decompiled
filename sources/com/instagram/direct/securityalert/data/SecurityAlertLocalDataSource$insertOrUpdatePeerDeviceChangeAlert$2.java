package com.instagram.direct.securityalert.data;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2", f = "SecurityAlertLocalDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SecurityAlertLocalDataSource A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2(SecurityAlertLocalDataSource securityAlertLocalDataSource, Number number, Number number2, Number number3, String str, String str2, String str3, AnonymousClass4D7 r9, int i, int i2, int i3) {
        super(2, r9);
        this.A04 = securityAlertLocalDataSource;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = number;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A06 = number2;
        this.A07 = number3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A04;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        ? securityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2 = new SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2(securityAlertLocalDataSource, this.A05, this.A06, this.A07, this.A09, this.A0A, this.A08, r14, i, i2, i3);
        securityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2.A00 = obj;
        return securityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e9, code lost:
        if (r12 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        if (r12 == null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0119, code lost:
        if (r4 != false) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            r45 = this;
            r0 = 252(0xfc, float:3.53E-43)
            java.lang.String r10 = X.C66579MXk.A00(r0)
            X.0eS.A00(r46)
            r3 = r45
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r0 = r3.A04
            int r9 = r3.A03
            int r1 = r3.A01
            r28 = r1
            int r1 = r3.A02
            r27 = r1
            java.lang.Number r4 = r3.A05
            java.lang.String r1 = r3.A09
            r37 = r1
            java.lang.String r1 = r3.A0A
            r38 = r1
            java.lang.String r1 = r3.A08
            r39 = r1
            java.lang.Number r2 = r3.A06
            java.lang.Number r1 = r3.A07
            X.KbC r8 = r0.A01     // Catch:{ all -> 0x03d0 }
            java.lang.String r5 = "source"
            java.lang.String r3 = "datasource.insertOrUpdate"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r5, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.String r26 = "datasource"
            r3 = r26
            X.0eP r11 = X.AnonymousClass7TE.A1L(r3, r10)     // Catch:{ all -> 0x03d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03d0 }
            java.lang.String r25 = "update_change_type"
            r3 = r25
            X.0eP r12 = X.AnonymousClass7TE.A1L(r3, r6)     // Catch:{ all -> 0x03d0 }
            java.lang.Integer r24 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x03d0 }
            java.lang.String r23 = "device_change_type"
            r6 = r23
            r3 = r24
            X.0eP r13 = X.AnonymousClass7TE.A1L(r6, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x03d0 }
            java.lang.String r21 = X.C66955Mfo.A01()     // Catch:{ all -> 0x03d0 }
            r6 = r21
            r3 = r22
            X.0eP r3 = X.AnonymousClass7TE.A1L(r6, r3)     // Catch:{ all -> 0x03d0 }
            X.0eP[] r3 = new X.0eP[]{r7, r11, r12, r13, r3}     // Catch:{ all -> 0x03d0 }
            java.util.LinkedHashMap r11 = X.0Yt.A06(r3)     // Catch:{ all -> 0x03d0 }
            int r20 = r27 * 100
            int r3 = r28 * 10
            int r20 = r20 + r3
            int r19 = r20 + r9
            r7 = 959381505(0x392f0001, float:1.6689302E-4)
            java.lang.String r6 = "UPDATE_IN_DATASOURCE"
            r3 = r19
            r8.A01(r7, r3, r6, r11)     // Catch:{ all -> 0x03d0 }
            r6 = 1
            if (r9 == r6) goto L_0x02ac
            r3 = 2
            r11 = 0
            if (r9 == r3) goto L_0x01af
            r14 = 3
            if (r9 == r14) goto L_0x0094
            java.lang.String r1 = "unexpected updateChangeType: "
            java.lang.String r1 = X.002.A0O(r1, r9)     // Catch:{ all -> 0x03d0 }
            X.0KC.A0C(r10, r1)     // Catch:{ all -> 0x03d0 }
            goto L_0x03bd
        L_0x0094:
            com.instagram.direct.securityalert.data.room.SecurityAlertDatabase r3 = r0.A02     // Catch:{ all -> 0x03d0 }
            r44 = r3
            X.MWm r12 = r44.A01()     // Catch:{ all -> 0x03d0 }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x03d0 }
            java.lang.String r4 = r3.A06     // Catch:{ all -> 0x03d0 }
            r3 = r27
            X.JvI r13 = r12.AVL(r4, r3)     // Catch:{ all -> 0x03d0 }
            if (r13 == 0) goto L_0x00b3
            java.lang.String r4 = r13.A0A     // Catch:{ all -> 0x03d0 }
        L_0x00aa:
            r3 = r37
            boolean r3 = X.0qQ.A0K(r4, r3)     // Catch:{ all -> 0x03d0 }
            if (r3 == 0) goto L_0x0111
            goto L_0x00b5
        L_0x00b3:
            r4 = r11
            goto L_0x00aa
        L_0x00b5:
            if (r13 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r4 = r11
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r4 = r13.A0B     // Catch:{ all -> 0x03d0 }
        L_0x00bc:
            r3 = r38
            boolean r3 = X.0qQ.A0K(r4, r3)     // Catch:{ all -> 0x03d0 }
            if (r3 == 0) goto L_0x0111
            if (r13 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r4 = r11
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r4 = r13.A09     // Catch:{ all -> 0x03d0 }
        L_0x00cb:
            r3 = r39
            boolean r3 = X.0qQ.A0K(r4, r3)     // Catch:{ all -> 0x03d0 }
            if (r3 == 0) goto L_0x0111
            if (r13 == 0) goto L_0x00d8
            java.lang.Double r15 = r13.A03     // Catch:{ all -> 0x03d0 }
            goto L_0x00d9
        L_0x00d8:
            r15 = r11
        L_0x00d9:
            if (r2 == 0) goto L_0x00e5
            double r3 = r2.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r12 = new java.lang.Double     // Catch:{ all -> 0x03d0 }
            r12.<init>(r3)     // Catch:{ all -> 0x03d0 }
            goto L_0x00e6
        L_0x00e5:
            r12 = r11
        L_0x00e6:
            r4 = 1
            if (r15 != 0) goto L_0x00f0
            if (r12 != 0) goto L_0x00ff
        L_0x00eb:
            if (r4 == 0) goto L_0x0111
            if (r13 == 0) goto L_0x0104
            goto L_0x0101
        L_0x00f0:
            if (r12 == 0) goto L_0x00ff
            double r17 = r15.doubleValue()     // Catch:{ all -> 0x03d0 }
            double r15 = r12.doubleValue()     // Catch:{ all -> 0x03d0 }
            int r3 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x00ff
            goto L_0x00eb
        L_0x00ff:
            r4 = 0
            goto L_0x00eb
        L_0x0101:
            java.lang.Double r15 = r13.A04     // Catch:{ all -> 0x03d0 }
            goto L_0x0105
        L_0x0104:
            r15 = r11
        L_0x0105:
            if (r1 == 0) goto L_0x0113
            double r3 = r1.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r12 = new java.lang.Double     // Catch:{ all -> 0x03d0 }
            r12.<init>(r3)     // Catch:{ all -> 0x03d0 }
            goto L_0x0114
        L_0x0111:
            r6 = 0
            goto L_0x011b
        L_0x0113:
            r12 = r11
        L_0x0114:
            r4 = 1
            if (r15 != 0) goto L_0x0124
            if (r12 != 0) goto L_0x0133
        L_0x0119:
            if (r4 == 0) goto L_0x0111
        L_0x011b:
            r12 = r11
            if (r6 != 0) goto L_0x011f
            r12 = r13
        L_0x011f:
            if (r12 == 0) goto L_0x02a3
            if (r2 == 0) goto L_0x0138
            goto L_0x0135
        L_0x0124:
            if (r12 == 0) goto L_0x0133
            double r17 = r15.doubleValue()     // Catch:{ all -> 0x03d0 }
            double r15 = r12.doubleValue()     // Catch:{ all -> 0x03d0 }
            int r3 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x0133
            goto L_0x0119
        L_0x0133:
            r4 = 0
            goto L_0x0119
        L_0x0135:
            r2.doubleValue()     // Catch:{ all -> 0x03d0 }
        L_0x0138:
            if (r1 == 0) goto L_0x013d
            r1.doubleValue()     // Catch:{ all -> 0x03d0 }
        L_0x013d:
            if (r2 == 0) goto L_0x0149
            double r3 = r2.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r6 = new java.lang.Double     // Catch:{ all -> 0x03d0 }
            r6.<init>(r3)     // Catch:{ all -> 0x03d0 }
            goto L_0x014a
        L_0x0149:
            r6 = r11
        L_0x014a:
            if (r1 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r13 = r11
            goto L_0x0158
        L_0x014f:
            double r3 = r1.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r13 = new java.lang.Double     // Catch:{ all -> 0x03d0 }
            r13.<init>(r3)     // Catch:{ all -> 0x03d0 }
        L_0x0158:
            java.lang.String r15 = r12.A08     // Catch:{ all -> 0x03d0 }
            java.lang.String r4 = r12.A0C     // Catch:{ all -> 0x03d0 }
            int r3 = r12.A00     // Catch:{ all -> 0x03d0 }
            r40 = r3
            int r3 = r12.A01     // Catch:{ all -> 0x03d0 }
            r41 = r3
            int r3 = r12.A02     // Catch:{ all -> 0x03d0 }
            r42 = r3
            java.lang.Long r3 = r12.A06     // Catch:{ all -> 0x03d0 }
            r18 = r3
            java.lang.Long r3 = r12.A07     // Catch:{ all -> 0x03d0 }
            r17 = r3
            java.lang.Long r3 = r12.A05     // Catch:{ all -> 0x03d0 }
            r16 = r3
            boolean r3 = r12.A0D     // Catch:{ all -> 0x03d0 }
            X.AnonymousClass7TG.A1N(r15, r4)     // Catch:{ all -> 0x03d0 }
            X.JvI r12 = new X.JvI     // Catch:{ all -> 0x03d0 }
            r29 = r12
            r30 = r6
            r31 = r13
            r32 = r18
            r33 = r17
            r34 = r16
            r35 = r15
            r36 = r4
            r43 = r3
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x03d0 }
            X.MWm r3 = r44.A01()     // Catch:{ all -> 0x03d0 }
            X.LqY r3 = (X.C65279LqY) r3     // Catch:{ all -> 0x03d0 }
            X.3oI r4 = r3.A02     // Catch:{ all -> 0x03d0 }
            r4.assertNotSuspendingTransaction()     // Catch:{ all -> 0x03d0 }
            r4.beginTransaction()     // Catch:{ all -> 0x03d0 }
            X.2NZ r3 = r3.A00     // Catch:{ all -> 0x01a9 }
            int r6 = r3.A00(r12)     // Catch:{ all -> 0x01a9 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x01a9 }
            goto L_0x033f
        L_0x01a9:
            r1 = move-exception
            r4.endTransaction()     // Catch:{ all -> 0x03d0 }
            goto L_0x03cf
        L_0x01af:
            com.instagram.direct.securityalert.data.room.SecurityAlertDatabase r1 = r0.A02     // Catch:{ all -> 0x03d0 }
            r44 = r1
            X.MWm r12 = r44.A01()     // Catch:{ all -> 0x03d0 }
            com.instagram.common.session.UserSession r1 = r0.A00     // Catch:{ all -> 0x03d0 }
            java.lang.String r2 = r1.A06     // Catch:{ all -> 0x03d0 }
            r1 = r27
            X.JvI r12 = r12.AVL(r2, r1)     // Catch:{ all -> 0x03d0 }
            if (r12 == 0) goto L_0x01c6
            java.lang.Long r13 = r12.A06     // Catch:{ all -> 0x03d0 }
            goto L_0x01c7
        L_0x01c6:
            r13 = r11
        L_0x01c7:
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ca:
            r1 = r11
            goto L_0x01d4
        L_0x01cc:
            long r1 = r4.longValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Long r1 = X.JTO.A0y(r1)     // Catch:{ all -> 0x03d0 }
        L_0x01d4:
            boolean r2 = X.0qQ.A0K(r13, r1)     // Catch:{ all -> 0x03d0 }
            r1 = r11
            if (r2 != 0) goto L_0x01dc
            r1 = r12
        L_0x01dc:
            if (r1 == 0) goto L_0x02a3
            if (r4 == 0) goto L_0x01e3
            r4.longValue()     // Catch:{ all -> 0x03d0 }
        L_0x01e3:
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e9
        L_0x01e6:
            r32 = r11
            goto L_0x01f1
        L_0x01e9:
            long r12 = r4.longValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Long r32 = X.JTO.A0y(r12)     // Catch:{ all -> 0x03d0 }
        L_0x01f1:
            java.lang.String r14 = r1.A08     // Catch:{ all -> 0x03d0 }
            java.lang.String r13 = r1.A0C     // Catch:{ all -> 0x03d0 }
            int r2 = r1.A00     // Catch:{ all -> 0x03d0 }
            r40 = r2
            int r2 = r1.A01     // Catch:{ all -> 0x03d0 }
            r41 = r2
            int r2 = r1.A02     // Catch:{ all -> 0x03d0 }
            r42 = r2
            java.lang.Long r2 = r1.A07     // Catch:{ all -> 0x03d0 }
            r33 = r2
            java.lang.String r2 = r1.A0A     // Catch:{ all -> 0x03d0 }
            r18 = r2
            java.lang.String r2 = r1.A0B     // Catch:{ all -> 0x03d0 }
            r17 = r2
            java.lang.String r2 = r1.A09     // Catch:{ all -> 0x03d0 }
            r16 = r2
            java.lang.Long r15 = r1.A05     // Catch:{ all -> 0x03d0 }
            java.lang.Double r12 = r1.A03     // Catch:{ all -> 0x03d0 }
            java.lang.Double r2 = r1.A04     // Catch:{ all -> 0x03d0 }
            boolean r1 = r1.A0D     // Catch:{ all -> 0x03d0 }
            X.Dba.A0j(r6, r14, r13)     // Catch:{ all -> 0x03d0 }
            X.JvI r6 = new X.JvI     // Catch:{ all -> 0x03d0 }
            r29 = r6
            r30 = r12
            r31 = r2
            r34 = r15
            r35 = r14
            r36 = r13
            r37 = r18
            r38 = r17
            r39 = r16
            r43 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x03d0 }
            X.MWm r1 = r44.A01()     // Catch:{ all -> 0x03d0 }
            X.LqY r1 = (X.C65279LqY) r1     // Catch:{ all -> 0x03d0 }
            X.3oI r2 = r1.A02     // Catch:{ all -> 0x03d0 }
            r2.assertNotSuspendingTransaction()     // Catch:{ all -> 0x03d0 }
            r2.beginTransaction()     // Catch:{ all -> 0x03d0 }
            X.2NZ r1 = r1.A00     // Catch:{ all -> 0x03cb }
            int r6 = r1.A00(r6)     // Catch:{ all -> 0x03cb }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x03cb }
            r2.endTransaction()     // Catch:{ all -> 0x03d0 }
            if (r4 == 0) goto L_0x0259
            long r1 = r4.longValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Long r11 = X.JTO.A0y(r1)     // Catch:{ all -> 0x03d0 }
        L_0x0259:
            java.lang.String r1 = "database.insertOrUpdate.creationTimestamp"
            X.0eP r12 = X.AnonymousClass7TE.A1L(r5, r1)     // Catch:{ all -> 0x03d0 }
            r1 = r26
            X.0eP r13 = X.AnonymousClass7TE.A1L(r1, r10)     // Catch:{ all -> 0x03d0 }
            r1 = r25
            X.0eP r14 = X.AnonymousClass7TF.A0x(r1, r3)     // Catch:{ all -> 0x03d0 }
            r2 = r23
            r1 = r24
            X.0eP r15 = X.AnonymousClass7TE.A1L(r2, r1)     // Catch:{ all -> 0x03d0 }
            r2 = r21
            r1 = r22
            X.0eP r16 = X.AnonymousClass7TE.A1L(r2, r1)     // Catch:{ all -> 0x03d0 }
            java.lang.String r1 = "created_timestamp_ms"
            X.0eP r17 = X.AnonymousClass7TE.A1L(r1, r11)     // Catch:{ all -> 0x03d0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03d0 }
            java.lang.String r1 = "affected_rows"
            X.0eP r18 = X.AnonymousClass7TE.A1L(r1, r2)     // Catch:{ all -> 0x03d0 }
            X.0eP[] r1 = new X.0eP[]{r12, r13, r14, r15, r16, r17, r18}     // Catch:{ all -> 0x03d0 }
            java.util.LinkedHashMap r3 = X.0Yt.A06(r1)     // Catch:{ all -> 0x03d0 }
            int r2 = r20 + 2
            java.lang.String r1 = "UPDATE_IN_DB"
            r8.A01(r7, r2, r1, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.String r2 = "updatePeerDeviceChangeAlert.creationTimestamp"
            X.05G r1 = r0.A03     // Catch:{ all -> 0x03d0 }
            r1.FIA(r2)     // Catch:{ all -> 0x03d0 }
            goto L_0x03bd
        L_0x02a3:
            X.02m r2 = r8.A01     // Catch:{ all -> 0x03d0 }
            r1 = r19
            r2.markerDrop(r7, r1)     // Catch:{ all -> 0x03d0 }
            goto L_0x03bd
        L_0x02ac:
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x03d0 }
            java.lang.String r3 = r3.A06     // Catch:{ all -> 0x03d0 }
            r40 = 0
            java.lang.String r35 = X.AnonymousClass7TG.A0j()     // Catch:{ all -> 0x03d0 }
            r31 = 0
            if (r4 == 0) goto L_0x02bf
            java.lang.Long r32 = X.C51968G9o.A0v(r4)     // Catch:{ all -> 0x03d0 }
            goto L_0x02c1
        L_0x02bf:
            r32 = r31
        L_0x02c1:
            r33 = 0
            if (r2 == 0) goto L_0x02ce
            double r11 = r2.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r30 = java.lang.Double.valueOf(r11)     // Catch:{ all -> 0x03d0 }
            goto L_0x02d0
        L_0x02ce:
            r30 = r31
        L_0x02d0:
            if (r1 == 0) goto L_0x02da
            double r1 = r1.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r31 = java.lang.Double.valueOf(r1)     // Catch:{ all -> 0x03d0 }
        L_0x02da:
            X.JvI r2 = new X.JvI     // Catch:{ all -> 0x03d0 }
            r29 = r2
            r34 = r33
            r36 = r3
            r41 = r28
            r42 = r27
            r43 = r40
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x03d0 }
            com.instagram.direct.securityalert.data.room.SecurityAlertDatabase r1 = r0.A02     // Catch:{ all -> 0x03d0 }
            X.MWm r1 = r1.A01()     // Catch:{ all -> 0x03d0 }
            X.LqY r1 = (X.C65279LqY) r1     // Catch:{ all -> 0x03d0 }
            X.3oI r3 = r1.A02     // Catch:{ all -> 0x03d0 }
            r3.assertNotSuspendingTransaction()     // Catch:{ all -> 0x03d0 }
            r3.beginTransaction()     // Catch:{ all -> 0x03d0 }
            X.1Vf r1 = r1.A01     // Catch:{ all -> 0x03c6 }
            r1.insert(r2)     // Catch:{ all -> 0x03c6 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x03c6 }
            r3.endTransaction()     // Catch:{ all -> 0x03d0 }
            java.lang.String r1 = "database.insertOrUpdate.insert"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r5, r1)     // Catch:{ all -> 0x03d0 }
            r1 = r26
            X.0eP r11 = X.AnonymousClass7TE.A1L(r1, r10)     // Catch:{ all -> 0x03d0 }
            r1 = r25
            X.0eP r4 = X.AnonymousClass7TF.A0x(r1, r6)     // Catch:{ all -> 0x03d0 }
            r2 = r23
            r1 = r24
            X.0eP r3 = X.AnonymousClass7TE.A1L(r2, r1)     // Catch:{ all -> 0x03d0 }
            r2 = r21
            r1 = r22
            X.0eP r1 = X.AnonymousClass7TE.A1L(r2, r1)     // Catch:{ all -> 0x03d0 }
            X.0eP[] r1 = new X.0eP[]{r5, r11, r4, r3, r1}     // Catch:{ all -> 0x03d0 }
            java.util.LinkedHashMap r3 = X.0Yt.A06(r1)     // Catch:{ all -> 0x03d0 }
            int r2 = r20 + 1
            java.lang.String r1 = "UPDATE_IN_DB"
            r8.A01(r7, r2, r1, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.String r2 = "insertPeerDeviceChangeAlert"
            X.05G r1 = r0.A03     // Catch:{ all -> 0x03d0 }
            r1.FIA(r2)     // Catch:{ all -> 0x03d0 }
            goto L_0x03bd
        L_0x033f:
            r4.endTransaction()     // Catch:{ all -> 0x03d0 }
            java.lang.String r3 = "database.insertOrUpdate.alertInfo"
            X.0eP r29 = X.AnonymousClass7TE.A1L(r5, r3)     // Catch:{ all -> 0x03d0 }
            r3 = r26
            X.0eP r30 = X.AnonymousClass7TE.A1L(r3, r10)     // Catch:{ all -> 0x03d0 }
            r3 = r25
            X.0eP r31 = X.AnonymousClass7TF.A0x(r3, r14)     // Catch:{ all -> 0x03d0 }
            r4 = r23
            r3 = r24
            X.0eP r32 = X.AnonymousClass7TE.A1L(r4, r3)     // Catch:{ all -> 0x03d0 }
            r4 = r21
            r3 = r22
            X.0eP r33 = X.AnonymousClass7TE.A1L(r4, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.String r4 = "device_model"
            r3 = r37
            X.0eP r34 = X.AnonymousClass7TE.A1L(r4, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.String r4 = "device_platform"
            r3 = r38
            X.0eP r35 = X.AnonymousClass7TE.A1L(r4, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.String r4 = "device_location"
            r3 = r39
            X.0eP r36 = X.AnonymousClass7TE.A1L(r4, r3)     // Catch:{ all -> 0x03d0 }
            r3 = 0
            if (r2 == 0) goto L_0x0387
            double r4 = r2.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r11 = java.lang.Double.valueOf(r4)     // Catch:{ all -> 0x03d0 }
        L_0x0387:
            java.lang.String r2 = "device_latitude"
            X.0eP r37 = X.AnonymousClass7TE.A1L(r2, r11)     // Catch:{ all -> 0x03d0 }
            if (r1 == 0) goto L_0x0397
            double r1 = r1.doubleValue()     // Catch:{ all -> 0x03d0 }
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch:{ all -> 0x03d0 }
        L_0x0397:
            java.lang.String r1 = "device_longitude"
            X.0eP r38 = X.AnonymousClass7TE.A1L(r1, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03d0 }
            java.lang.String r1 = "affected_rows"
            X.0eP r39 = X.AnonymousClass7TE.A1L(r1, r2)     // Catch:{ all -> 0x03d0 }
            X.0eP[] r1 = new X.0eP[]{r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39}     // Catch:{ all -> 0x03d0 }
            java.util.LinkedHashMap r3 = X.0Yt.A06(r1)     // Catch:{ all -> 0x03d0 }
            int r2 = r20 + 3
            java.lang.String r1 = "UPDATE_IN_DB"
            r8.A01(r7, r2, r1, r3)     // Catch:{ all -> 0x03d0 }
            java.lang.String r2 = "updatePeerDeviceChangeAlert.alertInfo"
            X.05G r1 = r0.A03     // Catch:{ all -> 0x03d0 }
            r1.FIA(r2)     // Catch:{ all -> 0x03d0 }
        L_0x03bd:
            r2 = 0
            r1 = r19
            r8.A03(r2, r7, r1)     // Catch:{ all -> 0x03d0 }
            X.0gF r4 = X.C60340gF.A00     // Catch:{ all -> 0x03d0 }
            goto L_0x03d5
        L_0x03c6:
            r1 = move-exception
            r3.endTransaction()     // Catch:{ all -> 0x03d0 }
            goto L_0x03cf
        L_0x03cb:
            r1 = move-exception
            r2.endTransaction()     // Catch:{ all -> 0x03d0 }
        L_0x03cf:
            throw r1     // Catch:{ all -> 0x03d0 }
        L_0x03d0:
            r1 = move-exception
            X.0eQ r4 = X.JTO.A1B(r1)
        L_0x03d5:
            java.lang.Throwable r3 = X.0eR.A00(r4)
            if (r3 == 0) goto L_0x03f0
            java.lang.String r1 = r3.getMessage()
            X.0KC.A0C(r10, r1)
            X.KbC r2 = r0.A01
            int r1 = r27 * 100
            int r0 = r28 * 10
            int r1 = r1 + r0
            int r1 = r1 + r9
            r0 = 959381505(0x392f0001, float:1.6689302E-4)
            r2.A03(r3, r0, r1)
        L_0x03f0:
            X.0eR r0 = new X.0eR
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
