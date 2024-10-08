package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;

/* renamed from: X.KBr  reason: case insensitive filesystem */
public final class C61538KBr extends C228042kh {
    public final UserSession A00;

    public C61538KBr(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60226Jhj(new DirectPollMessageOptionVotersRepository(this.A00));
    }
}
