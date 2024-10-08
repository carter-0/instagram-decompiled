package X;

import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import com.instagram.common.session.UserSession;

public final class KDD extends C228042kh {
    public final QP5 A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public KDD(QP5 qp5, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = qp5;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.KqZ, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        QP5 qp5 = this.A00;
        AppreciationGiftFeedRepository appreciationGiftFeedRepository = new AppreciationGiftFeedRepository(userSession, qp5.A03);
        ? obj = new Object();
        return new C60311JjC(qp5, new LRN(qp5, this.A01, userSession), new C63582KzV(userSession), AnonymousClass2BF.A00().A00(userSession), obj, appreciationGiftFeedRepository);
    }
}
