package com.instagram.direct.avatar.stickers.search;

import X.05G;
import X.106;
import X.AnonymousClass7TG;
import X.C317846nw;
import X.C62944Kow;
import com.instagram.common.session.UserSession;

public final class AvatarLocalStickerSearchUseCase extends C62944Kow {
    public final UserSession A00;
    public final AvatarLocalStickerSearchRepository A01;
    public final 05G A02 = 106.A01((Object) null);

    public /* synthetic */ AvatarLocalStickerSearchUseCase(C317846nw r3, UserSession userSession) {
        AvatarLocalStickerSearchRepository avatarLocalStickerSearchRepository = new AvatarLocalStickerSearchRepository(r3, userSession);
        AnonymousClass7TG.A1O(userSession, r3);
        this.A00 = userSession;
        this.A01 = avatarLocalStickerSearchRepository;
    }
}
