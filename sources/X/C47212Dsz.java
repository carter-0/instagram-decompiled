package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dsz  reason: case insensitive filesystem */
public final class C47212Dsz extends AnonymousClass0T0 implements C51938G8h {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47212Dsz) {
                C47212Dsz dsz = (C47212Dsz) obj;
                if (!0qQ.A0K(this.A01, dsz.A01) || !0qQ.A0K(this.A02, dsz.A02) || !0qQ.A0K(this.A00, dsz.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)));
    }

    public C47212Dsz(ImageUrl imageUrl, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, imageUrl);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
    }
}
