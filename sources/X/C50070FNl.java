package X;

import android.view.View;

/* renamed from: X.FNl  reason: case insensitive filesystem */
public final class C50070FNl implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C50070FNl(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b3, code lost:
        r1 = r2.A01;
        r0 = r2.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fd, code lost:
        X.FFO.A02(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0100, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0205, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x020c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0050, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0218;
                case 1: goto L_0x0179;
                case 2: goto L_0x013f;
                case 3: goto L_0x0101;
                case 4: goto L_0x029e;
                case 5: goto L_0x00e9;
                case 6: goto L_0x00a5;
                case 7: goto L_0x0092;
                case 8: goto L_0x00d0;
                case 9: goto L_0x00b8;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1190503573(0xffffffffb90a5b6b, float:-1.3194761E-4)
            int r6 = X.AnonymousClass0fD.A05(r0)
            boolean r1 = r8.A03
            r3 = 0
            java.lang.Object r5 = r8.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r5 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r5
            com.instagram.common.session.UserSession r7 = r5.A01
            X.2Ay r0 = r5.A02
            java.lang.String r4 = r0.A00
            if (r1 == 0) goto L_0x0054
            long r1 = X.Dba.A01(r7)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.DbT.A1T(r7, r0, r4, r1)
            com.instagram.common.session.UserSession r1 = r5.A01
            java.lang.Object r0 = r8.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2nI r5 = X.C229382nI.A03(r0, r1, r3)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.DbX.A0v()
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            r0 = 6
            X.FVR r1 = new X.FVR
            r1.<init>(r8, r0)
            java.lang.String r0 = "com.bloks.www.ig.supervision.screen_time_enforcement.open_settings.async"
            X.FBO r0 = X.FBO.A00(r1, r0, r4, r3)
            r0.A01(r2, r5)
        L_0x004d:
            r0 = -1975194098(0xffffffff8a44ee0e, float:-9.48183E-33)
        L_0x0050:
            X.AnonymousClass0fD.A0C(r0, r6)
        L_0x0053:
            return
        L_0x0054:
            X.2Aq r0 = X.2Aq.A03(r7)
            long r1 = X.Dba.A02(r0, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            X.DbT.A1T(r7, r0, r4, r1)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x0073
            boolean r0 = X.0oI.A09(r1)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "barcelona://settings"
            X.FH7.A02(r1, r0)
            goto L_0x004d
        L_0x0073:
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            com.instagram.common.session.UserSession r0 = r5.A01
            X.6Yo r1 = X.DbU.A0Q(r1, r0)
            X.XQw r0 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            X.JaK r0 = X.Eq6.A00(r0, r3)
            r1.A0E(r0)
            r0 = 3172(0xc64, float:4.445E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0A = r0
            r1.A04()
            goto L_0x004d
        L_0x0092:
            java.lang.Object r2 = r8.A01
            X.FEp r2 = (X.C49915FEp) r2
            boolean r0 = r8.A03
            java.lang.Object r1 = r8.A02
            X.6qr r1 = (X.C319586qr) r1
            if (r0 == 0) goto L_0x0270
            X.6qr r0 = X.C319586qr.PROFESSIONAL_SIGNUP_FLOW
            if (r1 == r0) goto L_0x0270
            java.lang.String r3 = "professional_conversion"
            goto L_0x00b3
        L_0x00a5:
            java.lang.Object r2 = r8.A01
            X.FEp r2 = (X.C49915FEp) r2
            boolean r0 = r8.A03
            java.lang.Object r1 = r8.A02
            java.util.List r1 = (java.util.List) r1
            if (r0 == 0) goto L_0x0274
            java.lang.String r3 = "professional_switch_account"
        L_0x00b3:
            androidx.fragment.app.FragmentActivity r1 = r2.A01
            com.instagram.common.session.UserSession r0 = r2.A07
            goto L_0x00fd
        L_0x00b8:
            r0 = 8421491(0x808073, float:1.1801022E-38)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r8.A01
            X.G9g r2 = (X.C51960G9g) r2
            java.lang.Object r1 = r8.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            boolean r0 = r8.A03
            r2.DSJ(r9, r1, r0)
            r0 = 1769803450(0x697d0eba, float:1.9120486E25)
            goto L_0x0050
        L_0x00d0:
            r0 = 248240608(0xecbd9e0, float:5.025317E-30)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r8.A01
            X.G9g r2 = (X.C51960G9g) r2
            java.lang.Object r1 = r8.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            boolean r0 = r8.A03
            r2.DSJ(r9, r1, r0)
            r0 = 1519530473(0x5a9231e9, float:2.05751117E16)
            goto L_0x0050
        L_0x00e9:
            java.lang.Object r6 = r8.A01
            X.FEp r6 = (X.C49915FEp) r6
            boolean r1 = r8.A03
            java.lang.Object r5 = r8.A02
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x02ba
            java.lang.String r3 = "professional_switch_account"
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            com.instagram.common.session.UserSession r0 = r6.A07
        L_0x00fd:
            X.FFO.A02(r1, r0, r3)
            return
        L_0x0101:
            r0 = 1232953412(0x497d6044, float:1037828.25)
            int r6 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x011e
            java.lang.Object r1 = r8.A01
            X.9FM r1 = (X.AnonymousClass9FM) r1
            java.lang.Object r0 = r8.A02
            android.content.Context r0 = X.DbT.A08(r0)
            r1.A00(r0)
        L_0x0119:
            r0 = 1453514356(0x56a2de74, float:8.9538156E13)
            goto L_0x0050
        L_0x011e:
            java.lang.Object r3 = r8.A02
            X.ERb r3 = (X.C48014ERb) r3
            X.F1n r1 = r3.A05
            if (r1 == 0) goto L_0x013b
            java.lang.String r0 = "old_build_manual_update"
            r1.A00(r0)
            java.lang.Object r2 = r8.A01
            X.9FM r2 = (X.AnonymousClass9FM) r2
            android.content.Context r1 = r3.requireContext()
            boolean r0 = X.0oI.A09(r1)
            r2.A01(r1, r0)
            goto L_0x0119
        L_0x013b:
            java.lang.String r0 = "dogfoodingRageshakeLogger"
            goto L_0x0205
        L_0x013f:
            r0 = -1368498068(0xffffffffae6e606c, float:-5.4200575E-11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r8.A02
            X.ESD r7 = (X.ESD) r7
            android.content.Context r1 = r7.requireContext()
            X.0eM r0 = r7.A02
            X.Dg1 r5 = X.C46498Dg1.A00(r1, r0)
            r2 = 2131972145(0x7f135031, float:1.958129E38)
            java.lang.Object r4 = r8.A01
            r1 = 54
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r7)
            r5.A04(r0, r2)
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            boolean r2 = r8.A03
            r1 = 1
            X.FNl r0 = new X.FNl
            r0.<init>(r1, r4, r7, r2)
            r5.A02(r0, r3)
            X.C49945FFy.A00(r7, r5)
            r0 = 110452488(0x6955f08, float:5.6187207E-35)
            goto L_0x0050
        L_0x0179:
            r0 = 1361817382(0x512baf26, float:4.6086119E10)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r8.A02
            X.ESD r3 = (X.ESD) r3
            java.lang.Object r5 = r8.A01
            com.instagram.login.twofac.model.TotpSeed r5 = (com.instagram.login.twofac.model.TotpSeed) r5
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x01ff
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 2131975761(0x7f135e51, float:1.9588623E38)
            java.lang.String r0 = r3.getString(r0)
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r5.A01
            r1.append(r0)
            r0 = 63
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r4 = X.C66579MXk.A00(r0)
            r0 = 2131975763(0x7f135e53, float:1.9588627E38)
            java.lang.String r2 = r3.getString(r0)
            java.lang.String r1 = "\n\n            "
            r0 = 2131975762(0x7f135e52, float:1.9588625E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.002.A11(r4, r2, r1, r0, r4)
            java.lang.String r4 = X.0rw.A0t(r0)
            r0 = 2131971974(0x7f134f86, float:1.9580942E38)
            java.lang.String r1 = r3.getString(r0)
            X.8ab r2 = X.DbW.A0U(r3)
            r2.A05 = r7
            r2.A0q(r4)
            r0 = 28
            X.FJk r0 = X.C50025FJk.A00(r3, r5, r0)
            r2.A0c(r0, r1)
            r0 = 2131975698(0x7f135e12, float:1.9588496E38)
            java.lang.String r1 = X.DbU.A0m(r3, r0)
            r0 = 23
            X.FJf r0 = X.C50020FJf.A00(r3, r0)
            r2.A0b(r0, r1)
            X.DbT.A1V(r2)
            X.ESD.A06(r3)
        L_0x01fa:
            r0 = -1325708382(0xffffffffb0fb4ba2, float:-1.828415E-9)
            goto L_0x0050
        L_0x01ff:
            android.os.Bundle r1 = r3.A00
            if (r1 != 0) goto L_0x020d
            java.lang.String r0 = "twoFacResponseBundle"
        L_0x0205:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x020d:
            java.lang.String r0 = "is_two_factor_enabled"
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            X.ESD.A07(r3, r5, r0, r1, r0)
            goto L_0x01fa
        L_0x0218:
            r0 = -1588903878(0xffffffffa14b403a, float:-6.886408E-19)
            int r6 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0264
            java.lang.Object r0 = r8.A02
            X.E5m r0 = (X.E5m) r0
            X.0eM r0 = r0.A08
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6gx r5 = X.C313746gw.A00(r0)
            java.lang.Object r1 = r8.A01
            X.Dri r1 = (X.C47167Dri) r1
            int r4 = r1.A00
            X.3t3 r0 = r1.A06
            if (r0 == 0) goto L_0x026e
            java.lang.String r3 = X.C300965yF.A07(r0)
        L_0x023f:
            java.lang.String r2 = r1.A0C
            X.1Ln r1 = X.DbT.A0J(r5)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0264
            X.DbW.A17(r1, r5)
            java.lang.String r0 = "thread_update_name_cancel"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "cancel_button"
            r1.A0p(r0)
            java.lang.String r0 = "change_name_sheet"
            java.lang.Long r0 = X.DbZ.A0b(r1, r0, r3, r2, r4)
            r1.A0i(r0)
            X.Dba.A1C(r1, r5)
        L_0x0264:
            java.lang.Object r0 = r8.A02
            X.Dbb.A1S(r0)
            r0 = 1415915958(0x546529b6, float:3.93698922E12)
            goto L_0x0050
        L_0x026e:
            r3 = 0
            goto L_0x023f
        L_0x0270:
            r2.A02(r1)
            return
        L_0x0274:
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            com.instagram.common.session.UserSession r0 = r2.A07
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r4, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0281:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0295
            java.lang.Object r0 = r2.next()
            X.FAc r0 = (X.C49862FAc) r0
            int r1 = r0.A02
            android.view.View$OnClickListener r0 = r0.A05
            r3.A04(r0, r1)
            goto L_0x0281
        L_0x0295:
            X.FFy r0 = new X.FFy
            r0.<init>(r3)
            r0.A03(r4)
            return
        L_0x029e:
            boolean r0 = r8.A03
            java.lang.Object r1 = r8.A01
            X.4DH r1 = (X.AnonymousClass4DH) r1
            java.lang.Object r2 = r8.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            if (r0 == 0) goto L_0x02b4
            android.content.Context r1 = r1.requireContext()
            java.lang.String r0 = "meta_verified"
            X.FFO.A02(r1, r2, r0)
            return
        L_0x02b4:
            java.lang.String r0 = "nme_ig_creator_tools"
            X.F6X.A01(r1, r2, r0)
            return
        L_0x02ba:
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.16V r0 = X.16V.A06
            r4 = 2131974860(0x7f135acc, float:1.9586796E38)
            r3 = 2131974858(0x7f135aca, float:1.9586792E38)
            r2 = 2131974859(0x7f135acb, float:1.9586794E38)
            if (r5 != r0) goto L_0x02d2
            r4 = 2131974876(0x7f135adc, float:1.9586828E38)
            r3 = 2131974874(0x7f135ada, float:1.9586824E38)
            r2 = 2131974875(0x7f135adb, float:1.9586826E38)
        L_0x02d2:
            androidx.fragment.app.FragmentActivity r0 = r6.A01
            X.8ab r1 = X.DbS.A0X(r0)
            r1.A09(r4)
            r1.A08(r3)
            r0 = 52
            X.C50025FJk.A01(r1, r6, r5, r0, r2)
            r1.A05()
            X.DbT.A1V(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50070FNl.onClick(android.view.View):void");
    }
}
