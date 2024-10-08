package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;

/* renamed from: X.EEy  reason: case insensitive filesystem */
public final class C47740EEy extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new FanClubMemberListViewModel(userSession, (FanClubMemberListRepository) userSession.A01(FanClubMemberListRepository.class, new C58176Ing(userSession, 6)), this.A01);
    }

    public C47740EEy(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
