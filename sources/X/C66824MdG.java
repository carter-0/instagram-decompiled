package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MdG  reason: case insensitive filesystem */
public final class C66824MdG extends C69597Nof {
    public final ImageUrl A00;
    public final ImageUrl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66824MdG) {
                C66824MdG mdG = (C66824MdG) obj;
                if (!0qQ.A0K(this.A00, mdG.A00) || !0qQ.A0K(this.A01, mdG.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }

    public C66824MdG(ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Double(first=");
        A1A.append(this.A00);
        A1A.append(", second=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
