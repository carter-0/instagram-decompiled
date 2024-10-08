package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;

public final class WYI implements MVB {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public WYI(Fragment fragment, AnonymousClass0iw r2, UserSession userSession, 1Xj r4) {
        this.A02 = userSession;
        this.A03 = r4;
        this.A00 = fragment;
        this.A01 = r2;
    }

    public final void onShow() {
        WGU A002 = WGU.A00(this.A02);
        C16678UzE uzE = C16678UzE.REEL_UPLOADED_TOAST;
        A002.A01 = "home_screen";
        A002.A0H(uzE, "reel_uploaded_toast");
    }

    public final void onButtonClick(View view) {
        1Yh A002 = C18138VmE.A00();
        UserSession userSession = this.A02;
        A002.A07(this.A00, (G7V) null, (PromoteLaunchOrigin) null, this.A01, userSession, this.A03, "reel_uploaded_toast", (String) null, false);
        WGU A003 = WGU.A00(userSession);
        C16678UzE uzE = C16678UzE.REEL_UPLOADED_TOAST;
        A003.A01 = "home_screen";
        A003.A0F(uzE, "reel_uploaded_toast");
    }
}
