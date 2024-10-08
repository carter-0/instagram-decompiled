package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.6au  reason: invalid class name and case insensitive filesystem */
public final class C310376au extends C252733pa {
    public final AvatarStickerGraphQLRepository A00;
    public final AvatarStore A01;
    public final UserSession A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C310376au(UserSession userSession) {
        super("StoriesTemplateParticipationRepository", AnonymousClass43D.A01(1342004349, 3));
        AvatarStore A002 = 25x.A00(userSession);
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 2);
        this.A02 = userSession;
        this.A01 = A002;
        this.A00 = avatarStickerGraphQLRepository;
    }
}
