package X;

/* renamed from: X.Pmc  reason: case insensitive filesystem */
public final class C73958Pmc extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NV8 A01;
    public final /* synthetic */ N3R A02;
    public final /* synthetic */ NVH A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73958Pmc(NV8 nv8, N3R n3r, NVH nvh, String str, String str2, int i) {
        super(1);
        this.A01 = nv8;
        this.A02 = n3r;
        this.A00 = i;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = nvh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005a, code lost:
        if (X.0qQ.A0K(r7, "questions") != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r12 = r18
            android.view.View r12 = (android.view.View) r12
            r2 = 0
            X.0qQ.A0B(r12, r2)
            r4 = r17
            X.NV8 r3 = r4.A01
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET"
            android.os.Parcelable r5 = r1.getParcelable(r0)
            android.os.Parcelable$Creator r1 = com.instagram.model.direct.DirectShareTarget.CREATOR
            X.0qQ.A08(r1)
            java.lang.Class<com.instagram.model.direct.DirectShareTarget> r0 = com.instagram.model.direct.DirectShareTarget.class
            java.lang.Object r15 = X.0B0.A01(r1, r5, r0)
            android.os.Parcelable r15 = (android.os.Parcelable) r15
            com.instagram.model.direct.DirectShareTarget r15 = (com.instagram.model.direct.DirectShareTarget) r15
            android.content.Context r11 = r3.requireContext()
            X.0eM r6 = r3.A0S
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.model.direct.DirectThreadKey r16 = r3.A0G()
            X.7H6 r14 = r3.A00
            if (r14 == 0) goto L_0x011d
            X.OM2 r10 = new X.OM2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.N3R r0 = r4.A02
            java.util.List r0 = r0.A0F
            X.0qQ.A0B(r0, r2)
            r10.A06 = r0
            int r0 = r4.A00
            r10.A01 = r0
            java.lang.String r7 = r4.A05
            java.lang.String r0 = "add_yours"
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "questions"
            boolean r1 = X.0qQ.A0K(r7, r0)
            r0 = 1
            if (r1 == 0) goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            r10.A0C = r0
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            r10.A03 = r8
            java.lang.String r0 = "roll_call"
            boolean r0 = X.0qQ.A0K(r7, r0)
            r10.A0B = r0
            android.content.Context r0 = r3.requireContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            float r0 = (float) r0
            r10.A00 = r0
            java.lang.String r9 = "shared_stack"
            boolean r1 = X.0qQ.A0K(r7, r9)
            java.lang.String r5 = "challenges"
            r0 = 0
            if (r1 != 0) goto L_0x0116
            boolean r1 = X.0qQ.A0K(r7, r5)
            if (r1 != 0) goto L_0x0116
            r1 = r0
        L_0x0088:
            r10.A08 = r1
            boolean r1 = X.0qQ.A0K(r7, r9)
            if (r1 != 0) goto L_0x0110
            boolean r1 = X.0qQ.A0K(r7, r5)
            if (r1 != 0) goto L_0x0110
            r1 = r0
        L_0x0097:
            r10.A09 = r1
            r5 = 37
            X.Phi r1 = new X.Phi
            r1.<init>(r7, r3, r5)
            r10.A07 = r1
            java.lang.String r1 = r4.A04
            r10.A05 = r1
            r10.A04 = r8
            boolean r1 = r3 instanceof X.NV6
            if (r1 != 0) goto L_0x0106
            boolean r1 = r3 instanceof X.NV7
            if (r1 == 0) goto L_0x0106
        L_0x00b0:
            r10.A00()
            java.lang.String r1 = "stacks"
            boolean r1 = X.0qQ.A0K(r7, r1)
            if (r1 == 0) goto L_0x00f9
            java.lang.String r5 = X.C66580MXl.A0w(r3)
            if (r5 != 0) goto L_0x00c3
            java.lang.String r5 = ""
        L_0x00c3:
            X.NVH r1 = r4.A03
            X.N3F r1 = r1.A01
            X.N37 r1 = r1.A00
            if (r1 == 0) goto L_0x00cd
            java.lang.Integer r0 = r1.A04
        L_0x00cd:
            X.1iA r4 = X.1i9.A00(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.0qQ.A0B(r0, r2)
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r0 = "direct_stack_grid_view_tap_media"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00f9
            X.C66580MXl.A1J(r2, r5)
            X.1iA r0 = X.1iA.A0Q
            if (r4 != r0) goto L_0x0103
            java.lang.String r1 = "photo"
        L_0x00f1:
            java.lang.String r0 = "media_type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00f9:
            X.MuF r0 = r3.A0E()
            r0.A06()
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0103:
            java.lang.String r1 = "video"
            goto L_0x00f1
        L_0x0106:
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker r1 = r3.A01
            if (r1 != 0) goto L_0x010d
            java.lang.String r0 = "replyBarEligibilityChecker"
            goto L_0x011f
        L_0x010d:
            r10.A02 = r1
            goto L_0x00b0
        L_0x0110:
            r1 = 4
            X.PgU r1 = X.C66580MXl.A14(r3, r1)
            goto L_0x0097
        L_0x0116:
            r1 = 3
            X.PgU r1 = X.C66580MXl.A14(r3, r1)
            goto L_0x0088
        L_0x011d:
            java.lang.String r0 = "directAggregatedMediaViewerController"
        L_0x011f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73958Pmc.invoke(java.lang.Object):java.lang.Object");
    }
}
