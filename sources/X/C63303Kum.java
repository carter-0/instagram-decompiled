package X;

import com.instagram.common.session.UserSession;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;

/* renamed from: X.Kum  reason: case insensitive filesystem */
public abstract class C63303Kum {
    public static final ImmersiveCatchUpRepository A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (ImmersiveCatchUpRepository) userSession.A01(ImmersiveCatchUpRepository.class, new C66299MMi(userSession, 29));
    }
}
