package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;

public final class KCL extends C228042kh {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C313786h0 r1 = C313776gz.A0K;
        UserSession userSession = this.A00;
        C313776gz A002 = r1.A00(userSession, C313666go.GUEST);
        return new C62413KfO((IgLiveQuestionSubmissionsRepository) A002.A0C.getValue(), A002.A01(), A002.A04, A002.A02(), A002.A03(), 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 2342166277780614186L));
    }

    public KCL(UserSession userSession) {
        this.A00 = userSession;
    }
}
