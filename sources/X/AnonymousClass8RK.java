package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8RK  reason: invalid class name */
public final class AnonymousClass8RK extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass8RK(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        0qQ.A07(application);
        return new AnonymousClass8RL(application, this.A01);
    }
}
