package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.H3k  reason: case insensitive filesystem */
public final class C54215H3k extends C333827aD {
    public final ImageUrl A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54215H3k) {
                C54215H3k h3k = (C54215H3k) obj;
                if (!0qQ.A0K(this.A02, h3k.A02) || this.A01 != h3k.A01 || !0qQ.A0K(this.A00, h3k.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C54215H3k(ImageUrl imageUrl, String str, int i) {
        super(002.A0b("slide_thread_row_model", str, i));
        this.A02 = str;
        this.A01 = i;
        this.A00 = imageUrl;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TE.A0O(this.A02) + this.A01) * 31);
    }
}
