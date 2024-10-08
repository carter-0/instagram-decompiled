package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

public final class FdB implements MVB {
    public final /* synthetic */ 0hq A00;
    public final /* synthetic */ C319616qu A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InstagramMainActivity A03;

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdB(0hq r1, C319616qu r2, UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = instagramMainActivity;
        this.A00 = r1;
    }

    public final void onButtonClick(View view) {
        UserSession userSession = this.A02;
        C319616qu.A01(userSession, "login_frictionless_login_toast_logout_pressed", "login_frictionless_login", "frictionless_login", "logged_in");
        InstagramMainActivity.A0J(this.A00, userSession, this.A03);
    }

    public final void onDismiss() {
        C319616qu.A01(this.A02, "login_frictionless_login_toast_dismissed", "login_frictionless_login", "frictionless_login", "logged_in");
    }
}
