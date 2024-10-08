package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;

/* renamed from: X.EEi  reason: case insensitive filesystem */
public final class C47725EEi extends C228042kh {
    public final UserSession A00;

    public C47725EEi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        Class<FanClubMemberListCategoryRepository> cls = FanClubMemberListCategoryRepository.class;
        return new C47870EKq(AnonymousClass12T.A00, userSession, (FanClubMemberListCategoryRepository) userSession.A01(cls, new C58176Ing(userSession, 5)));
    }
}
