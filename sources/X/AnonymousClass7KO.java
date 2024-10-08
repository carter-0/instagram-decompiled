package X;

import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;

/* renamed from: X.7KO  reason: invalid class name */
public final class AnonymousClass7KO implements C329677Ju {
    public final 0sP A00;
    public final C329317Ik A01;
    public final C62320sa A02;

    public final boolean Cnn(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        DirectStickerSuggestionsController directStickerSuggestionsController;
        AnonymousClass9JF r4;
        C317966o8 r3;
        if (!z || z2 || !z3 || z4 || (directStickerSuggestionsController = (DirectStickerSuggestionsController) this.A02.invoke()) == null || (r4 = directStickerSuggestionsController.A0S) == null || (r3 = (C317966o8) r4.A02) == null) {
            return false;
        }
        C329317Ik r2 = this.A01;
        r2.FLa(r4, r3, directStickerSuggestionsController, new C73667Phg(31, r4, this));
        r2.Cmd(AnonymousClass05K.A0C, true);
        return true;
    }

    public AnonymousClass7KO(C329317Ik r1, C62320sa r2, 0sP r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }
}
