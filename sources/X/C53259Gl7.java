package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gl7  reason: case insensitive filesystem */
public final class C53259Gl7 extends AnonymousClass0T0 {
    public final ImageUrl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53259Gl7) {
                C53259Gl7 gl7 = (C53259Gl7) obj;
                if (!0qQ.A0K(this.A01, gl7.A01) || !0qQ.A0K(this.A00, gl7.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C53259Gl7(ImageUrl imageUrl, String str) {
        this.A01 = str;
        this.A00 = imageUrl;
    }
}
