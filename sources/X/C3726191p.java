package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.91p  reason: invalid class name and case insensitive filesystem */
public final class C3726191p extends C392289uY implements G76 {
    public String A00 = "";
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C3726291q A03;

    public final void onActionClicked() {
        this.A03.A00(C391519tD.BUTTON_TAPPED, this.A00);
    }

    public final void onBannerDismissed() {
        this.A03.A00(C391519tD.DISMISS, this.A00);
    }

    public C3726191p(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = new C3726291q(userSession);
    }
}
