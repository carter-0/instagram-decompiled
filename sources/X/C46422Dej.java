package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dej  reason: case insensitive filesystem */
public final class C46422Dej implements C3250670x {
    public final C3250770y A00 = C3250770y.OTHER;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C323326xJ A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C320206rz A05;

    public final String Aix() {
        return "generic";
    }

    public C46422Dej(Context context, UserSession userSession, C323326xJ r4, User user, C320206rz r6) {
        this.A01 = context;
        this.A04 = user;
        this.A02 = userSession;
        this.A03 = r4;
        this.A05 = r6;
    }

    public final String Air() {
        Context context = this.A01;
        int i = 2131973011;
        if (0qQ.A0K(this.A04.getId(), this.A02.A06)) {
            i = 2131960850;
        }
        String string = context.getString(i);
        0qQ.A0A(string);
        return string;
    }

    public final C3250770y Aiv() {
        return this.A00;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        String str;
        if (0qQ.A0K(this.A04.getId(), this.A02.A06)) {
            str = "tap_dropdown_discover_people";
        } else {
            str = "tap_dropdown_suggested_accounts";
        }
        this.A03.BhL().D2d(str, "user_profile_header");
        this.A05.A0G(true, "overflow_menu_see_similar_accounts");
    }
}
