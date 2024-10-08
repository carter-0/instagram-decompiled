package X;

import com.instagram.model.direct.stickerstore.TypedImageUrl;

public final class NYT extends AnonymousClass7FV implements AnonymousClass7FW {
    public final TypedImageUrl A00;
    public final String A01;
    public final AnonymousClass7FT A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NYT(AnonymousClass7FT r2, TypedImageUrl typedImageUrl, String str, boolean z) {
        super(r2);
        0qQ.A0B(typedImageUrl, 1);
        this.A00 = typedImageUrl;
        this.A02 = r2;
        this.A01 = str;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYT) {
                NYT nyt = (NYT) obj;
                if (!0qQ.A0K(this.A00, nyt.A00) || !0qQ.A0K(this.A02, nyt.A02) || !0qQ.A0K(this.A01, nyt.A01) || this.A03 != nyt.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        return DbS.A06(this.A03, (AnonymousClass7TF.A07(this.A02, A0K) + AnonymousClass7TG.A0E(this.A01)) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
