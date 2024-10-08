package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDz  reason: case insensitive filesystem */
public final class C61598KDz extends C228042kh {
    public final AvatarStickerGraphQLRepository A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;

    public /* synthetic */ C61598KDz(UserSession userSession, String str, String str2) {
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = avatarStickerGraphQLRepository;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60269JiQ(this.A00, this.A01, this.A03, this.A02);
    }
}
