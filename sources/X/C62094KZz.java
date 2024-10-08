package X;

import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.AvatarStickerSearchRepository;

/* renamed from: X.KZz  reason: case insensitive filesystem */
public final class C62094KZz extends C62944Kow {
    public final C61082JwK A00;
    public final C317846nw A01;
    public final C317866ny A02;
    public final UserSession A03;
    public final AvatarStickerSearchRepository A04;
    public final 05G A05;

    public /* synthetic */ C62094KZz(C61082JwK jwK, C317846nw r3, C317866ny r4, UserSession userSession) {
        AvatarStickerSearchRepository avatarStickerSearchRepository = new AvatarStickerSearchRepository(jwK, r4, userSession);
        AnonymousClass7TG.A1O(userSession, r4);
        this.A03 = userSession;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = jwK;
        this.A04 = avatarStickerSearchRepository;
        this.A05 = avatarStickerSearchRepository.A06;
    }
}
