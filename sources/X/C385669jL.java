package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9jL  reason: invalid class name and case insensitive filesystem */
public final class C385669jL extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C385669jL(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        return new C60178Jgx(userSession, C361288fz.A00(fragmentActivity, userSession));
    }
}
