package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8RE  reason: invalid class name */
public final class AnonymousClass8RE extends C228042kh {
    public final FragmentActivity A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final UserSession A03;

    public AnonymousClass8RE(FragmentActivity fragmentActivity, 2Fk r3, 2Fk r4, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r4, 4);
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        0qQ.A07(application);
        return new AnonymousClass8RF(application, this.A02, this.A01, this.A03);
    }
}
