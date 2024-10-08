package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Ma7  reason: case insensitive filesystem */
public final class C66638Ma7 {
    public final UserSession A00;
    public final AnonymousClass7QY A01;
    public final C70833ONf A02;
    public final OO1 A03;

    public C66638Ma7(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = C70178NyW.A00(userSession);
        this.A02 = (C70833ONf) userSession.A01(C70833ONf.class, new C73903Ple(userSession, 7));
        this.A01 = AnonymousClass7QX.A00(userSession);
    }

    public static final int A00(AnonymousClass2Ep r4, 1OS r5, boolean z, boolean z2) {
        C69405Nkj nkj;
        if (!z || !r4.Axj()) {
            if (z2) {
                return 3;
            }
            C70621ODs oDs = r5.A02.A00;
            if (oDs == null || (nkj = oDs.A00) == null) {
                return 0;
            }
            int ordinal = nkj.ordinal();
            if (ordinal == 0) {
                return 1;
            }
            if (ordinal != 1) {
                return 0;
            }
        }
        return 2;
    }

    public final void A02(TransportPayload transportPayload, C74551Pwk pwk, 1OS r11, DirectThreadKey directThreadKey, int i) {
        A03(transportPayload, pwk, r11, directThreadKey, i, false, false);
    }

    public static final String A01(AnonymousClass2Ep r4, 1OS r5, C66638Ma7 ma7) {
        C270214gN r2;
        UserSession userSession = ma7.A00;
        if (!r4.CVZ(userSession) || (r2 = r5.A03) == null || r2.A01 != C69414Nku.A0E || !0qQ.A0K(r2.A03, RealtimeSubscription.GRAPHQL_MQTT_VERSION) || !182.A06(0Tu.A05, userSession, 36327842706897655L)) {
            return r5.A05;
        }
        String A0s = DbV.A0s();
        String A002 = ma7.A03.A00(r5.A05);
        if (A002 != null) {
            C282375Cv.A02(0, A002, A0s);
        }
        return A0s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03c4, code lost:
        if (r9 != 5) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x046b, code lost:
        if (r10 != r14) goto L_0x046d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0396 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ea A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03f0 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03f1 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0442 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0467 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0222 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0244 A[Catch:{ all -> 0x04aa }, LOOP:0: B:66:0x023e->B:68:0x0244, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0251 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x025c A[Catch:{ all -> 0x04aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r73, X.C74551Pwk r74, X.1OS r75, com.instagram.model.direct.DirectThreadKey r76, int r77, boolean r78, boolean r79) {
        /*
            r72 = this;
            r24 = 0
            r11 = r74
            r8 = r76
            r0 = r24
            int r14 = X.DbW.A02(r0, r8, r11)
            r15 = 3
            r2 = r73
            X.0qQ.A0B(r2, r15)
            r0 = r75
            java.lang.String r1 = r0.A05
            int r3 = r1.hashCode()
            r4 = r72
            com.instagram.common.session.UserSession r1 = r4.A00
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger r23 = X.AnonymousClass7G0.A00(r1, r3)
            if (r23 == 0) goto L_0x0027
            r23.onLogSendArmadilloExpressPayloadStart()
        L_0x0027:
            X.0Tu r7 = X.0Tu.A05
            r5 = 36329955830808966(0x8111e700004186, double:3.038548584169194E-306)
            boolean r3 = X.182.A06(r7, r1, r5)
            if (r3 == 0) goto L_0x01c7
            boolean r3 = r0 instanceof X.1bp
            if (r3 == 0) goto L_0x004d
            X.2Dm r4 = X.2L2.A00(r1)
            r3 = r0
            X.1bp r3 = (X.1bp) r3
            java.lang.String r3 = r3.A06()
            X.3su r4 = r4.BRy(r8, r3)
            if (r4 == 0) goto L_0x004d
            r3 = 1
            r4.A1L(r3)
        L_0x004d:
            r6 = 0
            X.Mah r5 = new X.Mah
            r5.<init>(r11, r6)
            r3 = 36329955830874503(0x8111e700014187, double:3.03854858421064E-306)
            boolean r3 = X.182.A06(r7, r1, r3)
            r69 = 0
            if (r3 == 0) goto L_0x0110
            java.lang.String r10 = r8.A00
            java.util.List r3 = r8.A02
            if (r10 != 0) goto L_0x0067
            r6 = r3
        L_0x0067:
            java.lang.String r9 = r0.A05
            byte[] r0 = r2.A0H()
            java.lang.String r11 = android.util.Base64.encodeToString(r0, r14)
            int r7 = X.C70265Nzv.A00(r2)
            java.lang.String r3 = X.C69854NtI.A00(r2)
            r4 = 0
            if (r3 == 0) goto L_0x008a
            X.2Dm r0 = X.2L2.A00(r1)
            X.3su r0 = r0.BRy(r8, r3)
            if (r0 == 0) goto L_0x008a
            java.lang.String r4 = r0.A0g()
        L_0x008a:
            int r0 = r2.transportPayloadCase_
            if (r0 != r15) goto L_0x010e
            X.OdD r12 = X.C71119OdD.A00
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r8 = X.C66580MXl.A0S(r2)
            java.lang.String r0 = r1.A06
            long r2 = java.lang.Long.parseLong(r0)
            java.lang.String r8 = r12.A04(r1, r8, r2)
        L_0x009e:
            X.1NY r3 = X.DbU.A0N(r1)
            X.2FW r0 = X.2FW.A1H
            java.lang.String r12 = "direct_v2/threads/broadcast/"
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "/"
            java.lang.String r2 = X.002.A0g(r12, r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r0 = r0.toString()
            r3.A0A(r0)
            java.lang.Class<X.NHZ> r2 = X.NHZ.class
            java.lang.Class<X.OQJ> r0 = X.OQJ.class
            r3.A0R(r2, r0)
            java.lang.String r2 = "action"
            java.lang.String r0 = "send_item"
            r3.A9m(r2, r0)
            java.lang.String r12 = "item_type"
            r0 = 1652(0x674, float:2.315E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r3.A9m(r12, r2)
            java.lang.String r0 = "thread_id"
            r3.A0G(r0, r10)
            java.lang.String r0 = "client_context"
            r3.A9m(r0, r9)
            r3.A9m(r2, r11)
            java.lang.String r0 = "opaque_message_type"
            r3.A0C(r0, r7)
            java.lang.String r0 = "target_item_id"
            r3.A0G(r0, r4)
            java.lang.String r0 = "supplemental_key"
            r3.A0G(r0, r8)
            if (r6 == 0) goto L_0x00fa
            java.lang.String r2 = X.C51970G9q.A0k(r6)
            java.lang.String r0 = "recipient_users"
            r3.A9m(r0, r2)
        L_0x00fa:
            X.1OC r2 = r3.A0M()
            X.NHq r0 = new X.NHq
            r0.<init>(r1, r5)
            r2.A00 = r0
            X.1ES.A03(r2)
        L_0x0108:
            if (r23 == 0) goto L_0x010d
            r23.onLogSendArmadilloExpressPayloadEnd()
        L_0x010d:
            return
        L_0x010e:
            r8 = 0
            goto L_0x009e
        L_0x0110:
            X.0xN r3 = X.C60510iO.A00(r1)
            java.lang.String r40 = r3.BcO()
            java.lang.String r4 = r8.A00
            java.util.List r3 = r8.A02
            if (r4 != 0) goto L_0x0124
            if (r3 == 0) goto L_0x0124
            java.lang.String r69 = X.C51970G9q.A0k(r3)
        L_0x0124:
            java.lang.String r7 = r0.A05
            X.2FW r28 = X.2FW.A1H
            byte[] r3 = r2.A0H()
            java.lang.String r66 = android.util.Base64.encodeToString(r3, r14)
            int r10 = X.C70265Nzv.A00(r2)
            java.lang.String r9 = X.C69854NtI.A00(r2)
            r67 = 0
            if (r9 == 0) goto L_0x014a
            X.2Dm r3 = X.2L2.A00(r1)
            X.3su r3 = r3.BRy(r8, r9)
            if (r3 == 0) goto L_0x014a
            java.lang.String r67 = r3.A0g()
        L_0x014a:
            int r3 = r2.transportPayloadCase_
            if (r3 != r15) goto L_0x01c4
            X.OdD r8 = X.C71119OdD.A00
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r9 = X.C66580MXl.A0S(r2)
            java.lang.String r2 = r1.A06
            long r2 = java.lang.Long.parseLong(r2)
            java.lang.String r68 = r8.A04(r1, r9, r2)
        L_0x015e:
            X.MaY r0 = r0.A02
            boolean r3 = r0.A09
            java.lang.String r2 = r0.A04
            java.lang.Integer r36 = java.lang.Integer.valueOf(r10)
            java.lang.String r42 = "send_item"
            X.OVe r0 = new X.OVe
            r25 = r6
            r26 = r6
            r27 = r6
            r29 = r6
            r30 = r6
            r31 = r6
            r32 = r6
            r33 = r6
            r34 = r6
            r35 = r6
            r37 = r6
            r38 = r6
            r39 = r6
            r41 = r4
            r43 = r6
            r44 = r6
            r45 = r6
            r46 = r7
            r47 = r6
            r48 = r6
            r49 = r2
            r50 = r6
            r51 = r6
            r52 = r6
            r53 = r6
            r54 = r6
            r55 = r6
            r56 = r6
            r57 = r6
            r58 = r6
            r59 = r6
            r60 = r6
            r61 = r6
            r62 = r6
            r63 = r6
            r64 = r6
            r65 = r6
            r70 = r3
            r71 = r24
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            X.OSJ.A00(r1, r0, r5)
            goto L_0x0108
        L_0x01c4:
            r68 = 0
            goto L_0x015e
        L_0x01c7:
            java.lang.String r3 = r0.A05
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger r30 = X.C66581MXm.A0k(r1, r3)
            boolean r3 = r1.A07()
            java.lang.String r9 = "ArmadilloExpressOutbox"
            if (r3 == 0) goto L_0x01f0
            r5 = 36320571329618568(0x81095e00242288, double:3.032613787828033E-306)
            boolean r3 = X.182.A06(r7, r1, r5)
            if (r3 == 0) goto L_0x01f0
            java.lang.String r1 = "Skip sending armadillo express payload for stopped user session"
            X.0KC.A0E(r9, r1)
            X.ONf r3 = r4.A02
            java.lang.String r1 = r0.A05
            X.4gN r0 = X.C270214gN.A0J
            r3.A01(r2, r11, r0, r1)
            goto L_0x0108
        L_0x01f0:
            r5 = -1013172846(0xffffffffc39c3592, float:-312.41852)
            java.lang.String r3 = "SendArmadilloExpressPayload"
            X.0fh.A01(r3, r5)
            java.lang.String r3 = "ae"
            r0.A07 = r3     // Catch:{ all -> 0x04aa }
            X.3U9 r22 = X.C66582MXn.A0a(r1, r8)     // Catch:{ all -> 0x04aa }
            r5 = 1
            if (r22 == 0) goto L_0x0274
            boolean r3 = r22.CUG()     // Catch:{ all -> 0x04aa }
            if (r3 == r5) goto L_0x021a
            X.3Tu r3 = r22.AiM()     // Catch:{ all -> 0x04aa }
            if (r3 == 0) goto L_0x0217
            int r3 = r3.A01     // Catch:{ all -> 0x04aa }
            r6 = 4
            r3 = r3 & 4
            if (r3 != r6) goto L_0x0217
            goto L_0x021a
        L_0x0217:
            r40 = 0
            goto L_0x021c
        L_0x021a:
            r40 = 1
        L_0x021c:
            boolean r3 = r22.CbX()     // Catch:{ all -> 0x04aa }
            if (r3 != r5) goto L_0x0251
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r1)     // Catch:{ all -> 0x04aa }
            java.lang.Long r21 = r3.BST()     // Catch:{ all -> 0x04aa }
            java.lang.String r3 = r1.A06     // Catch:{ all -> 0x04aa }
            java.util.List r19 = X.AnonymousClass7TE.A1I(r3)     // Catch:{ all -> 0x04aa }
        L_0x0230:
            java.util.List r3 = r22.BRX()     // Catch:{ all -> 0x04aa }
            r18 = 10
            java.util.ArrayList r20 = X.AnonymousClass7TF.A0p(r3)     // Catch:{ all -> 0x04aa }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x04aa }
        L_0x023e:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x04aa }
            if (r3 == 0) goto L_0x025a
            java.lang.String r6 = X.AnonymousClass7TE.A18(r8)     // Catch:{ all -> 0x04aa }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x04aa }
            r3 = r20
            X.C66582MXn.A1N(r6, r3)     // Catch:{ all -> 0x04aa }
            goto L_0x023e
        L_0x0251:
            java.lang.Long r21 = r22.C6I()     // Catch:{ all -> 0x04aa }
            java.util.List r19 = r22.BRV()     // Catch:{ all -> 0x04aa }
            goto L_0x0230
        L_0x025a:
            if (r21 == 0) goto L_0x0274
            java.lang.Long r6 = X.2Eq.A00     // Catch:{ all -> 0x04aa }
            r3 = r21
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x04aa }
            if (r3 != 0) goto L_0x0274
            boolean r3 = r19.isEmpty()     // Catch:{ all -> 0x04aa }
            if (r3 != 0) goto L_0x0274
            if (r40 == 0) goto L_0x0287
            boolean r3 = r20.isEmpty()     // Catch:{ all -> 0x04aa }
            if (r3 == 0) goto L_0x0287
        L_0x0274:
            java.lang.String r1 = "Failed to get other user ids from a DirectThreadKey"
            X.0KC.A0C(r9, r1)     // Catch:{ all -> 0x04aa }
            X.ONf r3 = r4.A02     // Catch:{ all -> 0x04aa }
            java.lang.String r1 = r0.A05     // Catch:{ all -> 0x04aa }
            X.4gN r0 = X.C270214gN.A0E     // Catch:{ all -> 0x04aa }
            r3.A01(r2, r11, r0, r1)     // Catch:{ all -> 0x04aa }
            r0 = 24679132(0x17892dc, float:4.5655773E-38)
            goto L_0x04a5
        L_0x0287:
            X.0rm r3 = X.C51965G9l.A11()     // Catch:{ all -> 0x04aa }
            X.OO1 r8 = r4.A03     // Catch:{ all -> 0x04aa }
            java.lang.String r6 = r0.A05     // Catch:{ all -> 0x04aa }
            java.lang.String r6 = r8.A00(r6)     // Catch:{ all -> 0x04aa }
            r3.A00 = r6     // Catch:{ all -> 0x04aa }
            int r6 = r2.transportPayloadCase_     // Catch:{ all -> 0x04aa }
            r12 = 1
            if (r6 == r5) goto L_0x029b
            r12 = 0
        L_0x029b:
            boolean r10 = r2.openEb_     // Catch:{ all -> 0x04aa }
            r6 = r22
            int r10 = A00(r6, r0, r12, r10)     // Catch:{ all -> 0x04aa }
            java.lang.Object r6 = r3.A00     // Catch:{ all -> 0x04aa }
            if (r6 != 0) goto L_0x0308
            java.lang.String r6 = r0.A05     // Catch:{ all -> 0x04aa }
            java.lang.String r6 = r8.A01(r6)     // Catch:{ all -> 0x04aa }
            r3.A00 = r6     // Catch:{ all -> 0x04aa }
            if (r6 != 0) goto L_0x0308
            int r6 = r0.A00     // Catch:{ all -> 0x04aa }
            if (r6 != 0) goto L_0x0308
            r12 = 36323195552672753(0x810bc100062bf1, double:3.034273357054398E-306)
            boolean r6 = X.182.A06(r7, r1, r12)     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x0308
            int r13 = X.C395289zW.A00(r0)     // Catch:{ all -> 0x04aa }
            java.lang.String r12 = "Started new 1tid trace, mutationType=%d"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x04aa }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x04aa }
            X.0KC.A0Q(r9, r12, r6)     // Catch:{ all -> 0x04aa }
            java.lang.String r9 = r0.A05     // Catch:{ all -> 0x04aa }
            r16 = 0
            java.util.List r6 = X.C66582MXn.A10(r16)     // Catch:{ all -> 0x04aa }
            java.lang.String r9 = r8.A02(r9, r6)     // Catch:{ all -> 0x04aa }
            r3.A00 = r9     // Catch:{ all -> 0x04aa }
            long r12 = (long) r13     // Catch:{ all -> 0x04aa }
            java.util.List r12 = X.C66582MXn.A10(r12)     // Catch:{ all -> 0x04aa }
            r6 = 7008(0x1b60, float:9.82E-42)
            r8.A03(r12, r6, r9)     // Catch:{ all -> 0x04aa }
            java.lang.String r6 = r0.A05     // Catch:{ all -> 0x04aa }
            boolean r6 = X.AnonymousClass3f0.A04(r6)     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x0308
            java.lang.String r9 = r0.A05     // Catch:{ all -> 0x04aa }
            r6 = r18
            java.lang.Long r6 = X.00y.A0n(r6, r9)     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x0308
            java.lang.Object r12 = r3.A00     // Catch:{ all -> 0x04aa }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x04aa }
            java.util.List r9 = X.AnonymousClass7TE.A1I(r6)     // Catch:{ all -> 0x04aa }
            r6 = 1305(0x519, float:1.829E-42)
            r8.A03(r9, r6, r12)     // Catch:{ all -> 0x04aa }
        L_0x0308:
            if (r10 != r14) goto L_0x0311
            java.lang.Object r9 = r3.A00     // Catch:{ all -> 0x04aa }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04aa }
            r12 = 136(0x88, float:1.9E-43)
            goto L_0x0336
        L_0x0311:
            if (r10 != r5) goto L_0x0314
            goto L_0x0330
        L_0x0314:
            boolean r6 = r22.CVb()     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x0321
            java.lang.Object r9 = r3.A00     // Catch:{ all -> 0x04aa }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04aa }
            r12 = 134(0x86, float:1.88E-43)
            goto L_0x0336
        L_0x0321:
            r6 = r22
            boolean r6 = r6.CVZ(r1)     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x033a
            java.lang.Object r9 = r3.A00     // Catch:{ all -> 0x04aa }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04aa }
            r12 = 132(0x84, float:1.85E-43)
            goto L_0x0336
        L_0x0330:
            java.lang.Object r9 = r3.A00     // Catch:{ all -> 0x04aa }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04aa }
            r12 = 131(0x83, float:1.84E-43)
        L_0x0336:
            r6 = 0
            r8.A03(r6, r12, r9)     // Catch:{ all -> 0x04aa }
        L_0x033a:
            boolean r6 = r0 instanceof X.1bp     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x0356
            X.2Dm r12 = X.2L2.A00(r1)     // Catch:{ all -> 0x04aa }
            com.instagram.model.direct.DirectThreadKey r9 = r22.BJz()     // Catch:{ all -> 0x04aa }
            r6 = r0
            X.1bp r6 = (X.1bp) r6     // Catch:{ all -> 0x04aa }
            java.lang.String r6 = r6.A06()     // Catch:{ all -> 0x04aa }
            X.3su r6 = r12.BRy(r9, r6)     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x0356
            r6.A1L(r5)     // Catch:{ all -> 0x04aa }
        L_0x0356:
            r6 = r22
            java.lang.String r32 = A01(r6, r0, r4)     // Catch:{ all -> 0x04aa }
            X.ONf r6 = r4.A02     // Catch:{ all -> 0x04aa }
            r25 = r6
            com.instagram.model.direct.DirectThreadKey r45 = r22.BJz()     // Catch:{ all -> 0x04aa }
            long r49 = r21.longValue()     // Catch:{ all -> 0x04aa }
            r9 = r19
            r6 = r24
            java.lang.String r47 = X.DbU.A0t(r9, r6)     // Catch:{ all -> 0x04aa }
            java.lang.Object r6 = r3.A00     // Catch:{ all -> 0x04aa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x04aa }
            r41 = r25
            r42 = r2
            r43 = r11
            r44 = r0
            r46 = r32
            r48 = r6
            r41.A00(r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x04aa }
            X.OUf r12 = X.OUf.A00     // Catch:{ all -> 0x04aa }
            com.instagram.model.direct.DirectThreadKey r9 = r22.BJz()     // Catch:{ all -> 0x04aa }
            r6 = r24
            r12.A00(r1, r0, r9, r6)     // Catch:{ all -> 0x04aa }
            X.MYx r6 = X.C66612MYy.A00     // Catch:{ all -> 0x04aa }
            boolean r6 = r6.A02(r1, r5)     // Catch:{ all -> 0x04aa }
            if (r6 != 0) goto L_0x03d7
            X.1as r9 = X.1as.A04     // Catch:{ all -> 0x04aa }
            r6 = 550(0x226, float:7.71E-43)
            java.lang.String r6 = X.C273654mx.A00(r6)     // Catch:{ all -> 0x04aa }
            r9.A0F(r1, r6)     // Catch:{ all -> 0x04aa }
            java.lang.Object r12 = r3.A00     // Catch:{ all -> 0x04aa }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x04aa }
            X.1y9 r6 = X.1xy.A00(r1)     // Catch:{ all -> 0x04aa }
            X.1aS r6 = r6.A00     // Catch:{ all -> 0x04aa }
            java.lang.Object r6 = r6.A0X()     // Catch:{ all -> 0x04aa }
            X.1aE r6 = (X.1aE) r6     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x03c6
            int r9 = r6.ordinal()     // Catch:{ all -> 0x04aa }
            r6 = 5
            r13 = 4
            if (r9 == r5) goto L_0x03bc
            goto L_0x03be
        L_0x03bc:
            r6 = 1
            goto L_0x03cd
        L_0x03be:
            if (r9 == r14) goto L_0x03cc
            if (r9 == r15) goto L_0x03ca
            if (r9 == r13) goto L_0x03c8
            if (r9 == r6) goto L_0x03cd
        L_0x03c6:
            r6 = 0
            goto L_0x03cd
        L_0x03c8:
            r6 = 4
            goto L_0x03cd
        L_0x03ca:
            r6 = 3
            goto L_0x03cd
        L_0x03cc:
            r6 = 2
        L_0x03cd:
            long r15 = (long) r6     // Catch:{ all -> 0x04aa }
            java.util.List r9 = X.C66582MXn.A10(r15)     // Catch:{ all -> 0x04aa }
            r6 = 1511(0x5e7, float:2.117E-42)
            r8.A03(r9, r6, r12)     // Catch:{ all -> 0x04aa }
        L_0x03d7:
            X.3Tu r6 = r22.AiM()     // Catch:{ all -> 0x04aa }
            boolean r19 = X.C331057Pi.A02(r6)     // Catch:{ all -> 0x04aa }
            X.3Tu r13 = r22.AiM()     // Catch:{ all -> 0x04aa }
            X.MaY r6 = r0.A02     // Catch:{ all -> 0x04aa }
            X.ODs r12 = r6.A00     // Catch:{ all -> 0x04aa }
            r6 = 0
            if (r12 == 0) goto L_0x03f1
            X.Nkj r9 = r12.A00     // Catch:{ all -> 0x04aa }
        L_0x03ec:
            X.Nkj r8 = X.C69405Nkj.DISAPPEARING_MESSAGE     // Catch:{ all -> 0x04aa }
            if (r9 != r8) goto L_0x043c
            goto L_0x03f3
        L_0x03f1:
            r9 = r6
            goto L_0x03ec
        L_0x03f3:
            if (r12 == 0) goto L_0x0428
            java.lang.Long r8 = r12.A01     // Catch:{ all -> 0x04aa }
            if (r8 == 0) goto L_0x0428
            long r17 = r8.longValue()     // Catch:{ all -> 0x04aa }
            r15 = 0
            int r8 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x0428
            boolean r8 = X.C308556Us.A06(r1)     // Catch:{ all -> 0x04aa }
            if (r8 == 0) goto L_0x0416
            if (r19 == 0) goto L_0x041b
            r8 = 2342163327140962587(0x20810923002f211b, double:4.065855455592171E-152)
            boolean r8 = X.182.A06(r7, r1, r8)     // Catch:{ all -> 0x04aa }
            if (r8 == 0) goto L_0x041b
        L_0x0416:
            java.lang.String r3 = r0.A05     // Catch:{ all -> 0x04aa }
            X.4gN r1 = X.C270214gN.A0G     // Catch:{ all -> 0x04aa }
            goto L_0x0459
        L_0x041b:
            X.7QY r8 = r4.A01     // Catch:{ all -> 0x04aa }
            boolean r8 = r8.A00(r13)     // Catch:{ all -> 0x04aa }
            if (r8 != 0) goto L_0x043c
            java.lang.String r3 = r0.A05     // Catch:{ all -> 0x04aa }
            X.4gN r1 = X.C270214gN.A0H     // Catch:{ all -> 0x04aa }
            goto L_0x0459
        L_0x0428:
            java.lang.String r3 = r0.A05     // Catch:{ all -> 0x04aa }
            X.4gN r1 = X.C270214gN.A0I     // Catch:{ all -> 0x04aa }
            r0 = r25
            r0.A01(r2, r11, r1, r3)     // Catch:{ all -> 0x04aa }
            X.0wj r2 = X.0wj.A01     // Catch:{ all -> 0x04aa }
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "ephemeralDurationSec is set with invalid value on send, transport payload type"
            X.DbT.A1Q(r2, r0, r1)     // Catch:{ all -> 0x04aa }
            goto L_0x04a2
        L_0x043c:
            X.MaY r8 = r0.A02     // Catch:{ all -> 0x04aa }
            X.ODs r8 = r8.A00     // Catch:{ all -> 0x04aa }
            if (r8 == 0) goto L_0x0444
            X.Nkj r6 = r8.A00     // Catch:{ all -> 0x04aa }
        L_0x0444:
            X.Nkj r8 = X.C69405Nkj.SHH_MODE     // Catch:{ all -> 0x04aa }
            if (r6 != r8) goto L_0x045f
            if (r19 == 0) goto L_0x045f
            r8 = 2342165418790103207(0x20810b0a003028a7, double:4.067628996633799E-152)
            boolean r6 = X.182.A06(r7, r1, r8)     // Catch:{ all -> 0x04aa }
            if (r6 == 0) goto L_0x045f
            java.lang.String r3 = r0.A05     // Catch:{ all -> 0x04aa }
            X.4gN r1 = X.C270214gN.A0G     // Catch:{ all -> 0x04aa }
        L_0x0459:
            r0 = r25
            r0.A01(r2, r11, r1, r3)     // Catch:{ all -> 0x04aa }
            goto L_0x04a2
        L_0x045f:
            byte[] r35 = r2.A0H()     // Catch:{ all -> 0x04aa }
            r38 = 1
            if (r10 == r5) goto L_0x046d
            r38 = 0
            r39 = 1
            if (r10 == r14) goto L_0x046f
        L_0x046d:
            r39 = 0
        L_0x046f:
            X.Pn4 r6 = new X.Pn4     // Catch:{ all -> 0x04aa }
            r37 = r77
            r41 = r78
            r42 = r79
            r24 = r6
            r25 = r2
            r26 = r22
            r27 = r11
            r28 = r0
            r29 = r4
            r31 = r21
            r33 = r20
            r34 = r3
            r36 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x04aa }
            r8 = 22
            X.IoM r5 = new X.IoM     // Catch:{ all -> 0x04aa }
            r7 = r5
            r9 = r11
            r10 = r0
            r11 = r4
            r12 = r2
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x04aa }
            X.OXH.A01(r1, r5, r6)     // Catch:{ all -> 0x04aa }
            r0 = 1165094402(0x4571ee02, float:3870.8755)
            goto L_0x04a5
        L_0x04a2:
            r0 = 97673248(0x5d26020, float:1.9783616E-35)
        L_0x04a5:
            X.0fh.A00(r0)
            goto L_0x0108
        L_0x04aa:
            r1 = move-exception
            r0 = -703547394(0xffffffffd610b7fe, float:-3.9779979E13)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66638Ma7.A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload, X.Pwk, X.1OS, com.instagram.model.direct.DirectThreadKey, int, boolean, boolean):void");
    }
}
