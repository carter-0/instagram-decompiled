package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gr5  reason: case insensitive filesystem */
public final class C53590Gr5 extends AnonymousClass0T0 implements JND {
    public final JNE A00;
    public final String A01;
    public final ImageUrl A02;
    public final String A03;
    public final boolean A04;

    public C53590Gr5(ImageUrl imageUrl, JNE jne, String str, String str2, boolean z) {
        0qQ.A0B(jne, 4);
        this.A03 = str;
        this.A02 = imageUrl;
        this.A04 = z;
        this.A00 = jne;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53590Gr5) {
                C53590Gr5 gr5 = (C53590Gr5) obj;
                if (!0qQ.A0K(this.A03, gr5.A03) || !0qQ.A0K(this.A02, gr5.A02) || this.A04 != gr5.A04 || !0qQ.A0K(this.A00, gr5.A00) || !0qQ.A0K(this.A01, gr5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A03)))) + AnonymousClass7TG.A0E(this.A01);
    }
}
