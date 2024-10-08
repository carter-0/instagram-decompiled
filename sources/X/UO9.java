package X;

import com.instagram.common.typedurl.ImageUrl;

public final class UO9 extends AnonymousClass0T0 implements X4H {
    public int A00;
    public ImageUrl A01;
    public String A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;
    public final C16518UwN A07 = C16518UwN.HEADER;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UO9) {
                UO9 uo9 = (UO9) obj;
                if (!0qQ.A0K(this.A06, uo9.A06) || !0qQ.A0K(this.A04, uo9.A04) || !0qQ.A0K(this.A05, uo9.A05) || !0qQ.A0K(this.A03, uo9.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C16518UwN CAZ() {
        return this.A07;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A08(this.A05, ((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31));
    }

    public UO9(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2) {
        this.A06 = str;
        this.A04 = imageUrl;
        this.A05 = str2;
        this.A03 = imageUrl2;
    }
}
