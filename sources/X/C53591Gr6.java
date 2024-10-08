package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gr6  reason: case insensitive filesystem */
public final class C53591Gr6 extends AnonymousClass0T0 implements JNE {
    public final ImageUrl A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53591Gr6) {
                C53591Gr6 gr6 = (C53591Gr6) obj;
                if (!0qQ.A0K(this.A01, gr6.A01) || !0qQ.A0K(this.A00, gr6.A00) || this.A02 != gr6.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public C53591Gr6(ImageUrl imageUrl, String str, boolean z) {
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = z;
    }
}
