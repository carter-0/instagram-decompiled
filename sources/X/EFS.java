package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.pendingmedia.store.PendingMediaStore;

public final class EFS extends C228042kh {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public EFS(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A04 = z4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C46401DeO deO;
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (!z) {
            deO = C46401DeO.WELCOME;
        } else if (!z2) {
            deO = C46401DeO.PROMOTIONAL;
        } else {
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(26));
        }
        UserSession userSession = this.A00;
        boolean z3 = this.A01;
        boolean z4 = this.A04;
        PendingMediaStore A002 = 28K.A00(userSession);
        C46401DeO deO2 = deO;
        UserSession userSession2 = userSession;
        FanClubPromoAndWelcomeVideoApi fanClubPromoAndWelcomeVideoApi = new FanClubPromoAndWelcomeVideoApi(deO2, userSession2, C272994ll.A00(userSession), new FanClubApi(userSession), 0eE.A00(userSession));
        return new C46790DlK(deO, AnonymousClass12T.A00, AnonymousClass1Nd.A00(userSession), userSession, FC8.A00(), fanClubPromoAndWelcomeVideoApi, A002, z3, z4);
    }
}
