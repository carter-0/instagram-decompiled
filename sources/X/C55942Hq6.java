package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Hq6  reason: case insensitive filesystem */
public final class C55942Hq6 {
    public final UserSession A00;
    public final String A01;

    public final void A00(Activity activity, String str, String str2) {
        0qQ.A0B(activity, 0);
        UserSession userSession = this.A00;
        C46474Dfc A012 = C46548Dgp.A01(userSession, str, str2, this.A01);
        A012.A0O = "profile_clips";
        DbU.A0w(activity, C51973G9u.A0A(userSession, A012), userSession, ModalActivity.class, "profile");
    }

    public C55942Hq6(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
