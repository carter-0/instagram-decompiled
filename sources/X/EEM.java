package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class EEM extends C252233om implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(EEM.class);
    public static final String __redex_internal_original_name = "FacebookLoginHelper";
    public FxSsoViewModel A00;
    public F23 A01;
    public String A02;
    public EE1 A03;
    public final Activity A04;
    public final Handler A05 = new Handler();
    public final AnonymousClass4DH A06;
    public final AnonymousClass0iw A07;
    public final AnonymousClass0aP A08;
    public final C46634DiE A09;
    public final FA2 A0A;

    private DialogInterface.OnClickListener A00(Ez0 ez0, String str, String str2, String str3, String str4, String str5) {
        int i;
        Ez0 ez02 = ez0;
        String str6 = ez0.A00;
        String str7 = str;
        switch (str6.hashCode()) {
            case -1828522310:
                if (str6.equals("email_sign_up")) {
                    i = 14;
                    break;
                } else {
                    return null;
                }
            case -563041124:
                if (str6.equals("switch_to_signup_flow")) {
                    return C50020FJf.A00(this, 61);
                }
                return null;
            case -469212106:
                if (str6.equals("forgot_password_flow")) {
                    return new C50022FJh(this, str2, 16);
                }
                return null;
            case 366006153:
                if (str6.equals("username_log_in")) {
                    return new C50018FJd(ez0, this, str3, 6);
                }
                return null;
            case 460966973:
                if (str6.equals("stop_account_deletion")) {
                    return new C50000FIl(this, ez02, str7, str4, str5, 3);
                }
                return null;
            case 1160163273:
                if (str6.equals("login_with_facebook")) {
                    return new C50018FJd(ez0, this, str, 7);
                }
                return null;
            case 1671672458:
                if (str6.equals("dismiss")) {
                    i = 15;
                    break;
                } else {
                    return null;
                }
            case 2138021083:
                if (str6.equals("create_new_account_with_fb_contact_point_taken")) {
                    i = 17;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return new C50022FJh(this, str3, i);
    }

    public final void A07() {
        AnonymousClass0aP r3 = this.A08;
        String str = this.A09.A01;
        boolean A1U = AnonymousClass7TF.A1U(0, r3, str);
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r3), "try_facebook_auth");
        DbY.A1D(A0e, A012, A002);
        DbZ.A1E(A0e);
        DbW.A12(A0e, A002);
        DbW.A13(A0e, A012);
        DbS.A1H(A0e, str);
        FH8.A09(A0e, r3);
        A0e.A7p("is_standalone", (Boolean) null);
        A0e.AAJ("view", (String) null);
        A0e.AAJ("flow", (String) null);
        A0e.Cgf();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("login_source", "IGNativeLoginWithFacebook");
        A1E.put("account_recovery_event_source", "ig_native_login_with_fb");
        A1E.put("event_request_id", AnonymousClass7TF.A0c());
        HashMap A1E2 = AnonymousClass7TE.A1E();
        A1E2.put("flow", "ig_caa_linking");
        A1E2.put("should_skip_native_auth", Boolean.valueOf(A1U));
        A1E2.put("target_account_type", 0);
        A1E2.put("logging_event", "auth_flow_initiated");
        A1E2.put("pass_through_params", new JSONObject(A1E));
        HashMap A1E3 = AnonymousClass7TE.A1E();
        DbW.A1Q(new JSONObject(A1E2), A1E3);
        AnonymousClass4DH r2 = this.A06;
        C360678ey A042 = C359988do.A04(r3, "com.bloks.www.fx.pf.auth_flow.async", A1E3);
        E84.A00(A042, this, 9);
        r2.schedule(A042);
    }

    public final void A0A(C257443xP r12, C257443xP r13, AnonymousClass0aP r14, String str, String str2, String str3, String str4) {
        A02(C2612848z.A00, r12, r13, r14, this, (Boolean) null, str, str2, str3, str4, true);
    }

    public static void A02(C257443xP r32, C257443xP r33, C257443xP r34, AnonymousClass0aP r35, EEM eem, Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        1OC A0B2;
        1Q0 r2;
        boolean z2 = false;
        String str6 = null;
        EEM eem2 = eem;
        Activity activity = eem2.A04;
        AnonymousClass0aP r8 = eem2.A08;
        Boolean bool2 = bool;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        if (str3 != null) {
            F0H A0G = FHA.A0G(FxcalAccountType.FACEBOOK, str8, str7);
            if (r34.A06()) {
                str6 = (String) r34.A03();
            }
            A0B2 = FHA.A0A(r8, A0G, bool2, str9, 0qv.A00(activity), DbT.A0s(activity), str6, str4);
            r2 = 1Q0.A1w;
        } else {
            if (r32.A06()) {
                str5 = (String) r32.A03();
            } else {
                str5 = null;
            }
            if (r34.A06()) {
                str6 = (String) r34.A03();
            }
            A0B2 = FHA.A0B(r8, bool2, str5, str8, (String) null, (String) null, 0qv.A00(activity), DbT.A0s(activity), str6, z, true, false, false, false);
            r2 = 1Q0.A1t;
        }
        FGI A022 = r2.A02(r8);
        C46634DiE diE = eem2.A09;
        FGI.A02(A022, EXD.A04, diE);
        boolean A062 = r32.A06();
        if (bool != null) {
            z2 = bool2.booleanValue();
        }
        AnonymousClass4DH r5 = eem2.A06;
        AnonymousClass6ST A0Y = DbW.A0Y(r5);
        A0Y.A00(DbV.A0z(r5, r5.getString(2131961885), 2131956551));
        A0B2.A00 = new C47694EDd(r33, r35, eem2, A0Y, str8, str7, str9, z2, A062, false);
        r5.schedule(A0B2);
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "try_facebook_sso");
        Dbc.A0X(A0e, A012, A002);
        DbZ.A1E(A0e);
        DbS.A1H(A0e, diE.A01);
        FH8.A08(A0e, r8);
    }

    public static void A03(EEM eem) {
        FGI.A03(1Q0.A1K.A02(eem.A08), eem.A09);
        eem.A05.post(new C51239Fqu(eem));
    }

    public static void A04(EEM eem, User user, String str) {
        1Q0 r0 = 1Q0.A19;
        AnonymousClass0aP r2 = eem.A08;
        FGI.A03(r0.A02(r2), eem.A09);
        C309516Yo A0J = DbY.A0J(eem.A06.getActivity(), r2);
        String id = user.getId();
        String username = user.getUsername();
        ImageUrl Bh3 = user.Bh3();
        C47478E4d e4d = new C47478E4d();
        Bundle A0C = DbX.A0C("IgSessionManager.LOGGED_OUT_TOKEN");
        A0C.putString("argument_reset_token", str);
        A0C.putString("argument_user_id", id);
        A0C.putString("argument_user_name", username);
        A0C.putParcelable("argument_profile_pic_url", Bh3);
        DbX.A18(A0C, e4d, A0J);
    }

    public static void A05(EEM eem, 1Q0 r3, String str) {
        if (str != null && str.equals("fb_email_taken")) {
            FGI.A03(r3.A02(eem.A08), eem.A09);
        }
    }

    public final void A0B(AnonymousClass0aP r12, String str, String str2, boolean z) {
        C2612848z r0 = C2612848z.A00;
        C2612848z r1 = r0;
        C2612848z r2 = r0;
        A02(r0, r1, r2, r12, this, (Boolean) null, str, str2, (String) null, (String) null, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r9 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r15 != null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.EM5 r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r21 = this;
            r14 = r21
            android.app.Activity r8 = r14.A04
            X.8ab r7 = X.DbS.A0X(r8)
            r5 = r22
            java.lang.String r0 = r5.getErrorMessage()
            r7.A0q(r0)
            java.lang.String r0 = r5.mErrorTitle
            if (r0 == 0) goto L_0x0017
            r7.A05 = r0
        L_0x0017:
            java.lang.String r0 = r5.mErrorBody
            if (r0 == 0) goto L_0x001e
            r7.A0q(r0)
        L_0x001e:
            java.lang.String r6 = r5.mErrorType
            java.util.List r0 = r5.A0F
            if (r0 == 0) goto L_0x0127
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0127
            java.util.List r0 = r5.A0F
            java.lang.String r4 = "stop_account_deletion"
            X.Ez0 r0 = A01(r4, r0)
            r16 = r23
            r19 = r24
            r20 = r25
            if (r0 == 0) goto L_0x00d1
            java.lang.String r9 = r5.A08
            java.lang.String r1 = r5.getErrorMessage()
            java.lang.String r10 = r5.A09
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00a9
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            X.DbU.A17(r8, r7, r0)
        L_0x004e:
            if (r9 == 0) goto L_0x0063
        L_0x0050:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0063
            r2 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r1 = 13
            X.FJh r0 = new X.FJh
            r0.<init>((X.EEM) r14, (java.lang.String) r9, (int) r1)
            r7.A0H(r0, r2)
        L_0x0063:
            java.util.List r2 = r5.A0F
            java.lang.String r10 = r5.A0D
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0095
            X.Ez0 r15 = A01(r4, r2)
            if (r15 == 0) goto L_0x0080
            java.lang.String r1 = r15.A02
            r18 = r6
            r17 = r10
            android.content.DialogInterface$OnClickListener r0 = r14.A00(r15, r16, r17, r18, r19, r20)
            r7.A0c(r0, r1)
        L_0x0080:
            java.lang.String r0 = "back_to_login"
            X.Ez0 r15 = A01(r0, r2)
            if (r15 == 0) goto L_0x0095
        L_0x0088:
            java.lang.String r1 = r15.A02
            r18 = r6
            r17 = r10
            android.content.DialogInterface$OnClickListener r0 = r14.A00(r15, r16, r17, r18, r19, r20)
            r7.A0b(r0, r1)
        L_0x0095:
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x00a8
            X.1Q0 r0 = X.1Q0.A0f
            A05(r14, r0, r6)
            X.Fs2 r0 = new X.Fs2
            r0.<init>(r7)
            X.11Z.A02(r0)
        L_0x00a8:
            return
        L_0x00a9:
            android.text.SpannableStringBuilder r3 = X.DbS.A0C(r1)
            java.lang.String r2 = r5.A06
            if (r2 == 0) goto L_0x00ba
            r1 = 1
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            X.AnonymousClass7AV.A02(r3, r0, r2)
        L_0x00ba:
            if (r9 == 0) goto L_0x00cc
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00cc
            r1 = 2
            X.FIT r0 = new X.FIT
            r0.<init>(r14, r10, r9, r1)
            r7.A0Z(r0, r3, r10)
            goto L_0x0050
        L_0x00cc:
            r7.A0q(r3)
            goto L_0x004e
        L_0x00d1:
            java.util.List r12 = r5.A0F
            java.lang.String r10 = r5.A0D
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0095
            java.lang.Object r15 = X.AnonymousClass7TE.A13(r12)
            X.Ez0 r15 = (X.Ez0) r15
            java.lang.String r1 = r15.A02
            r18 = r6
            r17 = r10
            android.content.DialogInterface$OnClickListener r0 = r14.A00(r15, r16, r17, r18, r19, r20)
            r7.A0c(r0, r1)
            int r0 = r12.size()
            r13 = 1
            if (r0 <= r13) goto L_0x0095
            X.0aP r11 = r14.A08
            X.DiE r0 = r14.A09
            java.lang.String r9 = r0.A01
            X.Dba.A0j(r13, r11, r9)
            double r3 = X.DbS.A01()
            double r1 = X.DbS.A00()
            X.0wc r5 = X.AnonymousClass0kN.A02(r11)
            java.lang.String r0 = "fb_clash_dialog"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r5, r0)
            X.Dbc.A0X(r0, r3, r1)
            X.DbS.A1H(r0, r9)
            X.DbZ.A1E(r0)
            X.FH8.A04(r0)
            X.FH8.A08(r0, r11)
            java.lang.Object r15 = r12.get(r13)
            X.Ez0 r15 = (X.Ez0) r15
            goto L_0x0088
        L_0x0127:
            r1 = 2131960862(0x7f13241e, float:1.9558405E38)
            r0 = 0
            r7.A0I(r0, r1)
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEM.A0C(X.EM5, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void onCreate() {
        ((IgFragmentActivity) this.A04).registerOnActivityResultListener(this.A03);
    }

    public final void onDestroy() {
        ((IgFragmentActivity) this.A04).unregisterOnActivityResultListener(this.A03);
    }

    public final void onPause() {
        this.A05.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (((X.G7B) r2).COM() == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r4 = this;
            android.app.Activity r2 = r4.A04
            boolean r0 = r2 instanceof X.G7B
            if (r0 == 0) goto L_0x0010
            r0 = r2
            X.G7B r0 = (X.G7B) r0
            boolean r0 = r0.COM()
            r1 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            X.0aP r3 = r4.A08
            int r0 = X.DbV.A04(r3)
            if (r0 <= 0) goto L_0x0025
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "FacebookLoginHelper"
            java.lang.String r0 = "activity finish loop"
            X.0KC.A0E(r1, r0)
            r2.finish()
        L_0x0025:
            X.183 r0 = X.183.A01
            if (r0 == 0) goto L_0x0039
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.1AV r1 = r0.A01()
            X.0eM r0 = X.1ET.A01
            r0.getValue()
            X.1AV.A00(r1, r2)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEM.onResume():void");
    }

    public EEM(AnonymousClass4DH r2, AnonymousClass0iw r3, AnonymousClass0aP r4, FxSsoViewModel fxSsoViewModel, C46634DiE diE, String str) {
        this.A08 = r4;
        this.A06 = r2;
        this.A04 = r2.getActivity();
        this.A09 = diE;
        this.A07 = r3;
        this.A01 = new F23(r2, r4);
        this.A0A = Eq7.A00(r4);
        this.A02 = str;
        this.A03 = new EE1(this);
        this.A00 = fxSsoViewModel;
    }

    public static Ez0 A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ez0 ez0 = (Ez0) it.next();
            if (ez0.A00.equals(str)) {
                return ez0;
            }
        }
        return null;
    }

    public static void A06(EEM eem, String str, String str2, List list, List list2, boolean z, boolean z2) {
        String str3;
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        AnonymousClass0aP r7 = eem.A08;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "register_with_facebook");
        Dbc.A0Y(A0e, A012, A002);
        Dbc.A0c(A0e, "step", eem.A09.A01, A002);
        FH8.A07(A0e, A012);
        A0e.A7p("has_fb_access_token", Boolean.valueOf(AnonymousClass7TF.A1V(str2)));
        FH8.A0B(A0e, r7);
        DbS.A1G(A0e, "facebook");
        A0e.Cgf();
        if (list == null || list.isEmpty()) {
            str3 = "unknown";
        } else {
            str3 = (String) AnonymousClass7TE.A13(list);
        }
        if (1AW.A06(0Tu.A05, 18298201358468292L)) {
            C49670F1c.getInstance().startDeviceValidation(eem.A06.getContext(), str3);
        }
        eem.A05.post(new C51549Fvv(eem, str, str2, list, list2, z, z2));
    }

    public final void A08() {
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        AnonymousClass0aP r7 = this.A08;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A07, r7), "pw_recovery_tapped");
        DbY.A1D(A0e, A012, A002);
        DbT.A1O(A0e);
        Dbc.A0c(A0e, "step", this.A09.A01, A002);
        DbW.A13(A0e, A012);
        FH8.A08(A0e, r7);
    }

    public final void A09(TextView textView, AnonymousClass4DH r7, C46634DiE diE) {
        String str;
        String str2;
        C376159Gt r0;
        C376149Gs r02 = FV8.A00().A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            str = null;
        } else {
            str = r0.A00;
        }
        AnonymousClass0aP r2 = this.A08;
        C49211ErG.A00(r2, diE.A01);
        if (TextUtils.isEmpty(str2)) {
            if (C50305FXk.A03.A00(r2, __redex_internal_original_name)) {
                if (Dbc.A12(r2, __redex_internal_original_name)) {
                    str2 = null;
                } else {
                    str2 = C50305FXk.A01;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
            } else {
                textView.setText(2131965542);
                return;
            }
        }
        FxSsoViewModel fxSsoViewModel = this.A00;
        if (fxSsoViewModel != null) {
            String A0z = DbV.A0z(r7, str2, 2131956700);
            0qQ.A0B(A0z, 0);
            DbT.A0H(fxSsoViewModel.A01).A0B(A0z);
        }
        DbX.A1F(textView, r7, str2, 2131956700);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C49822F8k.A00();
        C49206ErB.A00(this.A08, this.A09.A01, "facebook_login_helper");
    }
}
