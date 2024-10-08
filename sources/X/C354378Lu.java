package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Lu  reason: invalid class name and case insensitive filesystem */
public final class C354378Lu extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C3501583m A02;

    public C354378Lu(FragmentActivity fragmentActivity, UserSession userSession, C3501583m r4) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragmentActivity, 2);
        0qQ.A0B(r4, 3);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C354388Lv(application, this.A01, this.A02);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
