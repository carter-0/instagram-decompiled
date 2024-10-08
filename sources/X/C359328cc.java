package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;

/* renamed from: X.8cc  reason: invalid class name and case insensitive filesystem */
public final class C359328cc implements 2YM {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ UserSession A01;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        0qQ.A0B(cls, 1);
        return create(cls);
    }

    public C359328cc(Application application, UserSession userSession) {
        this.A00 = application;
        this.A01 = userSession;
    }

    public final 2YL create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        Context applicationContext = application.getApplicationContext();
        0qQ.A07(applicationContext);
        return new C359338cd(application, userSession, (InspirationHubRepository) userSession.A01(InspirationHubRepository.class, new MJ9(25, applicationContext, userSession)));
    }
}
