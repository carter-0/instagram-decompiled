package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.FGs  reason: case insensitive filesystem */
public abstract class C49960FGs {
    public static final E22 A00(UserSession userSession, User user, C51921G7p g7p, String str) {
        0qQ.A0B(userSession, 0);
        Bundle A09 = DbY.A09(userSession);
        A09.putString("MuteSettingsFragment.ARG_DISPLAYED_USER_ID", user.getId());
        A09.putString("MuteSettingsFragment.ARG_SELECTED_FROM", str);
        E22 e22 = new E22();
        e22.setArguments(A09);
        e22.A01 = g7p;
        return e22;
    }

    public static final void A05(Context context, C307896Rx r15, C277014uI r16, C277014uI r17, UserSession userSession, C331157Pu r19, User user, C48088EVg eVg, String str) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        Context context2 = context;
        User user2 = user;
        AnonymousClass7TF.A1B(context2, 1, user2);
        String str2 = str;
        0qQ.A0B(str2, 7);
        0wc A01 = AnonymousClass0kN.A01(new C50241FUx(str2), userSession2);
        1YZ r0 = 1YZ.A02;
        if (r0 != null) {
            r0.A00();
            C277014uI r5 = r16;
            C331157Pu r12 = r19;
            C51102FoW foW = new C51102FoW(r15, r5, r12);
            C51098FoS foS = new C51098FoS(0, r15, r17, r5);
            C331127Pr A0e = DbX.A0e(userSession2, true);
            A0e.A0x = true;
            A0e.A1G = true;
            A0e.A03 = 0.7f;
            C49925FFb.A01(context2, (C3263576k) null, (C69445Nlp) null, A01, userSession2, r12, A0e, user2, foS, eVg, foW, str2, (String) null, (JSONObject) null, true);
        }
    }

    public static final void A06(Context context, UserSession userSession, C331157Pu r5, User user, C51921G7p g7p, String str) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A0w(1, context, str, g7p);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0d = DbY.A0b(context, user, 2131973067);
        if (r5 == null) {
            A0W.A00().A03(context, A00(userSession, user, g7p, str));
            return;
        }
        DbS.A1S(A0W, true);
        A0W.A0x = true;
        A0W.A03 = 0.7f;
        r5.A0F(A00(userSession, user, g7p, str), A0W);
    }

    public static final void A07(Context context, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        if (str != null) {
            C11225SFz sFz = new C11225SFz(str);
            if (!(str2 == null || str2.length() == 0)) {
                sFz.A02 = str2;
            }
            SimpleWebViewActivity.A02.A02(context, userSession, new SimpleWebViewConfig(sFz));
        }
    }

    public static final boolean A08(UserSession userSession, DirectShareTarget directShareTarget, User user, boolean z) {
        0qQ.A0B(userSession, 0);
        if (directShareTarget != null && directShareTarget.A0L()) {
            return true;
        }
        if (user != null && 1 == user.BIW()) {
            return true;
        }
        if (!z || 182.A06(0Tu.A06, userSession, 36310302060445706L)) {
            return false;
        }
        return true;
    }

    public static final void A01(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(16);
        }
    }

    public static final void A02(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(16);
        }
    }

    public static final void A03(Activity activity) {
        AnonymousClass37D A0i;
        if (activity != null && (A0i = DbT.A0i(activity)) != null) {
            A0i.A0B();
        }
    }

    public static final void A04(Activity activity, UserSession userSession, C243853aD r23, User user, String str, String str2, JSONObject jSONObject, boolean z) {
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(activity2, userSession2);
        String str3 = str2;
        0qQ.A0B(str3, 5);
        C243853aD r12 = r23;
        User user2 = user;
        String str4 = str;
        JSONObject jSONObject2 = jSONObject;
        C50009FIu fIu = new C50009FIu(activity2, userSession2, r12, user2, jSONObject2, str, str2, 1, z);
        if (user2.A0N() == AnonymousClass05K.A01) {
            FH6.A08(activity2, (0xF) null, (1P0) null, userSession2, (1Xj) null, (AnonymousClass3W1) null, (UserDetailEntryInfo) null, r12, user2, str4, (String) null, str3, (String) null, jSONObject2);
            int i = 2131975856;
            if (user2.B6o() == FollowStatus.A05) {
                i = 2131962539;
            }
            DbU.A0z(activity2, i);
            if (!z) {
                A03(activity2);
                return;
            }
            return;
        }
        r12.DGP(user2);
        C358248ab A0Y = DbS.A0Y(activity2);
        A0Y.A05 = DbY.A0b(activity2, user2, 2131975863);
        DbU.A17(activity2, A0Y, 2131975857);
        A0Y.A0I(fIu, 2131975854);
        A0Y.A05();
        A0Y.A0f(new C50030FJp(8, user2, r12));
        AnonymousClass7TH.A0a(A0Y, true);
    }
}
