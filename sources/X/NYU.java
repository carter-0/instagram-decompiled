package X;

import com.instagram.common.typedurl.ImageUrl;

public final class NYU extends AnonymousClass7FV implements AnonymousClass7FW {
    public final float A00;
    public final long A01;
    public final ImageUrl A02;
    public final AnonymousClass7FE A03;
    public final C68868Na0 A04;
    public final AnonymousClass7FT A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYU) {
                NYU nyu = (NYU) obj;
                if (Float.compare(this.A00, nyu.A00) != 0 || !0qQ.A0K(this.A02, nyu.A02) || !0qQ.A0K(this.A04, nyu.A04) || !0qQ.A0K(this.A03, nyu.A03) || !0qQ.A0K(this.A05, nyu.A05) || this.A01 != nyu.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, ((Float.floatToIntBits(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31))) + C51968G9o.A03(this.A01);
    }

    public NYU(ImageUrl imageUrl, AnonymousClass7FT r2, AnonymousClass7FE r3, C68868Na0 na0, float f, long j) {
        super(r2);
        this.A00 = f;
        this.A02 = imageUrl;
        this.A04 = na0;
        this.A03 = r3;
        this.A05 = r2;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
