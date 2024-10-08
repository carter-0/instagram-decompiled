package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class A99 {
    public final Activity A00;
    public final UserSession A01;
    public final C358248ab A02;
    public final 1Av A03;
    public final 0sL A04;
    public final 0sL A05;
    public final 0sL A06;

    public A99(Activity activity) {
        this.A00 = activity;
        UserSession A08 = 09i.A0A.A08(activity);
        this.A01 = A08;
        this.A03 = 1Au.A00(A08);
        C59345JFx jFx = new C59345JFx(this, 24);
        this.A06 = jFx;
        C59345JFx jFx2 = new C59345JFx(this, 22);
        this.A04 = jFx2;
        C59345JFx jFx3 = new C59345JFx(this, 23);
        this.A05 = jFx3;
        C358248ab r3 = new C358248ab(activity);
        r3.A0r(true);
        r3.A08(2131965515);
        r3.A09(2131965516);
        r3.A0s(true);
        r3.A0J(new AKK(jFx, 9), 2131965514);
        r3.A0G(new AKK(jFx2, 9), 2131965513);
        r3.A0H(new AKK(jFx3, 9), 2131965512);
        r3.A07(R.drawable.ig_illustrations_illo_camera_permissions_refresh);
        this.A02 = r3;
    }

    public final void A00(boolean z) {
        0Aj A0e;
        String str;
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        if (C342017nu.A00(activity, userSession).A00()) {
            C361358g6 r0 = C361358g6.A00;
            1Av r1 = this.A03;
            if (!r0.A02(activity, userSession, r1)) {
                AnonymousClass0fN.A00(this.A02.A02());
                0xa r3 = r1.A01;
                String A002 = AnonymousClass000.A00(794);
                if (!r3.getBoolean(A002, false)) {
                    0xY AR4 = r3.AR4();
                    AR4.E5T(A002, true);
                    AR4.apply();
                }
                FA7 A003 = C48962En0.A00(activity, userSession);
                boolean A004 = FA7.A00(A003);
                if (z) {
                    if (A004) {
                        A0e = AnonymousClass7TE.A0e((0wc) A003.A01.getValue(), "ig_lock_screen_shortcuts");
                        if (A0e.isSampled()) {
                            str = "onboarding_dialog_imp_via_nux";
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (A004) {
                    A0e = AnonymousClass7TE.A0e((0wc) A003.A01.getValue(), "ig_lock_screen_shortcuts");
                    if (A0e.isSampled()) {
                        str = "onboarding_dialog_imp_via_camera_settings";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                A0e.AAJ("action", str);
                A0e.Cgf();
            }
        }
    }
}
