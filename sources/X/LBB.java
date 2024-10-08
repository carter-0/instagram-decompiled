package X;

import android.content.Context;
import com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

public final class LBB {
    public String A00 = "";
    public boolean A01;
    public final C317846nw A02;
    public final C317866ny A03;
    public final AvatarStickerSuggestionRepository A04;
    public final C335147cT A05;
    public final 02m A06;
    public final UserSession A07;
    public final AvatarStickerInteractor A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;

    public /* synthetic */ LBB(C317846nw r10, C317866ny r11, UserSession userSession, String str, int i, boolean z) {
        AvatarStickerInteractor avatarStickerInteractor = new AvatarStickerInteractor((Context) null, userSession, 30);
        02m r4 = 02m.A0p;
        AvatarStickerSuggestionRepository avatarStickerSuggestionRepository = new AvatarStickerSuggestionRepository(r4, userSession, str, i, z);
        C335147cT r1 = new C335147cT(userSession);
        0qQ.A0B(r4, 9);
        this.A07 = userSession;
        this.A02 = r10;
        this.A03 = r11;
        this.A08 = avatarStickerInteractor;
        this.A06 = r4;
        this.A04 = avatarStickerSuggestionRepository;
        this.A05 = r1;
        05G r0 = avatarStickerSuggestionRepository.A09;
        this.A09 = r0;
        this.A0A = 10b.A03(r0);
    }
}
