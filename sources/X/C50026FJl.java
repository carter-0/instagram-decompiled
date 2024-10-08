package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FJl  reason: case insensitive filesystem */
public final class C50026FJl implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C50026FJl(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    public static boolean A00(Context context, C50349FZg fZg, int i, int i2) {
        return 0qQ.A0K(fZg.A06[i], context.getString(i2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.FBc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.ELT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.FBc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v162, resolved type: X.ELT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v163, resolved type: X.ELT} */
    /* JADX WARNING: type inference failed for: r1v9, types: [X.G6n, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03d5, code lost:
        r0 = r1.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f2, code lost:
        if (r1 == null) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03f4, code lost:
        r1.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03f7, code lost:
        r2 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x06ca, code lost:
        X.C48729EjE.A00();
        r2 = X.DbU.A04(r1);
        r1 = X.DbY.A09(r3);
        X.DbS.A1B(r1, r0);
        X.DbV.A1C(r2, 3, r1);
        X.0kR.A05(r4, r2, 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x06e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01b5, code lost:
        r3.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        X.C299275ur.A00(r2, (X.AnonymousClass6Tm) X.AnonymousClass7TE.A14((X.AnonymousClass0eM) r0), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02ba, code lost:
        r3 = (X.AnonymousClass0iw) r0.A02;
        r2 = r6.A00;
        new X.F2R((androidx.fragment.app.FragmentActivity) r0.A01, r3, r2, "igd_android_nux").A00();
        r4 = X.AnonymousClass7TE.A0e(X.AnonymousClass0kN.A01(r3, r2), "hidden_words_acceptance_nux_click");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02dc, code lost:
        if (r4.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02de, code lost:
        r1 = "continue";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02e0, code lost:
        r4.AAJ("click_action", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02e5, code lost:
        r4.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03c2, code lost:
        r0 = (X.C49369EuX) r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03c6, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03c8, code lost:
        r1 = r0.A00;
        r0 = X.AnonymousClass05K.A00;
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03ce, code lost:
        if (r2 != r0) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03d0, code lost:
        r0 = r1.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03d2, code lost:
        r1.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03d4, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.A00
            r5 = r23
            switch(r1) {
                case 0: goto L_0x038b;
                case 1: goto L_0x02f9;
                case 2: goto L_0x00c4;
                case 3: goto L_0x0009;
                case 4: goto L_0x02e9;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x06bc;
                case 9: goto L_0x06ad;
                case 10: goto L_0x0658;
                case 11: goto L_0x0641;
                case 12: goto L_0x0621;
                case 13: goto L_0x02aa;
                case 14: goto L_0x02a5;
                case 15: goto L_0x0272;
                case 16: goto L_0x0242;
                case 17: goto L_0x01ea;
                case 18: goto L_0x01b9;
                case 19: goto L_0x060b;
                case 20: goto L_0x05e9;
                case 21: goto L_0x05a5;
                case 22: goto L_0x058c;
                case 23: goto L_0x0573;
                case 24: goto L_0x054f;
                case 25: goto L_0x0512;
                case 26: goto L_0x0512;
                case 27: goto L_0x04ff;
                case 28: goto L_0x0151;
                case 29: goto L_0x012a;
                case 30: goto L_0x0099;
                case 31: goto L_0x010d;
                case 32: goto L_0x00e0;
                case 33: goto L_0x006c;
                case 34: goto L_0x04d2;
                case 35: goto L_0x04a8;
                case 36: goto L_0x0468;
                case 37: goto L_0x0023;
                case 38: goto L_0x044c;
                case 39: goto L_0x042b;
                case 40: goto L_0x0412;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r0.A02
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r0.A03
            X.4tV r1 = (X.C276544tV) r1
            X.4uI r1 = r1.A09()
            java.lang.Object r0 = r0.A01
        L_0x0017:
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.6Tm r0 = (X.AnonymousClass6Tm) r0
            X.C299275ur.A00(r2, r0, r1)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r7 = r0.A01
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r6 = r0.A03
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r5 = 1
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "com.instagram.bullying.privacy.tags_options"
            X.DiU r3 = X.C46649DiU.A04(r1, r2)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r6)
            r1 = 2131969692(0x7f13469c, float:1.9576314E38)
            X.DbS.A18(r7, r2, r1)
            r2.A0i = r5
            android.os.Bundle r2 = X.C49891FBs.A00(r2, r3)
            java.lang.String r1 = "bloks"
            X.Dbb.A0i(r7, r2, r6, r4, r1)
            java.lang.Object r2 = r0.A02
            X.0wc r2 = (X.0wc) r2
            java.lang.String r0 = r6.A06
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            X.0Aj r4 = X.Dbc.A04(r2, r0, r1)
            java.lang.String r0 = "click"
            X.DbS.A1J(r4, r0)
            java.lang.String r0 = "cant_tag_alert_nux_go_to_settings"
            X.DbS.A1H(r4, r0)
            java.lang.String r0 = "extra_values"
            r4.A9H(r0, r1)
            goto L_0x02e5
        L_0x006c:
            X.DbW.A0r(r22)
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r1)
            java.lang.Object r1 = r0.A02
            X.0lg r1 = (X.0lg) r1
            X.6Yo r3 = X.DbS.A0M(r2, r1)
            java.lang.Object r2 = r0.A03
            com.instagram.registration.model.RegFlowExtras r2 = (com.instagram.registration.model.RegFlowExtras) r2
            if (r2 == 0) goto L_0x040d
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r2)
            X.E5j r0 = new X.E5j
            r0.<init>()
            r0.setArguments(r1)
            r3.A0D(r0)
            goto L_0x01b5
        L_0x0099:
            java.lang.Object r3 = r0.A01
            X.FnK r3 = (X.C51028FnK) r3
            java.lang.Object r2 = r0.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            r3.A00(r2, r0)
            X.4lm r1 = X.C272994ll.A00(r1)
            java.lang.String r0 = r2.getId()
            long r2 = java.lang.Long.parseLong(r0)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "fan_management_unfollow_after_onboarded"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "profile"
            X.Dbb.A1D(r4, r0, r2)
            goto L_0x02e5
        L_0x00c4:
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r0.A03
            X.0lg r1 = (X.0lg) r1
            X.6Yo r3 = X.DbS.A0M(r2, r1)
            r1 = 0
            r3.A06()
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3.A0B(r1, r0)
            r0 = 1
            r3.A0E = r0
            goto L_0x01b5
        L_0x00e0:
            java.lang.Object r3 = r0.A03
            X.E6z r3 = (X.C47536E6z) r3
            java.lang.Object r1 = r0.A01
            android.widget.EditText r1 = (android.widget.EditText) r1
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r1)
            java.lang.Object r0 = r0.A02
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r0)
            if (r2 == 0) goto L_0x0022
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0022
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0022
            java.util.Map r0 = r3.A02
            r0.put(r2, r1)
            X.C47536E6z.A00(r3)
            return
        L_0x010d:
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.0BQ r1 = X.AnonymousClass0BO.A00(r4)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.A02
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            boolean r0 = r1.AG1(r2, r4, r5)
            if (r0 == 0) goto L_0x0022
            r3 = 0
            java.lang.String r6 = "professional_account_onboarding_checklist"
            r1.E2S(r2, r3, r4, r5, r6)
            return
        L_0x012a:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A02
            X.0lg r3 = (X.0lg) r3
            java.lang.Object r2 = r0.A03
            X.0iw r2 = (X.AnonymousClass0iw) r2
            X.0nO r1 = X.0nY.A00()
            X.RA2 r0 = new X.RA2
            r0.<init>(r4)
            r1.ATE(r0)
            java.lang.String r0 = "tos_event_accepted"
            X.0xI r0 = X.0xI.A00(r2, r0)
            X.DbU.A1R(r0, r3)
            if (r22 == 0) goto L_0x0022
            r22.dismiss()
            return
        L_0x0151:
            r22.dismiss()
            X.1Q0 r2 = X.1Q0.A19
            java.lang.Object r1 = r0.A02
            X.F0t r1 = (X.C49662F0t) r1
            X.0aP r8 = r1.A02
            X.FGI r2 = r2.A02(r8)
            X.DiE r1 = r1.A04
            r7 = 0
            X.FGI.A02(r2, r7, r1)
            java.lang.Object r2 = r0.A03
            X.Ebh r2 = (X.C48262Ebh) r2
            java.lang.String r9 = r2.A08()
            if (r9 == 0) goto L_0x0022
            X.DbT.A15()
            com.instagram.user.model.User r1 = r2.A03()
            java.lang.String r6 = r1.getId()
            com.instagram.user.model.User r1 = r2.A03()
            java.lang.String r5 = r1.getUsername()
            com.instagram.user.model.User r1 = r2.A03()
            com.instagram.common.typedurl.ImageUrl r4 = r1.Bh3()
            java.lang.String r1 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.E4d r3 = new X.E4d
            r3.<init>()
            android.os.Bundle r2 = X.DbX.A0C(r1)
            java.lang.String r1 = "argument_reset_token"
            r2.putString(r1, r9)
            java.lang.String r1 = "argument_user_id"
            r2.putString(r1, r6)
            java.lang.String r1 = "argument_user_name"
            r2.putString(r1, r5)
            java.lang.String r1 = "argument_profile_pic_url"
            r2.putParcelable(r1, r4)
            r3.setArguments(r2)
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.6Yo r3 = X.DbU.A0P(r7, r3, r0, r8)
        L_0x01b5:
            r3.A04()
            return
        L_0x01b9:
            java.lang.Object r1 = r0.A03
            X.Dfj r1 = (X.C46480Dfj) r1
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            com.instagram.common.session.UserSession r2 = r1.A00
            java.lang.String r1 = "igd_android_nux"
            X.F2R r0 = new X.F2R
            r0.<init>(r4, r3, r2, r1)
            r0.A00()
            X.0wc r2 = X.AnonymousClass0kN.A01(r3, r2)
            java.lang.String r1 = "hidden_words_unsave_action_warning_nux"
            java.lang.String r0 = "hidden_words_acceptance_nux_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0022
            X.DbS.A1L(r4, r1)
            java.lang.String r1 = "cancel"
            goto L_0x02e0
        L_0x01ea:
            java.lang.Object r1 = r0.A03
            X.Dfj r1 = (X.C46480Dfj) r1
            com.instagram.common.session.UserSession r4 = r1.A00
            X.631 r5 = new X.631
            r5.<init>(r4)
            boolean r1 = r5.A03()
            if (r1 == 0) goto L_0x021b
            X.61N r2 = r5.A03
            r1 = 4
            java.util.Map r2 = r2.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = X.DbT.A11(r1, r2)
            if (r2 == 0) goto L_0x021b
            X.1a8 r3 = r5.A00
            com.instagram.common.session.UserSession r1 = r5.A01
            X.61J r1 = X.AnonymousClass61I.A00(r1)
            X.1aU r2 = r1.A02(r2)
            X.FpJ r1 = X.C51147FpJ.A00
            r3.A02(r2, r1)
        L_0x021b:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131973423(0x7f13552f, float:1.9583881E38)
            X.C59689JTv.A07(r2, r1)
            java.lang.Object r0 = r0.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r4)
            java.lang.String r1 = "hidden_words_unsave_action_warning_nux"
            java.lang.String r0 = "hidden_words_acceptance_nux_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0022
            X.DbS.A1L(r4, r1)
            java.lang.String r1 = "continue"
            goto L_0x02e0
        L_0x0242:
            java.lang.Object r1 = r0.A03
            X.Dfj r1 = (X.C46480Dfj) r1
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            com.instagram.common.session.UserSession r2 = r1.A00
            java.lang.String r1 = "igd_android_nux"
            X.F2R r0 = new X.F2R
            r0.<init>(r4, r3, r2, r1)
            r0.A00()
            X.0wc r2 = X.AnonymousClass0kN.A01(r3, r2)
            java.lang.String r1 = "hidden_words_save_action_warning_nux"
            java.lang.String r0 = "hidden_words_acceptance_nux_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0022
            X.DbS.A1L(r4, r1)
            java.lang.String r1 = "cancel"
            goto L_0x02e0
        L_0x0272:
            java.lang.Object r1 = r0.A03
            X.Dfj r1 = (X.C46480Dfj) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            X.631 r2 = new X.631
            r2.<init>(r3)
            r1 = 0
            r2.A02(r1)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131973414(0x7f135526, float:1.9583863E38)
            X.C59689JTv.A07(r2, r1)
            java.lang.Object r0 = r0.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r3)
            java.lang.String r1 = "hidden_words_save_action_warning_nux"
            java.lang.String r0 = "hidden_words_acceptance_nux_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0022
            X.DbS.A1L(r4, r1)
            goto L_0x02de
        L_0x02a5:
            java.lang.Object r6 = r0.A03
            X.Dfj r6 = (X.C46480Dfj) r6
            goto L_0x02ba
        L_0x02aa:
            java.lang.Object r6 = r0.A03
            X.Dfj r6 = (X.C46480Dfj) r6
            X.1Av r5 = r6.A01
            r4 = 0
            X.0s0 r3 = r5.A3b
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 438(0x1b6, float:6.14E-43)
            X.AnonymousClass7TF.A1J(r5, r3, r2, r1, r4)
        L_0x02ba:
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            com.instagram.common.session.UserSession r2 = r6.A00
            java.lang.String r1 = "igd_android_nux"
            X.F2R r0 = new X.F2R
            r0.<init>(r4, r3, r2, r1)
            r0.A00()
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r2)
            java.lang.String r0 = "hidden_words_acceptance_nux_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0022
        L_0x02de:
            java.lang.String r1 = "continue"
        L_0x02e0:
            java.lang.String r0 = "click_action"
            r4.AAJ(r0, r1)
        L_0x02e5:
            r4.Cgf()
            return
        L_0x02e9:
            java.lang.Object r2 = r0.A03
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r0.A01
            X.4tV r1 = (X.C276544tV) r1
            X.4uI r1 = r1.A09()
            java.lang.Object r0 = r0.A02
            goto L_0x0017
        L_0x02f9:
            java.lang.Object r7 = r0.A03
            X.FZg r7 = (X.C50349FZg) r7
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            r1 = 2131975011(0x7f135b63, float:1.9587102E38)
            boolean r1 = A00(r4, r7, r5, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0352
            X.E4u r5 = r7.A02
            if (r5 == 0) goto L_0x032a
            r1 = 1088(0x440, float:1.525E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r1)
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            android.content.Context r2 = r5.requireContext()
            boolean r1 = X.1DL.A07(r2, r4)
            if (r1 == 0) goto L_0x032e
            boolean r1 = X.1DL.A07(r2, r3)
            if (r1 == 0) goto L_0x032e
            X.C50349FZg.A01(r7)
        L_0x032a:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x03c2
        L_0x032e:
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            android.app.Activity r6 = r1.getParent()
            if (r6 != 0) goto L_0x033c
            androidx.fragment.app.FragmentActivity r6 = r5.requireActivity()
        L_0x033c:
            boolean r9 = X.1DL.A05(r6, r4)
            boolean r10 = X.1DL.A05(r6, r3)
            r8 = 0
            X.Lh7 r5 = new X.Lh7
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String[] r1 = new java.lang.String[]{r4, r3}
            X.1DL.A04(r6, r5, r1)
            goto L_0x032a
        L_0x0352:
            r1 = 2131955113(0x7f130da9, float:1.9546744E38)
            boolean r1 = A00(r4, r7, r5, r1)
            if (r1 == 0) goto L_0x036c
            X.E4u r3 = r7.A02
            if (r3 == 0) goto L_0x0369
            java.io.File r2 = X.0mb.A04(r4)
            r7.A03 = r2
            r1 = 2
            X.FFa.A03(r3, r2, r1)
        L_0x0369:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x03c2
        L_0x036c:
            r1 = 2131964180(0x7f133114, float:1.9565134E38)
            boolean r1 = A00(r4, r7, r5, r1)
            if (r1 == 0) goto L_0x0378
            X.E4u r1 = r7.A02
            goto L_0x03f2
        L_0x0378:
            r1 = 2131972084(0x7f134ff4, float:1.9581166E38)
            boolean r1 = A00(r4, r7, r5, r1)
            if (r1 == 0) goto L_0x06e2
            X.E4u r1 = r7.A02
            if (r1 == 0) goto L_0x0388
            r1.A03(r2)
        L_0x0388:
            r7.A00 = r2
            goto L_0x03c2
        L_0x038b:
            java.lang.Object r4 = r0.A03
            X.FZg r4 = (X.C50349FZg) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            r1 = 2131975011(0x7f135b63, float:1.9587102E38)
            boolean r1 = A00(r3, r4, r5, r1)
            r2 = 0
            if (r1 == 0) goto L_0x03d8
            X.36V r5 = r4.A01
            if (r5 == 0) goto L_0x03c0
            X.36W r4 = X.AnonymousClass36W.PROFILE_PHOTO
            X.JWU r3 = new X.JWU
            r3.<init>(r4)
            r2 = 1
            r3.A03 = r2
            r1 = 0
            r3.A05 = r1
            r3.A09 = r2
            r3.A0C = r1
            r3.A0D = r1
            r3.A0A = r1
            com.instagram.model.creation.MediaCaptureConfig r2 = new com.instagram.model.creation.MediaCaptureConfig
            r2.<init>((X.JWU) r3)
            X.EXF r1 = X.EXF.A0J
            r5.Exx(r1, r2, r4)
        L_0x03c0:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
        L_0x03c2:
            java.lang.Object r0 = r0.A02
            X.EuX r0 = (X.C49369EuX) r0
            if (r2 == 0) goto L_0x0022
            X.F3a r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.E4u r1 = r1.A00
            if (r2 != r0) goto L_0x03d5
            X.G66 r0 = r1.A0C
        L_0x03d2:
            r1.A04 = r0
            return
        L_0x03d5:
            X.G66 r0 = r1.A0D
            goto L_0x03d2
        L_0x03d8:
            r1 = 2131955113(0x7f130da9, float:1.9546744E38)
            boolean r1 = A00(r3, r4, r5, r1)
            if (r1 == 0) goto L_0x03e7
            r4.A02()
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x03c2
        L_0x03e7:
            r1 = 2131964180(0x7f133114, float:1.9565134E38)
            boolean r1 = A00(r3, r4, r5, r1)
            if (r1 == 0) goto L_0x03fa
            X.E4u r1 = r4.A02
        L_0x03f2:
            if (r1 == 0) goto L_0x03f7
            r1.A02()
        L_0x03f7:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x03c2
        L_0x03fa:
            r1 = 2131972084(0x7f134ff4, float:1.9581166E38)
            boolean r1 = A00(r3, r4, r5, r1)
            if (r1 == 0) goto L_0x06e9
            X.E4u r1 = r4.A02
            if (r1 == 0) goto L_0x040a
            r1.A03(r2)
        L_0x040a:
            r4.A00 = r2
            goto L_0x03c2
        L_0x040d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0412:
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r4 = r0.A02
            X.1Xj r4 = (X.1Xj) r4
            X.1sw r5 = X.1sw.A05
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 3
            X.ECu r2 = new X.ECu
            r2.<init>(r1, r0)
            r6 = 0
            X.AnonymousClass738.A06(r1, r2, r3, r4, r5, r6)
            return
        L_0x042b:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.2EG r2 = X.2EG.A15
            r1 = 3249(0xcb1, float:4.553E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.SUL r2 = X.Dba.A0J(r4, r3, r2, r1)
            java.lang.String r1 = r3.A06
            r2.A0E(r1)
            java.lang.Object r0 = r0.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.DbW.A1J(r0, r2)
            return
        L_0x044c:
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            r8 = 0
            r9 = 1
            r6 = 0
            r7 = r6
            android.os.Bundle r2 = X.C63502KyD.A00(r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r0.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "clips_editor"
            X.DbU.A0w(r1, r2, r4, r3, r0)
            return
        L_0x0468:
            java.lang.Object r5 = r0.A03
            X.0lg r5 = (X.0lg) r5
            java.lang.Object r2 = r0.A02
            X.0iw r2 = (X.AnonymousClass0iw) r2
            r1 = 114(0x72, float:1.6E-43)
            java.lang.String r4 = X.C273654mx.A00(r1)
            X.0wc r2 = X.AnonymousClass0kN.A01(r2, r5)
            java.lang.String r1 = "ig_cg_click_to_enter_fundraiser_settings"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "source_name"
            r2.AAJ(r1, r4)
            r2.Cgf()
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.util.HashMap r1 = X.Dba.A0f(r1, r4)
            r0 = 2887(0xb47, float:4.046E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r2 = X.C46649DiU.A04(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r5)
            r0 = 2131962827(0x7f132bcb, float:1.956239E38)
            X.DbS.A18(r3, r1, r0)
            X.C46649DiU.A07(r3, r1, r2)
            return
        L_0x04a8:
            java.lang.Object r4 = r0.A03
            com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity r4 = (com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity) r4
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r1 = "upsell"
            X.AnonymousClass736.A04(r4, r3, r1)
            r22.dismiss()
            java.lang.Object r0 = r0.A01
            X.4DH r0 = (X.AnonymousClass4DH) r0
            X.Ey8 r2 = new X.Ey8
            r2.<init>(r0, r3)
            r1 = 20
            X.FyJ r0 = new X.FyJ
            r0.<init>(r4, r1)
            r2.A00 = r0
            com.instagram.common.session.UserSession r1 = r2.A02
            r0 = 13
            X.FG4.A02(r1, r2, r0)
            return
        L_0x04d2:
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r5)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r3 = r1.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "cancel"
            boolean r2 = r3.equals(r1)
            java.lang.Object r1 = r0.A01
            X.ESY r1 = (X.ESY) r1
            if (r2 == 0) goto L_0x04f7
            java.lang.Object r2 = r0.A02
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            android.widget.CompoundButton$OnCheckedChangeListener r1 = r1.A01
            r0 = 0
            X.FGP.A05(r1, r2, r0)
            return
        L_0x04f7:
            java.lang.Object r0 = r0.A02
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            X.ESY.A00(r0, r1, r3)
            return
        L_0x04ff:
            java.lang.Object r2 = r0.A02
            X.0r1 r2 = (X.0r1) r2
            r1 = 1
            r2.A00 = r1
            java.lang.Object r1 = r0.A03
            X.FGY r1 = (X.FGY) r1
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.FGY.A00(r0, r1)
            return
        L_0x0512:
            java.lang.Object r1 = r0.A03
            X.DwI r1 = (X.DwI) r1
            java.lang.String r1 = r1.A08
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r20 = X.SQU.A01(r3, r1)
            X.0qQ.A07(r20)
            X.FEe r2 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r0.A02
            X.0lg r1 = (X.0lg) r1
            r5 = 0
            r0 = 2131963313(0x7f132db1, float:1.9563376E38)
            java.lang.String r19 = r3.getString(r0)
            r7 = 0
            r12 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r4 = new com.instagram.simplewebview.SimpleWebViewConfig
            r6 = r5
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = r7
            r14 = r7
            r15 = r12
            r16 = r7
            r17 = r7
            r18 = r7
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20)
            r2.A02(r3, r1, r4)
            java.lang.String r0 = "account_assistance_impression"
            X.C49938FFr.A01(r1, r0)
            return
        L_0x054f:
            X.FFw r3 = X.C49943FFw.A00()
            java.lang.Object r2 = r0.A01
            X.E55 r2 = (X.E55) r2
            X.0wW r5 = r2.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            java.lang.Object r4 = r0.A02
            X.0iw r4 = (X.AnonymousClass0iw) r4
            java.lang.Object r1 = r0.A03
            X.G5l r1 = (X.C51874G5l) r1
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Integer r7 = r1.B8m()
            r8 = 0
            r3.A02(r4, r5, r6, r7, r8)
            r2.A02()
            return
        L_0x0573:
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r0.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.EZm r2 = X.F5v.A00(r1)
            java.lang.String r1 = "reminder_confirm"
            X.FGS.A02(r2, r3, r1)
            java.lang.Object r0 = r0.A01
            X.G5k r0 = (X.C51873G5k) r0
            r0.D5S()
            return
        L_0x058c:
            java.lang.Object r1 = r0.A03
            X.F2f r1 = (X.C49695F2f) r1
            com.instagram.common.session.UserSession r4 = r1.A04
            java.lang.Object r3 = r0.A02
            X.EZu r3 = (X.C48152EZu) r3
            java.lang.Object r2 = r0.A01
            java.util.HashMap r2 = (java.util.HashMap) r2
            r0 = 389(0x185, float:5.45E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 3
            X.FFL.A02(r3, r4, r1, r2, r0)
            return
        L_0x05a5:
            java.lang.Object r6 = r0.A03
            X.F2f r6 = (X.C49695F2f) r6
            com.instagram.common.session.UserSession r5 = r6.A04
            java.lang.Object r3 = r0.A02
            X.EZu r3 = (X.C48152EZu) r3
            java.lang.Object r2 = r0.A01
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r1 = "upsell_primary_click"
            r0 = 3
            X.FFL.A02(r3, r5, r1, r2, r0)
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L_0x05de
            java.lang.String r4 = "17"
        L_0x05bf:
            androidx.fragment.app.Fragment r3 = r6.A02
            X.1ZD r2 = X.AnonymousClass1ZD.A02
            if (r2 == 0) goto L_0x05e1
            if (r3 == 0) goto L_0x05d5
            r0 = 0
            X.ELT r1 = new X.ELT
            r1.<init>((androidx.fragment.app.Fragment) r3, (X.0lg) r5)
        L_0x05cd:
            r1.A00 = r0
            r2.A00 = r1
            r1.A04(r4)
            return
        L_0x05d5:
            android.app.Activity r0 = r6.A01
            X.ELT r1 = new X.ELT
            r1.<init>((android.app.Activity) r0, (X.0lg) r5)
            r0 = 0
            goto L_0x05cd
        L_0x05de:
            java.lang.String r4 = "8"
            goto L_0x05bf
        L_0x05e1:
            X.DbS.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05e9:
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            boolean r1 = r3.A5G()
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            if (r1 == 0) goto L_0x05ff
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass738.A07(r0, r2, r3)
            return
        L_0x05ff:
            X.1sw r4 = X.1sw.A04
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            r5 = r1
            X.AnonymousClass738.A06(r0, r1, r2, r3, r4, r5)
            return
        L_0x060b:
            java.lang.Object r3 = r0.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r0 = 3104(0xc20, float:4.35E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FH6.A03(r3, r2, r1, r0)
            return
        L_0x0621:
            java.lang.Object r4 = r0.A02
            X.0wc r4 = (X.0wc) r4
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r2 = 2
            X.PqZ r1 = new X.PqZ
            r1.<init>(r3, r2)
            X.C48798EkM.A00(r4, r1)
            java.lang.Object r2 = r0.A01
            X.0r1 r2 = (X.0r1) r2
            r1 = 1
            r2.A00 = r1
            java.lang.Object r0 = r0.A03
            X.DbS.A1U(r0)
            return
        L_0x0641:
            java.lang.Object r3 = r0.A03
            X.FGL r3 = (X.FGL) r3
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131956570(0x7f13135a, float:1.95497E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
            java.lang.Object r0 = r0.A02
            X.EX9 r0 = (X.EX9) r0
            X.FGL.A01(r2, r3, r0, r1)
            return
        L_0x0658:
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.WGU r3 = X.WGU.A00(r4)
            X.UzE r2 = X.C16678UzE.SUCCESS_DIALOG
            java.lang.String r1 = "meta_verified_success_dialog"
            r3.A0F(r2, r1)
            java.lang.Object r8 = r0.A02
            androidx.fragment.app.FragmentActivity r8 = (androidx.fragment.app.FragmentActivity) r8
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.String r1 = "ig_boost_creation_success_dialog"
            r0 = 2
            X.0qQ.A0B(r2, r0)
            r7 = 0
            r6 = 1
            X.2nI r5 = X.DbT.A0N(r8, r2, r4)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r2 = X.DbS.A0w(r6)
            java.lang.String r0 = "entrypoint"
            r4.put(r0, r1)
            r2.set(r7)
            X.FVM r1 = new X.FVM
            r1.<init>()
            int r0 = r2.nextClearBit(r7)
            if (r0 < r6) goto L_0x06a8
            r0 = 552(0x228, float:7.74E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FBO r0 = X.FBO.A00(r1, r0, r4, r3)
            r0.A01(r8, r5)
            return
        L_0x06a8:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x06ad:
            java.lang.Object r4 = r0.A02
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "branded_content_view_insights_button"
            goto L_0x06ca
        L_0x06bc:
            java.lang.Object r4 = r0.A02
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "branded_content_allow_to_promote_toggle"
        L_0x06ca:
            X.C48729EjE.A00()
            android.content.Intent r2 = X.DbU.A04(r1)
            android.os.Bundle r1 = X.DbY.A09(r3)
            X.DbS.A1B(r1, r0)
            r0 = 3
            X.DbV.A1C(r2, r0, r1)
            r0 = 14
            X.0kR.A05(r4, r2, r0)
            return
        L_0x06e2:
            java.lang.String r0 = "Dialog option not supported"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x06e9:
            java.lang.String r0 = "Dialog option not supported"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50026FJl.onClick(android.content.DialogInterface, int):void");
    }

    public C50026FJl(FragmentActivity fragmentActivity, AnonymousClass0iw r2, C46480Dfj dfj, int i) {
        this.A00 = i;
        this.A03 = dfj;
        this.A01 = fragmentActivity;
        this.A02 = r2;
    }

    public C50026FJl(C307896Rx r1, C276544tV r2, AnonymousClass0eM r3, int i) {
        this.A00 = i;
        switch (i) {
            case 3:
            case 5:
            case 6:
            case 7:
                this.A02 = r1;
                this.A03 = r2;
                this.A01 = r3;
                break;
            default:
                this.A03 = r1;
                this.A01 = r2;
                this.A02 = r3;
                break;
        }
    }

    public C50026FJl(FragmentActivity fragmentActivity, UserSession userSession, User user, int i) {
        this.A00 = i;
        if (19 - i != 0) {
            this.A03 = userSession;
            this.A01 = fragmentActivity;
        } else {
            this.A01 = fragmentActivity;
            this.A03 = userSession;
        }
        this.A02 = user;
    }

    public C50026FJl(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, int i) {
        this.A00 = i;
        this.A03 = userSession;
        if (10 - i != 0) {
            this.A02 = r2;
            this.A01 = fragmentActivity;
        } else {
            this.A02 = fragmentActivity;
            this.A01 = r2;
        }
    }
}
