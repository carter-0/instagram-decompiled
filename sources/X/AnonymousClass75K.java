package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.75K  reason: invalid class name */
public final class AnonymousClass75K extends AnonymousClass75J {
    public final ImageUrl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass75K) {
                AnonymousClass75K r5 = (AnonymousClass75K) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public AnonymousClass75K(ImageUrl imageUrl, String str) {
        this.A01 = str;
        this.A00 = imageUrl;
    }
}
