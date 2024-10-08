package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.717  reason: invalid class name */
public final class AnonymousClass717 implements C3250670x {
    public final Context A00;
    public final UserSession A01;
    public final C319866rM A02;
    public final C3250770y A03 = C3250770y.OTHER;
    public final User A04;

    public AnonymousClass717(Context context, UserSession userSession, C319866rM r4, User user) {
        0qQ.A0B(r4, 2);
        this.A00 = context;
        this.A02 = r4;
        this.A04 = user;
        this.A01 = userSession;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        String str;
        C274674os AyK = this.A04.A03.AyK();
        if (AyK == null || AyK.Ay3() == null) {
            str = "";
        } else {
            str = AyK.Ay3();
        }
        0qQ.A07(str);
        return str;
    }

    public final C3250770y Aiv() {
        return this.A03;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        this.A02.Czf(this.A04, "support");
    }
}
