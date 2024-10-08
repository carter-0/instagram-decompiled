package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JyQ  reason: case insensitive filesystem */
public final class C61174JyQ extends AnonymousClass0T0 implements C232262tL {
    public final C317966o8 A00;
    public final C318046oG A01;
    public final C62320sa A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61174JyQ) {
                C61174JyQ jyQ = (C61174JyQ) obj;
                if (!0qQ.A0K(this.A00, jyQ.A00) || this.A01 != jyQ.A01 || !0qQ.A0K(this.A02, jyQ.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A0S;
        0qQ.A07(str);
        return str;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        C317966o8 r0;
        C61174JyQ jyQ = (C61174JyQ) obj;
        ImageUrl imageUrl2 = this.A00.A0H;
        if (jyQ == null || (r0 = jyQ.A00) == null) {
            imageUrl = null;
        } else {
            imageUrl = r0.A0H;
        }
        return 0qQ.A0K(imageUrl2, imageUrl);
    }

    public C61174JyQ(C317966o8 r1, C318046oG r2, C62320sa r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CommentAvatarStickerSuggestionItemViewModel(sticker=");
        A1A.append(this.A00);
        A1A.append(", stickerType=");
        A1A.append(this.A01);
        A1A.append(", onAvatarStickerSelected=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
