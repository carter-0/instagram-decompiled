package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.HdS  reason: case insensitive filesystem */
public abstract class C55176HdS {
    public static final LimitsPlusRepository A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (LimitsPlusRepository) userSession.A01(LimitsPlusRepository.class, new C58175Inf(userSession, 3));
    }
}
