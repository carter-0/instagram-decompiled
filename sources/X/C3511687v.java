package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.87v  reason: invalid class name and case insensitive filesystem */
public final class C3511687v extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C3511687v(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        0qQ.A07(application);
        UserSession userSession = this.A01;
        Context applicationContext = fragmentActivity.getApplicationContext();
        0qQ.A07(applicationContext);
        return new C3511787w(application, C311766dD.A00(applicationContext, userSession), userSession, new 2YN(fragmentActivity).A00(AnonymousClass860.class).A00("post_capture"));
    }
}
