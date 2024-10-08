package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.75I  reason: invalid class name */
public final class AnonymousClass75I extends AnonymousClass75J {
    public final ImageUrl A00;
    public final boolean A01 = true;

    public AnonymousClass75I(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass75I) {
                AnonymousClass75I r5 = (AnonymousClass75I) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
