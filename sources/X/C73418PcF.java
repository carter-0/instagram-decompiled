package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PcF  reason: case insensitive filesystem */
public final class C73418PcF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ byte[] A0B;

    public C73418PcF(UserSession userSession, String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4) {
        this.A08 = userSession;
        this.A05 = j;
        this.A07 = j2;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = j3;
        this.A06 = j4;
        this.A0A = str;
        this.A09 = str2;
        this.A0B = bArr;
        this.A00 = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b7, code lost:
        if (r3 != null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d3, code lost:
        if ((r17 + r24) >= X.JTR.A0L()) goto L_0x01d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0221 A[Catch:{ NnD -> 0x024b, all -> 0x0279 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0236 A[Catch:{ NnD -> 0x024b, all -> 0x0279 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r44 = this;
            r2 = r44
            com.instagram.common.session.UserSession r8 = r2.A08
            long r0 = r2.A05
            r42 = r0
            long r0 = r2.A07
            r40 = r0
            int r0 = r2.A01
            r16 = r0
            int r0 = r2.A02
            r39 = r0
            int r10 = r2.A03
            long r0 = r2.A04
            r37 = r0
            long r0 = r2.A06
            r24 = r0
            java.lang.String r6 = r2.A0A
            java.lang.String r14 = r2.A09
            byte[] r0 = r2.A0B
            r15 = r0
            int r3 = r2.A00
            java.lang.String r2 = "ArmadilloExpressIncomingPayloadDispatcher"
            java.lang.String r1 = "ArmadilloExpressIncomingPayloadDispatcher.handleIncomingPayloadInternal"
            r0 = -2034023731(0xffffffff86c342cd, float:-7.3449E-35)
            X.0fh.A01(r1, r0)
            X.2Dm r4 = X.2L2.A00(r8)     // Catch:{ all -> 0x0279 }
            r0 = r37
            X.3U9 r0 = r4.B34(r0)     // Catch:{ all -> 0x0279 }
            X.65S r11 = X.AnonymousClass6ED.A00(r8)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = r0.C6C()     // Catch:{ all -> 0x0279 }
        L_0x0045:
            r9 = 0
            X.65V r4 = r11.A01     // Catch:{ all -> 0x0279 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x00a2
            goto L_0x004f
        L_0x004d:
            r5 = 0
            goto L_0x0045
        L_0x004f:
            if (r14 == 0) goto L_0x00a2
            X.0BQ r0 = X.AnonymousClass0BO.A00(r8)     // Catch:{ all -> 0x0279 }
            java.util.List r1 = r0.BO0()     // Catch:{ all -> 0x0279 }
            boolean r0 = X.AnonymousClass7TE.A1b(r1)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r1.get(r9)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = X.DbS.A0q(r0)     // Catch:{ all -> 0x0279 }
        L_0x0067:
            boolean r0 = X.C51966G9m.A1W(r8, r0)     // Catch:{ all -> 0x0279 }
            r0 = r0 ^ 1
            r13 = r0 ^ 1
            java.lang.Long r0 = X.AnonymousClass65V.A00(r4, r14)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x00a2
            long r0 = r0.longValue()     // Catch:{ all -> 0x0279 }
            com.facebook.quicklog.reliability.UserFlowLogger r7 = r4.A00     // Catch:{ all -> 0x0279 }
            X.9J6 r12 = X.AnonymousClass65V.A03     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = r12.A01     // Catch:{ all -> 0x0279 }
            r7.flowMarkPoint(r0, r4)     // Catch:{ all -> 0x0279 }
            goto L_0x0086
        L_0x0083:
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x0279 }
            goto L_0x0067
        L_0x0086:
            if (r5 == 0) goto L_0x008d
            java.lang.String r4 = "thread_id"
            r7.flowAnnotateWithCrucialData(r0, r4, r5)     // Catch:{ all -> 0x0279 }
        L_0x008d:
            r4 = r13 ^ 1
            if (r4 == 0) goto L_0x0094
            java.lang.String r5 = "1"
            goto L_0x0096
        L_0x0094:
            java.lang.String r5 = "0"
        L_0x0096:
            java.lang.String r4 = "is_bg_account"
            r7.flowAnnotateWithCrucialData(r0, r4, r5)     // Catch:{ all -> 0x0279 }
            java.lang.String r5 = r12.A00     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = "c"
            r7.flowAnnotateWithCrucialData(r0, r4, r5)     // Catch:{ all -> 0x0279 }
        L_0x00a2:
            X.65T r1 = r11.A02     // Catch:{ all -> 0x0279 }
            boolean r0 = r1.A06     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r1.A03     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0279 }
            if (r0 != 0) goto L_0x00ee
            r1.A01 = r6     // Catch:{ all -> 0x0279 }
        L_0x00b2:
            com.facebook.quicklog.reliability.UserFlowLogger r7 = r1.A05     // Catch:{ all -> 0x0279 }
            long r0 = r1.A04     // Catch:{ all -> 0x0279 }
            X.9J6 r5 = X.AnonymousClass65T.A08     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = r5.A01     // Catch:{ all -> 0x0279 }
            r7.flowMarkPoint(r0, r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r5 = r5.A00     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = "c"
            r7.flowAnnotateWithCrucialData(r0, r4, r5)     // Catch:{ all -> 0x0279 }
        L_0x00c4:
            X.OMd r7 = X.O0G.A00(r8)     // Catch:{ all -> 0x0279 }
            X.MZB r26 = X.MZC.A00(r8)     // Catch:{ all -> 0x0279 }
            java.lang.Integer r27 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x0279 }
            r0 = 14
            java.lang.String r30 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r0, r6)     // Catch:{ all -> 0x0279 }
            r12 = 0
            r28 = r12
            r29 = r6
            r31 = r40
            r33 = r37
            r35 = r24
            r26.A01(r27, r28, r29, r30, r31, r33, r35)     // Catch:{ all -> 0x0279 }
            r0 = 1
            java.util.List r1 = X.C66582MXn.A10(r0)     // Catch:{ all -> 0x0279 }
            r0 = 7020(0x1b6c, float:9.837E-42)
            r7.A00(r6, r1, r0, r9)     // Catch:{ all -> 0x0279 }
            goto L_0x00f5
        L_0x00ee:
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x00c4
            goto L_0x00b2
        L_0x00f5:
            r5 = 1
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r4 = X.C71037Oa0.A00(r15)     // Catch:{ NnD -> 0x024b }
            X.0qQ.A0B(r4, r5)     // Catch:{ all -> 0x0279 }
            int r1 = r4.transportPayloadCase_     // Catch:{ all -> 0x0279 }
            r0 = 1
            if (r1 == r5) goto L_0x0103
            r0 = 0
        L_0x0103:
            r3 = 0
            if (r0 == 0) goto L_0x012a
            if (r10 == r5) goto L_0x0126
            r0 = 2
            if (r10 != r0) goto L_0x012a
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r0 = r4.A0L()     // Catch:{ all -> 0x0279 }
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r0 = r0.metadata_     // Catch:{ all -> 0x0279 }
            if (r0 != 0) goto L_0x0115
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE     // Catch:{ all -> 0x0279 }
        L_0x0115:
            com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams r0 = r0.ephemeralityParams_     // Catch:{ all -> 0x0279 }
            if (r0 != 0) goto L_0x011b
            com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams r0 = com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams.DEFAULT_INSTANCE     // Catch:{ all -> 0x0279 }
        L_0x011b:
            long r0 = r0.ephemeralDurationSec_     // Catch:{ all -> 0x0279 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0279 }
            X.ODs r3 = X.C70875OPo.A01(r0, r12)     // Catch:{ all -> 0x0279 }
            goto L_0x012a
        L_0x0126:
            X.ODs r3 = X.C70875OPo.A00()     // Catch:{ all -> 0x0279 }
        L_0x012a:
            r23 = 2
            if (r3 == 0) goto L_0x0133
            X.Nkj r2 = r3.A00     // Catch:{ all -> 0x0279 }
            if (r2 == 0) goto L_0x0133
            goto L_0x0142
        L_0x0133:
            if (r10 == r5) goto L_0x013d
            r0 = r23
            if (r10 == r0) goto L_0x013a
            goto L_0x0140
        L_0x013a:
            X.Nkj r2 = X.C69405Nkj.DISAPPEARING_MESSAGE     // Catch:{ all -> 0x0279 }
            goto L_0x0142
        L_0x013d:
            X.Nkj r2 = X.C69405Nkj.SHH_MODE     // Catch:{ all -> 0x0279 }
            goto L_0x0142
        L_0x0140:
            X.Nkj r2 = X.C69405Nkj.UNRECOGNIZED     // Catch:{ all -> 0x0279 }
        L_0x0142:
            X.ObC r22 = X.OQ4.A00(r8)     // Catch:{ all -> 0x0279 }
            X.Nkj r13 = X.C69405Nkj.DISAPPEARING_MESSAGE     // Catch:{ all -> 0x0279 }
            if (r2 != r13) goto L_0x01b7
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0279 }
            r15 = 2342163327139782929(0x20810923001d2111, double:4.065855454591921E-152)
            r0 = r15
            boolean r0 = X.C51965G9l.A1a(r10, r8, r0)     // Catch:{ all -> 0x0279 }
            if (r0 != 0) goto L_0x01a5
            boolean r0 = r4.isE2EeAttributed_     // Catch:{ all -> 0x0279 }
            r21 = r0
            if (r3 == 0) goto L_0x01da
            X.Nkj r0 = r3.A00     // Catch:{ all -> 0x0279 }
            if (r0 != r13) goto L_0x01b9
            java.lang.Long r0 = r3.A01     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0183
            long r19 = r0.longValue()     // Catch:{ all -> 0x0279 }
        L_0x016a:
            long r19 = r19 + r24
            r0 = r22
            com.instagram.common.session.UserSession r0 = r0.A01     // Catch:{ all -> 0x0279 }
            r16 = 36601792901222745(0x82092300051159, double:3.2104594420988914E-306)
            r15 = r0
            r0 = r16
            long r17 = X.182.A01(r10, r15, r0)     // Catch:{ all -> 0x0279 }
            r15 = 2
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x018e
            goto L_0x0186
        L_0x0183:
            r19 = 0
            goto L_0x016a
        L_0x0186:
            if (r21 == 0) goto L_0x018b
            r17 = 21600(0x5460, double:1.0672E-319)
            goto L_0x018e
        L_0x018b:
            r17 = 1209600(0x127500, double:5.97622E-318)
        L_0x018e:
            long r19 = r19 + r17
            long r15 = X.JTR.A0L()     // Catch:{ all -> 0x0279 }
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b9
            r15 = r22
            r16 = r40
            r18 = r37
            r20 = r6
            r21 = r24
            r15.A03(r16, r18, r20, r21)     // Catch:{ all -> 0x0279 }
        L_0x01a5:
            java.lang.String r1 = "Dropped an ephemeral message"
            r0 = 7031(0x1b77, float:9.853E-42)
            r7.A00(r6, r12, r0, r9)     // Catch:{ all -> 0x0279 }
            r7.A01(r6, r5)     // Catch:{ all -> 0x0279 }
            r11.A07(r14, r6, r1, r5)     // Catch:{ all -> 0x0279 }
            r0 = -2004994545(0xffffffff887e360f, float:-7.649889E-34)
            goto L_0x0275
        L_0x01b7:
            if (r3 == 0) goto L_0x01da
        L_0x01b9:
            X.Nkj r0 = r3.A00     // Catch:{ all -> 0x0279 }
            if (r0 != r13) goto L_0x01d5
            java.lang.Long r0 = r3.A01     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x01cc
            long r17 = r0.longValue()     // Catch:{ all -> 0x0279 }
        L_0x01c5:
            long r17 = r17 + r24
            long r15 = X.JTR.A0L()     // Catch:{ all -> 0x0279 }
            goto L_0x01cf
        L_0x01cc:
            r17 = 0
            goto L_0x01c5
        L_0x01cf:
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r35 = 1
            if (r0 < 0) goto L_0x01d7
        L_0x01d5:
            r35 = 0
        L_0x01d7:
            if (r35 == 0) goto L_0x01ea
            goto L_0x01dd
        L_0x01da:
            r35 = 0
            goto L_0x01ea
        L_0x01dd:
            java.lang.String r1 = "Message is already hidden"
            r0 = 7030(0x1b76, float:9.851E-42)
            r7.A00(r6, r12, r0, r9)     // Catch:{ all -> 0x0279 }
            r7.A01(r6, r5)     // Catch:{ all -> 0x0279 }
            r11.A07(r14, r6, r1, r5)     // Catch:{ all -> 0x0279 }
        L_0x01ea:
            r0 = r23
            X.Plo r1 = X.C73913Plo.A00(r8, r0)     // Catch:{ all -> 0x0279 }
            java.lang.Class<X.OE2> r0 = X.OE2.class
            java.lang.Object r10 = r8.A01(r0, r1)     // Catch:{ all -> 0x0279 }
            X.OE2 r10 = (X.OE2) r10     // Catch:{ all -> 0x0279 }
            boolean r9 = r4.isE2EeAttributed_     // Catch:{ all -> 0x0279 }
            if (r3 == 0) goto L_0x0234
            java.lang.Long r0 = r3.A01     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0234
            long r11 = r0.longValue()     // Catch:{ all -> 0x0279 }
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0234
            long r11 = r11 + r24
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0234
            com.instagram.common.session.UserSession r8 = r10.A00     // Catch:{ all -> 0x0279 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0279 }
            r0 = 2342163327139586318(0x20810923001a210e, double:4.065855454425211E-152)
            boolean r0 = X.182.A06(r7, r8, r0)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0234
            X.ObC r0 = r10.A01     // Catch:{ all -> 0x0279 }
            r26 = r0
            r27 = r3
            r28 = r6
            r29 = r40
            r31 = r37
            r33 = r24
            r36 = r9
            r26.A04(r27, r28, r29, r31, r33, r35, r36)     // Catch:{ all -> 0x0279 }
        L_0x0234:
            if (r35 != 0) goto L_0x0272
            X.OyQ r0 = r10.A02     // Catch:{ all -> 0x0279 }
            r7 = r14
            r8 = r39
            r9 = r42
            r11 = r40
            r13 = r37
            r15 = r24
            r17 = r5
            r3 = r0
            r5 = r2
            r3.A03(r4, r5, r6, r7, r8, r9, r11, r13, r15, r17)     // Catch:{ all -> 0x0279 }
            goto L_0x0272
        L_0x024b:
            r1 = move-exception
            java.lang.String r0 = "Not able to create transport payload for incoming message"
            X.0KC.A0F(r2, r0, r1)     // Catch:{ all -> 0x0279 }
            r2 = 7035(0x1b7b, float:9.858E-42)
            long r0 = (long) r3     // Catch:{ all -> 0x0279 }
            java.util.List r0 = X.C66582MXn.A10(r0)     // Catch:{ all -> 0x0279 }
            r7.A00(r6, r0, r2, r5)     // Catch:{ all -> 0x0279 }
            r5 = -2
            r0 = r8
            r1 = r6
            r2 = r16
            r3 = r39
            r4 = r10
            r6 = r42
            r8 = r40
            r10 = r37
            r12 = r24
            X.C70143Nxx.A00(r0, r1, r2, r3, r4, r5, r6, r8, r10, r12)     // Catch:{ all -> 0x0279 }
            r0 = -836708588(0xffffffffce20d714, float:-6.7461248E8)
            goto L_0x0275
        L_0x0272:
            r0 = 606328034(0x2423d4e2, float:3.552531E-17)
        L_0x0275:
            X.0fh.A00(r0)
            return
        L_0x0279:
            r1 = move-exception
            r0 = 1725158425(0x66d3d419, float:5.0016592E23)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73418PcF.run():void");
    }
}
