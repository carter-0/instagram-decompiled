package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

public final class OZM {
    public final UserSession A00;
    public final OFO A01;
    public final OL8 A02;
    public final 2Dm A03;
    public final OO2 A04;
    public final C70808OMd A05;
    public final AnonymousClass65S A06;

    public final String A02(AnonymousClass2Ep r7, long j) {
        Object obj;
        0qQ.A0B(r7, 1);
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A00;
        Long A0r = C66581MXm.A0r(userSession, r0);
        if (A0r != null && A0r.longValue() == j) {
            return userSession.A06;
        }
        Iterator it = r7.BRZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Long BST = ((User) obj).BST();
            if (BST != null && BST.longValue() == j) {
                break;
            }
        }
        User user = (User) obj;
        if (user != null) {
            return user.getId();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1GK A00(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r40, X.C69405Nkj r41, X.AnonymousClass2Ep r42, X.OZM r43, java.lang.String r44, java.lang.String r45, long r46, long r48) {
        /*
            r35 = r42
            java.lang.String r14 = r35.C6C()
            if (r14 == 0) goto L_0x05cb
            r6 = r43
            r42 = r46
            r1 = r42
            r0 = r35
            java.lang.String r27 = r6.A02(r0, r1)
            X.3Tu r1 = r35.AiM()
            r2 = 1
            r3 = 0
            r0 = r44
            if (r1 == 0) goto L_0x0149
            int r1 = r1.A01
            if (r1 != 0) goto L_0x0149
            X.3Tu r4 = r35.AiM()
            if (r4 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r1 = r6.A00
            boolean r1 = r4.A03(r1)
            if (r1 != r2) goto L_0x0038
            X.OMd r5 = r6.A05
            r4 = 132(0x84, float:1.85E-43)
        L_0x0034:
            r1 = 0
            r5.A00(r0, r1, r4, r3)
        L_0x0038:
            X.OMd r5 = r6.A05
            r10 = 2
            X.3Tu r1 = r35.AiM()
            if (r1 == 0) goto L_0x0145
            int r1 = r1.A01
            long r7 = (long) r1
        L_0x0044:
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            X.3Tu r4 = r35.AiM()
            if (r4 == 0) goto L_0x0141
            com.instagram.common.session.UserSession r1 = r6.A00
            long r7 = r4.A00(r1)
        L_0x0054:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.Long[] r1 = new java.lang.Long[]{r9, r1}
            java.util.List r7 = X.0sr.A1P(r1)
            r9 = 4
            r4 = 0
            r1 = 7038(0x1b7e, float:9.862E-42)
            r5.A00(r0, r7, r1, r3)
            r1 = 14
            java.lang.String r19 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r1, r0)
            if (r19 == 0) goto L_0x00cb
            java.lang.String r11 = r35.C6C()
            if (r11 == 0) goto L_0x00cb
            com.instagram.common.session.UserSession r12 = r5.A00
            X.0Tu r1 = X.0Tu.A05
            r7 = 36320644342096566(0x81096f000622b6, double:3.0326599612131167E-306)
            boolean r1 = X.182.A06(r1, r12, r7)
            if (r1 == 0) goto L_0x00cb
            int r7 = r11.length()
            if (r7 <= 0) goto L_0x00cb
            boolean r1 = X.AnonymousClass3f0.A04(r11)
            if (r1 == 0) goto L_0x00cb
            int r13 = r7 / 3
            int r12 = r13 * 2
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            boolean r7 = r35.CVE()
            if (r7 == 0) goto L_0x00a3
            r7 = 131(0x83, double:6.47E-322)
            X.AnonymousClass7TE.A1Y(r1, r7)
        L_0x00a3:
            r7 = 1252(0x4e4, double:6.186E-321)
            X.AnonymousClass7TE.A1Y(r1, r7)
            java.lang.String r7 = X.C51967G9n.A0q(r11, r3, r13)
            X.C66582MXn.A1N(r7, r1)
            java.lang.String r7 = X.C51967G9n.A0q(r11, r13, r12)
            X.C66582MXn.A1N(r7, r1)
            java.lang.String r7 = X.C66580MXl.A0z(r11, r12)
            X.C66582MXn.A1N(r7, r1)
            r18 = 2220(0x8ac, float:3.111E-42)
            r15 = r4
            r16 = r3
            r17 = r4
            r20 = r3
            r21 = r1
            com.facebook.msys.mci.TraceLogger.logCrucialCheckpoint(r15, r16, r17, r18, r19, r20, r21)
        L_0x00cb:
            java.lang.Long r1 = r35.C6I()
            long r31 = r1.longValue()
            java.lang.Integer r23 = X.AnonymousClass05K.A0j
            r7 = 3
            r11 = 5
            r36 = r40
            r8 = r41
            r12 = r45
            r29 = r48
            r21 = r36
            r22 = r8
            r24 = r4
            r25 = r12
            r26 = r0
            r28 = r14
            X.OIH r1 = X.C69847NtB.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r31)
            if (r1 != 0) goto L_0x014f
            java.lang.String r4 = "ArmadilloExpressMessageProcessor"
            java.lang.String r1 = "Not able to create message metadata from transport payload"
            X.0KC.A0C(r4, r1)
            r9 = 3
            java.util.List r4 = X.C66582MXn.A10(r9)
            r1 = 7035(0x1b7b, float:9.858E-42)
            r5.A00(r0, r4, r1, r7)
            r5.A01(r0, r3)
            X.OO2 r1 = r6.A04
            X.OZu r3 = r1.A01
            java.lang.String r1 = "metadata_failed"
            r3.A02(r0, r1)
            r3.A04(r0, r7)
            X.65S r1 = r6.A06
            java.lang.String r3 = "Unable to create message metadata"
            r1.A07(r12, r0, r3, r2)
            X.8zv r1 = X.C372178zu.A0A
            X.8zu r2 = r1.A00()
            if (r2 == 0) goto L_0x0126
            com.instagram.common.session.UserSession r1 = r6.A00
            X.OQ5.A01(r1, r8, r2, r14, r0)
        L_0x0126:
            X.Mfp r1 = X.C66957Mfq.A0A
            X.Mfq r2 = r1.A00()
            if (r2 == 0) goto L_0x0133
            com.instagram.common.session.UserSession r1 = r6.A00
            X.OQ5.A00(r2, r1, r8, r14, r0)
        L_0x0133:
            X.NnF r0 = new X.NnF
            r0.<init>(r3)
            X.NQW r1 = new X.NQW
            r1.<init>()
            r1.A09(r0)
            return r1
        L_0x0141:
            r7 = 0
            goto L_0x0054
        L_0x0145:
            r7 = 0
            goto L_0x0044
        L_0x0149:
            X.OMd r5 = r6.A05
            r4 = 134(0x86, float:1.88E-43)
            goto L_0x0034
        L_0x014f:
            r12 = 2
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Long[] r12 = new java.lang.Long[]{r12}
            java.util.ArrayList r13 = X.0sr.A1M(r12)
            r12 = 7010(0x1b62, float:9.823E-42)
            r5.A00(r0, r13, r12, r3)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r12 = r36.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r14 = r12.content_
            if (r14 != 0) goto L_0x016c
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r14 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x016c:
            int r13 = r14.addMessageContentCase_
            r12 = 21
            if (r13 == r2) goto L_0x0179
            r12 = 41
            if (r13 != r7) goto L_0x0261
            r12 = 70546(0x11392, float:9.8856E-41)
        L_0x0179:
            long r12 = (long) r12
            java.util.List r13 = X.C66582MXn.A10(r12)
            r12 = 1255(0x4e7, float:1.759E-42)
            r5.A00(r0, r13, r12, r3)
            r12 = r36
            int r13 = r12.transportPayloadCase_
            if (r13 == r2) goto L_0x0218
            boolean r12 = X.AnonymousClass7TF.A1S(r13, r7)
            if (r12 != 0) goto L_0x0218
            if (r13 != r10) goto L_0x01eb
            java.lang.String r2 = X.C69854NtI.A00(r36)
            if (r2 == 0) goto L_0x02d6
            java.lang.String r9 = r1.A0A
            java.lang.String r8 = X.C2611348j.A03(r2)
            if (r8 == 0) goto L_0x02d1
            X.2Dm r2 = r6.A03
            com.instagram.model.direct.DirectThreadKey r1 = r35.BJy()
            X.3su r1 = r2.BRy(r1, r8)
            if (r1 == 0) goto L_0x01e3
            java.lang.String r1 = r1.A1u
            boolean r1 = X.0qQ.A0K(r1, r9)
            if (r1 != 0) goto L_0x01e3
            com.instagram.common.session.UserSession r7 = r6.A00
            X.0Tu r6 = X.0Tu.A05
            r1 = 36318892002843335(0x8107d700771ac7, double:3.0315517748132696E-306)
            boolean r1 = X.182.A06(r6, r7, r1)
            if (r1 != 0) goto L_0x01e3
            java.lang.String r1 = "ArmadilloExpressMessageProcessor"
            java.lang.String r6 = "sender id mismatch for unsend"
            X.0KC.A0C(r1, r6)
            r1 = 7035(0x1b7b, float:9.858E-42)
            r5.A00(r0, r4, r1, r11)
            r5.A01(r0, r3)
        L_0x01d1:
            X.NcB r1 = new X.NcB
            r1.<init>(r6)
        L_0x01d6:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            X.NQW r1 = new X.NQW
            r1.<init>()
            r1.A0A(r0)
            return r1
        L_0x01e3:
            X.NcA r1 = new X.NcA
            r0 = r35
            r1.<init>(r0, r4, r8, r9)
            goto L_0x01d6
        L_0x01eb:
            r1 = 7035(0x1b7b, float:9.858E-42)
            r5.A00(r0, r4, r1, r9)
            r5.A01(r0, r3)
            X.8zv r1 = X.C372178zu.A0A
            X.8zu r3 = r1.A00()
            if (r3 == 0) goto L_0x0204
            com.instagram.common.session.UserSession r2 = r6.A00
            java.lang.String r1 = r35.C6C()
            X.OQ5.A01(r2, r8, r3, r1, r0)
        L_0x0204:
            X.Mfp r1 = X.C66957Mfq.A0A
            X.Mfq r3 = r1.A00()
            if (r3 == 0) goto L_0x0215
            com.instagram.common.session.UserSession r2 = r6.A00
            java.lang.String r1 = r35.C6C()
            X.OQ5.A00(r3, r2, r8, r1, r0)
        L_0x0215:
            java.lang.String r6 = "Unexpected TransportPayload type"
            goto L_0x01d1
        L_0x0218:
            com.instagram.common.session.UserSession r11 = r6.A00
            X.5yD r13 = X.C300935yC.A00(r11)
            com.instagram.model.direct.DirectThreadKey r14 = r35.BJy()
            java.lang.String r12 = r1.A05
            java.lang.String r9 = r1.A0A
            r15 = r12
            r16 = r9
            r17 = r2
            r18 = r3
            r19 = r2
            boolean r12 = r13.A03(r14, r15, r16, r17, r18, r19)
            if (r12 == 0) goto L_0x02db
            r5.A01(r0, r2)
            X.65S r3 = r6.A06
            java.lang.String r1 = r1.A07
            java.lang.String r6 = "dropping DST message"
            r3.A07(r1, r0, r6, r2)
            X.8zv r1 = X.C372178zu.A0A
            X.8zu r2 = r1.A00()
            if (r2 == 0) goto L_0x0250
            java.lang.String r1 = r35.C6C()
            X.OQ5.A01(r11, r8, r2, r1, r0)
        L_0x0250:
            X.Mfp r1 = X.C66957Mfq.A0A
            X.Mfq r2 = r1.A00()
            if (r2 == 0) goto L_0x01d1
            java.lang.String r1 = r35.C6C()
            X.OQ5.A00(r2, r11, r8, r1, r0)
            goto L_0x01d1
        L_0x0261:
            if (r13 != r10) goto L_0x0267
            r12 = 43
            goto L_0x0179
        L_0x0267:
            r15 = 7
            if (r13 != r15) goto L_0x026e
            r12 = 15
            goto L_0x0179
        L_0x026e:
            r15 = 6
            if (r13 != r15) goto L_0x0275
            r12 = 46
            goto L_0x0179
        L_0x0275:
            r15 = 8
            if (r13 != r15) goto L_0x027d
            r12 = 28
            goto L_0x0179
        L_0x027d:
            if (r13 != r9) goto L_0x0282
            r12 = 7
            goto L_0x0179
        L_0x0282:
            com.instagram.direct.armadilloexpress.transportpayload.Media r13 = r14.A0L()
            int r14 = r13.mediaCase_
            if (r14 != r2) goto L_0x028d
            r12 = 2
            goto L_0x0179
        L_0x028d:
            if (r14 != r10) goto L_0x0292
            r12 = 5
            goto L_0x0179
        L_0x0292:
            if (r14 != r7) goto L_0x0297
            r12 = 4
            goto L_0x0179
        L_0x0297:
            if (r14 != r11) goto L_0x029d
            r12 = 30
            goto L_0x0179
        L_0x029d:
            if (r14 != r9) goto L_0x02a3
            r12 = 13
            goto L_0x0179
        L_0x02a3:
            r13 = 6
            if (r14 != r13) goto L_0x02aa
            r12 = 14
            goto L_0x0179
        L_0x02aa:
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r13 = X.C66582MXn.A0R(r36)
            int r13 = r13.supplementMessageContentCase_
            if (r13 == r2) goto L_0x0179
            if (r13 == r9) goto L_0x0179
            if (r13 != r10) goto L_0x02ba
            r12 = 48
            goto L_0x0179
        L_0x02ba:
            if (r13 != r11) goto L_0x02c0
            r12 = 47
            goto L_0x0179
        L_0x02c0:
            if (r13 != r7) goto L_0x02c6
            r12 = 44
            goto L_0x0179
        L_0x02c6:
            r12 = r36
            int r13 = r12.transportPayloadCase_
            r12 = 0
            if (r13 != r10) goto L_0x0179
            r12 = 29
            goto L_0x0179
        L_0x02d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02db:
            r5 = r36
            int r5 = r5.transportPayloadCase_
            if (r5 != r2) goto L_0x05ba
            r11 = r0
        L_0x02e2:
            X.O5t r18 = new X.O5t
            r18.<init>()
            X.OO2 r5 = r6.A04
            X.OZu r12 = r5.A01
            java.lang.String r5 = "build_start"
            r12.A02(r0, r5)
            X.OFO r12 = r6.A01
            if (r11 == 0) goto L_0x05c6
            X.Pmx r17 = new X.Pmx
            r31 = r17
            r32 = r6
            r33 = r18
            r34 = r1
            r37 = r0
            r38 = r11
            r39 = r10
            r40 = r29
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            com.instagram.common.session.UserSession r10 = r12.A00
            X.0Tu r13 = X.0Tu.A05
            r5 = 36318892004416217(0x8107d7008f1ad9, double:3.0315517758079665E-306)
            boolean r5 = X.182.A06(r13, r10, r5)
            X.OMd r6 = r12.A03
            if (r5 == 0) goto L_0x0477
            r12 = 1
            java.util.List r12 = X.C66582MXn.A10(r12)
            r5 = 7051(0x1b8b, float:9.88E-42)
            r6.A00(r0, r12, r5, r3)
            X.OTW r5 = new X.OTW
            r5.<init>(r10, r6)
            X.OMd r6 = r5.A03
            r10 = 7041(0x1b81, float:9.867E-42)
            r6.A00(r0, r4, r10, r3)
            r10 = r36
            int r10 = r10.transportPayloadCase_
            if (r10 != r2) goto L_0x0385
            int r7 = r8.ordinal()
            if (r7 == r3) goto L_0x0382
            r27 = 2
            if (r7 == r2) goto L_0x0343
            r27 = 0
        L_0x0343:
            java.lang.String r7 = r1.A06
            long r30 = X.C2611348j.A00(r7)
            X.Oa0 r19 = X.C71037Oa0.A00
            com.instagram.common.session.UserSession r5 = r5.A00
            long r1 = r1.A00
            X.7Qc r8 = new X.7Qc
            r9 = r35
            r8.<init>(r9)
            java.lang.Long r24 = java.lang.Long.valueOf(r42)
            r32 = r3
            r20 = r5
            r22 = r8
            r25 = r0
            r26 = r7
            r28 = r1
            X.3su r10 = r19.A02(r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32)
            r0 = 7044(0x1b84, float:9.871E-42)
            r6.A00(r11, r4, r0, r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Added message fails to be rebuilt from payload"
            X.OTW.A00(r10, r11, r1, r0)
        L_0x0378:
            r0 = r17
            r0.invoke(r10)
        L_0x037d:
            r0 = r18
            X.1GK r1 = r0.A00
            return r1
        L_0x0382:
            r27 = 1
            goto L_0x0343
        L_0x0385:
            boolean r8 = X.AnonymousClass7TF.A1S(r10, r7)
            if (r8 == 0) goto L_0x037d
            boolean r8 = X.AnonymousClass7TF.A1S(r10, r7)
            X.17k.A0F(r8)
            boolean r7 = X.AnonymousClass7TF.A1S(r10, r7)
            X.17k.A0F(r7)
            X.2Dm r8 = r5.A02
            com.instagram.model.direct.DirectThreadKey r7 = r35.BJy()
            X.3su r10 = r8.BRy(r7, r11)
            if (r10 == 0) goto L_0x0425
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r7 = X.C66580MXl.A0S(r36)
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r14 = r7.content_
            if (r14 != 0) goto L_0x03af
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r14 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE
        L_0x03af:
            X.0qQ.A07(r14)
            long r7 = r1.A01
            X.7Qc r13 = new X.7Qc
            r12 = r35
            r13.<init>(r12)
            java.lang.Integer r14 = r14.A0M()
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            if (r14 != r12) goto L_0x03fa
            java.util.List r12 = r10.A0v()
            java.util.ArrayList r15 = X.DbV.A15(r12)
            java.util.Iterator r16 = r12.iterator()
        L_0x03cf:
            boolean r12 = r16.hasNext()
            if (r12 == 0) goto L_0x03e4
            java.lang.Object r14 = r16.next()
            r12 = r14
            X.46u r12 = (X.C2607246u) r12
            java.lang.String r12 = r12.A00()
            X.JTR.A1P(r12, r9, r14, r15)
            goto L_0x03cf
        L_0x03e4:
            java.util.Iterator r15 = r15.iterator()
        L_0x03e8:
            boolean r12 = r15.hasNext()
            if (r12 == 0) goto L_0x03fa
            java.lang.Object r14 = r15.next()
            X.46u r14 = (X.C2607246u) r14
            com.instagram.common.session.UserSession r12 = r5.A00
            r10.A0z(r12, r14, r9, r4)
            goto L_0x03e8
        L_0x03fa:
            X.Oa0 r19 = X.C71037Oa0.A00
            com.instagram.common.session.UserSession r9 = r5.A00
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r21 = X.C66580MXl.A0S(r36)
            r22 = r10
            r23 = r13
            r24 = r7
            r26 = r42
            r20 = r9
            r19.A04(r20, r21, r22, r23, r24, r26)
            r7 = 7044(0x1b84, float:9.871E-42)
            r6.A00(r11, r4, r7, r3)
            X.2FW r8 = r10.A10
            X.2FW r7 = X.2FW.A0q
            if (r8 == r7) goto L_0x0425
            long r0 = r1.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.OTW.A00(r10, r11, r0, r4)
            goto L_0x0378
        L_0x0425:
            com.instagram.common.session.UserSession r7 = r5.A00
            X.OO2 r7 = X.O0F.A00(r7)
            X.OKV r8 = r7.A02
            monitor-enter(r8)
            java.util.Set r7 = r8.A01     // Catch:{ all -> 0x05c0 }
            boolean r7 = r7.contains(r11)     // Catch:{ all -> 0x05c0 }
            monitor-exit(r8)
            if (r7 == 0) goto L_0x043c
            r7 = 7052(0x1b8c, float:9.882E-42)
            r6.A00(r0, r4, r7, r3)
        L_0x043c:
            X.Pmx r19 = new X.Pmx
            r20 = r5
            r21 = r1
            r22 = r35
            r23 = r17
            r24 = r36
            r25 = r0
            r26 = r11
            r27 = r2
            r28 = r42
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.7Qc r10 = new X.7Qc
            r1 = r35
            r10.<init>(r1)
            r1 = 7045(0x1b85, float:9.872E-42)
            r6.A00(r0, r4, r1, r3)
            X.OKF r9 = r5.A01
            java.lang.Long r1 = r35.C6I()
            long r13 = r1.longValue()
            r7 = 25
            X.PqY r2 = new X.PqY
            r3 = r5
            r4 = r19
            r5 = r11
            r6 = r0
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7)
            goto L_0x05a9
        L_0x0477:
            r13 = 0
            java.util.List r13 = X.C66582MXn.A10(r13)
            r5 = 7051(0x1b8b, float:9.88E-42)
            r6.A00(r0, r13, r5, r3)
            r5 = 7041(0x1b81, float:9.867E-42)
            r6.A00(r0, r4, r5, r3)
            r5 = r36
            int r5 = r5.transportPayloadCase_
            if (r5 != r2) goto L_0x04db
            int r5 = r8.ordinal()
            if (r5 == r3) goto L_0x04d8
            r27 = 2
            if (r5 == r2) goto L_0x0499
            r27 = 0
        L_0x0499:
            java.lang.String r8 = r1.A06
            long r30 = X.C2611348j.A00(r8)
            X.Oa0 r19 = X.C71037Oa0.A00
            long r1 = r1.A00
            X.7Qc r5 = new X.7Qc
            r7 = r35
            r5.<init>(r7)
            java.lang.Long r24 = java.lang.Long.valueOf(r42)
            r32 = r3
            r20 = r10
            r22 = r5
            r25 = r0
            r26 = r8
            r28 = r1
            X.3su r5 = r19.A02(r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32)
        L_0x04be:
            if (r5 == 0) goto L_0x0576
            X.2FW r2 = r5.A10
            X.2FW r1 = X.2FW.A0q
            if (r2 == r1) goto L_0x0576
            java.lang.String r1 = r5.A0g()
            if (r1 == 0) goto L_0x0576
            r1 = 7044(0x1b84, float:9.871E-42)
            r6.A00(r0, r4, r1, r3)
            r0 = r17
            r0.invoke(r5)
            goto L_0x037d
        L_0x04d8:
            r27 = 1
            goto L_0x0499
        L_0x04db:
            boolean r2 = X.AnonymousClass7TF.A1S(r5, r7)
            if (r2 == 0) goto L_0x0575
            boolean r2 = X.AnonymousClass7TF.A1S(r5, r7)
            X.17k.A0F(r2)
            X.2Dm r5 = r12.A02
            com.instagram.model.direct.DirectThreadKey r2 = r35.BJy()
            X.3su r5 = r5.BRy(r2, r11)
            if (r5 == 0) goto L_0x0547
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r2 = X.C66580MXl.A0S(r36)
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r13 = r2.content_
            if (r13 != 0) goto L_0x04fe
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r13 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE
        L_0x04fe:
            X.0qQ.A07(r13)
            long r1 = r1.A01
            X.7Qc r8 = new X.7Qc
            r7 = r35
            r8.<init>(r7)
            java.lang.Integer r13 = r13.A0M()
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r13 != r7) goto L_0x0549
            java.util.List r7 = r5.A0v()
            java.util.ArrayList r14 = X.DbV.A15(r7)
            java.util.Iterator r15 = r7.iterator()
        L_0x051e:
            boolean r7 = r15.hasNext()
            if (r7 == 0) goto L_0x0533
            java.lang.Object r13 = r15.next()
            r7 = r13
            X.46u r7 = (X.C2607246u) r7
            java.lang.String r7 = r7.A00()
            X.JTR.A1P(r7, r9, r13, r14)
            goto L_0x051e
        L_0x0533:
            java.util.Iterator r13 = r14.iterator()
        L_0x0537:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x0549
            java.lang.Object r7 = r13.next()
            X.46u r7 = (X.C2607246u) r7
            r5.A0z(r10, r7, r9, r4)
            goto L_0x0537
        L_0x0547:
            r5 = 0
            goto L_0x055c
        L_0x0549:
            X.Oa0 r19 = X.C71037Oa0.A00
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r21 = X.C66580MXl.A0S(r36)
            r20 = r10
            r22 = r5
            r23 = r8
            r24 = r1
            r26 = r42
            r19.A04(r20, r21, r22, r23, r24, r26)
        L_0x055c:
            if (r5 != 0) goto L_0x04be
            X.OO2 r1 = X.O0F.A00(r10)
            X.OKV r2 = r1.A02
            monitor-enter(r2)
            java.util.Set r1 = r2.A01     // Catch:{ all -> 0x05c3 }
            boolean r1 = r1.contains(r11)     // Catch:{ all -> 0x05c3 }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x04be
            r1 = 7052(0x1b8c, float:9.882E-42)
            r6.A00(r0, r4, r1, r3)
            goto L_0x04be
        L_0x0575:
            r5 = 0
        L_0x0576:
            r25 = 15
            X.Pmh r19 = new X.Pmh
            r20 = r17
            r21 = r12
            r22 = r5
            r23 = r35
            r24 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.7Qc r10 = new X.7Qc
            r1 = r35
            r10.<init>(r1)
            r1 = 7045(0x1b85, float:9.872E-42)
            r6.A00(r0, r4, r1, r3)
            X.OKF r9 = r12.A01
            java.lang.Long r1 = r35.C6I()
            long r13 = r1.longValue()
            r7 = 24
            X.PqY r2 = new X.PqY
            r3 = r12
            r4 = r19
            r5 = r11
            r6 = r0
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7)
        L_0x05a9:
            java.util.List r11 = X.AnonymousClass7TE.A1I(r11)
            r1 = 9
            X.PqZ r0 = new X.PqZ
            r0.<init>(r2, r1)
            r12 = r0
            r9.A00(r10, r11, r12, r13)
            goto L_0x037d
        L_0x05ba:
            java.lang.String r11 = X.C69854NtI.A00(r36)
            goto L_0x02e2
        L_0x05c0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x05c3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x05c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZM.A00(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload, X.Nkj, X.2Ep, X.OZM, java.lang.String, java.lang.String, long, long):X.1GK");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C68978Nc9 A01(X.C254703su r7, X.AnonymousClass2Ep r8, X.OZM r9) {
        /*
            boolean r0 = r7.A2P
            r5 = 0
            if (r0 == 0) goto L_0x0071
            com.instagram.common.session.UserSession r6 = r9.A00
            java.lang.String r4 = r6.A06
            java.lang.String r0 = r7.A0g()
            r3 = 0
            boolean r0 = X.AnonymousClass48N.A0A(r8, r4, r0)
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = r7.A0f()
            if (r2 == 0) goto L_0x0021
            X.OMd r1 = r9.A05
            r0 = 7027(0x1b73, float:9.847E-42)
            r1.A00(r2, r5, r0, r3)
        L_0x0021:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318891997665932(0x8107d700281a8c, double:3.031551771539059E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0071
            X.3SZ r1 = r8.Aue(r4)
            X.3su r0 = r8.BLT()
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = r0.A0g()
        L_0x003c:
            if (r1 == 0) goto L_0x008e
            X.3Sc r0 = r1.A02
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = r0.A01
        L_0x0044:
            if (r2 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x004e
            int r0 = r1.compareTo(r2)
            if (r0 > 0) goto L_0x008a
        L_0x004e:
            long r2 = X.C2611348j.A00(r2)
            r0 = 1
            long r2 = r2 + r0
            java.lang.String r0 = r7.A0g()
            java.lang.String r0 = X.C2611348j.A03(r0)
            if (r0 == 0) goto L_0x0092
            java.lang.String r4 = X.C2611348j.A04(r0, r2)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            r7.A1E(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.A1A(r0)
        L_0x0071:
            com.instagram.common.session.UserSession r1 = r9.A00
            com.instagram.model.direct.DirectThreadKey r0 = r8.BJy()
            X.3t0 r0 = X.AnonymousClass3t7.A00(r0)
            if (r0 == 0) goto L_0x0081
            X.3t0 r5 = X.C300965yF.A02(r0)
        L_0x0081:
            r7.A11(r1, r5)
            X.Nc9 r0 = new X.Nc9
            r0.<init>(r7, r8)
            return r0
        L_0x008a:
            r2 = r1
            if (r1 == 0) goto L_0x0071
            goto L_0x004e
        L_0x008e:
            r1 = r5
            goto L_0x0044
        L_0x0090:
            r2 = r5
            goto L_0x003c
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZM.A01(X.3su, X.2Ep, X.OZM):X.Nc9");
    }

    public OZM(UserSession userSession, OL8 ol8, 2Dm r4, OO2 oo2, C70808OMd oMd, AnonymousClass65S r7) {
        C51974G9v.A1P(userSession, r4, oMd, oo2);
        0qQ.A0B(r7, 5);
        this.A00 = userSession;
        this.A03 = r4;
        this.A05 = oMd;
        this.A04 = oo2;
        this.A06 = r7;
        this.A02 = ol8;
        this.A01 = new OFO(userSession, oMd);
    }
}
