package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FJk  reason: case insensitive filesystem */
public final class C50025FJk implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50025FJk(Context context, UserSession userSession, int i) {
        this.A00 = i;
        switch (i) {
            case 10:
            case 23:
            case 65:
                this.A01 = context;
                this.A02 = userSession;
                return;
            default:
                this.A01 = context;
                this.A02 = userSession;
                return;
        }
    }

    public static C50025FJk A00(Object obj, Object obj2, int i) {
        return new C50025FJk(i, obj, obj2);
    }

    public static void A01(C358248ab r1, Object obj, Object obj2, int i, int i2) {
        r1.A0I(new C50025FJk(i, obj, obj2), i2);
    }

    public static void A02(C358248ab r1, Object obj, Object obj2, int i, int i2) {
        r1.A0H(new C50025FJk(i, obj, obj2), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x049d, code lost:
        r8.AAJ(r1, r0);
        r8.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0648, code lost:
        X.0oI.A07(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x064b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x06ee, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x06f5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x071e, code lost:
        X.AnonymousClass7TE.A1Z(new X.C66167MGe((java.lang.Object) r5, r4, r2, r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0726, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x07ea, code lost:
        X.DbU.A0w(r5, r1, r4, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x07ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0867, code lost:
        r1.A0S = r0;
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x086c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0910, code lost:
        r4.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0913, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x098f, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0992, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d5, code lost:
        r3.DbI(r2, r1, (java.util.Map) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.A00
            r4 = r22
            r2 = r23
            switch(r1) {
                case 0: goto L_0x0947;
                case 1: goto L_0x08b4;
                case 2: goto L_0x089c;
                case 3: goto L_0x0877;
                case 4: goto L_0x086d;
                case 5: goto L_0x0155;
                case 6: goto L_0x0855;
                case 7: goto L_0x0845;
                case 8: goto L_0x08ec;
                case 9: goto L_0x0821;
                case 10: goto L_0x0815;
                case 11: goto L_0x07ee;
                case 12: goto L_0x07d3;
                case 13: goto L_0x07b9;
                case 14: goto L_0x076c;
                case 15: goto L_0x0760;
                case 16: goto L_0x072d;
                case 17: goto L_0x0129;
                case 18: goto L_0x00f2;
                case 19: goto L_0x0697;
                case 20: goto L_0x06dc;
                case 21: goto L_0x0682;
                case 22: goto L_0x00dd;
                case 23: goto L_0x066e;
                case 24: goto L_0x065e;
                case 25: goto L_0x064c;
                case 26: goto L_0x0637;
                case 27: goto L_0x0608;
                case 28: goto L_0x05c2;
                case 29: goto L_0x0556;
                case 30: goto L_0x0539;
                case 31: goto L_0x0523;
                case 32: goto L_0x0501;
                case 33: goto L_0x00cb;
                case 34: goto L_0x04e7;
                case 35: goto L_0x04bf;
                case 36: goto L_0x04a4;
                case 37: goto L_0x045b;
                case 38: goto L_0x0375;
                case 39: goto L_0x035d;
                case 40: goto L_0x034f;
                case 41: goto L_0x033b;
                case 42: goto L_0x00a5;
                case 43: goto L_0x032a;
                case 44: goto L_0x02e8;
                case 45: goto L_0x02da;
                case 46: goto L_0x02cb;
                case 47: goto L_0x02c0;
                case 48: goto L_0x02cb;
                case 49: goto L_0x02c0;
                case 50: goto L_0x02b4;
                case 51: goto L_0x006f;
                case 52: goto L_0x001b;
                case 53: goto L_0x029a;
                case 54: goto L_0x0267;
                case 55: goto L_0x0258;
                case 56: goto L_0x000b;
                case 57: goto L_0x000b;
                case 58: goto L_0x000b;
                case 59: goto L_0x0247;
                case 60: goto L_0x021d;
                case 61: goto L_0x0163;
                case 62: goto L_0x020f;
                case 63: goto L_0x01e6;
                case 64: goto L_0x01b3;
                case 65: goto L_0x0182;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.C250563lf.A0b(r2, r1, r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r2 = r0.A01
            X.FEp r2 = (X.C49915FEp) r2
            java.lang.Object r10 = r0.A02
            X.16V r10 = (X.16V) r10
            X.4DH r1 = r2.A02
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x001a
            android.content.Context r0 = r1.getContext()
            X.2lw r8 = X.DbW.A0Q(r0, r1)
            android.content.Context r4 = r1.getContext()
            com.instagram.common.session.UserSession r7 = r2.A07
            r5 = 0
            X.G7u r6 = r2.A04
            java.lang.String r11 = "setting"
            X.AnonymousClass7TG.A1P(r4, r7)
            X.AnonymousClass7TG.A1S(r10, r6)
            X.1NY r0 = X.FRL.A00(r7, r10, r11)
            X.1OC r2 = r0.A0M()
            X.FEa r0 = new X.FEa
            r0.<init>()
            com.instagram.model.business.BusinessInfo r9 = new com.instagram.model.business.BusinessInfo
            r9.<init>(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r7)
            X.16V r1 = r0.A0J()
            X.16V r0 = X.16V.A07
            boolean r12 = X.AnonymousClass7TF.A1W(r1, r0)
            X.EDC r3 = new X.EDC
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.A00 = r3
            r8.schedule(r2)
            return
        L_0x006f:
            java.lang.Object r5 = r0.A02
            X.ESI r5 = (X.ESI) r5
            X.0wc r2 = r5.A03
            java.lang.String r1 = "remove_self_followers_dialog_confirmed"
            X.Dba.A1I(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x001a
            X.Df5 r2 = X.C46443Df5.FOLLOWERS
            java.lang.Object r0 = r0.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            r4 = 0
            r0 = 0
            com.instagram.user.recommended.FollowListData r3 = X.C46451DfE.A00(r2, r1, r4, r0)
            X.1YF r2 = X.C46339Dch.A01()
            X.0eM r1 = r5.A0E
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.Der r0 = r2.Cr3(r0, r3)
            X.6Yo r1 = X.DbZ.A0P(r5, r1)
            r1.A0B(r4, r0)
            goto L_0x098f
        L_0x00a5:
            r4.dismiss()
            boolean r1 = X.C318996ps.A01()
            if (r1 == 0) goto L_0x001a
            X.FBp r1 = X.DbU.A0d()
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            X.DbS.A1X(r2)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.FUK r3 = new X.FUK
            r3.<init>()
            java.lang.String r5 = "opal_badge"
            r6 = 1
            r1.A03(r2, r3, r4, r5, r6)
            return
        L_0x00cb:
            r1 = -2
            if (r2 == r1) goto L_0x0910
            r1 = -1
            if (r2 != r1) goto L_0x001a
            java.lang.Object r1 = r0.A02
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0kR.A0D(r0, r1)
            return
        L_0x00dd:
            r1 = -1
            if (r2 != r1) goto L_0x001a
            java.lang.Object r3 = r0.A02
            X.E4g r3 = (X.C47481E4g) r3
            X.4lm r4 = r3.A00
            if (r4 != 0) goto L_0x0914
            java.lang.String r0 = "fanClubLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f2:
            java.lang.Object r2 = r0.A02
            X.E4b r2 = (X.C47477E4b) r2
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r5 = X.C47477E4b.A00(r2)
            java.lang.Object r0 = r0.A01
            X.Jvx r0 = (X.C61059Jvx) r0
            java.lang.Object r1 = r0.A02
            X.EVK r1 = (X.EVK) r1
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            r0 = 0
            int r1 = X.DbU.A02(r1, r0)
            if (r1 == r0) goto L_0x0940
            r0 = 1
            if (r1 != r0) goto L_0x001a
            com.instagram.common.session.UserSession r3 = r5.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327374555462022(0x810f8e00003986, double:3.036916175245825E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x093c
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r4, r0)
            return
        L_0x0129:
            java.lang.Object r1 = r0.A02
            X.Dfj r1 = (X.C46480Dfj) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "hidden_words_acceptance_nux_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 164(0xa4, float:2.3E-43)
            X.1Ln r2 = new X.1Ln
            r2.<init>(r1, r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "not_now"
            java.lang.String r0 = "click_action"
            r2.A0R(r0, r1)
            r2.Cgf()
            return
        L_0x0155:
            java.lang.Object r1 = r0.A01
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            if (r1 == 0) goto L_0x001a
            java.lang.Object r0 = r0.A02
            android.content.ClipData r0 = (android.content.ClipData) r0
            r1.setPrimaryClip(r0)
            return
        L_0x0163:
            java.lang.Object r2 = r0.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.0iw r1 = X.C46359DdX.A00
            X.AnonymousClass7TG.A1N(r2, r1)
            X.DcM r3 = new X.DcM
            r3.<init>(r1, r2)
            java.lang.Object r0 = r0.A02
            X.3FW r0 = (X.AnonymousClass3FW) r0
            X.F10 r2 = X.Dba.A0Q(r0)
            java.lang.String r1 = "in_app_upsell"
            java.lang.String r0 = "ig_quiet_mode_upsell_dialog_not_now_tap"
            X.DcM.A03(r3, r2, r0, r1)
            goto L_0x0910
        L_0x0182:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            X.0lg r2 = (X.0lg) r2
            r12 = 1
            X.FEe r1 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            r0 = 16
            java.lang.String r20 = X.AnonymousClass000.A00(r0)
            r5 = 0
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r19 = r3.getString(r0)
            r7 = 0
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
            r1.A02(r3, r2, r4)
            return
        L_0x01b3:
            java.lang.Object r5 = r0.A01
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r0 = 0
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r4)
            java.lang.String r0 = r4.A06
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            X.0Aj r1 = X.Dbc.A04(r1, r0, r2)
            java.lang.String r0 = "click"
            X.DbS.A1J(r1, r0)
            java.lang.String r0 = "cant_tag_alert_manage_blocked_accounts"
            X.DbS.A1H(r1, r0)
            java.lang.String r0 = "extra_values"
            r1.A9H(r0, r2)
            r1.Cgf()
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "blocked_list"
            goto L_0x07ea
        L_0x01e6:
            X.FEe r2 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = X.DbT.A08(r1)
            java.lang.Object r0 = r0.A02
            X.0lg r0 = (X.0lg) r0
            java.lang.String r19 = "https://help.instagram.com/412981112149384/"
            r4 = 0
            r6 = 0
            r11 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r3 = new com.instagram.simplewebview.SimpleWebViewConfig
            r5 = r4
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r11
            r14 = r11
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r4
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (boolean) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (java.lang.String) r18, (java.lang.String) r19)
            r2.A02(r1, r0, r3)
            return
        L_0x020f:
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "comments"
            X.FGc.A06(r2, r1, r0)
            return
        L_0x021d:
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r1 = "http://help.instagram.com/374546259294234/?ref=learn_more"
            java.lang.String r4 = X.SQU.A01(r5, r1)
            X.0qQ.A07(r4)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r2 = r0.A02
            X.0lg r2 = (X.0lg) r2
            if (r2 == 0) goto L_0x0242
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r4)
            r0 = 2131963313(0x7f132db1, float:1.9563376E38)
            java.lang.String r0 = r5.getString(r0)
            X.C49906FEe.A01(r5, r2, r3, r1, r0)
            return
        L_0x0242:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0247:
            java.lang.Object r2 = r0.A01
            X.G7R r2 = (X.G7R) r2
            java.lang.Object r0 = r0.A02
            X.17G r0 = (X.AnonymousClass17G) r0
            boolean r1 = r0.CPV()
            r0 = 0
            r2.D5T(r1, r0)
            return
        L_0x0258:
            java.lang.Object r2 = r0.A02
            com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity r2 = (com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity) r2
            java.lang.Object r1 = r0.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "upsell"
            X.AnonymousClass736.A05(r2, r1, r0)
            goto L_0x0910
        L_0x0267:
            java.lang.Object r2 = r0.A02
            X.EwP r2 = (X.C49484EwP) r2
            java.lang.Object r0 = r0.A01
            X.FF8 r0 = (X.FF8) r0
            android.widget.CheckBox r0 = r0.A08
            r0.getClass()
            boolean r8 = r0.isChecked()
            X.FH4 r1 = r2.A00
            com.instagram.common.session.UserSession r5 = r1.A04
            java.lang.String r7 = r2.A01
            X.0iw r4 = r1.A03
            java.lang.String r0 = "logout_d1_logout_tapped"
            X.FCF.A02(r4, r5, r0, r7, r8)
            X.6qt r2 = X.C319606qt.A01(r5)
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r0 = r1.A01
            android.content.Context r3 = r0.getApplicationContext()
            r2.A09(r3, r4, r5, r6, r7, r8)
            X.EVP r0 = X.EVP.SINGLE
            r1.A0D(r0, r8)
            return
        L_0x029a:
            java.lang.Object r1 = r0.A01
            X.ESM r1 = (X.ESM) r1
            X.0eM r1 = r1.A06
            r1.getValue()
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.Checkable"
            X.0qQ.A0C(r1, r0)
            android.widget.Checkable r1 = (android.widget.Checkable) r1
            r0 = 0
            r1.setChecked(r0)
            goto L_0x0910
        L_0x02b4:
            java.lang.Object r1 = r0.A01
            X.G7K r1 = (X.G7K) r1
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            r1.Dje(r0)
            return
        L_0x02c0:
            java.lang.Object r3 = r0.A02
            X.2bv r3 = (X.2bv) r3
            java.lang.Object r2 = r0.A01
            X.4UC r2 = (X.AnonymousClass4UC) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x02d5
        L_0x02cb:
            java.lang.Object r3 = r0.A02
            X.2bv r3 = (X.2bv) r3
            java.lang.Object r2 = r0.A01
            X.4UC r2 = (X.AnonymousClass4UC) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x02d5:
            r0 = 0
            r3.DbI(r2, r1, r0)
            return
        L_0x02da:
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.String r0 = "https://help.instagram.com/2387676754836493"
            X.C49845F9k.A00(r1, r2, r0)
            return
        L_0x02e8:
            java.lang.Object r5 = r0.A01
            com.instagram.profile.fragment.UserDetailFragment r5 = (com.instagram.profile.fragment.UserDetailFragment) r5
            java.lang.Object r4 = r0.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            r0 = 7
            X.EDf r3 = new X.EDf
            r3.<init>(r5, r0)
            com.instagram.common.session.UserSession r0 = r5.A0I
            if (r0 == 0) goto L_0x0307
            X.5mt r2 = X.C294695ms.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            com.instagram.common.session.UserSession r0 = r5.A0I
            r2.A08(r1, r3, r0, r4)
        L_0x0307:
            X.Euk r2 = r5.A0w
            if (r2 != 0) goto L_0x0314
            com.instagram.common.session.UserSession r0 = r5.A0I
            X.Euk r2 = new X.Euk
            r2.<init>(r0)
            r5.A0w = r2
        L_0x0314:
            X.Dc6 r0 = r5.A10
            java.lang.String r0 = r0.A03()
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.0wc r2 = r2.A00
            java.lang.String r1 = "remove_follower_dialog_confirmed"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "target_id"
            goto L_0x049d
        L_0x032a:
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbZ.A0E(r1)
            X.DbS.A1X(r1)
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.C49242Erl.A00(r1, r0)
            return
        L_0x033b:
            r4.dismiss()
            X.1WK r3 = X.FFQ.A00()
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r0.A02
            X.0lg r1 = (X.0lg) r1
            r0 = 0
            r3.A00(r2, r0, r1)
            return
        L_0x034f:
            java.lang.Object r2 = r0.A01
            X.EDV r2 = (X.EDV) r2
            java.lang.Object r1 = r0.A02
            java.lang.Object r0 = r2.A01
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccess(r1)
            return
        L_0x035d:
            java.lang.Object r1 = r0.A02
            X.E5W r1 = (X.E5W) r1
            X.0eM r1 = r1.A03
            X.0lg r2 = X.DbT.A0X(r1)
            X.DiE r1 = X.C46634DiE.A0G
            java.lang.Object r0 = r0.A01
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.String r0 = r0.A05()
            X.C49900FCd.A00(r2, r1, r0)
            return
        L_0x0375:
            java.lang.Object r8 = r0.A02
            X.E5W r8 = (X.E5W) r8
            X.0eM r3 = r8.A03
            X.0lg r2 = X.DbT.A0X(r3)
            X.DiE r1 = X.C46634DiE.A0G
            java.lang.Object r9 = r0.A01
            X.JwH r9 = (X.C61079JwH) r9
            java.lang.String r0 = r9.A05()
            X.C49900FCd.A01(r2, r1, r0)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r7 = r8.A01
            if (r7 != 0) goto L_0x0394
            java.lang.String r0 = "aymhViewModel"
            goto L_0x06ee
        L_0x0394:
            X.0lg r5 = X.DbT.A0X(r3)
            android.os.Bundle r6 = r8.requireArguments()
            r4 = 1
            X.0qQ.A0B(r5, r4)
            java.lang.String r3 = r9.A05()
            if (r3 == 0) goto L_0x03d7
            X.0tS r1 = r7.A06
            java.util.Set r0 = r1.A09()
            java.util.LinkedHashSet r0 = X.094.A01(r3, r0)
            r1.A0H(r0)
            java.lang.Object r0 = r9.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x03bb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03d7
            java.lang.Object r0 = r2.next()
            X.Jtv r0 = (X.C60937Jtv) r0
            java.lang.Integer r0 = r0.A01
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x03bb
            X.6qt r1 = r7.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A0A(r8, r5, r0, r3)
            goto L_0x03bb
        L_0x03d7:
            java.lang.String r9 = r9.A02
            if (r9 == 0) goto L_0x040f
            java.util.ArrayList r2 = X.FCR.A00()
            java.util.Iterator r1 = r2.iterator()
        L_0x03e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03ff
            java.lang.Object r0 = r1.next()
            X.F3D r0 = (X.F3D) r0
            r0.A01()
            java.lang.String r0 = r0.A01()
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x03e3
            r1.remove()
        L_0x03ff:
            X.FCR.A02(r2)
            X.0tS r1 = r7.A06
            java.util.Set r0 = r1.A09()
            java.util.LinkedHashSet r0 = X.094.A01(r9, r0)
            r1.A0H(r0)
        L_0x040f:
            X.0eM r8 = r7.A08
            X.2Fk r5 = X.DbT.A0H(r8)
            java.lang.Object r0 = X.Dba.A0W(r8)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            if (r0 == 0) goto L_0x0439
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0426:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x043a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.String r0 = r0.A02
            X.DbY.A1T(r0, r9, r1, r3)
            goto L_0x0426
        L_0x0439:
            r3 = r4
        L_0x043a:
            r5.A0B(r3)
            java.lang.Object r0 = X.Dba.A0W(r8)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x044c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x044c
            return
        L_0x044c:
            X.6oS r2 = X.C318116oQ.A00(r7)
            r1 = 46
            X.MH3 r0 = new X.MH3
            r0.<init>(r7, r6, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            return
        L_0x045b:
            java.lang.Object r7 = r0.A02
            X.0lg r7 = (X.0lg) r7
            java.lang.Object r6 = r0.A01
            X.G8G r6 = (X.G8G) r6
            double r4 = X.DbS.A01()
            double r2 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r7)
            java.lang.String r0 = "retry_tapped"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbW.A11(r8)
            X.DbY.A1D(r8, r4, r2)
            java.lang.String r0 = "access_dialog"
            X.DbS.A1H(r8, r0)
            java.lang.String r1 = "waterfall_log_in"
            java.lang.String r0 = "module"
            X.DbY.A1I(r8, r0, r1, r2)
            X.FH8.A07(r8, r4)
            java.lang.String r1 = r6.AXz()
            java.lang.String r0 = "auth_type"
            r8.AAJ(r0, r1)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.String r0 = X.DbZ.A0m(r7)
            java.lang.String r1 = "source"
        L_0x049d:
            r8.AAJ(r1, r0)
            r8.Cgf()
            return
        L_0x04a4:
            java.lang.Object r1 = r0.A01
            X.Jzs r1 = (X.C61260Jzs) r1
            java.lang.Object r2 = r1.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.Object r0 = r0.A02
            X.E2q r0 = (X.C47444E2q) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.AnonymousClass7TG.A1N(r2, r1)
            java.lang.String r0 = "user_selected_cancel_on_dialog"
            X.C49173Eqe.A00(r1, r2, r0)
            return
        L_0x04bf:
            java.lang.Object r1 = r0.A01
            X.Jzs r1 = (X.C61260Jzs) r1
            java.lang.Object r5 = r1.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.Object r4 = r0.A02
            X.E2q r4 = (X.C47444E2q) r4
            X.0eM r0 = r4.A07
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            r2 = 0
            boolean r1 = X.AnonymousClass7TF.A1U(r2, r5, r3)
            java.lang.String r0 = "user_selected_continue_on_dialog"
            X.C49173Eqe.A00(r3, r5, r0)
            X.E7c r0 = X.C47444E2q.A00(r4)
            X.F3p r0 = r0.A02()
            r0.A01(r5, r2, r1)
            return
        L_0x04e7:
            java.lang.Object r1 = r0.A02
            X.E2q r1 = (X.C47444E2q) r1
            X.E7c r1 = X.C47444E2q.A00(r1)
            X.F3p r3 = r1.A02()
            java.lang.Object r0 = r0.A01
            X.Jzs r0 = (X.C61260Jzs) r0
            java.lang.Object r2 = r0.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r1 = 1
            r0 = 0
            r3.A01(r2, r1, r0)
            return
        L_0x0501:
            java.lang.Object r1 = r0.A01
            X.FH4 r1 = (X.FH4) r1
            com.instagram.common.session.UserSession r5 = r1.A04
            X.6qt r2 = X.C319606qt.A01(r5)
            java.lang.Object r0 = r0.A02
            java.lang.String r7 = X.DbS.A0q(r0)
            X.0iw r4 = r1.A03
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r0 = r1.A01
            android.content.Context r3 = r0.getApplicationContext()
            r8 = 1
            r2.A09(r3, r4, r5, r6, r7, r8)
            X.FH4.A07(r1)
            return
        L_0x0523:
            java.lang.Object r0 = r0.A01
            X.FH4 r0 = (X.FH4) r0
            com.instagram.common.session.UserSession r4 = r0.A04
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r3 = "logout_password_saving_cancel_clicked"
            java.lang.String r2 = "logout_spi"
            java.lang.String r1 = "logout"
            java.lang.String r0 = "logout_interaction"
            X.C319616qu.A01(r4, r3, r2, r1, r0)
            return
        L_0x0539:
            java.lang.Object r7 = r0.A02
            X.6qu r7 = (X.C319616qu) r7
            java.lang.Object r6 = r0.A01
            X.FH4 r6 = (X.FH4) r6
            com.instagram.common.session.UserSession r5 = r6.A04
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.String r3 = "logout_password_saving_opt_out"
            java.lang.String r2 = "logout_spi"
            java.lang.String r1 = "spi"
            java.lang.String r0 = "logout_interaction"
            X.C319616qu.A01(r5, r3, r2, r1, r0)
            X.FH4.A02(r7, r6, r4)
            return
        L_0x0556:
            java.lang.Object r4 = r0.A01
            X.FH4 r4 = (X.FH4) r4
            java.lang.Object r5 = r0.A02
            X.EVP r5 = (X.EVP) r5
            com.instagram.common.session.UserSession r6 = r4.A04
            X.2cc r1 = X.C71342cb.A00(r6)
            androidx.fragment.app.FragmentActivity r0 = r4.A01
            r1.A06(r0)
            X.EVP r0 = X.EVP.ALL
            X.0wc r1 = X.AnonymousClass0kN.A02(r6)
            if (r5 != r0) goto L_0x0598
            java.lang.String r0 = "ig_log_out_all_accounts"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 234(0xea, float:3.28E-43)
            X.1Ln r7 = new X.1Ln
            r7.<init>(r1, r0)
            boolean r0 = X.DbT.A1Y(r7)
            if (r0 == 0) goto L_0x0590
            X.0iw r0 = r4.A03
            java.lang.String r0 = r0.getModuleName()
            r7.A0n(r0)
        L_0x058d:
            r7.Cgf()
        L_0x0590:
            boolean r0 = X.DbX.A1Y(r6)
            r4.A0D(r5, r0)
            return
        L_0x0598:
            java.lang.String r0 = "ig_log_out_account"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 233(0xe9, float:3.27E-43)
            X.1Ln r7 = new X.1Ln
            r7.<init>(r1, r0)
            int r0 = X.DbV.A04(r6)
            long r2 = (long) r0
            r0 = 1
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "updated_accounts_count"
            r7.A0Q(r0, r1)
            X.0iw r0 = r4.A03
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "containermodule"
            r7.A0R(r0, r1)
            goto L_0x058d
        L_0x05c2:
            java.lang.Object r3 = r0.A01
            X.ESD r3 = (X.ESD) r3
            X.0hq r2 = r3.getParentFragmentManager()
            r1 = 6
            X.EQk r6 = new X.EQk
            r6.<init>(r2, r3, r1)
            X.0eM r1 = r3.A02
            X.0lg r1 = X.DbT.A0X(r1)
            android.content.Context r5 = r3.requireContext()
            java.lang.Object r0 = r0.A02
            com.instagram.login.twofac.model.TotpSeed r0 = (com.instagram.login.twofac.model.TotpSeed) r0
            java.lang.String r4 = r0.A02
            X.0qQ.A07(r4)
            X.1NY r3 = X.DbZ.A0L(r1)
            r2 = 584(0x248, float:8.18E-43)
            r1 = 38
            r0 = 93
            java.lang.String r0 = X.Dbq.A05(r2, r1, r0)
            r3.A0A(r0)
            X.Dbb.A0j(r5, r3)
            java.lang.String r0 = X.Dbb.A0W()
            X.DbX.A1M(r3, r0, r4)
            X.1OC r0 = r3.A0M()
            r0.A00 = r6
            X.1ES.A03(r0)
            return
        L_0x0608:
            java.lang.Object r3 = r0.A02
            X.E3v r3 = (X.C47471E3v) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r1 = r3.A00
            X.6Yo r4 = X.DbX.A0N(r2, r1)
            X.FFR.A03()
            android.os.Bundle r3 = r3.requireArguments()
            java.lang.String r2 = "Duo Mobile"
            java.lang.String r1 = "arg_two_fac_app_name"
            r3.putString(r1, r2)
            X.E3w r1 = new X.E3w
            r1.<init>()
            X.DbW.A0x(r3, r1, r4)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = X.Dbb.A0U()
            java.lang.String r0 = "ig_two_fac_authenticator_app_download"
            goto L_0x0648
        L_0x0637:
            java.lang.Object r1 = r0.A02
            X.E4L r1 = (X.E4L) r1
            X.E4L.A00(r1)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = X.Dbb.A0U()
            java.lang.String r0 = "ig_two_fac_authenticator_app_confirm"
        L_0x0648:
            X.0oI.A07(r2, r1, r0)
            return
        L_0x064c:
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.EZm r1 = X.F5v.A00(r0)
            java.lang.String r0 = "reminder_cancel"
            X.FGS.A02(r1, r2, r0)
            return
        L_0x065e:
            java.lang.Object r2 = r0.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            com.facebook.common.callercontext.CallerContext r0 = X.C56910IHf.A00
            java.lang.String r0 = "cancel_click"
            X.C48897Elx.A00(r0, r2, r1)
            return
        L_0x066e:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A2a
            java.lang.String r0 = "https://help.instagram.com/402084904469945/"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "exclusive_story_music_sticker_prevention_dialog"
            goto L_0x0867
        L_0x0682:
            java.lang.Object r1 = r0.A02
            X.E7N r1 = (X.E7N) r1
            X.0eM r1 = r1.A02
            X.2YL r5 = X.DbS.A0H(r1)
            java.lang.Object r4 = r0.A01
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 45
            goto L_0x071e
        L_0x0697:
            java.lang.Object r5 = r0.A02
            X.6j9 r5 = (X.C314976j9) r5
            java.lang.Object r2 = r0.A01
            X.3uh r2 = (X.C255773uh) r2
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r4 = 0
            if (r0 == 0) goto L_0x06da
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x06da
            java.lang.String r3 = r0.getId()
        L_0x06b2:
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x06ba
            com.instagram.common.typedurl.ImageUrl r4 = r0.A1Q()
        L_0x06ba:
            com.instagram.common.session.UserSession r2 = r5.A05
            java.lang.String r1 = r2.A05
            X.3BQ r0 = X.AnonymousClass3BQ.MAIN_FEED_TRAY
            com.instagram.archive.fragment.InlineAddHighlightFragment r3 = X.LT8.A04(r4, r0, r1, r3)
            X.7Pr r2 = X.DbS.A0W(r2)
            r1 = 4
            X.Lys r0 = new X.Lys
            r0.<init>(r5, r1)
            r2.A0T = r0
            X.7Pu r1 = r2.A00()
            android.app.Activity r0 = r5.A02
            r1.A02(r0, r3)
            return
        L_0x06da:
            r3 = r4
            goto L_0x06b2
        L_0x06dc:
            java.lang.Object r3 = r0.A02
            X.E7O r3 = (X.E7O) r3
            X.0eM r1 = r3.A08
            java.lang.Object r6 = r1.getValue()
            X.FYu r6 = (X.C50337FYu) r6
            com.instagram.api.schemas.FanClubCategoryType r1 = r3.A00
            if (r1 != 0) goto L_0x06f6
            java.lang.String r0 = "categoryType"
        L_0x06ee:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x06f6:
            int r2 = r1.ordinal()
            r1 = 3
            if (r2 == r1) goto L_0x072a
            r1 = 2
            if (r2 == r1) goto L_0x0727
            r1 = 1
            if (r2 != r1) goto L_0x070f
            X.EZo r5 = X.C48146EZo.LEAST_INTERACTED_SUBSCRIBERS_LIST
        L_0x0705:
            X.EZp r4 = X.C48147EZp.SUBSCRIBER_DETAILS_DOT_MENU
            r9 = 0
            java.lang.String r7 = "remove_subscriber"
            java.lang.String r8 = "tap"
            X.C50337FYu.A01(r4, r5, r6, r7, r8, r9)
        L_0x070f:
            X.0eM r1 = r3.A0B
            X.2YL r5 = X.DbS.A0H(r1)
            java.lang.Object r4 = r0.A01
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 44
        L_0x071e:
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        L_0x0727:
            X.EZo r5 = X.C48146EZo.MOST_INTERACTED_SUBSCRIBERS_LIST
            goto L_0x0705
        L_0x072a:
            X.EZo r5 = X.C48146EZo.MOST_RECENT_SUBSCRIBERS_LIST
            goto L_0x0705
        L_0x072d:
            X.FV5 r5 = X.FV5.A00
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            com.instagram.api.schemas.UserCallSettings r0 = com.instagram.api.schemas.UserCallSettings.PEOPLE_YOU_FOLLOW
            java.lang.String r2 = r0.A00
            X.AnonymousClass7TG.A1N(r4, r2)
            X.1NY r1 = X.AnonymousClass7TG.A0a(r4)
            java.lang.String r0 = "video_call/change_user_call_settings/"
            r1.A0A(r0)
            java.lang.String r0 = "setting_type"
            X.DbX.A1M(r1, r0, r2)
            X.1OC r0 = r1.A0M()
            X.1ES.A03(r0)
            r3.run()
            X.0wc r1 = X.AnonymousClass0kN.A01(r5, r4)
            java.lang.String r0 = "verified_calling_dialog_enable_button_tapped"
            X.Dba.A1I(r1, r0)
            return
        L_0x0760:
            java.lang.Object r1 = r0.A02
            X.FBR r1 = (X.FBR) r1
            java.lang.Object r0 = r0.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            X.FBR.A00(r1, r0)
            return
        L_0x076c:
            java.lang.Object r1 = r0.A02
            X.DmJ r1 = (X.C46843DmJ) r1
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r3 = r1.A04
            java.lang.Object r2 = r0.A01
            X.F2P r2 = (X.F2P) r2
            X.F2X r0 = r3.A0N
            if (r0 == 0) goto L_0x0795
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0795
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0G(r3)
            X.7eL r1 = r3.A0l
            if (r1 == 0) goto L_0x0795
            java.lang.String r0 = ""
            r1.EhX(r0)
            X.F2X r1 = r3.A0N
            r0 = 0
            r1.A00 = r0
        L_0x0795:
            X.DmJ r1 = r3.mShortcutsRowAdapter
            if (r1 == 0) goto L_0x07a1
            java.util.List r0 = r1.A05
            r0.remove(r2)
            r1.notifyDataSetChanged()
        L_0x07a1:
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r0 = r3.A0P
            java.lang.String r4 = r2.A01
            r3 = 0
            com.instagram.common.session.UserSession r1 = r0.A0L
            r2 = 2
            X.NQO r0 = new X.NQO
            r0.<init>(r4, r2)
            X.5g0 r1 = X.C290635fd.A01(r1, r0)
            r0 = 1967622104(0x754787d8, float:2.5293514E32)
            X.1ES.A05(r1, r0, r2, r3, r3)
            return
        L_0x07b9:
            java.lang.Object r4 = r0.A01
            X.4DH r4 = (X.AnonymousClass4DH) r4
            android.content.Context r3 = r4.requireContext()
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A2a
            java.lang.String r0 = "https://help.instagram.com/856296695055001"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = r4.getModuleName()
            goto L_0x0867
        L_0x07d3:
            java.lang.Object r2 = r0.A02
            X.9QZ r2 = (X.AnonymousClass9QZ) r2
            com.instagram.common.session.UserSession r4 = r2.A04
            X.27p.A01(r4)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.Object r1 = r0.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            androidx.fragment.app.FragmentActivity r5 = r2.A03
            r0 = 251(0xfb, float:3.52E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x07ea:
            X.DbU.A0w(r5, r1, r4, r3, r0)
            return
        L_0x07ee:
            java.lang.Object r1 = r0.A02
            X.9QZ r1 = (X.AnonymousClass9QZ) r1
            com.instagram.common.session.UserSession r5 = r1.A04
            X.27p.A01(r5)
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            android.content.Context r3 = r1.A02
            r1 = 16
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.SFz r2 = new X.SFz
            r2.<init>((java.lang.String) r1)
            java.lang.Object r1 = r0.A01
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0 = 2131956091(0x7f13117b, float:1.9548728E38)
            java.lang.String r0 = r1.getString(r0)
            X.C49906FEe.A01(r3, r5, r4, r2, r0)
            return
        L_0x0815:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.F5K.A01(r1, r0)
            return
        L_0x0821:
            java.lang.Object r2 = r0.A02
            X.FGL r2 = (X.FGL) r2
            androidx.fragment.app.Fragment r1 = r2.A00
            android.content.Context r6 = r1.requireContext()
            X.0gy r5 = X.AnonymousClass07i.A00(r1)
            android.content.Context r4 = r1.requireContext()
            com.instagram.common.session.UserSession r3 = r2.A02
            r2 = 1
            r1 = 0
            X.1OC r1 = X.FGQ.A01(r4, r3, r1, r2)
            java.lang.Object r0 = r0.A01
            X.1P0 r0 = (X.1P0) r0
            r1.A00 = r0
            X.1ES.A00(r6, r5, r1)
            return
        L_0x0845:
            java.lang.Object r2 = r0.A01
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            r1 = 0
            r2.setCheckedAnimated(r1)
            java.lang.Object r0 = r0.A02
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r0 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r0
            com.instagram.business.fragment.ProfileDisplayOptionsFragment.A01(r0)
            return
        L_0x0855:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A0Y
            java.lang.String r0 = "https://help.instagram.com/1022082264667994"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promoted_branded_content_dialog"
        L_0x0867:
            r1.A0S = r0
            r1.A0A()
            return
        L_0x086d:
            java.lang.Object r1 = r0.A02
            X.6Rx r1 = (X.C307896Rx) r1
            java.lang.Object r0 = r0.A01
            X.DbZ.A1V(r1, r0)
            return
        L_0x0877:
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_SCROLL_TO_AUTO_SAVE_SETTINGS"
            r2 = 1
            r4.putBoolean(r1, r2)
            r1 = 2474(0x9aa, float:3.467E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putBoolean(r1, r2)
            java.lang.Object r3 = r0.A02
            X.0lg r3 = (X.0lg) r3
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            java.lang.Object r0 = r0.A01
            X.EzW r0 = (X.C49613EzW) r0
            android.app.Activity r1 = r0.A00
            java.lang.String r0 = "reel_settings"
            X.DbU.A0w(r1, r4, r3, r2, r0)
            return
        L_0x089c:
            java.lang.Object r4 = r0.A01
            X.E4j r4 = (X.E4j) r4
            X.E8o r3 = r4.A00
            java.lang.Object r2 = r0.A02
            X.Evm r2 = (X.C49445Evm) r2
            com.instagram.user.model.User r0 = r2.A01
            java.lang.String r1 = r0.getId()
            r0 = 0
            r3.A0C(r1, r0)
            X.E4j.A00(r2, r4)
            return
        L_0x08b4:
            java.lang.Object r5 = r0.A01
            X.4mT r5 = (X.C273374mT) r5
            java.lang.Object r4 = r0.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            r5.getSession()
            java.lang.String r0 = r4.getId()
            java.lang.Long.parseLong(r0)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            java.lang.String r3 = r4.getId()
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "multiple_accounts/unlink_from_main_accounts/"
            r2.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0R(r1, r0)
            java.lang.String r0 = "main_account_ids"
            X.1OC r1 = X.DbT.A0T(r2, r0, r3)
            r0 = 0
            X.EDV.A00(r1, r5, r4, r0)
            r5.schedule(r1)
            return
        L_0x08ec:
            r1 = 0
            X.0qQ.A0B(r4, r1)
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "ig_direct_quick_replies"
            r3.put(r2, r1)
            r1 = 558(0x22e, float:7.82E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DiU r2 = X.C46649DiU.A04(r1, r3)
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            X.0lg r0 = (X.0lg) r0
            X.C46649DiU.A09(r1, r2, r0)
        L_0x0910:
            r4.dismiss()
            return
        L_0x0914:
            java.lang.String r5 = "FanClubPromoVideosFragment"
            X.0eE r2 = X.AnonymousClass0t1.A01
            X.0eM r1 = r3.A04
            com.instagram.user.model.User r1 = X.DbX.A0l(r2, r1)
            java.lang.String r1 = r1.getId()
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.Object r0 = r0.A01
            X.Drr r0 = (X.C47176Drr) r0
            java.lang.String r8 = r0.A03
            if (r8 == 0) goto L_0x0937
            java.lang.String r9 = "replace"
            r4.A04(r5, r6, r8, r9)
            X.C47481E4g.A03(r3)
            return
        L_0x0937:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x093c:
            r4.finish()
            return
        L_0x0940:
            java.lang.String r0 = "NONE dialog does not exist and should not be clicked"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0947:
            java.lang.Object r4 = r0.A01
            X.4mT r4 = (X.C273374mT) r4
            java.lang.Object r2 = r0.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            com.instagram.common.session.UserSession r1 = r4.getSession()
            com.instagram.common.session.UserSession r0 = r4.getSession()
            java.lang.String r3 = r0.A06
            java.lang.String r2 = r2.getId()
            android.os.Bundle r1 = X.DbY.A09(r1)
            java.lang.String r0 = "child_user_id_key"
            r1.putString(r0, r3)
            java.lang.String r0 = "main_user_id_key"
            r1.putString(r0, r2)
            X.DuE r3 = new X.DuE
            r3.<init>()
            r3.setArguments(r1)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r2 = r0.getCanonicalName()
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.0mp.A01
            if (r2 != 0) goto L_0x0982
            r2 = r1
        L_0x0982:
            X.6Yo r1 = X.Dbb.A0G(r4)
            r1.A0C = r2
            r1.A0E(r3)
            r0 = 0
            r1.A0F(r4, r0)
        L_0x098f:
            r1.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50025FJk.onClick(android.content.DialogInterface, int):void");
    }

    public C50025FJk(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public C50025FJk(C61260Jzs jzs, C47444E2q e2q, int i) {
        this.A00 = i;
        if (34 - i != 0) {
            this.A01 = jzs;
            this.A02 = e2q;
        } else {
            this.A02 = e2q;
            this.A01 = jzs;
        }
    }
}
