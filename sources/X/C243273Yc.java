package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3Yc  reason: invalid class name and case insensitive filesystem */
public final class C243273Yc {
    public final UserSession A00;
    public final C243263Yb A01;
    public final C227072ib A02;
    public final 0q2 A03;
    public final C225892f5 A04;

    public C243273Yc(UserSession userSession, C243263Yb r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
        this.A03 = 0q2.A00(userSession);
        this.A04 = C225892f5.A00(userSession);
        this.A02 = new C227072ib(userSession);
    }

    public final int A01(1Xj r15) {
        0qQ.A0B(r15, 0);
        0q2 r4 = this.A03;
        C225892f5 r3 = this.A04;
        UserSession userSession = this.A00;
        return Arrays.hashCode(new Object[]{Integer.valueOf(r15.A0v()), Integer.valueOf(r15.A0r()), Boolean.valueOf(r4.A0N(r15)), Boolean.valueOf(r3.A0O(r15)), Boolean.valueOf(r15.A4c()), r15.A1w(), Boolean.valueOf(C243353Yk.A00(userSession, r15)), Boolean.valueOf(C243353Yk.A01(userSession, r15)), Integer.valueOf(r15.A0o())});
    }

    /* JADX WARNING: type inference failed for: r25v2, types: [X.DIz] */
    /* JADX WARNING: type inference failed for: r64v3, types: [X.DIy] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02dc, code lost:
        if (X.182.A06(r7, r37, 36328444002319712L) == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        if (r3.A02.A02(r4) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36328302268595410L) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        if (r4.A5Z() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ee, code lost:
        if (r1.A01() == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0197, code lost:
        if (X.182.A06(r7, r5, 36330784759759632L) != false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        if (r3.A02.A02(r4) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a9, code lost:
        if (r0 == X.C231592rv.LITHO_MEDIA_UFI.ordinal()) goto L_0x02ab;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0225  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C247453gM A02(android.content.Context r77, X.C246963fY r78, X.1Xj r79, X.AnonymousClass4DU r80, X.AnonymousClass3W1 r81) {
        /*
            r76 = this;
            r6 = 0
            r7 = r77
            X.0qQ.A0B(r7, r6)
            r12 = 1
            r4 = r79
            X.0qQ.A0B(r4, r12)
            r11 = 2
            r8 = r81
            X.0qQ.A0B(r8, r11)
            r13 = 3
            r29 = r80
            r0 = r29
            X.0qQ.A0B(r0, r13)
            r18 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)
            if (r0 == 0) goto L_0x002a
            r1 = 2146807145(0x7ff5ad69, float:NaN)
            java.lang.String r0 = "MediaUfiUseCase#getUiState"
            X.0fS.A01(r0, r1)
        L_0x002a:
            java.lang.String r27 = r29.getModuleName()
            r3 = r76
            com.instagram.common.session.UserSession r5 = r3.A00
            boolean r1 = X.C243353Yk.A00(r5, r4)
            int r0 = r4.A0v()
            if (r0 <= 0) goto L_0x0048
            if (r1 != 0) goto L_0x0048
            X.2ib r0 = r3.A02
            boolean r0 = r0.A02(r4)
            r53 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0048:
            r53 = 0
        L_0x004a:
            int r0 = r4.A0r()
            if (r0 <= 0) goto L_0x0060
            boolean r0 = r4.A4c()
            if (r0 != 0) goto L_0x0060
            X.2ib r0 = r3.A02
            boolean r0 = r0.A02(r4)
            r54 = 1
            if (r0 != 0) goto L_0x0062
        L_0x0060:
            r54 = 0
        L_0x0062:
            boolean r1 = X.C243353Yk.A01(r5, r4)
            int r0 = r4.A11()
            if (r0 <= 0) goto L_0x0087
            if (r1 != 0) goto L_0x0087
            X.2ib r1 = r3.A02
            boolean r0 = r1.A02(r4)
            if (r0 == 0) goto L_0x0087
            com.instagram.common.session.UserSession r9 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328302268595410(0x81106600033cd2, double:3.0375028647669805E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r55 = 1
            if (r0 != 0) goto L_0x0089
        L_0x0087:
            r55 = 0
        L_0x0089:
            java.lang.Integer r38 = X.AnonymousClass05K.A00
            int r0 = r8.A03
            X.1Xj r0 = r4.A1c(r0)
            if (r0 != 0) goto L_0x0094
            r0 = r4
        L_0x0094:
            boolean r42 = r0.A4y()
            X.0q2 r0 = r3.A03
            boolean r43 = r0.A0N(r4)
            X.2f5 r0 = r3.A04
            boolean r44 = r0.A0O(r4)
            boolean r0 = r4.A4c()
            r45 = r0 ^ 1
            X.1sw r1 = r4.A1u()
            X.1sw r0 = X.1sw.A04
            if (r1 == r0) goto L_0x00d2
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x00be
            boolean r0 = X.C231122qu.A0M(r5, r4)
            if (r0 == 0) goto L_0x00d2
        L_0x00be:
            boolean r0 = r4.A5P()
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r4.A5Z()
            if (r0 != 0) goto L_0x00d2
        L_0x00ca:
            boolean r0 = r4.A5Z()
            r46 = 1
            if (r0 == 0) goto L_0x00d4
        L_0x00d2:
            r46 = 0
        L_0x00d4:
            boolean r47 = r4.A4M()
            boolean r48 = r4.A5f()
            X.2ib r1 = r3.A02
            boolean r49 = r1.A02(r4)
            boolean r0 = r4.A5o()
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r1.A01()
            r50 = 1
            if (r0 != 0) goto L_0x00f2
        L_0x00f0:
            r50 = 0
        L_0x00f2:
            boolean r51 = r1.A02(r4)
            r2 = 308(0x134, float:4.32E-43)
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenWidthDp
            r52 = 0
            if (r0 >= r2) goto L_0x0108
            r52 = 1
        L_0x0108:
            java.lang.String r41 = ""
            r2 = r78
            if (r53 == 0) goto L_0x03c4
            int r0 = r4.A0v()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            android.content.Context r0 = r2.A00
            android.content.res.Resources r7 = r0.getResources()
            X.0qQ.A07(r7)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r39 = X.C253673rC.A04(r7, r9, r0, r6, r6)
        L_0x0125:
            java.lang.String r7 = r29.getModuleName()
            java.lang.String r26 = "feed_timeline"
            r0 = r26
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03c0
            boolean r0 = r4.A4U()
            if (r0 == 0) goto L_0x03c0
            X.3gF r0 = X.C247323g9.A00(r5)
            X.3fc r31 = r0.A01(r6)
        L_0x0141:
            if (r54 == 0) goto L_0x03bc
            int r0 = r4.A0r()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            android.content.Context r0 = r2.A00
            android.content.res.Resources r7 = r0.getResources()
            X.0qQ.A07(r7)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r40 = X.C253673rC.A04(r7, r9, r0, r6, r6)
        L_0x015a:
            if (r55 == 0) goto L_0x0173
            int r0 = r4.A11()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            android.content.Context r0 = r2.A00
            android.content.res.Resources r2 = r0.getResources()
            X.0qQ.A07(r2)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r41 = X.C253673rC.A04(r2, r7, r0, r6, r6)
        L_0x0173:
            boolean r14 = r1.A01()
            com.instagram.common.session.UserSession r0 = r1.A00
            r37 = r0
            X.0Tu r7 = X.0Tu.A05
            r1 = 36328302269054167(0x811066000a3cd7, double:3.0375028650571E-306)
            boolean r10 = X.182.A06(r7, r0, r1)
            boolean r0 = r4.A5D()
            if (r0 == 0) goto L_0x0199
            r0 = 36330784759759632(0x8112a800044310, double:3.039072802175424E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            r62 = 1
            if (r0 == 0) goto L_0x019b
        L_0x0199:
            r62 = 0
        L_0x019b:
            boolean r9 = r4.A4V()
            boolean r2 = r4.CcK()
            int r1 = r4.A0o()
            int r0 = r4.A13()
            boolean r0 = X.C247023fe.A01(r5, r1, r0, r9, r2)
            if (r0 == 0) goto L_0x03b6
            int r61 = r4.A13()
        L_0x01b5:
            boolean r0 = r4.A5D()
            if (r0 == 0) goto L_0x03b2
            if (r14 == 0) goto L_0x01bf
            if (r10 == 0) goto L_0x03b2
        L_0x01bf:
            r63 = 1
        L_0x01c1:
            r0 = 36601805787042145(0x82092600131161, double:3.210467591142967E-306)
            long r1 = X.182.A01(r7, r5, r0)
            int r0 = (int) r1
            if (r0 == r12) goto L_0x03ae
            if (r0 == r11) goto L_0x03aa
            X.3ff r58 = X.C247033ff.DEFAULT
        L_0x01d1:
            r0 = 36601805787107682(0x82092600141162, double:3.210467591184413E-306)
            long r9 = X.182.A01(r7, r5, r0)
            int r1 = (int) r9
            r9 = 36328302268988630(0x81106600093cd6, double:3.0375028650156544E-306)
            r0 = r37
            boolean r0 = X.182.A06(r7, r0, r9)
            if (r0 != 0) goto L_0x03a6
            r9 = 36328302268923093(0x81106600083cd5, double:3.0375028649742086E-306)
            r0 = r37
            boolean r0 = X.182.A06(r7, r0, r9)
            if (r0 != 0) goto L_0x03a2
            if (r1 == r12) goto L_0x039e
            if (r1 == r11) goto L_0x03a2
            if (r1 != r13) goto L_0x03a6
            X.3fh r59 = X.C247053fh.VARIANT3
        L_0x01fd:
            r16 = 36324694495998201(0x810d1e000230f9, double:3.0352212948491714E-306)
            r0 = r16
            boolean r64 = X.182.A06(r7, r5, r0)
            r1 = 27
            X.9LZ r0 = new X.9LZ
            r0.<init>(r3, r1)
            r1 = 10
            X.9IE r2 = new X.9IE
            r2.<init>((java.lang.Object) r0, (int) r1)
            X.3fn r33 = new X.3fn
            r56 = r33
            r57 = r2
            r60 = r4
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64)
            X.Gmc r0 = r4.A0A
            if (r0 == 0) goto L_0x02f4
            X.DIz r25 = X.C46016DIz.A00
            X.DNf r24 = X.C46126DNf.A00
            X.DNg r23 = X.C46127DNg.A00
            X.DQI r22 = X.DQI.A00
            X.DQ4 r20 = X.DQ4.A00
            X.DJ0 r15 = X.DJ0.A00
            X.DNh r67 = X.C46128DNh.A00
            X.DJ1 r14 = X.DJ1.A00
            X.DJ2 r13 = X.DJ2.A00
            X.DIv r12 = X.DIv.A00
            X.DIw r11 = X.DIw.A00
            X.DIx r10 = X.DIx.A00
            X.DQ0 r9 = X.DQ0.A00
            X.DNd r2 = X.C46124DNd.A00
            X.DQ1 r72 = X.DQ1.A00
            X.DNe r69 = X.C46125DNe.A00
            X.DQ2 r73 = X.DQ2.A00
            X.DQ3 r1 = X.DQ3.A00
            X.DIy r64 = X.DIy.A00
        L_0x024b:
            X.9IT r28 = new X.9IT
            r56 = r28
            r57 = r25
            r58 = r15
            r59 = r14
            r60 = r13
            r61 = r12
            r62 = r11
            r63 = r10
            r65 = r24
            r66 = r23
            r68 = r2
            r70 = r20
            r71 = r9
            r74 = r1
            r75 = r22
            r56.<init>((X.C62320sa) r57, (X.C62320sa) r58, (X.C62320sa) r59, (X.C62320sa) r60, (X.C62320sa) r61, (X.C62320sa) r62, (X.C62320sa) r63, (X.C62320sa) r64, (X.0sP) r65, (X.0sP) r66, (X.0sP) r67, (X.0sP) r68, (X.0sP) r69, (X.0sL) r70, (X.0sL) r71, (X.0sL) r72, (X.0sL) r73, (X.0sL) r74, (X.0sK) r75)
            X.3fv r34 = X.C247193fv.A02
            X.3ZH r35 = r4.A1Y()
            X.3Yb r0 = r3.A01
            X.3fy r1 = r0.BRK()
            r0 = r29
            X.3g4 r36 = X.C247243g1.A00(r0, r5, r4, r1, r8)
            X.3Ye r1 = new X.3Ye
            r1.<init>(r5)
            java.lang.String r2 = "cta_extension_tap_on_ufi"
            X.9J3 r29 = r1.A00(r4, r0, r8, r2)
            X.3gK r32 = X.C247293g6.A00(r5, r4)
            int r0 = r8.A0E
            X.2rv r1 = X.C231592rv.LITHO_COALESCED_FOOTER
            int r1 = r1.ordinal()
            if (r0 == r1) goto L_0x02ab
            X.2rv r1 = X.C231592rv.MEDIA_UFI
            int r1 = r1.ordinal()
            if (r0 == r1) goto L_0x02ab
            X.2rv r1 = X.C231592rv.LITHO_MEDIA_UFI
            int r1 = r1.ordinal()
            r56 = 0
            if (r0 != r1) goto L_0x02ad
        L_0x02ab:
            r56 = 1
        L_0x02ad:
            r0 = r16
            boolean r57 = X.182.A06(r7, r5, r0)
            boolean r58 = r4.CeS()
            com.instagram.common.typedurl.ImageUrl r30 = r4.A1Q()
            boolean r1 = r4.CcK()
            r0 = r27
            X.0qQ.A0B(r0, r6)
            if (r1 != 0) goto L_0x02de
            r1 = r0
            r0 = r26
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02de
            r1 = 36328444002319712(0x81108700003d60, double:3.037592497744945E-306)
            r0 = r37
            boolean r0 = X.182.A06(r7, r0, r1)
            r59 = 1
            if (r0 != 0) goto L_0x02e0
        L_0x02de:
            r59 = 0
        L_0x02e0:
            X.3gM r27 = new X.3gM
            r37 = r8
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)
            if (r0 == 0) goto L_0x02f3
            r0 = -294653613(0xffffffffee6ff153, float:-1.8564665E28)
            X.0fS.A00(r0)
        L_0x02f3:
            return r27
        L_0x02f4:
            r2 = 20
            X.9LP r25 = new X.9LP
            r0 = r25
            r0.<init>(r3, r2)
            X.9Ld r24 = new X.9Ld
            r0 = r24
            r0.<init>(r3, r1)
            r9 = 42
            X.9M5 r23 = new X.9M5
            r0 = r23
            r0.<init>(r9, r3, r4)
            X.9MD r22 = new X.9MD
            r1 = r22
            r0 = r29
            r1.<init>(r6, r3, r4, r0)
            r21 = 5
            X.9MG r20 = new X.9MG
            r2 = r21
            r1 = r0
            r0 = r20
            r0.<init>(r2, r1, r3, r4)
            r0 = 47
            X.9Lz r15 = new X.9Lz
            r15.<init>(r0, r4, r3)
            X.9MQ r67 = new X.9MQ
            r56 = r67
            r57 = r13
            r58 = r4
            r59 = r3
            r60 = r1
            r61 = r8
            r56.<init>(r57, r58, r59, r60, r61)
            r0 = 41
            X.9MI r14 = new X.9MI
            r14.<init>((int) r0, (java.lang.Object) r8, (java.lang.Object) r3, (java.lang.Object) r4)
            X.9MI r13 = new X.9MI
            r13.<init>((int) r9, (java.lang.Object) r8, (java.lang.Object) r3, (java.lang.Object) r4)
            r1 = 38
            X.9MI r12 = new X.9MI
            r12.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r3, (java.lang.Object) r4)
            r1 = 39
            X.9MI r11 = new X.9MI
            r11.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r3, (java.lang.Object) r4)
            r1 = 40
            X.9MI r10 = new X.9MI
            r10.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r3, (java.lang.Object) r4)
            r1 = 4
            X.9MG r9 = new X.9MG
            r9.<init>(r1, r8, r3, r4)
            X.9M5 r2 = new X.9M5
            r2.<init>(r0, r3, r4)
            X.9MT r72 = new X.9MT
            r56 = r72
            r57 = r21
            r58 = r3
            r59 = r8
            r60 = r4
            r61 = r29
            r56.<init>(r57, r58, r59, r60, r61)
            r57 = 9
            X.9MZ r69 = new X.9MZ
            r56 = r69
            r58 = r29
            r59 = r3
            r60 = r8
            r61 = r4
            r62 = r38
            r56.<init>(r57, r58, r59, r60, r61, r62)
            X.3ft r73 = X.C247173ft.A00
            r0 = 26
            X.9LZ r1 = new X.9LZ
            r1.<init>(r3, r0)
            r57 = 15
            X.9MR r64 = new X.9MR
            r56 = r64
            r56.<init>(r57, r58, r59, r60, r61)
            goto L_0x024b
        L_0x039e:
            X.3fh r59 = X.C247053fh.VARIANT1
            goto L_0x01fd
        L_0x03a2:
            X.3fh r59 = X.C247053fh.VARIANT2
            goto L_0x01fd
        L_0x03a6:
            X.3fh r59 = X.C247053fh.DEFAULT
            goto L_0x01fd
        L_0x03aa:
            X.3ff r58 = X.C247033ff.VARIANT2
            goto L_0x01d1
        L_0x03ae:
            X.3ff r58 = X.C247033ff.VARIANT1
            goto L_0x01d1
        L_0x03b2:
            r63 = 0
            goto L_0x01c1
        L_0x03b6:
            int r61 = r4.A0s()
            goto L_0x01b5
        L_0x03bc:
            r40 = r41
            goto L_0x015a
        L_0x03c0:
            X.3fc r31 = X.C247003fc.A03
            goto L_0x0141
        L_0x03c4:
            r39 = r41
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243273Yc.A02(android.content.Context, X.3fY, X.1Xj, X.4DU, X.3W1):X.3gM");
    }

    public static final void A00(String str, C62320sa r5) {
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R("UseCaseActions/MediaUfi - ", str), 2092577082);
        }
        r5.invoke();
        if (Systrace.A0E(1)) {
            0fS.A00(174780795);
        }
    }
}
