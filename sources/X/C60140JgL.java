package X;

import com.instagram.avatars.graphql.AvatarMentionsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.JgL  reason: case insensitive filesystem */
public final class C60140JgL extends 2YL {
    public final AvatarMentionsRepository A00;
    public final UserSession A01;
    public final 05G A02 = 106.A01(KWA.A00);

    public /* synthetic */ C60140JgL(UserSession userSession) {
        AvatarMentionsRepository avatarMentionsRepository = new AvatarMentionsRepository(userSession);
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = avatarMentionsRepository;
    }
}
