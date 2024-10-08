package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8M0  reason: invalid class name */
public final class AnonymousClass8M0 extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ClipsCreationViewModel A02;

    public AnonymousClass8M0(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragmentActivity, 2);
        0qQ.A0B(clipsCreationViewModel, 3);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = clipsCreationViewModel;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new AnonymousClass8M1(application, this.A01, this.A02);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
