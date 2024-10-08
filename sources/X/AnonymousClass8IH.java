package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8IH  reason: invalid class name */
public final class AnonymousClass8IH extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass8IH(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new AnonymousClass8II(application, this.A01);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
