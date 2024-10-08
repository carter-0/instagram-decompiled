package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;

public final class KDR extends C228042kh {
    public final int A00;
    public final UserSession A01;
    public final String A02;

    public KDR(UserSession userSession, String str, int i) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60232Jhp(new DirectTabbedEmojiReactionRepository(this.A01, this.A02), this.A00);
    }
}
