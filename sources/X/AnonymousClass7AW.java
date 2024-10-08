package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.7AW  reason: invalid class name */
public final class AnonymousClass7AW {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass7IR A03;
    public final 1Av A04;

    public AnonymousClass7AW(Activity activity, Context context, UserSession userSession, AnonymousClass7IR r5) {
        0qQ.A0B(context, 3);
        0qQ.A0B(r5, 4);
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = context;
        this.A03 = r5;
        this.A04 = 1Au.A00(userSession);
    }

    public final void A01(DirectShareTarget directShareTarget, String str) {
        0qQ.A0B(str, 0);
        AnonymousClass7IR r0 = this.A03;
        C254783t2 r4 = directShareTarget.A09;
        r4.getClass();
        0wc r2 = r0.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_composer_plus_overflow_menu_tap");
        if (A002.isSampled()) {
            A002.AAJ("open_thread_id", AnonymousClass4KK.A02(r4));
            A002.AAJ("overflow_menu_selection", "igd_location_sharing");
            A002.Cgf();
        }
        1Av r3 = this.A04;
        boolean booleanValue = ((Boolean) r3.A3n.CDM(r3, 1Av.A8a[206])).booleanValue();
        boolean A08 = 1DL.A08(this.A00, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
        if (!booleanValue || !A08) {
            C69714Nqa.A00(this.A02).A00(this.A01, new C68362NBz(this, directShareTarget, str), "live_location_sharing_device_permission", "ig4a", (String) null, (String) null, (String) null);
        } else {
            A00(this, directShareTarget, str);
        }
    }

    public static final void A00(AnonymousClass7AW r5, DirectShareTarget directShareTarget, String str) {
        UserSession userSession = r5.A02;
        if (!str.isEmpty()) {
            Bundle bundle = new Bundle(0);
            bundle.putString("arg_thread_id", str);
            bundle.putParcelable(AnonymousClass000.A00(530), directShareTarget);
            AnonymousClass0Dg.A00(bundle, userSession);
            C15931Ukw ukw = new C15931Ukw();
            ukw.setArguments(bundle);
            C331127Pr r2 = new C331127Pr(userSession);
            r2.A0a = true;
            r2.A0x = true;
            r2.A03 = 0.7f;
            r2.A04 = 0.7f;
            r2.A0T = ukw;
            r2.A0k = true;
            r2.A13 = true;
            r2.A0y = true;
            r2.A1R = true;
            r2.A00().A02(r5.A00, ukw);
            return;
        }
        throw new RuntimeException("Expected a non-empty string");
    }
}
