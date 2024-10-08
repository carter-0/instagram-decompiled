package X;

/* renamed from: X.Ixn  reason: case insensitive filesystem */
public final class C58802Ixn extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58802Ixn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        super(1);
        this.A00 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A06 = str;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        if (r3 != false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r7 = r25
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0294;
                case 1: goto L_0x0038;
                case 2: goto L_0x0101;
                case 3: goto L_0x0147;
                case 4: goto L_0x0186;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r0.A05
            X.GwO r1 = (X.C53918GwO) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            java.lang.Object r2 = r0.A02
            X.Cw7 r2 = (X.C45427Cw7) r2
            X.4DU r4 = r1.A01
            java.lang.Object r1 = r0.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r6 = r1.A00
            r1 = 854(0x356, float:1.197E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.0qQ.A0C(r6, r1)
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.String r5 = r0.A06
            java.lang.Object r1 = r0.A03
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r0 = r0.A04
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r0 = r0.A05
            X.C53918GwO.A00(r0, r1, r2, r3, r4, r5, r6)
        L_0x0035:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0038:
            X.7zG r7 = (X.C348917zG) r7
            if (r7 == 0) goto L_0x0035
            X.5kq r5 = r7.A01
            int r1 = r7.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13 = 1
            if (r1 == 0) goto L_0x0035
            java.lang.Object r15 = r0.A05
            X.K69 r15 = (X.K69) r15
            java.lang.Object r14 = r0.A02
            com.instagram.creation.sharesheet.preview.ClipsViewerPreviewView r14 = (com.instagram.creation.sharesheet.preview.ClipsViewerPreviewView) r14
            java.lang.String r6 = r0.A06
            java.lang.Object r8 = r0.A01
            X.3Q2 r8 = (X.AnonymousClass3Q2) r8
            java.lang.Object r4 = r0.A04
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r0 = r0.A03
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.Jft r1 = (X.C60112Jft) r1
            r0 = 2131433071(0x7f0b166f, float:1.8487917E38)
            android.view.View r0 = r4.findViewById(r0)
            X.AnonymousClass7TH.A0R(r0)
            X.0eM r2 = r15.A04
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r2)
            X.2Fj r0 = r1.A00
            java.lang.Object r7 = r0.A02()
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            if (r8 == 0) goto L_0x0080
            java.util.List r0 = r8.A4R
        L_0x0080:
            r1 = 0
            if (r0 == 0) goto L_0x008a
            boolean r3 = r0.isEmpty()
            r0 = 0
            if (r3 == 0) goto L_0x008b
        L_0x008a:
            r0 = 1
        L_0x008b:
            r21 = r0 ^ 1
            r20 = 1058642330(0x3f19999a, float:0.6)
            r17 = r5
            r18 = r6
            r19 = r7
            r14.A00(r15, r16, r17, r18, r19, r20, r21)
            if (r8 == 0) goto L_0x0035
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r8.A0r
            if (r0 == 0) goto L_0x0035
            r0 = 2131443741(0x7f0b401d, float:1.8509559E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r4, r0)
            r0 = 2131443728(0x7f0b4010, float:1.8509532E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r4, r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.setVisibility(r1)
            android.content.Context r0 = r15.requireContext()
            int r17 = X.AnonymousClass0nB.A01(r0)
            android.content.Context r0 = r15.requireContext()
            int r18 = X.AnonymousClass0nB.A00(r0)
            r7 = 0
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = new com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl
            r16 = r0
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            X.81W r1 = r0.A0K
            int r0 = r1.getHeight()
            X.0nA.A0V(r3, r0)
            int r0 = r1.getWidth()
            X.0nA.A0f(r3, r0)
            android.content.Context r4 = r15.requireContext()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            int r11 = r1.getWidth()
            int r12 = r1.getHeight()
            r10 = 1065353216(0x3f800000, float:1.0)
            X.LWf r3 = new X.LWf
            r9 = r7
            r14 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A02 = r3
            goto L_0x0035
        L_0x0101:
            X.3t2 r7 = (X.C254783t2) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            java.lang.Object r2 = r0.A05
            X.7L9 r2 = (X.AnonymousClass7L9) r2
            X.7Zg r1 = r2.A02
            X.7Zj r8 = r1.BsD()
            X.7L7 r1 = r2.A05
            X.0sa r1 = r1.A05
            java.lang.Object r4 = r1.invoke()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r0.A02
            X.N2b r1 = (X.C68137N2b) r1
            com.instagram.model.direct.gifs.DirectAnimatedMedia r3 = r1.A00
            X.0sa r1 = r2.A07
            boolean r17 = X.C51971G9r.A1b(r1)
            X.7L5 r1 = r2.A03
            java.lang.String r14 = r1.A00()
            java.lang.Object r9 = r0.A01
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r2 = r0.A04
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A03
            X.3tI r1 = (X.C254933tI) r1
            java.lang.String r0 = r0.A06
            r10 = r2
            r11 = r1
            r12 = r3
            r13 = r7
            r15 = r0
            r16 = r4
            r8.ELL(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0035
        L_0x0147:
            X.3t2 r7 = (X.C254783t2) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            boolean r1 = r7 instanceof X.AnonymousClass9HR
            if (r1 == 0) goto L_0x0035
            java.lang.Object r6 = r0.A01
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r5 = r0.A03
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r4 = r0.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.String r2 = r0.A06
            r1 = 1
            X.AnonymousClass7TG.A0w(r1, r5, r4, r3)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            if (r6 == 0) goto L_0x0035
            X.1pE r2 = X.1pE.A01(r6, r3, r4, r2)
            r2.A0B = r7
            r2.A0v = r1
            r2.A0q = r1
            r2.A01 = r5
            r1 = 7
            X.P4D r0 = new X.P4D
            r0.<init>(r6, r1)
            r2.A06 = r0
            r2.A06()
            goto L_0x0035
        L_0x0186:
            java.lang.Object r8 = r0.A05
            X.Ur2 r8 = (X.C16239Ur2) r8
            X.X9C r3 = r8.A03
            X.Vuf r1 = r3.Bz5()
            X.W2j r10 = new X.W2j
            r10.<init>(r1)
            X.Vuf r1 = r3.Bz5()
            X.W1L r1 = r1.A04
            X.VuM r7 = new X.VuM
            r7.<init>(r1)
            java.lang.Object r1 = r0.A03
            X.Vjd r1 = (X.C18001Vjd) r1
            X.UrZ r1 = (X.C16272UrZ) r1
            java.lang.String r4 = r1.A02
            X.Uxz r2 = X.C16605Uxz.LOADED
            java.util.Map r1 = r7.A04
            r1.put(r4, r2)
            com.instagram.common.session.UserSession r9 = r8.A00
            X.Vuf r1 = r3.Bz5()
            com.instagram.user.model.Product r11 = r1.A09
            X.Vuf r1 = r3.Bz5()
            X.W1L r2 = r1.A04
            X.Vuf r1 = r3.Bz5()
            com.instagram.user.model.Product r1 = r1.A09
            java.util.List r1 = r2.A01(r9, r1)
            X.0qQ.A07(r1)
            java.lang.Object r4 = r0.A04
            X.1Xj r4 = (X.1Xj) r4
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r1.iterator()
        L_0x01d6:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x01f9
            java.lang.Object r5 = r12.next()
            r2 = r5
            X.Vjd r2 = (X.C18001Vjd) r2
            boolean r1 = r2 instanceof X.C16272UrZ
            if (r1 == 0) goto L_0x01f5
            X.UrZ r2 = (X.C16272UrZ) r2
            X.1Xj r1 = r2.A01
            java.lang.String r1 = r1.getId()
            boolean r1 = X.C51969G9p.A1Z(r4, r1)
            if (r1 != 0) goto L_0x01d6
        L_0x01f5:
            r6.add(r5)
            goto L_0x01d6
        L_0x01f9:
            r7.A00(r9, r11, r6)
            X.W1L r1 = new X.W1L
            r1.<init>(r7)
            r10.A04 = r1
            X.Vuf r1 = r3.Bz5()
            X.VWl r5 = r1.A05
            X.0qQ.A07(r5)
            java.util.Map r2 = r5.A00
            r1 = 1644(0x66c, float:2.304E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            java.util.Map r7 = X.0u4.A03(r2)
            java.util.Map r6 = r5.A02
            java.util.Map r5 = r5.A01
            r1 = 0
            X.0qQ.A0B(r4, r1)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r7)
        L_0x0227:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x023a
            java.lang.Object r1 = X.C51971G9r.A0p(r2)
            X.2rW r1 = (X.AnonymousClass2rW) r1
            r1.A0C(r4)
            r1.A06()
            goto L_0x0227
        L_0x023a:
            r4 = 0
            X.VWl r1 = new X.VWl
            r1.<init>(r7, r6, r5)
            r10.A05 = r1
            X.Vuf r1 = new X.Vuf
            r1.<init>(r10)
            r3.Elq(r1)
            long r1 = X.C19226WQh.A04
            X.WQh r1 = X.C17088VHk.A00(r9)
            r1.A00()
            X.326 r5 = r8.A02
            java.lang.Object r6 = r0.A02
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r1 = r0.A01
            X.DTv r1 = (X.C46292DTv) r1
            X.Pwf r1 = r1.Bbg()
            r10 = 0
            if (r1 == 0) goto L_0x0268
            java.lang.Long r4 = r1.BEY()
        L_0x0268:
            java.lang.String r8 = java.lang.String.valueOf(r4)
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r7 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.CANCELED
            X.Vuf r1 = r3.Bz5()
            com.instagram.user.model.Product r1 = r1.A08
            X.0qQ.A0A(r1)
            java.lang.String r9 = r1.A0H
            X.Vuf r1 = r3.Bz5()
            com.instagram.user.model.Product r1 = r1.A08
            X.0qQ.A0A(r1)
            com.instagram.user.model.User r1 = r1.A0B
            if (r1 == 0) goto L_0x028a
            java.lang.String r10 = X.AnonymousClass3ZA.A00(r1)
        L_0x028a:
            X.0qQ.A0A(r10)
            java.lang.String r11 = r0.A06
            r5.A01(r6, r7, r8, r9, r10, r11)
            goto L_0x0035
        L_0x0294:
            X.7aH r7 = (X.C333867aH) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            java.lang.Object r4 = r0.A05
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            com.instagram.common.session.UserSession r8 = r4.A0B
            java.lang.Object r2 = r0.A01
            X.GlX r2 = (X.C53285GlX) r2
            java.lang.String r11 = r2.A04
            java.lang.String r12 = r2.A03
            java.lang.String r13 = r0.A06
            java.lang.Object r1 = r0.A03
            com.instagram.api.schemas.CommentGiphyMediaInfo r1 = (com.instagram.api.schemas.CommentGiphyMediaInfo) r1
            r15 = 0
            if (r1 == 0) goto L_0x02ee
            X.7fs r6 = X.C335837dc.A02(r1)
        L_0x02b5:
            java.lang.Object r9 = r0.A02
            X.571 r9 = (X.AnonymousClass571) r9
            java.lang.Object r10 = r0.A04
            X.572 r10 = (X.AnonymousClass572) r10
            X.GmL r1 = r4.A04
            java.lang.String r14 = r1.A0E
            X.7a4 r0 = r2.A02
            if (r0 == 0) goto L_0x02c7
            java.util.List r15 = r0.A01
        L_0x02c7:
            boolean r3 = r1.A0e
            boolean r2 = r1.A0d
            X.7a5 r0 = r4.A05
            X.0Ud r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.7a7 r0 = (X.C333777a7) r0
            if (r0 == 0) goto L_0x02ec
            com.instagram.user.model.User r0 = r0.A0A
            if (r0 == 0) goto L_0x02ec
            X.17M r1 = r0.A02
        L_0x02dd:
            X.17M r0 = X.17M.A06
            boolean r18 = X.AnonymousClass7TF.A1W(r1, r0)
            r16 = r3
            r17 = r2
            X.7aH r0 = X.C335067cK.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x02ec:
            r1 = 0
            goto L_0x02dd
        L_0x02ee:
            r6 = r15
            goto L_0x02b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58802Ixn.invoke(java.lang.Object):java.lang.Object");
    }
}
