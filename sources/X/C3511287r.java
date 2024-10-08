package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.87r  reason: invalid class name and case insensitive filesystem */
public final class C3511287r extends C228042kh {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public C3511287r(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        0qQ.A07(application);
        UserSession userSession = this.A01;
        C3511587u A002 = new 2YN(new C3511487t(userSession, fragmentActivity), fragmentActivity).A00(C3511587u.class);
        C3511187q A003 = new 2YN(new C3511087p(userSession), fragmentActivity).A00(C3511187q.class);
        0qQ.A07(A003);
        Application application2 = fragmentActivity.getApplication();
        0qQ.A07(application2);
        return new C3511387s(application, A002, new 2YN(new AnonymousClass881(application2, userSession), fragmentActivity).A00(AnonymousClass882.class), userSession, new 2YN(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class), A003);
    }
}
