package X;

/* renamed from: X.IwI  reason: case insensitive filesystem */
public final class C58709IwI extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58709IwI(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C58709IwI(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C58709IwI(obj, i));
    }

    /* JADX WARNING: type inference failed for: r6v37, types: [X.HQU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0205, code lost:
        if (r4.A1t != false) goto L_0x0207;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0353;
                case 1: goto L_0x034c;
                case 2: goto L_0x0345;
                case 3: goto L_0x00c5;
                case 4: goto L_0x0331;
                case 5: goto L_0x0313;
                case 6: goto L_0x02f3;
                case 7: goto L_0x02df;
                case 8: goto L_0x0353;
                case 9: goto L_0x034c;
                case 10: goto L_0x0345;
                case 11: goto L_0x02cf;
                case 12: goto L_0x02c6;
                case 13: goto L_0x02b3;
                case 14: goto L_0x029f;
                case 15: goto L_0x028e;
                case 16: goto L_0x0353;
                case 17: goto L_0x034c;
                case 18: goto L_0x0345;
                case 19: goto L_0x0057;
                case 20: goto L_0x0005;
                case 21: goto L_0x003e;
                case 22: goto L_0x0005;
                case 23: goto L_0x0283;
                case 24: goto L_0x0278;
                case 25: goto L_0x0005;
                case 26: goto L_0x0283;
                case 27: goto L_0x0005;
                case 28: goto L_0x0268;
                case 29: goto L_0x025e;
                case 30: goto L_0x024e;
                case 31: goto L_0x0225;
                case 32: goto L_0x020d;
                case 33: goto L_0x00b3;
                case 34: goto L_0x001a;
                case 35: goto L_0x01d5;
                case 36: goto L_0x01c3;
                case 37: goto L_0x01b5;
                case 38: goto L_0x01a5;
                case 39: goto L_0x0195;
                case 40: goto L_0x000c;
                case 41: goto L_0x0185;
                case 42: goto L_0x0173;
                case 43: goto L_0x0163;
                case 44: goto L_0x0153;
                case 45: goto L_0x0097;
                case 46: goto L_0x0143;
                case 47: goto L_0x008a;
                case 48: goto L_0x0133;
                case 49: goto L_0x0062;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.07f r6 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r6
        L_0x000c:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            android.content.Context r2 = r0.A0Q
            X.GJT r1 = r0.A01
            if (r1 != 0) goto L_0x0101
            java.lang.String r0 = "afiSeeMoreLessManager"
            goto L_0x00bd
        L_0x001a:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r8 = X.C227232is.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r7 = X.C227232is.A00(r0)
            X.GBj r11 = r0.A0N
            if (r11 != 0) goto L_0x002e
            java.lang.String r0 = "clipsViewerViewPager"
            goto L_0x00bd
        L_0x002e:
            X.GD6 r9 = r0.A0C
            if (r9 != 0) goto L_0x0036
            java.lang.String r0 = "viewerAdapter"
            goto L_0x00bd
        L_0x0036:
            X.GBE r0 = r0.A09
            if (r0 != 0) goto L_0x010b
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            goto L_0x00bd
        L_0x003e:
            java.lang.Object r4 = r14.A01
            X.H0c r4 = (X.C54133H0c) r4
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0eM r0 = r4.A0C
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = r4.A05
            if (r0 != 0) goto L_0x0113
            java.lang.String r0 = "draftSessionId"
            goto L_0x00bd
        L_0x0057:
            java.lang.Object r9 = r14.A01
            X.H1B r9 = (X.H1B) r9
            java.lang.String r12 = r9.A04
            if (r12 != 0) goto L_0x0119
            java.lang.String r0 = "mediaId"
            goto L_0x00bd
        L_0x0062:
            java.lang.Object r3 = r14.A01
            X.GBE r3 = (X.GBE) r3
            android.content.Context r2 = r3.A0Q
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.HQU r6 = new X.HQU
            r6.<init>()
            X.0xi r0 = X.0tS.A4E
            X.0tS r0 = r0.A01(r2)
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x000b
            X.IXt r1 = new X.IXt
            r1.<init>()
            X.VvI r0 = new X.VvI
            r0.<init>(r2, r3, r1)
            r6.A00 = r0
            return r6
        L_0x008a:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            X.GCb r6 = r0.A06
            if (r6 != 0) goto L_0x000b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0097:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r3 = r0.A0a
            X.0Tu r2 = X.C51968G9o.A0b(r3)
            r0 = 36319239887592477(0x81082800031c1d, double:3.0317717785294464E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000b
            X.GCz r6 = new X.GCz
            r6.<init>(r3)
            return r6
        L_0x00b3:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            X.B55 r6 = r0.A0F
            if (r6 != 0) goto L_0x000b
            java.lang.String r0 = "clipsViewerAppreciationGiftController"
        L_0x00bd:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c5:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r5 = r0.mParentFragment
            r6 = 0
            if (r5 == 0) goto L_0x000b
            r0 = 0
            X.IwI r3 = new X.IwI
            r3.<init>(r5, r0)
            X.0eO r2 = X.0eO.A02
            r1 = 1
            X.IwI r0 = new X.IwI
            r0.<init>(r3, r1)
            X.0eM r4 = X.AnonymousClass0eN.A00(r2, r0)
            java.lang.Class<X.Gh4> r0 = X.C53013Gh4.class
            X.0Yh r3 = X.DbS.A0z(r0)
            r0 = 2
            X.IwI r2 = new X.IwI
            r2.<init>(r4, r0)
            r0 = 47
            X.Ivz r1 = X.C58690Ivz.A00(r6, r4, r0)
            r0 = 48
            X.Ivz r0 = X.C58690Ivz.A00(r4, r5, r0)
            X.2kA r0 = X.DbS.A0I(r2, r0, r1, r3)
            java.lang.Object r6 = r0.getValue()
            return r6
        L_0x0101:
            X.GBj r0 = X.C52050GCw.A07(r0)
            X.GCJ r6 = new X.GCJ
            r6.<init>(r2, r1, r0)
            return r6
        L_0x010b:
            X.GCH r10 = r0.A1A
            X.GLY r6 = new X.GLY
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0113:
            X.JfT r6 = new X.JfT
            r6.<init>(r1, r3, r2, r0)
            return r6
        L_0x0119:
            android.content.Context r7 = r9.requireContext()
            X.0eM r0 = r9.A06
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r11 = r9.A05
            X.0gy r8 = X.AnonymousClass07i.A00(r9)
            X.C51972G9s.A1C(r10, r11)
            r13 = 1
            X.H6m r6 = new X.H6m
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r6
        L_0x0133:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.GBj r0 = X.C52050GCw.A07(r0)
            X.GE7 r6 = new X.GE7
            r6.<init>(r1, r0)
            return r6
        L_0x0143:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            android.content.Context r2 = r0.A0Q
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.GAc r0 = r0.A19
            X.GCc r6 = new X.GCc
            r6.<init>(r2, r1, r0)
            return r6
        L_0x0153:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r2 = r0.A0a
            X.93T r1 = r0.A1D
            X.GAc r0 = r0.A19
            X.GAh r6 = new X.GAh
            r6.<init>(r0, r2, r1)
            return r6
        L_0x0163:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.GBj r0 = X.C52050GCw.A07(r0)
            X.GCM r6 = new X.GCM
            r6.<init>(r1, r0)
            return r6
        L_0x0173:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r2 = r0.A0a
            X.GBj r1 = X.C52050GCw.A07(r0)
            androidx.fragment.app.FragmentActivity r0 = r0.A0R
            X.GCL r6 = new X.GCL
            r6.<init>(r0, r2, r1)
            return r6
        L_0x0185:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.GBj r0 = X.C52050GCw.A07(r0)
            X.GE6 r6 = new X.GE6
            r6.<init>(r1, r0)
            return r6
        L_0x0195:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.GBj r0 = X.C52050GCw.A07(r0)
            X.GE9 r6 = new X.GE9
            r6.<init>(r1, r0)
            return r6
        L_0x01a5:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.GBj r0 = X.C52050GCw.A07(r0)
            X.GE8 r6 = new X.GE8
            r6.<init>(r1, r0)
            return r6
        L_0x01b5:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r1 = r0.A0a
            X.4h9 r0 = r0.A0S
            X.GCN r6 = new X.GCN
            r6.<init>(r0, r1)
            return r6
        L_0x01c3:
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            com.instagram.common.session.UserSession r2 = r0.A0a
            X.GBj r1 = X.C52050GCw.A07(r0)
            androidx.fragment.app.FragmentActivity r0 = r0.A0R
            X.GCK r6 = new X.GCK
            r6.<init>(r0, r2, r1)
            return r6
        L_0x01d5:
            java.lang.Object r2 = r14.A01
            X.GBE r2 = (X.GBE) r2
            com.instagram.clips.intf.ClipsViewerConfig r4 = r2.A0Y
            boolean r0 = r4.A1f
            if (r0 == 0) goto L_0x01e5
            java.lang.Integer r1 = r4.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0207
        L_0x01e5:
            X.GAn r1 = r2.A0T
            X.GAc r0 = r2.A19
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0207
            com.instagram.common.session.UserSession r3 = r2.A0a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312213320893432(0x8101c4000003f8, double:3.027328149455257E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0207
            boolean r1 = r4.A1t
            r0 = 1
            if (r1 == 0) goto L_0x0208
        L_0x0207:
            r0 = 0
        L_0x0208:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x020d:
            java.lang.Object r4 = r14.A01
            X.GCb r4 = (X.C52029GCb) r4
            X.4DH r0 = r4.A08
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r4.A0C
            X.4DU r1 = r4.A0D
            X.Hrq r0 = r4.A0S
            java.lang.String r0 = r0.A00
            X.ViN r6 = new X.ViN
            r6.<init>(r3, r2, r1, r0)
            return r6
        L_0x0225:
            java.lang.Object r3 = r14.A01
            X.GCb r3 = (X.C52029GCb) r3
            X.GIY r2 = r3.A0L
            X.0Ud r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x0235:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            if (r0 == 0) goto L_0x0235
            r2.A00(r0)
            goto L_0x0235
        L_0x0245:
            X.GBn r1 = r3.A0d
            r0 = 0
            r1.A0T(r0)
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x024e:
            java.lang.Object r0 = r14.A01
            X.GCb r0 = (X.C52029GCb) r0
            com.instagram.common.session.UserSession r2 = r0.A0C
            androidx.fragment.app.FragmentActivity r1 = r0.A07
            X.4DU r0 = r0.A0D
            X.33A r6 = new X.33A
            r6.<init>(r1, r0, r2)
            return r6
        L_0x025e:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.IOl r6 = new X.IOl
            r6.<init>(r0)
            return r6
        L_0x0268:
            java.lang.Object r0 = r14.A01
            X.H03 r0 = (X.H03) r0
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.GCZ r6 = new X.GCZ
            r6.<init>(r0)
            return r6
        L_0x0278:
            java.lang.Object r0 = r14.A01
            X.H0c r0 = (X.C54133H0c) r0
            X.0eM r0 = r0.A0C
            X.1Av r6 = X.DbX.A0h(r0)
            return r6
        L_0x0283:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YM r6 = r0.getDefaultViewModelProviderFactory()
            return r6
        L_0x028e:
            java.lang.Object r10 = r14.A01
            X.Ib6 r10 = (X.C57462Ib6) r10
            android.content.Context r7 = r10.A03
            com.instagram.common.session.UserSession r8 = r10.A04
            r9 = 0
            java.lang.String r11 = "ClipsTemplateBrowserVideoPlayer"
            X.Tol r6 = new X.Tol
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x029f:
            java.lang.Object r0 = r14.A01
            X.Ib6 r0 = (X.C57462Ib6) r0
            com.instagram.common.session.UserSession r2 = r0.A04
            r0 = 24
            X.IwJ r1 = new X.IwJ
            r1.<init>(r2, r0)
            java.lang.Class<X.Hhx> r0 = X.C55453Hhx.class
            java.lang.Object r6 = r2.A01(r0, r1)
            return r6
        L_0x02b3:
            java.lang.Object r1 = r14.A01
            X.HJb r1 = (X.C54566HJb) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r0 = r1.A01
            android.content.Context r1 = r0.getContext()
            r0 = 0
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            r6.<init>(r1, r0, r0)
            return r6
        L_0x02c6:
            java.lang.Object r1 = r14.A01
            r0 = 6
            X.GiT r6 = new X.GiT
            r6.<init>(r1, r0)
            return r6
        L_0x02cf:
            java.lang.Object r1 = r14.A01
            X.HJb r1 = (X.C54566HJb) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r1 = r1.A01
            r0 = 2131432374(0x7f0b13b6, float:1.8486504E38)
            android.view.View r6 = X.DbY.A0F(r1, r0)
            return r6
        L_0x02df:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            return r6
        L_0x02f3:
            java.lang.Object r3 = r14.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.os.Bundle r2 = r3.requireArguments()
            r0 = 424(0x1a8, float:5.94E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r0 = r2.getSerializable(r1)
            if (r0 != 0) goto L_0x030a
            java.lang.String r6 = "default"
            return r6
        L_0x030a:
            android.os.Bundle r0 = r3.requireArguments()
            java.io.Serializable r6 = r0.getSerializable(r1)
            return r6
        L_0x0313:
            java.lang.Object r3 = r14.A01
            X.H1I r3 = (X.H1I) r3
            X.0eM r0 = r3.A0I
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A0F
            java.lang.Object r1 = r0.getValue()
            com.instagram.api.schemas.ClipsTemplateBrowserV2Type r1 = (com.instagram.api.schemas.ClipsTemplateBrowserV2Type) r1
            X.0eM r0 = r3.A0M
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H6d r6 = new X.H6d
            r6.<init>(r1, r3, r2, r0)
            return r6
        L_0x0331:
            java.lang.Object r2 = r14.A01
            X.H1I r2 = (X.H1I) r2
            X.0eM r0 = r2.A0I
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.H6E r6 = new X.H6E
            r6.<init>(r1, r0)
            return r6
        L_0x0345:
            java.lang.Object r0 = r14.A01
            X.07f r6 = X.DbY.A0I(r0)
            return r6
        L_0x034c:
            java.lang.Object r0 = r14.A01
            java.lang.Object r6 = X.DbT.A0r(r0)
            return r6
        L_0x0353:
            java.lang.Object r6 = r14.A01
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58709IwI.invoke():java.lang.Object");
    }
}
