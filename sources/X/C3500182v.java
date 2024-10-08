package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.82v  reason: invalid class name and case insensitive filesystem */
public final class C3500182v extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C3500182v(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Context applicationContext = fragmentActivity.getApplicationContext();
        if (applicationContext != null) {
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 1);
            C3495780x A002 = new 2YN(new C3495680w(applicationContext, userSession), fragmentActivity).A00(C3495780x.class);
            2Nn A003 = 2Nm.A00(applicationContext, userSession);
            Application application = fragmentActivity.getApplication();
            if (application != null) {
                Application application2 = fragmentActivity.getApplication();
                0qQ.A07(application2);
                return new ClipsCreationViewModel(application, userSession, C3500382y.A00(application2, userSession), A002, A003);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
