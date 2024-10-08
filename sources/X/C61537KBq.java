package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.emojipong.data.EmojiPongRepository;

/* renamed from: X.KBq  reason: case insensitive filesystem */
public final class C61537KBq extends C228042kh {
    public final UserSession A00;

    public C61537KBq(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60135JgG(userSession, new EmojiPongRepository(new L1D(userSession), new L1E(userSession)));
    }
}
