package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OYm  reason: case insensitive filesystem */
public final class C71014OYm {
    public 1wn A00;
    public final Activity A01;
    public final UserSession A02;
    public final VN1 A03;
    public final C17421VVa A04;

    public static final void A00(UHR uhr, C71014OYm oYm) {
        Activity activity = oYm.A01;
        if (activity != null) {
            UserSession userSession = oYm.A02;
            0qQ.A0B(userSession, 0);
            C69714Nqa.A00(userSession).A00(activity, new NC1(0, uhr, oYm), C273654mx.A00(2986), "ig4a", (String) null, (String) null, (String) null);
        }
    }

    public C71014OYm(Activity activity, UserSession userSession, VN1 vn1, C17421VVa vVa) {
        C51972G9s.A1C(userSession, vVa);
        this.A01 = activity;
        this.A02 = userSession;
        this.A03 = vn1;
        this.A04 = vVa;
    }

    public C71014OYm() {
    }
}
