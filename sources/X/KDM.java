package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

public final class KDM extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ClipsCreationViewModel A02;

    public KDM(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = clipsCreationViewModel;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C60099Jff(application, this.A01, this.A02);
        }
        throw AnonymousClass7TE.A0y();
    }
}
