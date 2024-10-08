package X;

/* renamed from: X.8pM  reason: invalid class name and case insensitive filesystem */
public final class C366598pM {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r1.A04.A0A.A03.BnX().isEmpty() != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r0.A5v() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r2.A0G() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        if (r0 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        if (r2 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0210, code lost:
        if (r4 >= 1) goto L_0x0212;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C366588pL A00(X.C3499482o r77, X.C366588pL r78, boolean r79, boolean r80, boolean r81) {
        /*
            r76 = this;
            r7 = 0
            r2 = r77
            X.0qQ.A0B(r2, r7)
            r6 = 1
            r1 = r78
            X.0qQ.A0B(r1, r6)
            if (r79 == 0) goto L_0x0016
            boolean r0 = r2.A0G()
            r21 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r21 = 0
        L_0x0018:
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r3 = r1.A00
            java.util.List r0 = r2.A05()
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
            r1 = 0
        L_0x0024:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r5.next()
            X.8nh r0 = (X.C365798nh) r0
            X.8nd r0 = r0.A05
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x003b
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x003e:
            if (r4 != r6) goto L_0x01fa
            if (r1 != 0) goto L_0x0212
            X.89U r16 = X.AnonymousClass89U.SINGLE_PHOTO
        L_0x0044:
            boolean r37 = r2.A0F()
            X.82Y r1 = r2.A01
            X.82b r0 = r1.A04
            r38 = 0
            if (r0 == 0) goto L_0x0082
            com.instagram.user.model.User r0 = r0.A0A
            X.4Cl r0 = r0.A03
            java.util.List r0 = r0.BnX()
            if (r0 == 0) goto L_0x006b
            X.82b r0 = r1.A04
            com.instagram.user.model.User r0 = r0.A0A
            X.4Cl r0 = r0.A03
            java.util.List r0 = r0.BnX()
            boolean r0 = r0.isEmpty()
            r4 = 1
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            X.82b r0 = r1.A04
            X.1Xj r0 = r0.A07
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.getXpostDenyReason()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r4 != 0) goto L_0x0080
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            r38 = 1
        L_0x0082:
            X.1Xj r0 = r1.A08
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.A5v()
            r39 = 1
            if (r0 != 0) goto L_0x0090
        L_0x008e:
            r39 = 0
        L_0x0090:
            X.82d r0 = r1.A0Y
            r25 = 0
            if (r0 == 0) goto L_0x0098
            r25 = 1
        L_0x0098:
            X.8Yz r0 = r1.A0X
            if (r0 == 0) goto L_0x021c
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            r41 = r0
            boolean r42 = r2.A0B()
            X.82f r2 = r1.A0f
            r43 = 0
            if (r2 == 0) goto L_0x00da
            com.instagram.user.model.User r4 = r2.A0B
            X.4Cl r0 = r4.A03
            java.util.List r0 = r0.BnX()
            if (r0 == 0) goto L_0x00c5
            X.4Cl r0 = r4.A03
            java.util.List r0 = r0.BnX()
            boolean r0 = r0.isEmpty()
            r4 = 1
            if (r0 == 0) goto L_0x00c6
        L_0x00c5:
            r4 = 0
        L_0x00c6:
            X.1Xj r0 = r2.A03
            if (r0 == 0) goto L_0x00d3
            X.HPj r0 = X.C59724JVi.A00(r0)
            boolean r2 = r0 instanceof X.KYX
            r0 = 1
            if (r2 != 0) goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            if (r4 != 0) goto L_0x00d8
            if (r0 == 0) goto L_0x00da
        L_0x00d8:
            r43 = 1
        L_0x00da:
            X.82n r0 = r1.A05
            r55 = 0
            if (r0 == 0) goto L_0x0126
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r0.A01
            if (r2 == 0) goto L_0x0126
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r2.A00
            com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf r0 = r0.Bho()
            if (r0 != 0) goto L_0x0124
            com.instagram.common.session.UserSession r4 = r1.A02
            if (r4 == 0) goto L_0x0124
            boolean r0 = X.AHN.A03(r4, r2)
            if (r0 == 0) goto L_0x0124
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x0109
            X.0Tu r5 = X.0Tu.A05
            r0 = 36323783962996234(0x810c4a00032e0a, double:3.0346454701123053E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x0124
        L_0x0109:
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x011a
            X.0Tu r5 = X.0Tu.A05
            r0 = 36323783963061771(0x810c4a00042e0b, double:3.034645470153751E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x0124
        L_0x011a:
            boolean r0 = r2.A0E()
            if (r0 != 0) goto L_0x0124
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0126
        L_0x0124:
            r55 = 1
        L_0x0126:
            X.6oG r0 = r3.A03
            r75 = r0
            boolean r0 = r3.A0I
            r74 = r0
            boolean r0 = r3.A0Z
            r73 = r0
            boolean r0 = r3.A08
            r26 = r0
            boolean r0 = r3.A0d
            r27 = r0
            boolean r0 = r3.A0r
            r28 = r0
            boolean r0 = r3.A06
            r29 = r0
            int r0 = r3.A00
            r72 = r0
            boolean r0 = r3.A0C
            r30 = r0
            boolean r0 = r3.A0A
            r31 = r0
            java.lang.Boolean r0 = r3.A05
            r71 = r0
            boolean r0 = r3.A0B
            r32 = r0
            boolean r0 = r3.A0a
            r33 = r0
            boolean r0 = r3.A0Y
            r34 = r0
            boolean r0 = r3.A0q
            r35 = r0
            boolean r0 = r3.A0F
            r36 = r0
            boolean r0 = r3.A0f
            r40 = r0
            boolean r0 = r3.A0j
            r44 = r0
            boolean r0 = r3.A0D
            r45 = r0
            boolean r0 = r3.A0P
            r46 = r0
            boolean r0 = r3.A0H
            r47 = r0
            boolean r0 = r3.A0c
            r48 = r0
            int r0 = r3.A02
            r24 = r0
            boolean r0 = r3.A0J
            r23 = r0
            boolean r0 = r3.A0t
            r20 = r0
            boolean r0 = r3.A0b
            r19 = r0
            boolean r0 = r3.A09
            r18 = r0
            boolean r0 = r3.A0i
            r17 = r0
            boolean r15 = r3.A0g
            boolean r14 = r3.A0R
            boolean r13 = r3.A07
            boolean r12 = r3.A0E
            boolean r11 = r3.A0G
            boolean r10 = r3.A0X
            boolean r9 = r3.A0W
            boolean r8 = r3.A0e
            boolean r7 = r3.A0V
            boolean r6 = r3.A0U
            boolean r5 = r3.A0S
            boolean r4 = r3.A0O
            boolean r2 = r3.A0M
            boolean r1 = r3.A0N
            int r3 = r3.A01
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r0 = new com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState
            r56 = r80
            r22 = r21
            r49 = r23
            r50 = r20
            r51 = r19
            r52 = r18
            r53 = r17
            r54 = r15
            r57 = r14
            r58 = r13
            r59 = r12
            r60 = r11
            r61 = r10
            r62 = r9
            r63 = r8
            r64 = r7
            r65 = r6
            r66 = r5
            r67 = r4
            r68 = r2
            r69 = r1
            r70 = r81
            r14 = r0
            r15 = r75
            r17 = r71
            r18 = r72
            r19 = r24
            r20 = r3
            r23 = r74
            r24 = r73
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            X.8pL r1 = new X.8pL
            r1.<init>(r0)
            return r1
        L_0x01fa:
            if (r4 != 0) goto L_0x0208
            if (r1 != r6) goto L_0x0202
            X.89U r16 = X.AnonymousClass89U.SINGLE_VIDEO
            goto L_0x0044
        L_0x0202:
            if (r1 <= r6) goto L_0x0218
            X.89U r16 = X.AnonymousClass89U.MULTI_VIDEO
            goto L_0x0044
        L_0x0208:
            if (r4 <= r6) goto L_0x0210
            if (r1 != 0) goto L_0x0212
            X.89U r16 = X.AnonymousClass89U.MULTI_PHOTO
            goto L_0x0044
        L_0x0210:
            if (r4 < r6) goto L_0x0218
        L_0x0212:
            if (r1 < r6) goto L_0x0218
            X.89U r16 = X.AnonymousClass89U.MULTIMEDIA
            goto L_0x0044
        L_0x0218:
            X.89U r16 = X.AnonymousClass89U.UNSUPPORTED
            goto L_0x0044
        L_0x021c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366598pM.A00(X.82o, X.8pL, boolean, boolean, boolean):X.8pL");
    }
}
