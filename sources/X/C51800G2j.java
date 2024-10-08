package X;

/* renamed from: X.G2j  reason: case insensitive filesystem */
public final class C51800G2j extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51800G2j(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C51800G2j A00(Object obj, int i) {
        return new C51800G2j(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0193, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x01e8;
                case 1: goto L_0x01e1;
                case 2: goto L_0x0005;
                case 3: goto L_0x01b3;
                case 4: goto L_0x0020;
                case 5: goto L_0x01a4;
                case 6: goto L_0x0194;
                case 7: goto L_0x018a;
                case 8: goto L_0x017d;
                case 9: goto L_0x018a;
                case 10: goto L_0x0174;
                case 11: goto L_0x0169;
                case 12: goto L_0x015e;
                case 13: goto L_0x0169;
                case 14: goto L_0x015e;
                case 15: goto L_0x01e8;
                case 16: goto L_0x01e1;
                case 17: goto L_0x0005;
                case 18: goto L_0x0147;
                case 19: goto L_0x013e;
                case 20: goto L_0x01e8;
                case 21: goto L_0x01e1;
                case 22: goto L_0x0005;
                case 23: goto L_0x0124;
                case 24: goto L_0x01e8;
                case 25: goto L_0x01e1;
                case 26: goto L_0x0005;
                case 27: goto L_0x010b;
                case 28: goto L_0x00fc;
                case 29: goto L_0x01e8;
                case 30: goto L_0x01e1;
                case 31: goto L_0x0005;
                case 32: goto L_0x00ec;
                case 33: goto L_0x00df;
                case 34: goto L_0x00df;
                case 35: goto L_0x00d5;
                case 36: goto L_0x000c;
                case 37: goto L_0x00bf;
                case 38: goto L_0x00a9;
                case 39: goto L_0x009a;
                case 40: goto L_0x008f;
                case 41: goto L_0x0082;
                case 42: goto L_0x01e8;
                case 43: goto L_0x01e1;
                case 44: goto L_0x0005;
                case 45: goto L_0x006e;
                case 46: goto L_0x0061;
                case 47: goto L_0x0057;
                case 48: goto L_0x0047;
                case 49: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.07f r4 = X.DbY.A0I(r0)
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r0 = r5.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r0 = 2131230843(0x7f08007b, float:1.807775E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 != 0) goto L_0x002d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0020:
            java.lang.Object r0 = r5.A01
            X.4DH r0 = (X.AnonymousClass4DH) r0
            android.app.Activity r1 = r0.getRootActivity()
            boolean r0 = r1 instanceof X.AnonymousClass2ZQ
            r4 = 0
            if (r0 == 0) goto L_0x000b
        L_0x002d:
            return r1
        L_0x002e:
            java.lang.Object r3 = r5.A01
            X.E5G r3 = (X.E5G) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r0 = 7
            X.FZf r1 = new X.FZf
            r1.<init>(r3, r0)
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.36U r4 = X.AnonymousClass36R.A00(r2, r0, r1)
            return r4
        L_0x0047:
            java.lang.Object r2 = r5.A01
            X.E5G r2 = (X.E5G) r2
            android.content.Context r1 = r2.requireContext()
            X.Eun r0 = r2.A00
            X.Eum r4 = new X.Eum
            r4.<init>(r1, r2, r0)
            return r4
        L_0x0057:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6qn r4 = new X.6qn
            r4.<init>(r0)
            return r4
        L_0x0061:
            java.lang.Object r0 = r5.A01
            X.02m r0 = (X.02m) r0
            X.0qQ.A0A(r0)
            X.6uS r4 = new X.6uS
            r4.<init>(r0)
            return r4
        L_0x006e:
            java.lang.Object r2 = r5.A01
            X.E2Z r2 = (X.E2Z) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r0 = X.DbY.A05(r2)
            X.EF5 r4 = new X.EF5
            r4.<init>(r0, r1)
            return r4
        L_0x0082:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r5.A01
            X.E31 r0 = (X.E31) r0
            X.0eM r0 = r0.A09
            com.instagram.user.model.User r4 = X.DbX.A0l(r1, r0)
            return r4
        L_0x008f:
            java.lang.Object r0 = r5.A01
            X.E31 r0 = (X.E31) r0
            X.0eM r0 = r0.A09
            X.1Ng r4 = X.DbX.A0R(r0)
            return r4
        L_0x009a:
            java.lang.Object r0 = r5.A01
            X.E31 r0 = (X.E31) r0
            X.0eM r0 = r0.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6ve r4 = X.C322316vd.A00(r0)
            return r4
        L_0x00a9:
            java.lang.Object r3 = r5.A01
            X.E3F r3 = (X.E3F) r3
            X.0eM r0 = r3.A0B
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r1 = 17
            X.FyG r0 = new X.FyG
            r0.<init>(r3, r1)
            X.FG4.A04(r0, r2)
            r4 = 0
            return r4
        L_0x00bf:
            java.lang.Object r3 = r5.A01
            X.E3F r3 = (X.E3F) r3
            X.0eM r0 = r3.A0B
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r1 = 16
            X.FyG r0 = new X.FyG
            r0.<init>(r3, r1)
            X.FG4.A04(r0, r2)
            r4 = 0
            return r4
        L_0x00d5:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYs r4 = new X.FYs
            r4.<init>(r0)
            return r4
        L_0x00df:
            java.lang.Object r0 = r5.A01
            X.Dkw r0 = (X.C46769Dkw) r0
            X.2Fj r1 = r0.A01
            X.EPM r0 = X.EPM.A00
            r1.A0A(r0)
            goto L_0x0191
        L_0x00ec:
            java.lang.Object r0 = r5.A01
            X.E2V r0 = (X.E2V) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEq r4 = new X.EEq
            r4.<init>(r0)
            return r4
        L_0x00fc:
            java.lang.Object r0 = r5.A01
            X.E2V r0 = (X.E2V) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.FYs r4 = X.C49071Eop.A00(r0)
            return r4
        L_0x010b:
            java.lang.Object r0 = r5.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "address_list_key"
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            if (r0 == 0) goto L_0x011f
            X.EEp r4 = new X.EEp
            r4.<init>(r0)
            return r4
        L_0x011f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0124:
            java.lang.Object r2 = r5.A01
            X.E62 r2 = (X.E62) r2
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "ProfileMultipleAddressesBottomsheetFragment.USER_ID"
            java.lang.String r1 = X.C320236s2.A01(r1, r0)
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EF4 r4 = new X.EF4
            r4.<init>(r0, r1)
            return r4
        L_0x013e:
            java.lang.Object r0 = r5.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r4 = r0.A00()
            return r4
        L_0x0147:
            java.lang.Object r0 = r5.A01
            X.Dc6 r0 = (X.Dc6) r0
            com.instagram.common.session.UserSession r2 = r0.A0A
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 3
            X.MMK r1 = new X.MMK
            r1.<init>(r2, r0)
            java.lang.Class<X.KWP> r0 = X.KWP.class
            java.lang.Object r4 = r2.A01(r0, r1)
            return r4
        L_0x015e:
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YM r4 = r0.getDefaultViewModelProviderFactory()
            return r4
        L_0x0169:
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.07f r4 = r0.getViewModelStore()
            return r4
        L_0x0174:
            java.lang.Object r1 = r5.A01
            com.instagram.profile.fragment.UserDetailFragment r1 = (com.instagram.profile.fragment.UserDetailFragment) r1
            r0 = 0
            r1.A12(r0)
            goto L_0x0191
        L_0x017d:
            java.lang.Object r0 = r5.A01
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            boolean r0 = r0.A17()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x018a:
            java.lang.Object r0 = r5.A01
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            r0.A0p()
        L_0x0191:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0194:
            java.lang.Object r0 = r5.A01
            X.Dc7 r0 = (X.Dc7) r0
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Ddl r4 = new X.Ddl
            r4.<init>(r0)
            return r4
        L_0x01a4:
            java.lang.Object r0 = r5.A01
            X.DcA r0 = (X.DcA) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.E3T r4 = X.C49079Eox.A00(r0)
            return r4
        L_0x01b3:
            java.lang.Object r4 = r5.A01
            X.E5V r4 = (X.E5V) r4
            android.os.Bundle r2 = r4.requireArguments()
            java.lang.String r0 = "ProfileTabbedExplorerFragment.USER_ID"
            java.lang.String r3 = X.C320236s2.A01(r2, r0)
            r0 = 999(0x3e7, float:1.4E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.C320236s2.A01(r2, r0)
            java.lang.String r0 = "ProfileTabbedExplorerFragment.ONLY_SHOW_SELECTED_TAB"
            boolean r2 = X.DbT.A1X(r2, r0)
            X.EVo r1 = X.C48096EVo.valueOf(r1)
            X.0eM r0 = r4.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EFP r4 = new X.EFP
            r4.<init>(r0, r1, r3, r2)
            return r4
        L_0x01e1:
            java.lang.Object r0 = r5.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x01e8:
            java.lang.Object r4 = r5.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51800G2j.invoke():java.lang.Object");
    }
}
