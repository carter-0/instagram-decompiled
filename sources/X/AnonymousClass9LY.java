package X;

/* renamed from: X.9LY  reason: invalid class name */
public final class AnonymousClass9LY extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LY(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        r1 = "clipsViewerFragmentViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d6, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dd, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f6, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x00c1;
                case 2: goto L_0x007a;
                case 3: goto L_0x005a;
                case 4: goto L_0x02e6;
                case 5: goto L_0x02d4;
                case 6: goto L_0x02c6;
                case 7: goto L_0x0014;
                case 8: goto L_0x00ac;
                case 9: goto L_0x02b9;
                case 10: goto L_0x02b9;
                case 11: goto L_0x02ff;
                case 12: goto L_0x02b0;
                case 13: goto L_0x0005;
                case 14: goto L_0x02ff;
                case 15: goto L_0x02b0;
                case 16: goto L_0x0005;
                case 17: goto L_0x029e;
                case 18: goto L_0x028a;
                case 19: goto L_0x0280;
                case 20: goto L_0x0276;
                case 21: goto L_0x026c;
                case 22: goto L_0x024b;
                case 23: goto L_0x0238;
                case 24: goto L_0x0226;
                case 25: goto L_0x021d;
                case 26: goto L_0x0208;
                case 27: goto L_0x01f7;
                case 28: goto L_0x01e9;
                case 29: goto L_0x01db;
                case 30: goto L_0x01b4;
                case 31: goto L_0x01a6;
                case 32: goto L_0x0196;
                case 33: goto L_0x02b9;
                case 34: goto L_0x0189;
                case 35: goto L_0x02ff;
                case 36: goto L_0x02b0;
                case 37: goto L_0x0005;
                case 38: goto L_0x0180;
                case 39: goto L_0x0175;
                case 40: goto L_0x0163;
                case 41: goto L_0x0152;
                case 42: goto L_0x0141;
                case 43: goto L_0x0136;
                case 44: goto L_0x012b;
                case 45: goto L_0x00f5;
                case 46: goto L_0x00e8;
                case 47: goto L_0x0136;
                case 48: goto L_0x012b;
                case 49: goto L_0x00de;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r3 = r0.getViewModelStore()
        L_0x0013:
            return r3
        L_0x0014:
            java.lang.Object r6 = r15.A01
            X.2is r6 = (X.C227232is) r6
            android.content.Context r4 = r6.requireContext()
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            com.instagram.common.session.UserSession r8 = X.C227232is.A01(r6)
            X.0eM r0 = r6.A0m
            java.lang.Object r9 = r0.getValue()
            X.GAc r9 = (X.C51979GAc) r9
            X.GBE r0 = r6.A09
            java.lang.String r1 = "clipsViewerFragmentViewModel"
            if (r0 == 0) goto L_0x00d6
            X.GF2 r11 = r0.A1H
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r6)
            com.instagram.clips.intf.ClipsViewerSource r7 = r0.A0J
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r6)
            java.lang.String r12 = r0.A1F
            X.GBE r0 = r6.A09
            if (r0 == 0) goto L_0x00d6
            X.Hlh r10 = r0.A1E
            r0 = 14
            X.JGX r14 = new X.JGX
            r14.<init>(r6, r0)
            r0 = 18
            X.JGB r13 = new X.JGB
            r13.<init>(r6, r0)
            X.GBI r3 = new X.GBI
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r3
        L_0x005a:
            java.lang.Object r3 = r15.A01
            X.2is r3 = (X.C227232is) r3
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r3)
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x00a9
            X.GAc r1 = r0.A19
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r3)
            X.1wS r0 = X.1wS.A01(r0)
            int r0 = r0.A09()
            X.GKx r3 = new X.GKx
            r3.<init>(r2, r1, r0)
            return r3
        L_0x007a:
            java.lang.Object r1 = r15.A01
            X.2is r1 = (X.C227232is) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            android.app.Application r4 = r0.getApplication()
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r6 = X.C227232is.A01(r1)
            X.GBE r0 = r1.A09
            if (r0 == 0) goto L_0x00a9
            X.GAc r7 = r0.A19
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r1)
            X.1wS r0 = X.1wS.A01(r0)
            int r8 = r0.A09()
            X.0gy r5 = X.AnonymousClass07i.A00(r1)
            X.GBP r3 = new X.GBP
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x00a9:
            java.lang.String r1 = "clipsViewerFragmentViewModel"
            goto L_0x00d6
        L_0x00ac:
            java.lang.Object r1 = r15.A01
            X.2is r1 = (X.C227232is) r1
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r1)
            java.lang.String r3 = r0.A02
            if (r3 != 0) goto L_0x0013
            android.os.Bundle r0 = r1.requireArguments()
            java.lang.String r3 = X.C228022kf.A00(r0)
            return r3
        L_0x00c1:
            java.lang.Object r0 = r15.A01
            X.2is r0 = (X.C227232is) r0
            X.GBp r3 = r0.A0E
            if (r3 != 0) goto L_0x0013
            java.lang.String r1 = "clipsAutoScrollController"
            goto L_0x00d6
        L_0x00cc:
            java.lang.Object r0 = r15.A01
            X.2is r0 = (X.C227232is) r0
            X.GBq r3 = r0.A08
            if (r3 != 0) goto L_0x0013
            java.lang.String r1 = "videoControllerDelegate"
        L_0x00d6:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00de:
            java.lang.Object r0 = r15.A01
            X.36M r0 = (X.AnonymousClass36M) r0
            X.Men r3 = new X.Men
            r3.<init>((X.AnonymousClass36M) r0)
            return r3
        L_0x00e8:
            java.lang.Object r0 = r15.A01
            X.2kj r0 = (X.C228062kj) r0
            X.2jw r0 = r0.A20
            boolean r0 = r0.A0P
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x00f5:
            java.lang.Object r0 = r15.A01
            X.2kj r0 = (X.C228062kj) r0
            X.2jw r6 = r0.A20
            X.2Zg r5 = r6.A07()
            com.instagram.common.session.UserSession r4 = r0.A1t
            X.0Tu r3 = X.0Tu.A06
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0125
            r0 = 36311569077174894(0x81012e0015026e, double:3.0269207271334926E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0125
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            boolean r0 = r1 instanceof X.AnonymousClass2ZV
            if (r0 == 0) goto L_0x0125
            r2 = r1
            X.2ZV r2 = (X.AnonymousClass2ZV) r2
        L_0x0125:
            X.2lI r3 = new X.2lI
            r3.<init>(r2, r5)
            return r3
        L_0x012b:
            java.lang.Object r0 = r15.A01
            X.2kj r0 = (X.C228062kj) r0
            X.2jw r0 = r0.A20
            r0.A0E()
            goto L_0x01f4
        L_0x0136:
            java.lang.Object r0 = r15.A01
            X.2kj r0 = (X.C228062kj) r0
            X.2jw r0 = r0.A20
            r0.A0F()
            goto L_0x01f4
        L_0x0141:
            java.lang.Object r0 = r15.A01
            X.2kj r0 = (X.C228062kj) r0
            X.2rI r0 = r0.A0J()
            int r0 = r0.getItemCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x0152:
            java.lang.Object r0 = r15.A01
            X.364 r0 = (X.AnonymousClass364) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.2jw r0 = r0.A03
            android.content.Context r0 = r0.requireContext()
            X.3KG r3 = X.AnonymousClass3KF.A00(r0, r1)
            return r3
        L_0x0163:
            java.lang.Object r0 = r15.A01
            X.2qG r0 = (X.C230782qG) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.2kC r0 = r0.A01
            X.2jw r1 = r0.A00
            X.4DU r0 = X.AnonymousClass2kO.A00
            X.FAK r3 = new X.FAK
            r3.<init>(r1, r0, r2)
            return r3
        L_0x0175:
            java.lang.Object r0 = r15.A01
            X.2qG r0 = (X.C230782qG) r0
            X.2kj r0 = r0.A02
            X.2rI r3 = r0.A0J()
            return r3
        L_0x0180:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.36a r3 = X.C2370236a.A00(r0)
            return r3
        L_0x0189:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.2YM r3 = r0.getDefaultViewModelProviderFactory()
            return r3
        L_0x0196:
            java.lang.Object r2 = r15.A01
            X.2jw r2 = (X.C227802jw) r2
            X.2kj r0 = r2.A0A()
            X.2ks r1 = r0.A1w
            X.3je r0 = r2.A0i
            r1.FJ2(r0)
            goto L_0x01f4
        L_0x01a6:
            java.lang.Object r0 = r15.A01
            X.2jw r0 = (X.C227802jw) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.2kg r3 = new X.2kg
            r3.<init>(r0)
            return r3
        L_0x01b4:
            java.lang.Object r0 = r15.A01
            X.2jw r0 = (X.C227802jw) r0
            com.instagram.common.session.UserSession r3 = r0.getSession()
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327151217752261(0x810f5a000938c5, double:3.0367749355788634E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x021b
            r0 = 37
            X.9Kt r1 = new X.9Kt
            r1.<init>(r3, r0)
            java.lang.Class<X.3D1> r0 = X.AnonymousClass3D1.class
            java.lang.Object r3 = r3.A01(r0, r1)
            return r3
        L_0x01db:
            java.lang.Object r0 = r15.A01
            X.2jw r0 = (X.C227802jw) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.2wr r3 = new X.2wr
            r3.<init>(r0)
            return r3
        L_0x01e9:
            java.lang.Object r0 = r15.A01
            X.2lj r0 = (X.C228472lj) r0
            X.0sa r0 = r0.A0L
            if (r0 == 0) goto L_0x01f4
            r0.invoke()
        L_0x01f4:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x01f7:
            java.lang.Object r0 = r15.A01
            X.2pz r0 = (X.C230662pz) r0
            X.2jw r0 = r0.A02
            X.2kj r0 = r0.A0A()
            X.2lj r0 = r0.A0o()
            X.2un r3 = r0.A09
            return r3
        L_0x0208:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x021b
            r0 = 2870(0xb36, float:4.022E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x021b:
            r3 = 0
            return r3
        L_0x021d:
            java.lang.Object r0 = r15.A01
            X.32F r0 = (X.AnonymousClass32F) r0
            com.instagram.common.session.UserSession r3 = X.AnonymousClass32F.A01(r0)
            return r3
        L_0x0226:
            java.lang.Object r2 = r15.A01
            X.32F r2 = (X.AnonymousClass32F) r2
            com.instagram.common.session.UserSession r1 = X.AnonymousClass32F.A01(r2)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.33A r3 = new X.33A
            r3.<init>(r0, r2, r1)
            return r3
        L_0x0238:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.requireArguments()
            r0 = 41
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = X.C320236s2.A01(r1, r0)
            return r3
        L_0x024b:
            java.lang.Object r0 = r15.A01
            instagram.features.feed.fragment.ContextualFeedFragment r0 = (instagram.features.feed.fragment.ContextualFeedFragment) r0
            com.instagram.common.session.UserSession r3 = instagram.features.feed.fragment.ContextualFeedFragment.A00(r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606212426700139(0x820d280044156b, double:3.213254367806796E-306)
            long r2 = X.182.A01(r2, r3, r0)
            int r1 = (int) r2
            r0 = -1
            if (r1 > r0) goto L_0x0267
            r1 = 3
        L_0x0267:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            return r3
        L_0x026c:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.93T r3 = new X.93T
            r3.<init>(r0)
            return r3
        L_0x0276:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.4hI r3 = new X.4hI
            r3.<init>(r0)
            return r3
        L_0x0280:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.4t3 r3 = new X.4t3
            r3.<init>(r0)
            return r3
        L_0x028a:
            java.lang.Object r0 = r15.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            X.GBM r3 = new X.GBM
            r3.<init>(r0, r1)
            return r3
        L_0x029e:
            java.lang.Object r0 = r15.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.Dcj r3 = new X.Dcj
            r3.<init>(r1, r0)
            return r3
        L_0x02b0:
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x02b9:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.07f r3 = r0.getViewModelStore()
            return r3
        L_0x02c6:
            java.lang.Object r0 = r15.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r0)
            X.GCZ r3 = new X.GCZ
            r3.<init>(r0)
            return r3
        L_0x02d4:
            java.lang.Object r0 = r15.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.GBO r3 = new X.GBO
            r3.<init>(r1, r0)
            return r3
        L_0x02e6:
            java.lang.Object r0 = r15.A01
            X.2is r0 = (X.C227232is) r0
            X.0eM r0 = r0.A0z
            java.lang.Object r0 = r0.getValue()
            X.GDE r0 = (X.GDE) r0
            X.GBH r0 = r0.A00
            X.0eM r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            X.GDL r0 = (X.GDL) r0
            X.GDM r3 = r0.A00
            return r3
        L_0x02ff:
            java.lang.Object r3 = r15.A01
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9LY.invoke():java.lang.Object");
    }
}
