package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.Fn6  reason: case insensitive filesystem */
public final class C51015Fn6 implements C51920G7o {
    public static final 0bY A00 = DbW.A0G();

    public final void CI1(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0wW r11) {
        AnonymousClass0wW r5 = r11;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (r11 instanceof UserSession) {
            if (bundle.containsKey("uid") && bundle.containsKey("token") && bundle.containsKey("source")) {
                UserSession userSession = (UserSession) r5;
                String A0l = DbU.A0l(bundle, "uid");
                Pattern pattern = 0mp.A01;
                String valueOf = String.valueOf(Long.parseLong(A0l, 36));
                if (!userSession.A06.equals(valueOf)) {
                    User BNw = AnonymousClass0BO.A00(userSession).BNw(valueOf);
                    if (BNw != null) {
                        FHB.A03(fragmentActivity, bundle);
                        0BQ A002 = AnonymousClass0BO.A00(userSession);
                        if (A002.AG1(fragmentActivity, userSession, BNw)) {
                            A002.E2S(fragmentActivity2, (Intent) null, userSession, BNw, "deep_link");
                            return;
                        }
                        return;
                    } else if (FFT.A02(userSession)) {
                        bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
                        FFQ.A01(fragmentActivity, bundle, userSession);
                        return;
                    } else {
                        C59689JTv.A07(fragmentActivity, 2131965890);
                        fragmentActivity.finish();
                        return;
                    }
                }
            }
            FHB.A03(fragmentActivity, bundle);
            return;
        }
        Uri A003 = FHB.A00(bundle);
        if (A003 != null) {
            AnonymousClass3K8 A004 = AnonymousClass3K7.A00(r11);
            String queryParameter = A003.getQueryParameter(AnonymousClass000.A00(1117));
            if (queryParameter != null) {
                A004.A00 = queryParameter;
                A004.A01 = "ig_app_auth";
                A004.A03 = A004.A02;
            }
        }
        if (bundle.containsKey("uid") && bundle.containsKey("token") && bundle.containsKey("source") && bundle.getBoolean("bypass", false) && "bypass_login_email".equals(bundle.get("source")) && !1AW.A06(0Tu.A04, 2324154323107329186L)) {
            bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
        }
        FFQ.A01(fragmentActivity, bundle, r11);
    }

    public final boolean EHn() {
        return false;
    }

    public final Bundle AFW(AnonymousClass0wW r10, String str) {
        Uri A01 = 0cp.A01(A00, str);
        if (A01 == null) {
            return null;
        }
        String scheme = A01.getScheme();
        if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
            if (!C49846F9l.A00(A01)) {
                return null;
            }
            List<String> pathSegments = A01.getPathSegments();
            if (pathSegments.size() != 2) {
                return null;
            }
            if (!"_n".equalsIgnoreCase(AnonymousClass7TE.A19(pathSegments, 0)) && !"n".equalsIgnoreCase(AnonymousClass7TE.A19(pathSegments, 0))) {
                return null;
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            String A19 = AnonymousClass7TE.A19(pathSegments, 1);
            DbZ.A11(A01, A0a, A19);
            Set<String> queryParameterNames = A01.getQueryParameterNames();
            String queryParameter = A01.getQueryParameter("utm_medium");
            String str2 = "email";
            if (A01.getBooleanQueryParameter("bypass", false) && A01.getQueryParameterNames().contains("uid") && A01.getQueryParameterNames().contains("token") && str2.equalsIgnoreCase(queryParameter)) {
                str2 = "bypass_login_email";
            } else if (!str2.equalsIgnoreCase(queryParameter) && !A19.equalsIgnoreCase("emaillogin")) {
                str2 = "";
                if (!str2.equalsIgnoreCase(queryParameter) && !A19.equalsIgnoreCase("smslogin")) {
                    str2 = "stop_deletions_email_login";
                    if (!A19.equalsIgnoreCase(str2)) {
                        str2 = "stop_deletions_sms_login";
                        if (!A19.equalsIgnoreCase(str2)) {
                            str2 = A19.equalsIgnoreCase("account_deactivation_email_login") ? "account_deactivation_email" : null;
                        }
                    }
                }
            }
            if (queryParameterNames.contains("uid") && queryParameterNames.contains("token") && str2 != null) {
                DbZ.A12(A01, A0a, "uid", "token");
                A0a.putString("source", str2);
            }
            if (queryParameterNames.contains("auto_send")) {
                DbU.A1B(A01, A0a, "auto_send");
            }
            if (queryParameterNames.contains("bypass")) {
                DbT.A1E(A01, A0a, "bypass");
            }
            if (!queryParameterNames.contains("reminder")) {
                return A0a;
            }
            DbU.A1B(A01, A0a, "reminder");
            return A0a;
        } else if (!"instagram".equalsIgnoreCase(scheme)) {
            return null;
        } else {
            String host = A01.getHost();
            host.getClass();
            if (!host.equalsIgnoreCase("mainfeed") && !host.equalsIgnoreCase("explore") && !host.equalsIgnoreCase("news") && !host.equalsIgnoreCase("profile")) {
                return null;
            }
            Bundle A0a2 = AnonymousClass7TE.A0a();
            DbZ.A11(A01, A0a2, host);
            return A0a2;
        }
    }
}
