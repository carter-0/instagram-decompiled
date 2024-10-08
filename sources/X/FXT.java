package X;

public final class FXT implements 1wn {
    public final int A00;
    public final Object A01;

    public FXT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.MVB] */
    /* JADX WARNING: type inference failed for: r0v50, types: [java.lang.Object, X.MVB] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x014b, code lost:
        r0 = "quietModeToggle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0166, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x016d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x021a, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x021d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x014e;
                case 1: goto L_0x01e1;
                case 2: goto L_0x017d;
                case 3: goto L_0x0046;
                case 4: goto L_0x00aa;
                case 5: goto L_0x007c;
                case 6: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1843007840(0xffffffff9225eea0, float:-5.235895E-28)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1050976489(0xffffffffc15b5f17, float:-13.710715)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A01
            X.E6Y r0 = (X.E6Y) r0
            X.E6Y.A01(r0)
            r0 = 868670031(0x33c6da4f, float:9.2598036E-8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -136788656(0xfffffffff7d8c550, float:-8.7932664E33)
        L_0x0023:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0027:
            r0 = 1107158050(0x41fde422, float:31.736393)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 632606828(0x25b4d06c, float:3.1366255E-16)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A01
            X.E6b r0 = (X.C47517E6b) r0
            X.C47517E6b.A01(r0)
            r0 = 1516645223(0x5a662b67, float:1.61967415E16)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1456129718(0x56cac6b6, float:1.11477403E14)
            goto L_0x0023
        L_0x0046:
            r0 = 1223796011(0x48f1a52b, float:494889.34)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 637868712(0x26051aa8, float:4.617977E-16)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r11.A01
            X.E3D r3 = (X.E3D) r3
            android.view.View r0 = r3.A03
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "quietModeTurnOnAutomaticallyRow"
            goto L_0x0166
        L_0x0060:
            float r2 = r0.getAlpha()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0072
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A0L
            if (r0 == 0) goto L_0x014b
            r0.setChecked(r1)
        L_0x0072:
            r0 = -377239844(0xffffffffe983c6dc, float:-1.9913546E25)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 784468819(0x2ec20b53, float:8.82411E-11)
            goto L_0x0023
        L_0x007c:
            r0 = -1952634798(0xffffffff8b9d2852, float:-6.053487E-32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1772011669(0xffffffff96613f6b, float:-1.8195366E-25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r11.A01
            X.E3D r2 = (X.E3D) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            java.lang.String r0 = "something_went_wrong"
            X.C59689JTv.A0B(r1, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r2.A0L
            if (r1 == 0) goto L_0x014b
            r0 = 1
            r1.setChecked(r0)
            r0 = 789491046(0x2f0ead66, float:1.2976428E-10)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1607735266(0x5fd417e2, float:3.0565865E19)
            goto L_0x0023
        L_0x00aa:
            r0 = -1180466520(0xffffffffb9a382a8, float:-3.118713E-4)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = -160092966(0xfffffffff6752cda, float:-1.243186E33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r11.A01
            X.E3D r7 = (X.E3D) r7
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r7.A0L
            if (r0 == 0) goto L_0x014b
            r8 = 1
            r0.setChecked(r8)
            r0 = 1056964608(0x3f000000, float:0.5)
            X.E3D.A0C(r7, r0)
            X.E3D.A0B(r7, r0)
            X.E3D.A0A(r7)
            X.0eM r6 = r7.A0W
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.C46359DdX.A06(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            r0 = 0
            X.Dba.A1J(r1, r0)
            long r0 = X.AnonymousClass7TG.A0I()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            long r2 = X.C46359DdX.A03(r2, r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r6)
            java.util.Date r10 = X.C46359DdX.A04(r6, r0)
            X.6ap r6 = X.DbS.A0a()
            android.content.res.Resources r9 = X.DbV.A05(r7)
            boolean r0 = r7.A0P
            r1 = 2131971212(0x7f134c8c, float:1.9579397E38)
            if (r0 == 0) goto L_0x010a
            r1 = 2131973960(0x7f135748, float:1.958497E38)
        L_0x010a:
            android.content.Context r0 = r7.requireContext()
            java.text.SimpleDateFormat r0 = X.FGR.A04(r0, r2)
            java.lang.String r0 = r0.format(r10)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r9, r0, r1)
            r6.A0D = r0
            r6.A0L = r8
            android.content.res.Resources r2 = X.DbV.A05(r7)
            boolean r1 = r7.A0P
            r0 = 2131971209(0x7f134c89, float:1.957939E38)
            if (r1 == 0) goto L_0x012c
            r0 = 2131973957(0x7f135745, float:1.9584964E38)
        L_0x012c:
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r2, r0)
            r6.A0G = r0
            X.Lrw r0 = new X.Lrw
            r0.<init>()
            r6.A0A(r0)
            r6.A06()
            X.Dbb.A1Q(r6)
            r0 = 986814589(0x3ad1987d, float:0.001599088)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1732149957(0xffffffff98c17d3b, float:-5.001578E-24)
            goto L_0x021a
        L_0x014b:
            java.lang.String r0 = "quietModeToggle"
            goto L_0x0166
        L_0x014e:
            r0 = -1138664972(0xffffffffbc2159f4, float:-0.009848107)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 588713356(0x23170d8c, float:8.188595E-18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r11.A01
            X.Der r0 = (X.C46430Der) r0
            X.Dex r1 = r0.A0E
            if (r1 != 0) goto L_0x016e
            java.lang.String r0 = "followListAdapter"
        L_0x0166:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x016e:
            r0 = 0
            r1.A0G(r0, r0)
            r0 = -397346867(0xffffffffe850f7cd, float:-3.9472934E24)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -288082977(0xffffffffeed433df, float:-3.2836765E28)
            goto L_0x0023
        L_0x017d:
            r0 = -1219613532(0xffffffffb74e2ca4, float:-1.22889505E-5)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = -748198391(0xffffffffd3676609, float:-9.9384931E11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r11.A01
            X.E3D r6 = (X.E3D) r6
            r3 = 0
            X.E3D.A0F(r6, r3)
            X.6ap r7 = X.DbS.A0a()
            android.content.res.Resources r2 = X.DbV.A05(r6)
            boolean r1 = r6.A0P
            r0 = 2131971208(0x7f134c88, float:1.9579389E38)
            if (r1 == 0) goto L_0x01a5
            r0 = 2131973956(0x7f135744, float:1.9584962E38)
        L_0x01a5:
            X.DbT.A1D(r2, r7, r0)
            r0 = 1
            r7.A0L = r0
            android.content.res.Resources r2 = X.DbV.A05(r6)
            boolean r1 = r6.A0P
            r0 = 2131971209(0x7f134c89, float:1.957939E38)
            if (r1 == 0) goto L_0x01b9
            r0 = 2131973957(0x7f135745, float:1.9584964E38)
        L_0x01b9:
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r2, r0)
            r7.A0G = r0
            X.Lrw r0 = new X.Lrw
            r0.<init>()
            r7.A0A(r0)
            r7.A06()
            X.Dbb.A1Q(r7)
            X.DcU r1 = r6.A0M
            r0 = 0
            r6.A0M = r0
            if (r1 == 0) goto L_0x01d7
            X.E3D.A08(r1, r6, r3)
        L_0x01d7:
            r0 = 1754373614(0x68919dee, float:5.5012514E24)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -418246998(0xffffffffe7120eaa, float:-6.89736E23)
            goto L_0x021a
        L_0x01e1:
            r0 = -837117391(0xffffffffce1a9a31, float:-6.4844909E8)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.FWc r12 = (X.C50271FWc) r12
            r0 = -916761397(0xffffffffc95b54cb, float:-898380.7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            if (r12 == 0) goto L_0x0211
            X.Df5 r3 = r12.A01
            r1 = -1
            int r0 = r12.A00
            if (r0 == r1) goto L_0x0211
            java.lang.Object r2 = r11.A01
            com.instagram.user.userlist.fragment.UnifiedFollowFragment r2 = (com.instagram.user.userlist.fragment.UnifiedFollowFragment) r2
            r2.A02 = r0
            java.util.Map r0 = r2.A0T
            java.lang.Object r1 = r0.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0211
            java.lang.String r0 = com.instagram.user.userlist.fragment.UnifiedFollowFragment.A00(r3, r2)
            r1.setText(r0)
        L_0x0211:
            r0 = -1520055404(0xffffffffa565cb94, float:-1.9931559E-16)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1837221063(0x6d81c4c7, float:5.020182E27)
        L_0x021a:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXT.onEvent(java.lang.Object):void");
    }
}
