package X;

import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;

/* renamed from: X.Pdt  reason: case insensitive filesystem */
public final /* synthetic */ class C73511Pdt implements 0sP {
    public final /* synthetic */ AnonymousClass9JF A00;
    public final /* synthetic */ C329067Hl A01;

    public /* synthetic */ C73511Pdt(AnonymousClass9JF r1, C329067Hl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        C329067Hl r1 = this.A01;
        AnonymousClass9JF r2 = this.A00;
        C317966o8 r10 = (C317966o8) obj;
        DirectStickerSuggestionsController directStickerSuggestionsController = r1.A0K;
        if (directStickerSuggestionsController == null || r2 == null) {
            return null;
        }
        String str = directStickerSuggestionsController.A04;
        AnonymousClass7IT r3 = r1.A1W;
        String str2 = r10.A0a;
        if (str2.isEmpty()) {
            str2 = r10.A0S;
        }
        r3.A00(str, r2.A04, r2.A05, Long.parseLong(str2));
        return null;
    }
}
