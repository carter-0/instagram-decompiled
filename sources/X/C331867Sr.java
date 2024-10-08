package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;

/* renamed from: X.7Sr  reason: invalid class name and case insensitive filesystem */
public abstract class C331867Sr {
    public static final AvatarReactionsRepository A00(UserSession userSession) {
        return (AvatarReactionsRepository) userSession.A01(AvatarReactionsRepository.class, new AnonymousClass9L0(userSession, 19));
    }
}
