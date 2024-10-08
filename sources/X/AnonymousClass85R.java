package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;

/* renamed from: X.85R  reason: invalid class name */
public final class AnonymousClass85R extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public AnonymousClass85R(Application application, UserSession userSession) {
        0qQ.A0B(application, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        Context applicationContext = application.getApplicationContext();
        0qQ.A07(applicationContext);
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 1);
        return new ClipsAssetHubViewModel(application, 2Nm.A00(applicationContext, userSession));
    }
}
