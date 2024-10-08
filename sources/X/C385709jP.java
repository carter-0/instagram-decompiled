package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.schools.tab.data.SchoolTabDataSource;
import com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl;

/* renamed from: X.9jP  reason: invalid class name and case insensitive filesystem */
public final class C385709jP extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    public C385709jP(Application application, UserSession userSession) {
        String A002 = AnonymousClass000.A00(5200);
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
        this.A02 = A002;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        C334007aW r3 = new C334007aW(userSession, new FollowUserDataSourceImpl(userSession, new C61960qR(application), C333947aP.A00(application, userSession, this.A02)), new C333987aU());
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        0qQ.A0B(userSession, 0);
        return new C53025GhG(A002, userSession, new KWX(new SchoolTabDataSource(userSession)), r3);
    }
}
