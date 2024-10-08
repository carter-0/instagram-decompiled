package X;

/* renamed from: X.2x5  reason: invalid class name and case insensitive filesystem */
public final class C234112x5 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234112x5(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A0B, 36330870658843452L) != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r60) {
        /*
            r59 = this;
            r4 = r60
            r0 = 717337895(0x2ac1b527, float:3.4409387E-13)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.3Kn r4 = (X.C240343Kn) r4
            r0 = 1904939043(0x718b1023, float:1.3772136E30)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r0 = r59
            X.2wt r8 = r0.A00
            androidx.fragment.app.Fragment r0 = r8.A07
            boolean r2 = r0 instanceof X.AnonymousClass0j6
            if (r2 == 0) goto L_0x0066
            r2 = 3651(0xe43, float:5.116E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r0, r2)
            r2 = r0
            X.0j6 r2 = (X.AnonymousClass0j6) r2
            X.0jB r10 = r2.E4x()
            if (r10 == 0) goto L_0x0066
            java.lang.String r6 = r4.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A0u
            java.lang.String r3 = "media_id"
            X.0j9 r2 = new X.0j9
            r2.<init>(r5, r3)
            java.io.Serializable r2 = r10.A01(r2)
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x0066
            boolean r1 = r0 instanceof X.C227252iu
            if (r1 == 0) goto L_0x0059
            r1 = 331(0x14b, float:4.64E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r0, r1)
            X.2iu r0 = (X.C227252iu) r0
            r0.EKl()
        L_0x0059:
            r0 = 896049828(0x3568a2a4, float:8.666341E-7)
        L_0x005c:
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1143240725(0x44247815, float:657.8763)
            X.AnonymousClass0fD.A0A(r0, r9)
            return
        L_0x0066:
            X.1Xj r2 = r4.A01
            boolean r3 = r2.CcK()
            if (r3 == 0) goto L_0x007f
            com.instagram.common.session.UserSession r10 = r8.A0B
            X.0Tu r3 = X.0Tu.A05
            r5 = 36330870658843452(0x8112bc0000433c, double:3.03912712510192E-306)
            boolean r3 = X.182.A06(r3, r10, r5)
            r51 = 1
            if (r3 == 0) goto L_0x0081
        L_0x007f:
            r51 = 0
        L_0x0081:
            java.lang.String r10 = r4.A02
            r13 = 0
            X.4DU r5 = r8.A0S
            java.lang.String r21 = r5.getModuleName()
            java.lang.String r6 = r4.A05
            com.instagram.common.session.UserSession r3 = r8.A0B
            boolean r33 = X.2R8.A02(r3, r2)
            boolean r34 = r5.isOrganicEligible()
            boolean r35 = r5.isSponsoredEligible()
            X.5OB r12 = X.AnonymousClass5OB.CAROUSEL_SLIDE_MENTION
            X.3kK r5 = r8.A03
            if (r5 == 0) goto L_0x0125
            java.lang.String r25 = r5.getSessionId()
        L_0x00a4:
            java.lang.String r27 = r2.BpP()
            int r5 = r4.A00
            java.lang.Integer r18 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.A06
            boolean r41 = r2.A5v()
            int r32 = r2.A0r()
            boolean r50 = r2.A4l()
            r39 = 1
            X.GmL r11 = new X.GmL
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r20 = r13
            r22 = r6
            r23 = r13
            r24 = r13
            r26 = r13
            r28 = r13
            r29 = r13
            r30 = r13
            r31 = r13
            r36 = r1
            r37 = r1
            r38 = r1
            r40 = r4
            r42 = r1
            r43 = r1
            r44 = r1
            r45 = r1
            r46 = r1
            r47 = r1
            r48 = r1
            r49 = r1
            r52 = r1
            r53 = r1
            r54 = r1
            r55 = r1
            r56 = r1
            r57 = r1
            r58 = r1
            r19 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            X.1Y4 r1 = X.C3018960m.A00()
            X.Hs6 r12 = r1.A00()
            androidx.fragment.app.FragmentActivity r13 = r0.requireActivity()
            java.lang.Boolean r0 = X.A09.A00(r3)
            boolean r16 = r0.booleanValue()
            boolean r17 = r2.CcK()
            r14 = r11
            r15 = r3
            r12.A01(r13, r14, r15, r16, r17)
            r0 = -1846921690(0xffffffff91ea3626, float:-3.6952062E-28)
            goto L_0x005c
        L_0x0125:
            r25 = 0
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234112x5.onEvent(java.lang.Object):void");
    }
}
