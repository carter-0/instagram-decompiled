package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class H6E extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public H6E(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        0qQ.A07(application);
        return new C52967GgK(application, this.A01);
    }
}
