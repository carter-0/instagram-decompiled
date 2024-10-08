package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository;

/* renamed from: X.NMb  reason: case insensitive filesystem */
public final class C68529NMb extends C228042kh {
    public final UserSession A00;

    public C68529NMb(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C60189Jh8(userSession, (ChannelXpostingRepository) userSession.A01(ChannelXpostingRepository.class, new C46570DhC(userSession, 26)));
    }
}
