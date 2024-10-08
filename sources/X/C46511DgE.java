package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;

/* renamed from: X.DgE  reason: case insensitive filesystem */
public final class C46511DgE extends C228042kh {
    public final Application A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final G7E A03;
    public final C294645mn A04;
    public final C333967aR A05;

    public C46511DgE(Application application, AnonymousClass0iw r3, UserSession userSession, G7E g7e, C294645mn r6, C333967aR r7) {
        0qQ.A0B(userSession, 3);
        AnonymousClass7TG.A1R(r3, g7e);
        this.A00 = application;
        this.A04 = r6;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = g7e;
        this.A05 = r7;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        ActivityFeedRepository A002 = AnonymousClass4HO.A00(userSession, new AnonymousClass4HN(userSession));
        AnonymousClass5GM A003 = AnonymousClass5GL.A00(userSession);
        0qQ.A0B(userSession, 0);
        C59816JZn jZn = (C59816JZn) userSession.A01(C59816JZn.class, new C66217MIy(userSession, 46));
        C333967aR r2 = this.A05;
        0qQ.A0B(r2, 1);
        ActivityFeedRecommendedUserRepository activityFeedRecommendedUserRepository = (ActivityFeedRecommendedUserRepository) userSession.A01(ActivityFeedRecommendedUserRepository.class, new MJ7(11, r2, userSession));
        Application application = this.A00;
        C294645mn r6 = this.A04;
        Object obj = AnonymousClass2aP.A00.get(2ah.class);
        if (obj != null) {
            1Ng A004 = AnonymousClass1Nd.A00(userSession);
            G7E g7e = this.A03;
            AnonymousClass0iw r3 = this.A01;
            C59815JZm jZm = new C59815JZm(r3, userSession, g7e);
            return new ActivityFeedViewModel(application, r3, A004, userSession, r6, (C46513DgG) userSession.A01(C46513DgG.class, new C66217MIy(userSession, 45)), A003, activityFeedRecommendedUserRepository, A002, jZn, jZm, (2ah) obj);
        }
        throw AnonymousClass7TE.A11(AnonymousClass000.A00(1637));
    }
}
