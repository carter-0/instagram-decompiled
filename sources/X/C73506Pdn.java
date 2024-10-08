package X;

import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;

/* renamed from: X.Pdn  reason: case insensitive filesystem */
public final /* synthetic */ class C73506Pdn implements C62320sa {
    public final /* synthetic */ AnonymousClass9JF A00;
    public final /* synthetic */ C329067Hl A01;

    public /* synthetic */ C73506Pdn(AnonymousClass9JF r1, C329067Hl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object invoke() {
        String str;
        C329067Hl r7 = this.A01;
        AnonymousClass9JF r6 = this.A00;
        DirectStickerSuggestionsController directStickerSuggestionsController = r7.A0K;
        if (directStickerSuggestionsController != null) {
            str = directStickerSuggestionsController.A04;
            OL5 ol5 = directStickerSuggestionsController.A02;
            if (ol5 != null) {
                C70784OLe oLe = ol5.A01;
                if (oLe != null) {
                    oLe.A00 = 0;
                    oLe.A01 = 0;
                }
                ol5.A00();
            }
            if (r6 != null) {
                r7.A1W.A01(r6.A04, "message_thread", str, r6.A05);
            }
        } else {
            str = null;
        }
        C329067Hl.A0N((N34) null, C69319NjK.STICKER_SUGGESTIONS, r7, str);
        return null;
    }
}
