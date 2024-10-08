package X;

/* renamed from: X.FSz  reason: case insensitive filesystem */
public final class C50193FSz implements C74301Psb {
    public final /* synthetic */ C46655Dia A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C50193FSz(C46655Dia dia, boolean z, boolean z2, boolean z3) {
        this.A00 = dia;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x002c: MOVE  (r1v10 X.Did) = (r1v1 X.Did)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void D5R(X.C324746zp r8, int r9) {
        /*
            r7 = this;
            r5 = 0
            r2 = 2131629774(0x7f0e16ce, float:1.8886878E38)
            X.6zq r0 = r8.A04
            android.view.LayoutInflater r1 = X.DbV.A0D(r0)
            X.6zq r0 = r8.A04
            android.view.View r0 = r1.inflate(r2, r0, r5)
            r8.A03(r0)
            X.Dia r4 = r7.A00
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L_0x0024
            java.lang.String r6 = "viewPager"
        L_0x001c:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A04
            X.2Rw r1 = r0.A0A
            boolean r0 = r1 instanceof X.C46658Did
            if (r0 == 0) goto L_0x0042
            X.Did r1 = (X.C46658Did) r1
            if (r1 == 0) goto L_0x0042
            java.util.List r1 = r1.A05
            if (r9 < 0) goto L_0x00cf
            int r0 = r1.size()
            if (r9 >= r0) goto L_0x00cf
            java.lang.Object r2 = r1.get(r9)
        L_0x003e:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r2 = (com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType) r2
            if (r2 != 0) goto L_0x0044
        L_0x0042:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r2 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB
        L_0x0044:
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L_0x0051
            r0 = 2131438517(0x7f0b2bb5, float:1.8498963E38)
            android.view.View r3 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = (com.instagram.common.ui.widget.imageview.CircularImageView) r3
        L_0x0051:
            int r2 = r2.ordinal()
            java.lang.String r6 = "tabLayout"
            r1 = 8
            if (r2 == r5) goto L_0x00ae
            r0 = 1
            if (r2 != r0) goto L_0x00db
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x00d3
            if (r3 == 0) goto L_0x007f
            android.content.Context r1 = r4.requireContext()
            r0 = 2131957518(0x7f13170e, float:1.9551622E38)
            X.DbU.A12(r1, r3, r0)
            android.content.Context r2 = r4.requireContext()
            boolean r1 = r7.A03
            r0 = 2131238288(0x7f081d90, float:1.809285E38)
            if (r1 == 0) goto L_0x007c
            r0 = 2131237952(0x7f081c40, float:1.8092169E38)
        L_0x007c:
            X.DbU.A13(r2, r3, r0)
        L_0x007f:
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x00ac
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto L_0x00ac
            boolean r1 = r7.A03
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r1 == 0) goto L_0x0095
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
        L_0x0095:
            int r1 = r2.getDimensionPixelOffset(r0)
        L_0x0099:
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a8
            r3.setStrokeAlpha(r5)
            r3.clearColorFilter()
        L_0x00a5:
            r3.setPadding(r1, r1, r1, r1)
        L_0x00a8:
            return
        L_0x00a9:
            if (r3 == 0) goto L_0x00a8
            goto L_0x00a5
        L_0x00ac:
            r1 = 0
            goto L_0x0099
        L_0x00ae:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x00d3
            if (r3 == 0) goto L_0x00a8
            X.0eM r0 = r4.A07
            X.0lg r0 = X.DbT.A0X(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0eD.A00(r0)
            if (r0 == 0) goto L_0x00c8
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
        L_0x00c4:
            r3.setUrl(r0, r4)
            return
        L_0x00c8:
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            goto L_0x00c4
        L_0x00cf:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r2 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB
            goto L_0x003e
        L_0x00d3:
            com.google.android.material.tabs.TabLayout r0 = r4.A02
            if (r0 == 0) goto L_0x001c
            r0.setVisibility(r1)
            return
        L_0x00db:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50193FSz.D5R(X.6zp, int):void");
    }
}
