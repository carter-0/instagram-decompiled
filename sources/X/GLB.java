package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;

public abstract class GLB {
    public static final GLN A00(MusicPageTabType musicPageTabType, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (GLN) userSession.A01(GLN.class, new C58688Ivx(47, musicPageTabType, userSession));
    }
}
