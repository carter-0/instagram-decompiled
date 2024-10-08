package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.71A  reason: invalid class name */
public final class AnonymousClass71A implements C3250670x {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C319866rM A03;
    public final C3250770y A04 = C3250770y.DONATE;
    public final User A05;

    public AnonymousClass71A(Context context, AnonymousClass0iw r3, UserSession userSession, C319866rM r5, User user) {
        0qQ.A0B(r5, 2);
        this.A00 = context;
        this.A03 = r5;
        this.A05 = user;
        this.A02 = userSession;
        this.A01 = r3;
        r5.CzV(user);
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        Context context = this.A00;
        int i = 2131960985;
        if (C64172LRz.A02(this.A02)) {
            i = 2131974803;
        }
        String string = context.getString(i);
        0qQ.A07(string);
        return string;
    }

    public final C3250770y Aiv() {
        return this.A04;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        UserSession userSession = this.A02;
        AnonymousClass0iw r0 = this.A01;
        User user = this.A05;
        String id = user.getId();
        0wc A012 = AnonymousClass0kN.A01(r0, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_cg_click_profile_donate_cta");
        A002.A9F("charity_user_id", Long.valueOf(Long.parseLong(id)));
        A002.A8M(XSG.IG_CHARITY_BUSINESS_PROFILE, AnonymousClass000.A00(151));
        A002.Cgf();
        this.A03.CzW(user, "button_tray");
    }
}
