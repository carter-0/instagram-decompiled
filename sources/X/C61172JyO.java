package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JyO  reason: case insensitive filesystem */
public final class C61172JyO extends AnonymousClass0T0 implements C232262tL {
    public final C39746A7m A00;
    public final C62320sa A01;

    public C61172JyO(C39746A7m a7m, C62320sa r3) {
        0qQ.A0B(a7m, 1);
        this.A00 = a7m;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61172JyO) {
                C61172JyO jyO = (C61172JyO) obj;
                if (!0qQ.A0K(this.A00, jyO.A00) || !0qQ.A0K(this.A01, jyO.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A05;
        0qQ.A07(str);
        return str;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        C39746A7m a7m;
        C39747A7n a7n;
        C63879LAi lAi;
        C61172JyO jyO = (C61172JyO) obj;
        ImageUrl imageUrl2 = this.A00.A00.A00.A05;
        if (jyO == null || (a7m = jyO.A00) == null || (a7n = a7m.A00) == null || (lAi = a7n.A00) == null) {
            imageUrl = null;
        } else {
            imageUrl = lAi.A05;
        }
        return 0qQ.A0K(imageUrl2, imageUrl);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CommentGiphyStickerSuggestionItemViewModel(sticker=");
        A1A.append(this.A00);
        A1A.append(", onGifSelected=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
