package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.85w  reason: invalid class name and case insensitive filesystem */
public final class C3507085w extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C3507085w(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        ClipsCreationViewModel A002 = new 2YN(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        Application application = fragmentActivity.getApplication();
        if (application != null) {
            Application application2 = fragmentActivity.getApplication();
            0qQ.A07(application2);
            return new C3507185x(application, C3500382y.A00(application2, userSession), A002);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
