package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jt  reason: invalid class name and case insensitive filesystem */
public final class C315436jt {
    public AnonymousClass5Gv A00;
    public AnonymousClass6Z2 A01;
    public final Activity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public final void A00(View view, String str, String str2, String str3, String str4) {
        String str5 = str3;
        String str6 = str4;
        if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6)) {
            UserSession userSession = this.A04;
            0wc A012 = AnonymousClass0kN.A01(this.A03, userSession);
            0Aj A002 = A012.A00(A012.A00, "reel_viewer_app_attribution_click");
            A002.AAJ("app_name", str2);
            A002.AAJ("app_attribution_id", str);
            A002.Cgf();
            C72742PHz pHz = new C72742PHz(this, str, str2, str5, str6);
            Activity activity = this.A02;
            AnonymousClass5Gt r0 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) activity.getString(2131952953, new Object[]{str2})));
            r0.A0B = false;
            r0.A0G = true;
            r0.A03(view);
            r0.A01();
            r0.A04 = pHz;
            AnonymousClass5Gv A003 = r0.A00();
            this.A00 = A003;
            A003.A07(userSession);
        }
    }

    public final void A01(String str, String str2, String str3, String str4) {
        if (str3 != null || str4 != null) {
            Activity activity = this.A02;
            PackageManager packageManager = activity.getPackageManager();
            if (!TextUtils.isEmpty(str4)) {
                UserSession userSession = this.A04;
                AnonymousClass0iw r1 = this.A03;
                C49088EpD.A00(r1, userSession, str, str2, "link");
                Uri A032 = 0cp.A03(str4);
                if (!FGU.A03(activity, userSession, str4, r1.getModuleName())) {
                    14D A002 = 14D.A04.A00();
                    A002.getClass();
                    if (A002.A00(userSession, str4) != null) {
                        Intent A042 = AnonymousClass14B.A00().A04(activity, A032);
                        A042.putExtra(C66579MXk.A00(3), true);
                        0kR.A0B(activity, A042);
                    } else if (!0kR.A0A(activity, new Intent("android.intent.action.VIEW", A032))) {
                        0kR.A0F(activity, A032);
                    }
                }
            } else {
                str3.getClass();
                boolean A0I = 0oI.A0I(packageManager, str3);
                UserSession userSession2 = this.A04;
                AnonymousClass0iw r12 = this.A03;
                if (A0I) {
                    C49088EpD.A00(r12, userSession2, str, str2, "app");
                    packageManager.getClass();
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str3);
                    launchIntentForPackage.getClass();
                    0kR.A00(activity, launchIntentForPackage);
                    return;
                }
                C49088EpD.A00(r12, userSession2, str, str2, "store");
                0oI.A07(activity, str3, "app_attribution");
            }
        }
    }

    public C315436jt(Context context, AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = (Activity) context;
        this.A04 = userSession;
        this.A03 = r2;
    }
}
