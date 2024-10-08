package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KCc  reason: case insensitive filesystem */
public final class C61549KCc extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C61549KCc(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C60107Jfn(application, userSession);
        }
        throw AnonymousClass7TE.A0y();
    }
}
