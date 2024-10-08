package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8IG  reason: invalid class name */
public final class AnonymousClass8IG extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass8IG(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C3507185x A002 = new 2YN(new C3507085w(userSession, fragmentActivity), fragmentActivity).A00(C3507185x.class);
        AnonymousClass861 A003 = new 2YN(fragmentActivity).A00(new AnonymousClass860().getClass()).A00("post_capture");
        Application application = fragmentActivity.getApplication();
        0qQ.A07(application);
        return new AnonymousClass89Z(userSession, C3500382y.A00(application, userSession), A002, new 2YN(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class), A003);
    }
}
