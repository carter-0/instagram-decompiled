package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gr4  reason: case insensitive filesystem */
public final class C53589Gr4 extends AnonymousClass0T0 implements JNC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final JNE A03;
    public final Integer A04;
    public final ImageUrl A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53589Gr4) {
                C53589Gr4 gr4 = (C53589Gr4) obj;
                if (!0qQ.A0K(this.A06, gr4.A06) || !0qQ.A0K(this.A05, gr4.A05) || this.A07 != gr4.A07 || !0qQ.A0K(this.A04, gr4.A04) || this.A01 != gr4.A01 || this.A02 != gr4.A02 || this.A00 != gr4.A00 || !0qQ.A0K(this.A03, gr4.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53589Gr4(ImageUrl imageUrl, JNE jne, Integer num, String str, int i, int i2, int i3, boolean z) {
        0qQ.A0B(jne, 8);
        this.A06 = str;
        this.A05 = imageUrl;
        this.A07 = z;
        this.A04 = num;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = jne;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0O(this.A06));
        return AnonymousClass7TE.A0N(this.A03, (((((((AnonymousClass7TF.A09(this.A07, A072) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31);
    }
}
