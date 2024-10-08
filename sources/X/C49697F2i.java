package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.F2i  reason: case insensitive filesystem */
public final class C49697F2i {
    public C331157Pu A00;
    public Integer A01;
    public final Activity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C49411EvD A05 = new C49411EvD(this);

    public C49697F2i(Activity activity, AnonymousClass0iw r3, UserSession userSession) {
        this.A02 = activity;
        this.A04 = userSession;
        this.A03 = r3;
    }

    public final void A00() {
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = this.A04;
        DbU.A1D(A0a, userSession);
        A0a.putBoolean("show_only_main_options", false);
        A0a.putBoolean("is_group_profile", false);
        E69 e69 = new E69();
        e69.setArguments(A0a);
        e69.A01 = this.A05;
        C331127Pr A0e = DbX.A0e(userSession, false);
        A0e.A0U = new FmA(5, e69, this);
        A0e.A0T = e69;
        Activity activity = this.A02;
        DbT.A1C(activity.getResources(), A0e, 2131975923);
        A0e.A07 = 1;
        this.A00 = A0e.A00().A02(activity, e69);
    }
}
