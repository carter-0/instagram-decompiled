package X;

import com.instagram.common.session.UserSession;

public final class GDA extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public GDA(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C52065GDl(userSession, (JUB) userSession.A01(JUB.class, new MMC(userSession, 5)), C52064GDk.A00(userSession), 0qQ.A0K(this.A01, "clips_media_notes_stack"));
    }
}
