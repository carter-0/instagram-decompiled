package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.KDm  reason: case insensitive filesystem */
public final class C61585KDm extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C313666go A02;

    public C61585KDm(AnonymousClass0iw r2, UserSession userSession, C313666go r4) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C313786h0 r0 = C313776gz.A0K;
        UserSession userSession = this.A01;
        C313666go r4 = this.A02;
        C313776gz A002 = r0.A00(userSession, r4);
        C313646gm A003 = C313646gm.A0A.A00(this.A00, userSession, r4);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = (IgLiveQuestionSubmissionsRepository) A002.A0C.getValue();
        C313876hI r6 = (C313876hI) A002.A0B.getValue();
        return new C313886hJ(userSession, r4, (C313726gu) A003.A06.getValue(), r6, igLiveQuestionSubmissionsRepository, (IgLiveQuestionsRepository) A002.A0D.getValue(), A012);
    }
}
