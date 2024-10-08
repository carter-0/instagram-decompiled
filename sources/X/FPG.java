package X;

import android.view.View;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

public final class FPG implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FPG(OneTapLoginLandingFragment oneTapLoginLandingFragment, C319646qx r2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.A01 = oneTapLoginLandingFragment;
                this.A02 = r2;
                return;
            default:
                this.A01 = oneTapLoginLandingFragment;
                this.A02 = r2;
                return;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new FPG(i, obj, obj2), view);
    }

    public static void A01(View view, OneTapLoginLandingFragment oneTapLoginLandingFragment, C319646qx r3, int i) {
        AnonymousClass0fU.A00(new FPG(oneTapLoginLandingFragment, r3, i), view);
    }

    /* JADX WARNING: type inference failed for: r4v57, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0651, code lost:
        if (r4.equals(r1) == false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0653, code lost:
        r4 = r3.getSession();
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0659, code lost:
        if (r1 == null) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x065b, code lost:
        X.Ep6.A00(r3.requireContext(), r3, r6, new X.C47978EPk(r3, r3, r4, r1.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r4 = new java.io.StringWriter();
        r1 = X.AnonymousClass15o.A00.A0A(r4);
        X.AnonymousClass4V6.A00(r1, r6);
        r1.close();
        r4 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x06b9, code lost:
        if (r4 == null) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x06bb, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x06bd, code lost:
        if (r1 == null) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x06bf, code lost:
        r5.setArguments(X.F7D.A00(r1.A00, r4, false));
        r1 = X.Dbb.A0G(r3);
        r1.A0D(r5);
        r1.A0G = true;
        r1.A0E = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x06d5, code lost:
        X.0wb.A03("IG-QP", X.002.A0R("Error parsing QuickPromotion for fullscreen interstitial: ", r6.A0D));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x071c, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0726, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0118, code lost:
        X.0qQ.A0F("birthdayLogger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0121, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0dc9, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0dcc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x108d, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x1090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x10d4, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x10d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x025f, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0262, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x036a, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x036d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r24) {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A00
            r4 = r24
            switch(r0) {
                case 2: goto L_0x10dc;
                case 3: goto L_0x1091;
                case 4: goto L_0x1078;
                case 5: goto L_0x1062;
                case 6: goto L_0x104c;
                case 7: goto L_0x101f;
                case 8: goto L_0x0f4a;
                case 9: goto L_0x0f33;
                case 10: goto L_0x0f1c;
                case 11: goto L_0x0f05;
                case 12: goto L_0x0eee;
                case 13: goto L_0x0e74;
                case 14: goto L_0x0dd8;
                case 15: goto L_0x0da1;
                case 16: goto L_0x0d87;
                case 17: goto L_0x0d2d;
                case 18: goto L_0x0d18;
                case 19: goto L_0x0d03;
                case 20: goto L_0x0cb6;
                case 21: goto L_0x0c8c;
                case 22: goto L_0x0c7b;
                case 23: goto L_0x0c36;
                case 24: goto L_0x0bb4;
                case 25: goto L_0x0b62;
                case 26: goto L_0x0ae3;
                case 27: goto L_0x0a6f;
                case 28: goto L_0x0a56;
                case 29: goto L_0x0a3b;
                case 30: goto L_0x0a20;
                case 31: goto L_0x0a05;
                case 32: goto L_0x095c;
                case 33: goto L_0x08d2;
                case 34: goto L_0x082e;
                case 35: goto L_0x074e;
                case 36: goto L_0x0731;
                case 37: goto L_0x05a4;
                case 38: goto L_0x0586;
                case 39: goto L_0x0568;
                case 40: goto L_0x0540;
                case 41: goto L_0x0524;
                case 42: goto L_0x04f1;
                case 43: goto L_0x0015;
                case 44: goto L_0x04ce;
                case 45: goto L_0x04ab;
                case 46: goto L_0x0492;
                case 47: goto L_0x0479;
                case 48: goto L_0x041f;
                case 49: goto L_0x03fc;
                case 50: goto L_0x03d8;
                case 51: goto L_0x03b5;
                case 52: goto L_0x0392;
                case 53: goto L_0x036e;
                case 54: goto L_0x0329;
                case 55: goto L_0x0300;
                case 56: goto L_0x02d7;
                case 57: goto L_0x029b;
                case 58: goto L_0x026e;
                case 59: goto L_0x0241;
                case 60: goto L_0x022b;
                case 61: goto L_0x0205;
                case 62: goto L_0x01d8;
                case 63: goto L_0x01b9;
                case 64: goto L_0x0185;
                case 65: goto L_0x016d;
                case 66: goto L_0x0154;
                case 67: goto L_0x013b;
                case 68: goto L_0x0122;
                case 69: goto L_0x00d4;
                case 70: goto L_0x0091;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r2.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r2.A02
            X.6qx r0 = (X.C319646qx) r0
            r1.A02(r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r2.A01
            X.Dm5 r0 = (X.C46829Dm5) r0
            java.lang.Object r5 = r2.A02
            X.EVe r5 = (X.C48086EVe) r5
            X.ExF r0 = r0.A04
            r12 = 0
            X.FnN r1 = r0.A01
            X.Tzd r2 = r0.A00
            com.instagram.user.model.User r11 = r2.A0L
            java.lang.String r4 = "Required value was null."
            if (r11 == 0) goto L_0x11c4
            r1.A01 = r5
            X.37E r3 = X.AnonymousClass37D.A00
            androidx.fragment.app.Fragment r7 = r1.A02
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            X.DbX.A10(r0, r3)
            int r0 = r5.ordinal()
            switch(r0) {
                case 1: goto L_0x1120;
                case 2: goto L_0x10e8;
                case 3: goto L_0x111c;
                case 4: goto L_0x111c;
                case 5: goto L_0x003e;
                case 6: goto L_0x11c0;
                case 7: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            return
        L_0x003f:
            X.3gp r9 = r2.A02
            if (r9 == 0) goto L_0x0014
            X.3uh r0 = r2.A0K
            if (r0 == 0) goto L_0x0014
            X.1Xj r8 = r0.A0b
            if (r8 == 0) goto L_0x0014
            java.lang.String r11 = r8.getId()
            if (r11 == 0) goto L_0x0014
            X.4D6 r7 = r1.A05
            com.instagram.common.session.UserSession r3 = r1.A04
            r10 = 1
            java.lang.String r6 = r9.A0G
            X.0iw r0 = r1.A03
            java.lang.String r5 = r0.getModuleName()
            X.AnonymousClass7TF.A1B(r6, r10, r5)
            X.1NY r4 = X.AnonymousClass7TG.A0a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r0 = "media/story_comment/delete/"
            java.lang.String r0 = X.0mp.A06(r0, r3)
            X.Dba.A1H(r4, r0)
            java.lang.String r0 = "comment_id"
            r4.A9m(r0, r6)
            java.lang.String r0 = "media_id"
            r4.A9m(r0, r11)
            java.lang.String r0 = "container_module"
            r4.A9m(r0, r5)
            X.1OC r0 = X.DbT.A0U(r4, r10)
            r7.schedule(r0)
            java.lang.String r0 = r9.A0G
            X.JZW.A04(r8, r0)
            X.G7s r0 = r1.A07
            r0.Cs2(r2)
            return
        L_0x0091:
            r0 = 894368235(0x354ef9eb, float:7.710466E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.Dlv r1 = (X.C46819Dlv) r1
            X.E26 r3 = r1.A00
            java.lang.Object r1 = r2.A01
            X.F00 r1 = (X.F00) r1
            X.EWN r2 = r1.A03
            X.0eM r1 = r3.A0O
            java.lang.Object r1 = r1.getValue()
            X.Dkc r1 = (X.C46749Dkc) r1
            X.05G r1 = r1.A00
            r1.Epw(r2)
            X.91o r4 = r3.A09
            if (r4 == 0) goto L_0x0118
            X.0eM r1 = r3.A0N
            long r8 = X.Dbb.A08(r1)
            long r10 = X.Dbb.A08(r1)
            X.EWN r1 = X.EWN.CLOSE_FRIENDS
            if (r2 != r1) goto L_0x00d1
            java.lang.String r7 = "selected_close_friends"
        L_0x00c5:
            java.lang.String r5 = "qp"
            java.lang.String r6 = "visibility"
            r4.A02(r5, r6, r7, r8, r10)
            r1 = -753684120(0xffffffffd313b168, float:-6.3433658E11)
            goto L_0x10d4
        L_0x00d1:
            java.lang.String r7 = "selected_reciprocal_follows"
            goto L_0x00c5
        L_0x00d4:
            r0 = -743754349(0xffffffffd3ab3593, float:-1.47067647E12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Dlz r0 = (X.C46823Dlz) r0
            X.E1k r6 = r0.A02
            java.lang.Object r5 = r2.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0eM r2 = r6.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "birthday_users_list"
            X.1pE r0 = X.1pE.A01(r3, r6, r1, r0)
            X.Dbc.A0x(r0, r5)
            r0.A06()
            X.91o r6 = r6.A03
            if (r6 == 0) goto L_0x0118
            java.lang.String r0 = r5.getId()
            long r10 = java.lang.Long.parseLong(r0)
            long r12 = X.Dbb.A08(r2)
            r9 = 0
            java.lang.String r7 = "birthday_center"
            java.lang.String r8 = "dm_quick_response"
            r6.A02(r7, r8, r9, r10, r12)
            r0 = -477315772(0xffffffffe38cbd44, float:-5.1923644E21)
            goto L_0x025f
        L_0x0118:
            java.lang.String r0 = "birthdayLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0122:
            r0 = -2122748262(0xffffffff81796e9a, float:-4.581343E-38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Dlz r0 = (X.C46823Dlz) r0
            X.E1k r1 = r0.A02
            java.lang.Object r0 = r2.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A00(r0)
            r0 = 1327996906(0x4f279fea, float:2.8122752E9)
            goto L_0x025f
        L_0x013b:
            r0 = -928282676(0xffffffffc8ab87cc, float:-351294.38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Dlz r0 = (X.C46823Dlz) r0
            X.E1k r1 = r0.A02
            java.lang.Object r0 = r2.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A00(r0)
            r0 = 1152498083(0x44b1b9a3, float:1421.8011)
            goto L_0x025f
        L_0x0154:
            r0 = 146421366(0x8ba3676, float:1.12072715E-33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Dlz r0 = (X.C46823Dlz) r0
            X.E1k r1 = r0.A02
            java.lang.Object r0 = r2.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A00(r0)
            r0 = -1451922094(0xffffffffa9756d52, float:-5.449575E-14)
            goto L_0x025f
        L_0x016d:
            java.lang.Object r1 = r2.A01
            X.Ezz r1 = (X.C49642Ezz) r1
            java.lang.Object r0 = r2.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.3kF r4 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r3 = r1.A01
            com.instagram.common.session.UserSession r2 = r1.A02
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "shopping_business_settings"
            r4.A18(r3, r2, r1, r0)
            return
        L_0x0185:
            r0 = 1636548105(0x618bbe09, float:3.2222386E20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r5 = "payments"
            java.lang.Object r1 = r2.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "promotion_payments_entered_from_payment_settings"
            r3 = 0
            X.FCT.A01(r3, r1, r5, r0, r3)
            java.lang.String r0 = "settings_payment_options"
            X.C18707VyY.A01(r1, r0)
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.6Yo r1 = X.DbU.A0Q(r0, r1)
            X.UsI r0 = new X.UsI
            r0.<init>()
            r1.A0B(r3, r0)
            java.lang.String r0 = "PromotePaymentsInterstitialFragment.BACK_STACK_NAME"
            r1.A0A = r0
            r1.A04()
            r0 = 1426379872(0x5504d460, float:9.1279799E12)
            goto L_0x025f
        L_0x01b9:
            r0 = -619532481(0xffffffffdb12af3f, float:-4.1288032E16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.F3U r0 = (X.F3U) r0
            android.app.Activity r5 = r0.A01
            com.instagram.common.session.UserSession r3 = r0.A05
            java.lang.Object r0 = r2.A02
            X.9JM r0 = (X.AnonymousClass9JM) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A04
            X.FGP.A02(r5, r3, r1, r0)
            r0 = 920901216(0x36e3d660, float:6.7900837E-6)
            goto L_0x025f
        L_0x01d8:
            r0 = 416643734(0x18d57a96, float:5.518299E-24)
            int r4 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "entrypoint"
            java.lang.String r0 = "notifications"
            r6.putString(r1, r0)
            java.lang.Object r5 = r2.A02
            X.0lg r5 = (X.0lg) r5
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.Object r2 = r2.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = "quiet_mode_settings"
            X.6W8 r0 = X.DbW.A0W(r1, r6, r5, r3, r0)
            X.DbU.A1K(r2, r0)
            r0 = -1529515428(0xffffffffa4d5725c, float:-9.256776E-17)
            goto L_0x025f
        L_0x0205:
            java.lang.Object r4 = r2.A01
            X.EyH r4 = (X.EyH) r4
            java.lang.Object r3 = r2.A02
            X.F20 r3 = (X.F20) r3
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.pro_home.monetization_platform.support.monetization_help_screen"
            X.DiU r2 = X.C46649DiU.A04(r0, r1)
            X.E6c r0 = r4.A02
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A00
            X.C46649DiU.A09(r1, r2, r0)
            java.lang.String r2 = "monetization_help"
            java.lang.String r1 = "enter"
            r0 = 0
            r3.A00(r2, r1, r0)
            return
        L_0x022b:
            r0 = -135687293(0xfffffffff7e99383, float:-9.474977E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            X.FF7 r3 = (X.FF7) r3
            java.lang.String r1 = "invite_story"
            java.lang.Object r0 = r2.A01
            X.FF7.A00(r3, r0, r1)
            r0 = 482430306(0x1cc14d62, float:1.2791672E-21)
            goto L_0x025f
        L_0x0241:
            r0 = 1917165772(0x7245a0cc, float:3.914428E30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r5 = r1.A02
            java.lang.String r3 = "settings_business_options"
            com.instagram.base.activity.BaseFragmentActivity r2 = r1.A00
            if (r2 == 0) goto L_0x0263
            r1 = 1
            java.lang.String r0 = "setting"
            X.C324476zN.A0P(r2, r5, r3, r0, r1)
            r0 = 458183672(0x1b4f53f8, float:1.714977E-22)
        L_0x025f:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0263:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -460255273(0xffffffffe4910fd7, float:-2.1407354E22)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x026e:
            r0 = 1884186267(0x704e669b, float:2.5551182E29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r5 = r1.A02
            java.lang.Object r6 = r2.A01
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.String r7 = "settings_business_options"
            com.instagram.base.activity.BaseFragmentActivity r4 = r1.A00
            if (r4 == 0) goto L_0x0292
            r9 = 1
            java.lang.String r8 = "setting"
            X.C324476zN.A0C(r4, r5, r6, r7, r8, r9)
            r0 = -546412463(0xffffffffdf6e6851, float:-1.717907E19)
            goto L_0x108d
        L_0x0292:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 2139464088(0x7f85a198, float:NaN)
            goto L_0x036a
        L_0x029b:
            r0 = 392377967(0x1763366f, float:7.341636E-25)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A02
            X.FRY r4 = (X.FRY) r4
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r3 = r4.A02
            java.lang.Object r0 = r2.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.OSf r2 = new X.OSf
            r2.<init>(r0, r3)
            java.lang.String r1 = "icebreaker_settings_row_click"
            r0 = 0
            X.C70932OSf.A00(r2, r1, r0, r0)
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r1 = new com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment
            r1.<init>()
            com.instagram.base.activity.BaseFragmentActivity r0 = r4.A00
            if (r0 == 0) goto L_0x02cc
            X.DbZ.A18(r1, r0, r3)
            r0 = 176137936(0xa7fa6d0, float:1.2309177E-32)
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x02cc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1130818857(0x4366ed29, float:230.9264)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x02d7:
            r0 = -882123366(0xffffffffcb6bdd9a, float:-1.545769E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.6Yo r3 = X.Dbc.A06(r1)
            X.ERx r1 = new X.ERx
            r1.<init>()
            r4 = 0
            r3.A0B(r4, r1)
            r3.A04()
            java.lang.Object r3 = r2.A01
            X.F20 r3 = (X.F20) r3
            java.lang.String r2 = "creator_settings_help"
            java.lang.String r1 = "enter"
            r3.A00(r2, r1, r4)
            r1 = -1869871059(0xffffffff908c082d, float:-5.523286E-29)
            goto L_0x10d4
        L_0x0300:
            r0 = 380438935(0x16ad0997, float:2.795571E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.6Yo r4 = X.Dbc.A06(r1)
            X.FCL.A00()
            java.lang.Object r3 = r2.A01
            java.util.List r3 = (java.util.List) r3
            X.E3x r2 = new X.E3x
            r2.<init>()
            java.lang.String r1 = "ARGUMENT_PRODUCT_ELIGIBILITY_LIST"
            X.DbZ.A1B(r2, r1, r3)
            r4.A0D(r2)
            r4.A04()
            r1 = -1335276784(0xffffffffb0694b10, float:-8.4871576E-10)
            goto L_0x10d4
        L_0x0329:
            r0 = -1418835497(0xffffffffab6e49d7, float:-8.465706E-13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r5 = r1.A02
            boolean r0 = X.C324536zU.A00(r5)
            if (r0 == 0) goto L_0x034c
            android.content.Context r1 = X.DbS.A08(r1)
            java.lang.String r0 = "page_linking"
            X.FFO.A02(r1, r5, r0)
            r0 = -2033013930(0xffffffff86d2ab56, float:-7.9244976E-35)
            goto L_0x108d
        L_0x034c:
            com.instagram.base.activity.BaseFragmentActivity r4 = r1.A00
            if (r4 == 0) goto L_0x0363
            java.lang.Object r2 = r2.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            X.2jx r1 = r1.A01
            X.C322576w3.A00()
            java.lang.String r0 = "setting"
            X.C50143FRa.A00(r4, r1, r2, r5, r0)
            r0 = -1327557812(0xffffffffb0df134c, float:-1.623087E-9)
            goto L_0x108d
        L_0x0363:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -232979893(0xfffffffff21d024b, float:-3.1098828E30)
        L_0x036a:
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x036e:
            java.lang.Object r0 = r2.A01
            X.EzL r0 = (X.C49602EzL) r0
            java.lang.Object r3 = r2.A02
            java.util.List r3 = (java.util.List) r3
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A02
            X.6Yo r2 = X.DbU.A0Q(r1, r0)
            X.FCL.A00()
            X.E3x r1 = new X.E3x
            r1.<init>()
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY_LIST"
            X.DbZ.A1B(r1, r0, r3)
            r2.A0E(r1)
            r2.A04()
            return
        L_0x0392:
            r0 = -1932884960(0xffffffff8cca8420, float:-3.1202548E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r5 = r2.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.37D r4 = X.DbV.A0g(r5, r1)
            if (r4 == 0) goto L_0x03b0
            java.lang.Object r3 = r2.A01
            r2 = 7
            X.FmJ r1 = new X.FmJ
            r1.<init>(r2, r3, r5)
            X.DbU.A1U(r1, r4, r4)
        L_0x03b0:
            r1 = -1445195274(0xffffffffa9dc11f6, float:-9.7730783E-14)
            goto L_0x10d4
        L_0x03b5:
            r0 = -1028994941(0xffffffffc2aac883, float:-85.391624)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r5 = r2.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.37D r4 = X.DbV.A0g(r5, r1)
            if (r4 == 0) goto L_0x03d3
            java.lang.Object r3 = r2.A01
            r2 = 6
            X.FmJ r1 = new X.FmJ
            r1.<init>(r2, r3, r5)
            X.DbU.A1U(r1, r4, r4)
        L_0x03d3:
            r1 = 110661906(0x6989112, float:5.7389207E-35)
            goto L_0x10d4
        L_0x03d8:
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r2.A02
            X.0lg r3 = (X.0lg) r3
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r0 = 2896(0xb50, float:4.058E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r2 = X.C46649DiU.A04(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r3)
            r0 = 2131972244(0x7f135094, float:1.958149E38)
            X.DbS.A18(r4, r1, r0)
            r2.A0D(r4, r1)
            return
        L_0x03fc:
            r0 = -540277605(0xffffffffdfcc049b, float:-2.940209E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r1 = r2.A02
            X.0lg r1 = (X.0lg) r1
            X.6Yo r2 = X.DbU.A0Q(r3, r1)
            X.ERs r1 = new X.ERs
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = 1081850063(0x407bb8cf, float:3.9331548)
            goto L_0x10d4
        L_0x041f:
            r0 = -55567442(0xfffffffffcb01bae, float:-7.315245E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.Tqa r3 = (X.C14140Tqa) r3
            java.lang.Object r1 = r2.A02
            X.UqL r1 = (X.C16196UqL) r1
            com.instagram.user.model.User r1 = r1.A00
            java.lang.String r6 = r1.getId()
            java.lang.String r5 = r1.A0P()
            com.instagram.common.session.UserSession r1 = r3.A01
            X.Tww r2 = X.C14434TwI.A00(r1)
            X.1OC r1 = r2.A01
            if (r1 == 0) goto L_0x0445
            r1.cancel()
        L_0x0445:
            r1 = 0
            r2.A02 = r1
            X.Twp r1 = r2.A03
            if (r1 == 0) goto L_0x044f
            r1.A00()
        L_0x044f:
            X.5js r3 = r3.A03
            X.0wc r2 = r3.A06
            java.lang.String r1 = "similar_user_unit_dismissed"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r1)
            X.0iw r3 = r3.A00
            java.lang.String r2 = r3.getModuleName()
            java.lang.String r1 = "view_module"
            r4.AAJ(r1, r2)
            X.DbW.A16(r4, r3)
            java.lang.String r1 = "chaining_profile_id"
            r4.AAJ(r1, r6)
            java.lang.String r1 = "algorithm"
            r4.AAJ(r1, r5)
            X.AnonymousClass7TH.A0V(r4)
            r1 = 1474677768(0x57e5cc08, float:5.05328941E14)
            goto L_0x10d4
        L_0x0479:
            r0 = 1963512577(0x7508d301, float:1.7344532E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.E67 r1 = (X.E67) r1
            X.F2A r3 = r1.A02
            java.lang.Object r1 = r2.A02
            com.instagram.api.schemas.StoryUnlockableStickerData r1 = (com.instagram.api.schemas.StoryUnlockableStickerData) r1
            r3.A00(r1)
            r1 = -1869179861(0xffffffff9096942b, float:-5.9392857E-29)
            goto L_0x10d4
        L_0x0492:
            r0 = -1880790096(0xffffffff8fe56bb0, float:-2.2622623E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.Dm3 r1 = (X.C46827Dm3) r1
            X.F2A r3 = r1.A02
            java.lang.Object r1 = r2.A02
            com.instagram.api.schemas.StoryUnlockableStickerData r1 = (com.instagram.api.schemas.StoryUnlockableStickerData) r1
            r3.A00(r1)
            r1 = -926407339(0xffffffffc8c82555, float:-409898.66)
            goto L_0x10d4
        L_0x04ab:
            r0 = 1964450747(0x751723bb, float:1.9159217E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r3 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r2.A01
            android.app.Activity r1 = (android.app.Activity) r1
            X.37D r5 = r3.A01(r1)
            if (r5 == 0) goto L_0x04c9
            java.lang.Object r3 = r2.A02
            r2 = 5
            X.FmJ r1 = new X.FmJ
            r1.<init>(r2, r3, r4)
            X.DbU.A1U(r1, r5, r5)
        L_0x04c9:
            r1 = 1915922749(0x7232a93d, float:3.5387474E30)
            goto L_0x10d4
        L_0x04ce:
            r0 = -718793019(0xffffffffd52816c5, float:-1.15509842E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.VOj r1 = (X.C17256VOj) r1
            java.lang.Object r3 = r2.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.TrF r2 = r1.A00
            com.facebook.common.callercontext.CallerContext r1 = X.C14176TrF.A11
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = r2.A0U
            X.FnN r2 = r1.A0A
            java.lang.String r1 = r3.getId()
            r2.A05(r1)
            r1 = 1994860212(0x76e726b4, float:2.3441515E33)
            goto L_0x10d4
        L_0x04f1:
            r0 = 1606131507(0x5fbb9f33, float:2.7039161E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.GUi r4 = X.C63556Kz5.A01
            java.lang.Object r3 = r2.A01
            X.K7D r3 = (X.K7D) r3
            X.0eM r1 = r3.A0F
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            java.lang.String r8 = r3.A08
            if (r8 == 0) goto L_0x051a
            java.lang.Object r6 = r2.A02
            X.FTb r6 = (X.C50195FTb) r6
            java.lang.String r9 = "ig_stories_consumption_avatar_mentions_bottom_sheet"
            r4.A01(r5, r6, r7, r8, r9)
            r1 = 1113208601(0x425a3719, float:54.553806)
            goto L_0x10d4
        L_0x051a:
            java.lang.String r0 = "editorLoggingSurface"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0524:
            r0 = -2108772852(0xffffffff824eae0c, float:-1.5184439E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.2bv r4 = (X.2bv) r4
            if (r4 == 0) goto L_0x053b
            java.lang.Object r3 = r2.A02
            X.4UC r3 = (X.AnonymousClass4UC) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 0
            r4.DbI(r3, r2, r1)
        L_0x053b:
            r1 = -1296787339(0xffffffffb2b49875, float:-2.1024087E-8)
            goto L_0x10d4
        L_0x0540:
            r0 = -1984513332(0xffffffff89b6bacc, float:-4.399057E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.E4Q r1 = (X.E4Q) r1
            X.2qi r4 = r1.A08
            r3 = 0
            if (r4 != 0) goto L_0x055a
            java.lang.String r0 = "_quickPromotionDelegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x055a:
            java.lang.Object r2 = r2.A01
            X.4UC r2 = (X.AnonymousClass4UC) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r4.DbI(r2, r1, r3)
            r1 = -1685564240(0xffffffff9b8854b0, float:-2.255404E-22)
            goto L_0x10d4
        L_0x0568:
            r0 = 1343235769(0x501026b9, float:9.6738273E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.E4R r1 = (X.E4R) r1
            X.2qi r4 = r1.A08
            if (r4 == 0) goto L_0x0581
            java.lang.Object r3 = r2.A01
            X.4UC r3 = (X.AnonymousClass4UC) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r1 = 0
            r4.DbI(r3, r2, r1)
        L_0x0581:
            r1 = 148677874(0x8dca4f2, float:1.3279547E-33)
            goto L_0x10d4
        L_0x0586:
            r0 = 1582540221(0x5e53a5bd, float:3.81270088E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.E4R r1 = (X.E4R) r1
            X.2qi r4 = r1.A08
            if (r4 == 0) goto L_0x059f
            java.lang.Object r3 = r2.A01
            X.4UC r3 = (X.AnonymousClass4UC) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 0
            r4.DbI(r3, r2, r1)
        L_0x059f:
            r1 = 48112322(0x2de22c2, float:3.2639918E-37)
            goto L_0x10d4
        L_0x05a4:
            r0 = 1551931751(0x5c809967, float:2.89579717E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r13 = 0
            X.0qQ.A0B(r4, r13)
            java.lang.Object r1 = r2.A01
            X.3kE r1 = (X.C249703kE) r1
            int r1 = r1.getBindingAdapterPosition()
            int r3 = r1 + -1
            java.lang.Object r2 = r2.A02
            X.DmF r2 = (X.C46839DmF) r2
            java.util.List r1 = r2.A02
            java.lang.Object r1 = r1.get(r3)
            X.Ey9 r1 = (X.Ey9) r1
            X.E6v r3 = r2.A01
            X.5Ji r7 = r1.A02
            X.2ka r1 = r1.A01
            com.instagram.quickpromotion.intf.QuickPromotionSurface r8 = r1.A00
            r2 = 1
            X.0qQ.A0B(r8, r2)
            r5 = 2
            r1 = 11
            com.instagram.common.session.UserSession r6 = r3.getSession()
            java.lang.String r12 = r6.A06
            X.5Jm r10 = r7.A02
            X.0qQ.A07(r10)
            java.util.List r6 = r10.A06
            if (r6 == 0) goto L_0x072c
            java.lang.Object r9 = r6.get(r13)
            X.4V7 r9 = (X.AnonymousClass4V7) r9
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            boolean r7 = r7.A04
            java.lang.String r6 = r10.A05
            X.4VB r11 = new X.4VB
            r11.<init>(r12, r6, r14)
            r16 = r7
            X.4UC r6 = X.AnonymousClass5K3.A01(r8, r9, r10, r11, r12, r13, r14, r16)
            X.Eoz r7 = X.C49081Eoz.$redex_init_class
            int r8 = r8.ordinal()
            java.lang.String r7 = "Required value was null."
            if (r8 == r13) goto L_0x0702
            if (r8 == r1) goto L_0x0702
            if (r8 == r2) goto L_0x06e4
            if (r8 == r5) goto L_0x0639
            r1 = 5
            if (r8 != r1) goto L_0x0634
            X.F3N r1 = r3.A00
            if (r1 == 0) goto L_0x0713
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            X.E2K r4 = new X.E2K
            r4.<init>()
            int r1 = r1.ordinal()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "QP_SLOT"
            X.DbZ.A1B(r4, r1, r2)
            r4.A00 = r6
        L_0x062a:
            X.6Yo r1 = X.Dbb.A0G(r3)
            r1.A0D(r4)
        L_0x0631:
            r1.A04()
        L_0x0634:
            r1 = 426599452(0x196d641c, float:1.227283E-23)
            goto L_0x10d4
        L_0x0639:
            X.4VA r1 = r6.A09
            java.lang.String r4 = r1.A00
            int r1 = r4.hashCode()
            switch(r1) {
                case -677595213: goto L_0x0697;
                case -341373439: goto L_0x0689;
                case -5352129: goto L_0x066a;
                case 533984576: goto L_0x064b;
                case 637319191: goto L_0x0648;
                case 1300038126: goto L_0x0645;
                default: goto L_0x0644;
            }
        L_0x0644:
            goto L_0x0634
        L_0x0645:
            java.lang.String r1 = "iig_large_social_context_dialog"
            goto L_0x064d
        L_0x0648:
            java.lang.String r1 = "promotional_dialog_ig_v2"
            goto L_0x064d
        L_0x064b:
            java.lang.String r1 = "iig_dialog"
        L_0x064d:
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0634
            com.instagram.common.session.UserSession r4 = r3.getSession()
            X.F3N r1 = r3.A00
            if (r1 == 0) goto L_0x0718
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            X.EPk r2 = new X.EPk
            r2.<init>(r3, r3, r4, r1)
            android.content.Context r1 = r3.requireContext()
            X.Ep6.A00(r1, r3, r6, r2)
            goto L_0x0634
        L_0x066a:
            java.lang.String r1 = "instagram_app_rating_dialog"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0634
            com.instagram.common.session.UserSession r4 = r3.getSession()
            X.F3N r1 = r3.A00
            if (r1 == 0) goto L_0x071d
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            X.EPk r2 = new X.EPk
            r2.<init>(r3, r3, r4, r1)
            android.content.Context r1 = r3.requireContext()
            X.Ep5.A00(r1, r6, r2)
            goto L_0x0634
        L_0x0689:
            java.lang.String r1 = "iig_fullscreen_bloks"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0634
            X.EPm r5 = new X.EPm
            r5.<init>()
            goto L_0x06a4
        L_0x0697:
            java.lang.String r1 = "iig_fullscreen"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0634
            X.EPn r5 = new X.EPn
            r5.<init>()
        L_0x06a4:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ IOException -> 0x06d5 }
            r4.<init>()     // Catch:{ IOException -> 0x06d5 }
            X.15p r1 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x06d5 }
            X.17W r1 = r1.A0A(r4)     // Catch:{ IOException -> 0x06d5 }
            X.AnonymousClass4V6.A00(r1, r6)     // Catch:{ IOException -> 0x06d5 }
            r1.close()     // Catch:{ IOException -> 0x06d5 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x06d5 }
            if (r4 == 0) goto L_0x0634
            X.F3N r1 = r3.A00
            if (r1 == 0) goto L_0x0722
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            android.os.Bundle r1 = X.F7D.A00(r1, r4, r13)
            r5.setArguments(r1)
            X.6Yo r1 = X.Dbb.A0G(r3)
            r1.A0D(r5)
            r1.A0G = r2
            r1.A0E = r2
            goto L_0x0631
        L_0x06d5:
            java.lang.String r2 = "Error parsing QuickPromotion for fullscreen interstitial: "
            java.lang.String r1 = r6.A0D
            java.lang.String r2 = X.002.A0R(r2, r1)
            java.lang.String r1 = "IG-QP"
            X.0wb.A03(r1, r2)
            goto L_0x0634
        L_0x06e4:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.quickpromotion.model.QuickPromotionTooltipDefinition"
            X.0qQ.A0C(r6, r1)
            X.5xO r6 = (X.C300555xO) r6
            java.lang.String r5 = r6.A02
            java.lang.Integer r2 = r6.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x06ff
            X.2fy r2 = X.C226262fy.BELOW_ANCHOR
        L_0x06f5:
            X.FvX r1 = new X.FvX
            r1.<init>(r4, r2, r3, r5)
            r4.post(r1)
            goto L_0x0634
        L_0x06ff:
            X.2fy r2 = X.C226262fy.ABOVE_ANCHOR
            goto L_0x06f5
        L_0x0702:
            X.F3N r1 = r3.A00
            if (r1 == 0) goto L_0x0727
            X.E6w r4 = new X.E6w
            r4.<init>()
            r4.A01 = r6
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            r4.A02 = r1
            goto L_0x062a
        L_0x0713:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0718:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x071d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0722:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0727:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x072c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0731:
            r0 = -285268477(0xffffffffeeff2603, float:-3.9482315E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.Euo r1 = (X.C49386Euo) r1
            java.lang.Object r2 = r2.A02
            X.6q8 r2 = (X.C319156q8) r2
            X.E3T r1 = r1.A00
            X.FmF r1 = r1.A00
            if (r1 == 0) goto L_0x0749
            r1.A00(r2)
        L_0x0749:
            r1 = 644541980(0x266aee1c, float:8.1507757E-16)
            goto L_0x10d4
        L_0x074e:
            r0 = 875856195(0x34348143, float:1.6810831E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r2.A02
            X.E2V r7 = (X.E2V) r7
            X.0eM r6 = r7.A04
            java.lang.Object r1 = r6.getValue()
            X.Dkw r1 = (X.C46769Dkw) r1
            X.FF6 r1 = r1.A03
            java.util.LinkedHashMap r1 = r1.A05
            java.util.Collection r1 = r1.values()
            X.0qQ.A07(r1)
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x0774:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0793
            java.lang.Object r1 = r8.next()
            X.DtX r1 = (X.C47246DtX) r1
            java.lang.String r5 = r1.A06
            java.lang.Integer r1 = r1.A04
            int r4 = X.DbX.A02(r1)
            r3 = 17
            X.N4G r1 = new X.N4G
            r1.<init>((java.lang.String) r5, (int) r4, (int) r3)
            r10.add(r1)
            goto L_0x0774
        L_0x0793:
            X.0eM r5 = r7.A02
            java.lang.Object r8 = r5.getValue()
            X.FYs r8 = (X.C50336FYs) r8
            java.lang.String r9 = "channels"
            X.0wc r3 = r8.A02
            r1 = 28
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r3, r1)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x07e3
            java.lang.String r3 = "instagram"
            java.lang.String r1 = "parent_surface"
            r4.AAJ(r1, r3)
            java.lang.String r1 = "edit_profile_channels"
            X.DbS.A1M(r4, r1)
            java.lang.String r3 = "done_button"
            java.lang.String r1 = "source"
            X.Dba.A1B(r4, r1, r3)
            java.lang.String r1 = "edit_pinned_channels_success"
            X.C50336FYs.A00(r4, r8, r1)
            X.Dba.A18(r4)
            java.lang.String r1 = r10.toString()
            java.util.Map r3 = X.AnonymousClass7TF.A0w(r9, r1)
            java.lang.String r1 = "extra"
            r4.A9H(r1, r3)
            java.lang.String r3 = r8.A00
            java.lang.String r1 = X.Dbm.A00()
            r4.AAJ(r1, r3)
            r4.Cgf()
        L_0x07e3:
            java.lang.Object r1 = r6.getValue()
            X.Dkw r1 = (X.C46769Dkw) r1
            r1.A00()
            java.lang.Object r2 = r2.A01
            X.2da r2 = (X.2da) r2
            r1 = 1
            r2.setIsLoading(r1)
            X.8Qm r1 = r7.A00
            r8 = 0
            if (r1 != 0) goto L_0x0803
            java.lang.String r0 = "itemTouchHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0803:
            r1.A0A(r8)
            X.2YL r6 = X.DbS.A0H(r6)
            java.lang.Object r1 = r5.getValue()
            X.FYs r1 = (X.C50336FYs) r1
            java.lang.String r5 = r1.A00
            X.6oS r4 = X.C318116oQ.A00(r6)
            X.12T r1 = X.AnonymousClass12T.A00
            X.0nV r3 = X.DbX.A0c(r1)
            r2 = 16
            X.MFV r1 = new X.MFV
            r1.<init>(r6, r5, r8, r2)
            X.1Eo.A05(r3, r1, r4)
            X.Dbb.A0v(r7)
            r1 = -1336979531(0xffffffffb04f4fb5, float:-7.541943E-10)
            goto L_0x10d4
        L_0x082e:
            r0 = 592392980(0x234f3314, float:1.1232309E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.EGz r1 = (X.C47788EGz) r1
            X.E3G r15 = r1.A00
            if (r15 == 0) goto L_0x08b1
            java.lang.Object r5 = r2.A01
            X.DtJ r5 = (X.C47232DtJ) r5
            r11 = 0
            X.0eM r2 = r15.A00
            com.instagram.common.session.UserSession r4 = X.DbW.A0S(r2, r11)
            java.lang.String r3 = r4.A06
            java.lang.String r17 = "click"
            java.lang.String r18 = "edit_button"
            java.lang.String r19 = "subscriber"
            java.lang.String r20 = "ig_profile_edit_address_list_page"
            r1 = 0
            r21 = r3
            r22 = r1
            r16 = r4
            X.C49075Eot.A00(r15, r16, r17, r18, r19, r20, r21, r22)
            com.instagram.model.business.ProfileAddressData r4 = r5.A00
            java.lang.Integer r7 = X.E3G.A01(r15, r1)
            if (r7 == 0) goto L_0x0890
            int r3 = r7.intValue()
            if (r3 != 0) goto L_0x0890
            java.lang.String r3 = r4.A06
            java.lang.String r6 = "primary"
            boolean r3 = X.0qQ.A0K(r3, r6)
            if (r3 == 0) goto L_0x0890
            X.0eM r3 = r15.A01
            java.lang.Object r3 = r3.getValue()
            X.Dl5 r3 = (X.C46778Dl5) r3
            X.05G r3 = r3.A00
            java.lang.Object r5 = r3.getValue()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0890
            boolean r3 = r5 instanceof java.util.Collection
            if (r3 == 0) goto L_0x08b6
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x08b6
        L_0x0890:
            r12 = 0
        L_0x0891:
            X.F3v r5 = X.DbU.A0R()
            java.lang.String r8 = "profile_multiple_addresses_edit_list"
            com.instagram.model.business.Address r6 = X.E3G.A00(r4, r15)
            java.lang.String r9 = r4.A06
            r10 = 1
            r13 = r11
            r14 = r11
            X.E4e r3 = r5.A05(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3.setTargetFragment(r15, r11)
            X.6Yo r2 = X.DbZ.A0P(r15, r2)
            r2.A0B(r1, r3)
            r2.A04()
        L_0x08b1:
            r1 = 776225003(0x2e4440eb, float:4.46229E-11)
            goto L_0x10d4
        L_0x08b6:
            java.util.Iterator r5 = r5.iterator()
        L_0x08ba:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0890
            java.lang.Object r3 = r5.next()
            com.instagram.model.business.ProfileAddressData r3 = (com.instagram.model.business.ProfileAddressData) r3
            java.lang.String r3 = r3.A06
            boolean r3 = X.0qQ.A0K(r3, r6)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x08ba
            r12 = 1
            goto L_0x0891
        L_0x08d2:
            r0 = 1926137645(0x72ce872d, float:8.181418E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.EGy r1 = (X.C47787EGy) r1
            X.E3G r14 = r1.A00
            if (r14 == 0) goto L_0x0915
            java.lang.Object r4 = r2.A01
            X.FY4 r4 = (X.FY4) r4
            r10 = 0
            X.0eM r2 = r14.A00
            com.instagram.common.session.UserSession r15 = X.DbW.A0S(r2, r10)
            java.lang.String r3 = r15.A06
            java.lang.String r16 = "click"
            java.lang.String r17 = "add_button"
            java.lang.String r18 = "subscriber"
            java.lang.String r19 = "ig_profile_edit_address_list_page"
            r1 = 0
            r20 = r3
            r21 = r1
            X.C49075Eot.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r4 = r4.A00
            if (r4 == 0) goto L_0x091a
            int r3 = r4.length()
            if (r3 == 0) goto L_0x091a
            X.6ap r2 = X.DbV.A0X()
            java.lang.String r1 = "max_address_num_reached"
            r2.A0H = r1
            r2.A0D = r4
            X.Dbb.A1Q(r2)
        L_0x0915:
            r1 = 376066005(0x166a4fd5, float:1.892756E-25)
            goto L_0x10d4
        L_0x091a:
            java.lang.Integer r6 = X.E3G.A01(r14, r1)
            X.F3v r4 = X.DbU.A0R()
            java.lang.String r7 = "profile_multiple_addresses_edit_list"
            java.lang.String r16 = ""
            java.lang.String r18 = "0"
            com.instagram.model.business.Address r5 = new com.instagram.model.business.Address
            r15 = r5
            r17 = r16
            r19 = r16
            r20 = r16
            r15.<init>(r16, r17, r18, r19, r20)
            X.0eM r3 = r14.A01
            java.lang.Object r3 = r3.getValue()
            X.Dl5 r3 = (X.C46778Dl5) r3
            boolean r3 = r3.A02()
            if (r3 == 0) goto L_0x0959
            r8 = r1
        L_0x0943:
            r9 = 1
            r11 = r10
            r12 = r9
            r13 = r10
            X.E4e r3 = r4.A05(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3.setTargetFragment(r14, r10)
            X.6Yo r2 = X.DbZ.A0P(r14, r2)
            r2.A0B(r1, r3)
            r2.A04()
            goto L_0x0915
        L_0x0959:
            java.lang.String r8 = "primary"
            goto L_0x0943
        L_0x095c:
            r0 = -925806463(0xffffffffc8d15081, float:-428676.03)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.EGx r1 = (X.C47786EGx) r1
            X.E62 r7 = r1.A00
            if (r7 == 0) goto L_0x09f6
            java.lang.Object r4 = r2.A01
            X.DtJ r4 = (X.C47232DtJ) r4
            r3 = 0
            X.0eM r6 = r7.A03
            java.lang.Object r1 = r6.getValue()
            X.Dkg r1 = (X.C46753Dkg) r1
            X.05G r1 = r1.A02
            androidx.lifecycle.CoroutineLiveData r1 = X.DbT.A0G(r1)
            java.lang.Object r2 = r1.A02()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x09ce
            com.instagram.model.business.ProfileAddressData r1 = r4.A00
            int r5 = r2.indexOf(r1)
        L_0x098c:
            java.lang.Object r1 = r6.getValue()
            X.Dkg r1 = (X.C46753Dkg) r1
            X.17i r2 = r1.A00
            java.lang.String r1 = r1.A01
            com.instagram.user.model.User r1 = r2.A02(r1)
            r13 = 0
            if (r1 == 0) goto L_0x09a1
            java.lang.String r13 = r1.getId()
        L_0x09a1:
            X.0eM r1 = r7.A02
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            r1 = 2
            X.0qQ.A0B(r8, r1)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "index"
            java.util.Map r14 = X.AnonymousClass7TF.A0w(r1, r2)
            java.lang.String r9 = "click"
            java.lang.String r10 = "address"
            java.lang.String r11 = "viewer"
            java.lang.String r12 = "ig_addresses_consumption_bottom_sheet"
            X.C49075Eot.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            X.Ey4 r1 = r7.A00
            if (r1 != 0) goto L_0x09d0
            java.lang.String r0 = "delegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09ce:
            r5 = -1
            goto L_0x098c
        L_0x09d0:
            com.instagram.model.business.ProfileAddressData r8 = r4.A00
            X.0qQ.A0B(r8, r3)
            X.FgX r7 = r1.A02
            android.content.Context r6 = r1.A00
            java.lang.String r5 = r8.A07
            if (r5 == 0) goto L_0x09fb
            int r1 = r5.length()
            if (r1 == 0) goto L_0x09fb
            androidx.fragment.app.FragmentActivity r4 = r7.A00
            com.instagram.common.session.UserSession r3 = r7.A02
            com.instagram.profile.fragment.UserDetailFragment r1 = r7.A04
            X.F2d r2 = new X.F2d
            r2.<init>(r4, r1, r3)
            X.Fgg r1 = new X.Fgg
            r1.<init>(r6, r8, r7, r5)
            r2.A00(r1)
        L_0x09f6:
            r1 = -962652859(0xffffffffc69f1545, float:-20362.635)
            goto L_0x10d4
        L_0x09fb:
            java.lang.String r3 = r8.A03
            java.lang.String r2 = r8.A05
            java.lang.String r1 = r8.A08
            X.FFS.A03(r6, r3, r2, r1)
            goto L_0x09f6
        L_0x0a05:
            r0 = 2086312108(0x7c5a98ac, float:4.540069E36)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.EHF r0 = (X.EHF) r0
            X.F1l r1 = r0.A03
            java.lang.Object r0 = r2.A01
            X.FYA r0 = (X.FYA) r0
            com.instagram.user.model.User r0 = r0.A00
            r1.A00(r0)
            r0 = 66680636(0x3f9773c, float:1.46622795E-36)
            goto L_0x0dc9
        L_0x0a20:
            r0 = -337656077(0xffffffffebdfc6f3, float:-5.4105994E26)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.EHF r0 = (X.EHF) r0
            X.F1l r1 = r0.A03
            java.lang.Object r0 = r2.A01
            X.FYA r0 = (X.FYA) r0
            com.instagram.user.model.User r0 = r0.A00
            r1.A00(r0)
            r0 = -1804582914(0xffffffff94703ffe, float:-1.2129524E-26)
            goto L_0x0dc9
        L_0x0a3b:
            r0 = -1716138140(0xffffffff99b5cf64, float:-1.8798726E-23)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.EHF r0 = (X.EHF) r0
            X.F1l r1 = r0.A03
            java.lang.Object r0 = r2.A01
            X.FYA r0 = (X.FYA) r0
            com.instagram.user.model.User r0 = r0.A00
            r1.A00(r0)
            r0 = -1125965632(0xffffffffbce320c0, float:-0.027725577)
            goto L_0x0dc9
        L_0x0a56:
            r0 = -1965242955(0xffffffff8adcc5b5, float:-2.1259599E-32)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.EHF r0 = (X.EHF) r0
            X.F1l r1 = r0.A03
            java.lang.Object r0 = r2.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A00(r0)
            r0 = -959831266(0xffffffffc6ca231e, float:-25873.559)
            goto L_0x0dc9
        L_0x0a6f:
            r0 = -468466478(0xffffffffe413c4d2, float:-1.0903415E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A01
            X.E70 r6 = (X.E70) r6
            boolean r1 = r6.A05
            if (r1 == 0) goto L_0x0adf
            java.lang.Integer r3 = r6.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r3 != r1) goto L_0x0ad9
            com.instagram.igds.components.form.IgFormField r1 = r6.A01
            if (r1 == 0) goto L_0x0ad9
            java.lang.CharSequence r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0ad9
            com.instagram.igds.components.form.IgFormField r1 = r6.A01
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r5 = r1.toString()
        L_0x0a9c:
            boolean r1 = r6.A06
            if (r1 == 0) goto L_0x0adc
            com.instagram.common.session.UserSession r4 = r6.getSession()
            java.lang.Integer r1 = r6.A03
            int r3 = X.F75.A00(r1)
            X.1NY r4 = X.DbZ.A0L(r4)
            java.lang.String r1 = "accounts/set_gender/"
            r4.A0A(r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "gender"
            r4.A9m(r1, r3)
            java.lang.String r1 = "custom_gender"
            r4.A9m(r1, r5)
            java.lang.Class<X.DwB> r3 = X.DwB.class
            java.lang.Class<X.F86> r1 = X.F86.class
            X.1OC r4 = X.DbU.A0S(r4, r3, r1)
            r3 = 4
            X.ECz r1 = new X.ECz
            r1.<init>(r5, r2, r3)
            r4.A00 = r1
            r6.schedule(r4)
        L_0x0ad4:
            r1 = -1227218774(0xffffffffb6da20aa, float:-6.500709E-6)
            goto L_0x10d4
        L_0x0ad9:
            java.lang.String r5 = ""
            goto L_0x0a9c
        L_0x0adc:
            X.E70.A01(r6, r5)
        L_0x0adf:
            X.DbX.A1J(r6)
            goto L_0x0ad4
        L_0x0ae3:
            r0 = -105278984(0xfffffffff9b991f8, float:-1.2044194E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1pi r4 = X.C66631pj.A00()
            java.lang.Object r3 = r2.A01
            X.Dib r3 = (X.C46656Dib) r3
            com.instagram.common.session.UserSession r6 = r3.A0V
            java.lang.Object r5 = r2.A02
            X.4DH r5 = (X.AnonymousClass4DH) r5
            com.instagram.user.model.User r7 = r3.A0q
            boolean r9 = r3.A0z
            java.lang.String r8 = "edit_profile"
            r4.EuR(r5, r6, r7, r8, r9)
            X.LCQ r2 = r3.A0r
            if (r2 != 0) goto L_0x0b1f
            X.C66631pj.A00()
            com.instagram.common.session.UserSession r4 = r3.A0V
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r1 = 43
            X.MMF r2 = new X.MMF
            r2.<init>(r4, r1)
            java.lang.Class<X.LCQ> r1 = X.LCQ.class
            java.lang.Object r2 = r4.A01(r1, r2)
            X.LCQ r2 = (X.LCQ) r2
            r3.A0r = r2
        L_0x0b1f:
            com.instagram.common.session.UserSession r1 = r3.A0V
            java.lang.String r1 = r1.A06
            long r5 = java.lang.Long.parseLong(r1)
            boolean r4 = r3.A0z
            X.0wc r2 = r2.A00
            r1 = 304(0x130, float:4.26E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r1 = "ig_userid"
            r3.A9F(r1, r2)
            java.lang.String r2 = "setup"
            java.lang.String r1 = "product"
            r3.AAJ(r1, r2)
            java.lang.String r2 = "diversity_info_entry"
            java.lang.String r1 = "step"
            X.Dba.A1B(r3, r1, r2)
            java.lang.String r2 = "client"
            java.lang.String r1 = "event_source"
            r3.AAJ(r1, r2)
            if (r4 == 0) goto L_0x0b5f
            java.lang.String r1 = "has_designation"
        L_0x0b57:
            X.DbV.A1J(r3, r1)
            r1 = 1043017805(0x3e2b304d, float:0.16717644)
            goto L_0x10d4
        L_0x0b5f:
            java.lang.String r1 = "empty_designation"
            goto L_0x0b57
        L_0x0b62:
            r0 = -1176239687(0xffffffffb9e401b9, float:-4.3488832E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.Dib r3 = (X.C46656Dib) r3
            boolean r1 = r3.A0y
            if (r1 == 0) goto L_0x0b7b
            java.lang.String r1 = "personal_information"
            X.C46656Dib.A0K(r3, r1)
            r1 = -1907785233(0xffffffff8e4981ef, float:-2.4837724E-30)
            goto L_0x10d4
        L_0x0b7b:
            java.lang.Boolean r1 = r3.A0s
            if (r1 == 0) goto L_0x0b96
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0b96
            java.lang.Object r4 = r2.A02
            X.4DH r4 = (X.AnonymousClass4DH) r4
            com.instagram.common.session.UserSession r3 = r3.A0V
            r2 = 0
            java.lang.String r1 = "personal_info"
            X.C49955FGk.A03(r4, r3, r1, r1, r2)
            r1 = 1381842236(0x525d3d3c, float:2.37553779E11)
            goto L_0x10d4
        L_0x0b96:
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r1 = r3.A0V
            X.6Yo r2 = X.C46447Df9.A01(r2, r1)
            X.E3E r1 = new X.E3E
            r1.<init>()
            r2.A0E(r1)
            java.lang.String r1 = "PersonalInformationFragment.BACK_STACK_NAME"
            r2.A0A = r1
            r2.A04()
            r1 = 858845724(0x3330f21c, float:4.119839E-8)
            goto L_0x10d4
        L_0x0bb4:
            r0 = 1358480423(0x50f8c427, float:3.33888369E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.Dib r5 = (X.C46656Dib) r5
            java.lang.Object r6 = r2.A02
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.util.List r1 = r5.A0u
            if (r1 == 0) goto L_0x0bf4
            java.lang.String r4 = r6.getId()
            java.util.List r1 = r5.A0u
            boolean r1 = r1.contains(r6)
            r7 = 1
            if (r1 == 0) goto L_0x0bf9
            com.instagram.common.session.UserSession r1 = r5.A0V
            X.1NY r2 = X.DbZ.A0L(r1)
            java.lang.String r1 = "multiple_accounts/remove_featured_account/"
            r2.A0A(r1)
            java.lang.String r1 = "target_user_id"
            X.DbX.A1M(r2, r1, r4)
            X.1OC r3 = r2.A0M()
            r2 = 11
        L_0x0bea:
            X.EDL r1 = new X.EDL
            r1.<init>(r5, r6, r4, r2)
            r3.A00 = r1
            r5.schedule(r3)
        L_0x0bf4:
            r1 = -1766638828(0xffffffff96b33b14, float:-2.8956293E-25)
            goto L_0x10d4
        L_0x0bf9:
            java.util.List r1 = r5.A0u
            int r2 = r1.size()
            r1 = 5
            if (r2 < r1) goto L_0x0c19
            X.8ab r2 = X.DbW.A0U(r5)
            r1 = 2131952057(0x7f1301b9, float:1.9540546E38)
            r2.A09(r1)
            r1 = 2131952056(0x7f1301b8, float:1.9540544E38)
            r2.A08(r1)
            r2.A06()
            X.AnonymousClass7TH.A0a(r2, r7)
            goto L_0x0bf4
        L_0x0c19:
            com.instagram.common.session.UserSession r1 = r5.A0V
            X.1NY r3 = X.DbZ.A0L(r1)
            java.lang.String r1 = "multiple_accounts/set_featured_account/"
            r3.A0A(r1)
            java.lang.String r1 = "target_user_id"
            r3.A9m(r1, r4)
            r3.A0N = r7
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            X.1OC r3 = X.DbU.A0S(r3, r2, r1)
            r2 = 12
            goto L_0x0bea
        L_0x0c36:
            r0 = 312547647(0x12a1193f, float:1.0166752E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A02
            X.E35 r6 = (X.E35) r6
            java.lang.Object r1 = r2.A01
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.AZm()
            com.instagram.api.schemas.ProfileBannerType r1 = com.instagram.api.schemas.ProfileBannerType.FACEBOOK_PAGE
            java.lang.String r1 = r1.A00
            boolean r5 = X.0qQ.A0K(r2, r1)
            com.instagram.api.schemas.ProfileBannerType r1 = com.instagram.api.schemas.ProfileBannerType.FACEBOOK_PROFILE
            java.lang.String r1 = r1.A00
            boolean r4 = X.0qQ.A0K(r2, r1)
            if (r5 != 0) goto L_0x0c5d
            if (r4 == 0) goto L_0x0c76
        L_0x0c5d:
            X.1Z9 r3 = X.C48920EmK.A00()
            X.0eM r1 = r6.A0C
            X.0lg r2 = X.DbT.A0X(r1)
            X.Fp4 r1 = new X.Fp4
            r1.<init>(r6, r5, r4)
            X.ELU r3 = r3.A01(r6, r2, r1)
            java.lang.String r2 = r6.A08
            r1 = 0
            r3.A06(r2, r1)
        L_0x0c76:
            r1 = 1789569374(0x6aaaa95e, float:1.031586E26)
            goto L_0x10d4
        L_0x0c7b:
            r0 = -1541124970(0xffffffffa4244c96, float:-3.5626702E-17)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            r0.getClass()
            r0 = 1567001293(0x5d668acd, float:1.03826972E18)
            goto L_0x0dc9
        L_0x0c8c:
            r0 = -908380210(0xffffffffc9db37ce, float:-1795833.8)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.FnK r5 = (X.C51028FnK) r5
            java.lang.Object r4 = r2.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.70K r3 = r5.A07
            X.EVg r2 = X.C48088EVg.PROFILE_FOLLOWING_SHEET
            java.lang.String r1 = "click"
            java.lang.String r0 = "following_sheet_unrestrict_option"
            r3.Ck8(r4, r2, r1, r0)
            X.7Pu r2 = r5.A03
            r1 = 2
            X.FmJ r0 = new X.FmJ
            r0.<init>(r1, r4, r5)
            r2.A0L(r0)
            r0 = 1297619087(0x4d58188f, float:2.26593008E8)
            goto L_0x0dc9
        L_0x0cb6:
            r0 = -1990925672(0xffffffff8954e298, float:-2.5625116E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A02
            X.FnK r4 = (X.C51028FnK) r4
            if (r4 == 0) goto L_0x0cfe
            java.lang.Object r6 = r2.A01
            X.0iw r6 = (X.AnonymousClass0iw) r6
            r1 = 0
            X.0qQ.A0B(r6, r1)
            com.instagram.common.session.UserSession r7 = r4.A02
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            com.instagram.user.model.User r8 = X.DbT.A0j(r7)
            r10 = 0
            java.lang.String r11 = "profile_overflow_menu"
            X.C49176Eqh.A00(r6, r7, r8, r9, r10, r11)
            X.7Pu r6 = r4.A03
            X.7Pr r5 = X.DbX.A0e(r7, r1)
            android.content.Context r1 = r4.A01
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131962580(0x7f132ad4, float:1.956189E38)
            X.DbT.A1C(r2, r5, r1)
            X.1a1 r3 = X.C46447Df9.A02()
            com.instagram.user.model.User r1 = r4.A05
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = "following_sheet"
            X.E22 r1 = r3.A08(r7, r4, r2, r1)
            r6.A0F(r1, r5)
        L_0x0cfe:
            r1 = 335907246(0x140589ae, float:6.7419366E-27)
            goto L_0x10d4
        L_0x0d03:
            r0 = -1260460433(0xffffffffb4dee66f, float:-4.1518385E-7)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A01
            r1.invoke(r0)
            r0 = 1287335754(0x4cbb2f4a, float:9.8138704E7)
            goto L_0x0dc9
        L_0x0d18:
            r0 = -1205818814(0xffffffffb820aa42, float:-3.8305538E-5)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A01
            r1.invoke(r0)
            r0 = -2031082325(0xffffffff86f024ab, float:-9.0331845E-35)
            goto L_0x0dc9
        L_0x0d2d:
            r0 = -786886784(0xffffffffd1190f80, float:-4.1086878E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.WWr r3 = (X.C19376WWr) r3
            java.lang.Object r5 = r2.A02
            X.VW7 r5 = (X.VW7) r5
            X.1Xj r1 = r3.A01
            if (r1 == 0) goto L_0x0d82
            com.instagram.common.session.UserSession r7 = r3.A08
            com.instagram.user.model.User r2 = r1.A2A(r7)
            if (r2 == 0) goto L_0x0d82
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto L_0x0d82
            android.content.Context r4 = r3.A05
            X.32G r6 = r3.A07
            java.lang.String r9 = r6.getModuleName()
            java.lang.String r12 = r2.getId()
            com.instagram.user.model.FollowStatus r1 = r2.B6o()
            java.lang.String r13 = X.1aC.A06(r1)
            java.lang.String r10 = "get_directions"
            java.lang.String r11 = "pbia_profile"
            r8 = 0
            X.C49749F4o.A01(r7, r8, r9, r10, r11, r12, r13)
            X.6rY r3 = X.Dbb.A0O(r7, r2)
            java.lang.String r2 = r2.getId()
            java.lang.String r1 = "tap_directions"
            X.C319976rX.A05(r6, r7, r3, r1, r2)
            java.lang.String r3 = r5.A01
            if (r3 != 0) goto L_0x0d7b
            java.lang.String r3 = ""
        L_0x0d7b:
            java.lang.String r2 = r5.A00
            java.lang.String r1 = r5.A02
            X.FFS.A03(r4, r3, r2, r1)
        L_0x0d82:
            r1 = 1846021574(0x6e080dc6, float:1.0526653E28)
            goto L_0x10d4
        L_0x0d87:
            r0 = 1257140630(0x4aee7196, float:7813323.0)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A02
            X.G55 r0 = (X.G55) r0
            X.Fg3 r0 = (X.C50643Fg3) r0
            com.instagram.api.schemas.IGRevShareProductType r0 = r0.A01
            r1.invoke(r0)
            r0 = -705925730(0xffffffffd5ec6d9e, float:-3.24944433E13)
            goto L_0x0dc9
        L_0x0da1:
            r0 = 1359096207(0x5102298f, float:3.4940187E10)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r4 = r2.A02
            com.instagram.nux.ui.NetzDgTermsTextView r4 = (com.instagram.nux.ui.NetzDgTermsTextView) r4
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r4)
            java.lang.Object r2 = r2.A01
            X.0lg r2 = (X.0lg) r2
            if (r2 == 0) goto L_0x0dcd
            java.lang.String r0 = r4.A00
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = X.DbV.A0y(r4)
            X.C49906FEe.A01(r3, r2, r5, r1, r0)
            r0 = -73351380(0xfffffffffba0bf2c, float:-1.6692898E36)
        L_0x0dc9:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0dcd:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -186034310(0xfffffffff4e9577a, float:-1.4789788E32)
            X.AnonymousClass0fD.A0C(r0, r6)
            throw r1
        L_0x0dd8:
            r0 = -1735743289(0xffffffff988aa8c7, float:-3.5842585E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3
            boolean r1 = r3.isChecked()
            r5 = r1 ^ 1
            r3.setChecked(r5)
            java.lang.Object r1 = r2.A02
            X.DtW r1 = (X.C47245DtW) r1
            r1.A01 = r5
            X.Exx r4 = r1.A03
            int r3 = r1.A00
            if (r5 == 0) goto L_0x0e37
            boolean r1 = r4.A02
            X.E7Q r6 = r4.A00
            if (r1 == 0) goto L_0x0e22
            java.util.LinkedHashSet r2 = r6.A0Q
            com.instagram.user.model.User r1 = r4.A01
            r2.add(r1)
        L_0x0e05:
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r6.A0A
            if (r3 == 0) goto L_0x0e1d
            java.util.HashSet r1 = r6.A0O
            int r2 = r1.size()
            java.util.LinkedHashSet r1 = r6.A0Q
            int r1 = r1.size()
            int r2 = r2 + r1
            boolean r1 = X.AnonymousClass7TF.A1R(r2)
            r3.setEnabled(r1)
        L_0x0e1d:
            r1 = -2110035785(0xffffffff823b68b7, float:-1.3768642E-37)
            goto L_0x10d4
        L_0x0e22:
            java.util.HashSet r2 = r6.A0O
            com.instagram.user.model.User r1 = r4.A01
            r2.add(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r2 = r6.A0M
            java.lang.String r1 = r1.getUsername()
            r2.put(r1, r3)
            goto L_0x0e05
        L_0x0e37:
            X.E7Q r6 = r4.A00
            java.util.LinkedHashSet r1 = r6.A0Q
            com.instagram.user.model.User r5 = r4.A01
            r1.remove(r5)
            java.util.HashSet r1 = r6.A0O
            r1.remove(r5)
            java.util.HashMap r2 = r6.A0M
            java.lang.String r1 = r5.getUsername()
            r2.remove(r1)
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x0e05
            java.util.ArrayList r1 = r6.A0L
            java.util.Iterator r4 = X.AnonymousClass7TE.A1G(r1)
        L_0x0e58:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0e05
            java.lang.Object r3 = X.AnonymousClass7TF.A0a(r4)
            X.DtW r3 = (X.C47245DtW) r3
            java.lang.String r2 = r3.A06
            java.lang.String r1 = r5.getUsername()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0e58
            r1 = 0
            r3.A01 = r1
            goto L_0x0e05
        L_0x0e74:
            r0 = 255604201(0xf3c35e9, float:9.279498E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r2.A01
            X.F2r r8 = (X.C49706F2r) r8
            com.instagram.registration.model.RegFlowExtras r1 = r8.A05
            java.lang.String r1 = r1.A04
            if (r1 == 0) goto L_0x0eeb
            long r13 = java.lang.Long.parseLong(r1)
        L_0x0e89:
            X.EXD r1 = r8.A07
            if (r1 == 0) goto L_0x0ee8
            java.lang.String r12 = r1.A00
        L_0x0e8f:
            X.0aP r11 = r8.A04
            X.DiE r1 = r8.A08
            java.lang.String r10 = r1.A01
            java.lang.String r9 = "username_sign_up"
            X.AnonymousClass7TG.A1N(r11, r10)
            r1 = 3
            double r6 = X.DbV.A00(r12, r1)
            double r3 = X.DbS.A00()
            X.0wc r5 = X.AnonymousClass0kN.A02(r11)
            java.lang.String r1 = "refresh_username_suggestion"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r1)
            X.DbY.A1D(r5, r6, r3)
            X.DbS.A1G(r5, r12)
            java.lang.String r1 = "containermodule"
            r5.AAJ(r1, r9)
            java.lang.String r1 = "step"
            X.Dbc.A0c(r5, r1, r10, r3)
            X.FH8.A0B(r5, r11)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.String r1 = "actor_id"
            r5.A9F(r1, r3)
            r5.Cgf()
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r8.A06
            java.lang.Object r3 = r2.A02
            java.util.List r3 = (java.util.List) r3
            java.util.Random r2 = r8.A02
            int r1 = r3.size()
            int r1 = r2.nextInt(r1)
            java.lang.Object r1 = r3.get(r1)
            X.DbZ.A14(r4, r1)
            r1 = 1763525789(0x691d449d, float:1.1882836E25)
            goto L_0x10d4
        L_0x0ee8:
            java.lang.String r12 = ""
            goto L_0x0e8f
        L_0x0eeb:
            r13 = 0
            goto L_0x0e89
        L_0x0eee:
            r0 = -1575801660(0xffffffffa2132cc4, float:-1.9945914E-18)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r2.A02
            X.6qx r0 = (X.C319646qx) r0
            r1.A02(r0)
            r0 = -1579479277(0xffffffffa1db0f13, float:-1.4844007E-18)
            goto L_0x108d
        L_0x0f05:
            r0 = -921870299(0xffffffffc90d6025, float:-579074.3)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r2.A02
            X.6qx r0 = (X.C319646qx) r0
            r1.A03(r0)
            r0 = -20385779(0xfffffffffec8f00d, float:-1.3354601E38)
            goto L_0x108d
        L_0x0f1c:
            r0 = -1258661107(0xffffffffb4fa5b0d, float:-4.6632377E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r2.A02
            X.6qx r0 = (X.C319646qx) r0
            r1.A02(r0)
            r0 = -499562401(0xffffffffe239485f, float:-8.544656E20)
            goto L_0x108d
        L_0x0f33:
            r0 = 1446282279(0x56348427, float:4.9619921E13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r2.A02
            X.6qx r0 = (X.C319646qx) r0
            r1.A02(r0)
            r0 = -132989018(0xfffffffff812bfa6, float:-1.1905663E34)
            goto L_0x108d
        L_0x0f4a:
            r0 = -109482324(0xfffffffff9796eac, float:-8.0945413E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            X.E6s r3 = (X.C47531E6s) r3
            java.lang.Object r1 = r2.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Integer r6 = r1.A0N()
            X.FBf r8 = X.C49881FBf.A00
            com.instagram.common.session.UserSession r9 = r3.getSession()
            java.lang.String r14 = "nux_account_privacy"
            com.instagram.common.session.UserSession r1 = r3.getSession()
            java.lang.String r15 = r1.A06
            java.lang.Boolean r11 = X.AnonymousClass7TE.A0u()
            android.widget.RadioButton r1 = r3.A00
            if (r1 == 0) goto L_0x101c
            boolean r1 = r1.isChecked()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
        L_0x0f7b:
            r10 = 0
            r13 = r10
            r8.A01(r9, r10, r11, r12, r13, r14, r15)
            com.instagram.common.session.UserSession r7 = r3.getSession()
            com.instagram.common.session.UserSession r1 = r3.getSession()
            java.lang.String r4 = r1.A06
            android.widget.RadioButton r1 = r3.A00
            if (r1 == 0) goto L_0x1019
            boolean r1 = r1.isChecked()
        L_0x0f92:
            r9 = 0
            X.0qQ.A0B(r7, r9)
            r5 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "android_pbd_nux_confirmation"
            X.C49214ErJ.A00(r7, r2, r10, r4, r1)
            r8 = 5
            X.EDa r4 = new X.EDa
            r4.<init>(r3, r8)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r6 == r1) goto L_0x0fe7
            android.widget.RadioButton r1 = r3.A00
            if (r1 == 0) goto L_0x0fe7
            boolean r1 = r1.isChecked()
            if (r1 != r5) goto L_0x0fe7
            com.instagram.common.session.UserSession r7 = r3.getSession()
            X.0qQ.A0B(r7, r9)
            X.1NY r6 = X.AnonymousClass7TG.A0a(r7)
            java.lang.String r1 = "accounts/set_private/"
            r6.A0A(r1)
            java.lang.String r1 = "default_to_private"
            java.lang.String r2 = "true"
            r6.A9m(r1, r2)
            java.lang.String r1 = "new_registration_user"
            r6.A9m(r1, r2)
            r2 = 4
            X.FVE r1 = new X.FVE
            r1.<init>(r2)
        L_0x0fd6:
            X.Dbb.A1K(r6, r1, r7)
            X.1OC r1 = X.DbT.A0U(r6, r5)
            r1.A00 = r4
            r3.schedule(r1)
        L_0x0fe2:
            r1 = 149341915(0x8e6c6db, float:1.3889372E-33)
            goto L_0x10d4
        L_0x0fe7:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r6 == r2) goto L_0x1015
            android.widget.RadioButton r1 = r3.A01
            if (r1 == 0) goto L_0x1015
            boolean r1 = r1.isChecked()
            if (r1 != r5) goto L_0x1015
            com.instagram.common.session.UserSession r7 = r3.getSession()
            X.0qQ.A0B(r7, r9)
            X.1NY r6 = X.DbU.A0M(r7)
            r6.A08(r2)
            java.lang.String r1 = "accounts/set_public/"
            r6.A0A(r1)
            java.lang.String r2 = "new_registration_user"
            java.lang.String r1 = "true"
            r6.A9m(r2, r1)
            X.FVE r1 = new X.FVE
            r1.<init>(r8)
            goto L_0x0fd6
        L_0x1015:
            X.C47531E6s.A02(r3)
            goto L_0x0fe2
        L_0x1019:
            r1 = 0
            goto L_0x0f92
        L_0x101c:
            r12 = 0
            goto L_0x0f7b
        L_0x101f:
            r0 = -1529542617(0xffffffffa4d50827, float:-9.2387836E-17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setEnabled(r0)
            X.FBf r4 = X.C49881FBf.A00
            java.lang.Object r1 = r2.A02
            X.E4P r1 = (X.E4P) r1
            X.0eM r0 = r1.A0C
            X.0lg r5 = X.DbT.A0X(r0)
            java.lang.String r10 = "aymh_password_input"
            java.lang.String r11 = r1.A06
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
            X.E4P.A00(r1)
            r0 = 1599774472(0x5f5a9f08, float:1.5753319E19)
            goto L_0x108d
        L_0x104c:
            r0 = 1586648460(0x5e92558c, float:5.272244E18)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.G7H r1 = (X.G7H) r1
            java.lang.Object r0 = r2.A01
            X.JwH r0 = (X.C61079JwH) r0
            r1.FI9(r0)
            r0 = -1395422437(0xffffffffacd38b1b, float:-6.0124245E-12)
            goto L_0x108d
        L_0x1062:
            r0 = -1263530388(0xffffffffb4b00e6c, float:-3.2793048E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.G7H r1 = (X.G7H) r1
            java.lang.Object r0 = r2.A01
            X.JwH r0 = (X.C61079JwH) r0
            r1.FI8(r0)
            r0 = 1991863270(0x76b96be6, float:1.8803972E33)
            goto L_0x108d
        L_0x1078:
            r0 = 211906227(0xca16eb3, float:2.4872602E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.G7H r1 = (X.G7H) r1
            java.lang.Object r0 = r2.A01
            X.JwH r0 = (X.C61079JwH) r0
            r1.FI8(r0)
            r0 = -290355999(0xffffffffeeb184e1, float:-2.7469744E28)
        L_0x108d:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x1091:
            r0 = -2125285583(0xffffffff8152b731, float:-3.8702342E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.E3c r4 = (X.E3c) r4
            java.lang.Object r1 = r2.A02
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            r1 = r1 ^ 1
            X.E8n r3 = r4.A01
            java.util.Set r2 = r3.A03
            if (r1 == 0) goto L_0x10d8
            X.F3A r1 = r3.A02
            r2.add(r1)
            X.F3A r1 = r3.A01
            r2.add(r1)
            X.F3A r1 = r3.A00
            r2.add(r1)
        L_0x10b9:
            r3.A0C()
            r3.FK4()
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r4.A03
            X.E8n r1 = r4.A01
            java.util.Set r1 = r1.A03
            int r2 = r1.size()
            r1 = 3
            boolean r1 = X.AnonymousClass7TF.A1S(r2, r1)
            r3.setEnabled(r1)
            r1 = -149675746(0xfffffffff714211e, float:-3.0044204E33)
        L_0x10d4:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x10d8:
            r2.clear()
            goto L_0x10b9
        L_0x10dc:
            java.lang.Object r1 = r2.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r2.A02
            X.6qx r0 = (X.C319646qx) r0
            r1.A03(r0)
            return
        L_0x10e8:
            X.F35 r0 = r1.A06
            X.0wc r3 = r0.A00
            java.lang.String r2 = r11.getId()
            r0 = 1757(0x6dd, float:2.462E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbZ.A1S(r3, r0, r2)
            android.content.Context r6 = r7.getContext()
            if (r6 == 0) goto L_0x1117
            androidx.fragment.app.FragmentActivity r5 = r7.getActivity()
            if (r5 == 0) goto L_0x1112
            com.instagram.common.session.UserSession r9 = r1.A04
            X.0iw r8 = r1.A03
            X.FnP r10 = new X.FnP
            r10.<init>(r11, r1)
            X.C49174Eqf.A00(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x1112:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x1117:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x111c:
            r1.A04(r11)
            return
        L_0x1120:
            X.F35 r0 = r1.A06
            r0.A01(r11)
            android.content.Context r9 = r7.getContext()
            if (r9 == 0) goto L_0x11bb
            com.instagram.common.session.UserSession r10 = r1.A04
            X.0iw r0 = r1.A03
            java.lang.String r13 = r0.getModuleName()
            r0 = 1
            X.Fne r12 = new X.Fne
            r12.<init>(r0, r2, r1, r11)
            java.lang.String r14 = r11.getFullName()
            if (r14 == 0) goto L_0x11b6
            r0 = 2
            X.0qQ.A0B(r13, r0)
            X.Fnj r8 = new X.Fnj
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = 51
            X.FJg r3 = X.C50021FJg.A00(r8, r0)
            X.8ab r2 = X.DbS.A0Y(r9)
            r0 = 2131958465(0x7f131ac1, float:1.9553543E38)
            java.lang.String r0 = X.DbW.A0h(r9, r14, r0)
            r2.A05 = r0
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            r0 = 2131958457(0x7f131ab9, float:1.9553527E38)
            java.lang.String r0 = r9.getString(r0)
            r5.append(r0)
            java.lang.String r4 = "\n\n"
            r5.append(r4)
            r0 = 2131958458(0x7f131aba, float:1.9553529E38)
            java.lang.String r0 = r9.getString(r0)
            r5.append(r0)
            java.lang.String r1 = "\n"
            r5.append(r1)
            r0 = 2131958459(0x7f131abb, float:1.955353E38)
            X.Dba.A0s(r9, r1, r5, r0)
            r0 = 2131958460(0x7f131abc, float:1.9553533E38)
            X.Dba.A0s(r9, r1, r5, r0)
            r0 = 2131958461(0x7f131abd, float:1.9553535E38)
            X.Dba.A0s(r9, r1, r5, r0)
            r0 = 2131958462(0x7f131abe, float:1.9553537E38)
            X.Dba.A0s(r9, r1, r5, r0)
            r0 = 2131958463(0x7f131abf, float:1.9553539E38)
            X.Dba.A0s(r9, r4, r5, r0)
            r0 = 2131958464(0x7f131ac0, float:1.955354E38)
            java.lang.String r0 = X.DbW.A0h(r9, r14, r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r5)
            r2.A0q(r0)
            r0 = 2131958456(0x7f131ab8, float:1.9553525E38)
            r2.A0I(r3, r0)
            r0 = 2131964550(0x7f133286, float:1.9565885E38)
            X.DbY.A1M(r2, r0)
            return
        L_0x11b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x11bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x11c0:
            X.C51031FnN.A00(r2, r1)
            return
        L_0x11c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPG.onClick(android.view.View):void");
    }

    public FPG(AnonymousClass4DH r1, C46656Dib dib, int i) {
        this.A00 = i;
        this.A01 = dib;
        this.A02 = r1;
    }

    public FPG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
