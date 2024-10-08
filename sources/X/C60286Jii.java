package X;

import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;

/* renamed from: X.Jii  reason: case insensitive filesystem */
public final class C60286Jii extends 2YL {
    public final UserSession A00;
    public final AvatarStickerPreRenderInteractor A01;
    public final Integer A02;
    public final 05G A03 = 106.A01(C62099Ka4.A00);
    public final AvatarStickerInteractor A04;

    private final void A00(C317846nw r10, C317866ny r11, 0sP r12) {
        DbY.A19(this, new C66172MGj(r10, r12, this, (AnonymousClass4D7) null, 31), this.A04.A03((C61082JwK) null, r10, r11, (Integer) null, (Integer) null, (String) null, true, false));
    }

    public final void A01() {
        C317846nw r1;
        if (this.A02.intValue() == 0) {
            C317866ny r4 = C317866ny.STORIES;
            UserSession userSession = this.A00;
            if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36315898403098270L)) {
                r1 = C317846nw.MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER;
            } else {
                r1 = C317846nw.MUSIC_AVATAR_STICKERS_DEFAULT_STICKER;
            }
            A00(r1, r4, JTO.A1C(this, 70));
            return;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final void A02() {
        if (this.A02.intValue() == 0) {
            A00(C317846nw.MUSIC_AVATAR_STICKERS_ICON, C317866ny.STORIES, new C66195MIc(this, 0));
            return;
        }
        throw AnonymousClass7TE.A1K();
    }

    public C60286Jii(UserSession userSession, AvatarStickerInteractor avatarStickerInteractor, AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor, Integer num) {
        AnonymousClass7TG.A1O(num, userSession);
        this.A02 = num;
        this.A00 = userSession;
        this.A04 = avatarStickerInteractor;
        this.A01 = avatarStickerPreRenderInteractor;
    }
}
