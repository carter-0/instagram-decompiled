package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GyL  reason: case insensitive filesystem */
public final class C54036GyL extends HPC {
    public final ImageUrl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54036GyL) {
                C54036GyL gyL = (C54036GyL) obj;
                if (!0qQ.A0K(this.A01, gyL.A01) || !0qQ.A0K(this.A00, gyL.A00)) {
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

    public C54036GyL(ImageUrl imageUrl, String str) {
        AnonymousClass7TG.A1O(str, imageUrl);
        this.A01 = str;
        this.A00 = imageUrl;
    }
}
