package X;

import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;

/* renamed from: X.8bt  reason: invalid class name and case insensitive filesystem */
public abstract class C359048bt {
    public static final QuickSnapRepository A00(UserSession userSession, 1ua r3) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        return (QuickSnapRepository) userSession.A01(QuickSnapRepository.class, new AnonymousClass9M1(6, r3, userSession));
    }
}
