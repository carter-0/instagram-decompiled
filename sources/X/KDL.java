package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class KDL extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Application A0A = JTP.A0A(fragmentActivity);
        UserSession userSession = this.A01;
        AnonymousClass835 A002 = C3500382y.A00(A0A, userSession).A00(this.A02);
        return new C60237Jhu(userSession, A002.A01, new 2YN(fragmentActivity).A00(AnonymousClass860.class).A00("post_capture"));
    }

    public KDL(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass7TG.A1P(userSession, str);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }
}
