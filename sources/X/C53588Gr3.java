package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gr3  reason: case insensitive filesystem */
public final class C53588Gr3 extends AnonymousClass0T0 implements JNB {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53588Gr3) {
                C53588Gr3 gr3 = (C53588Gr3) obj;
                if (!0qQ.A0K(this.A02, gr3.A02) || !0qQ.A0K(this.A01, gr3.A01) || !0qQ.A0K(this.A00, gr3.A00) || this.A03 != gr3.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02))));
    }

    public C53588Gr3(ImageUrl imageUrl, String str, String str2, boolean z) {
        AnonymousClass7TG.A1P(str, imageUrl);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = imageUrl;
        this.A03 = z;
    }
}
