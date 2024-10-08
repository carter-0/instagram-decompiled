package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GQz  reason: case insensitive filesystem */
public final class C52400GQz extends AnonymousClass0T0 implements C59643JRl {
    public final AnonymousClass9J6 A00;
    public final BBV A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C52400GQz(AnonymousClass9J6 r2, BBV bbv, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(imageUrl, 1);
        this.A03 = imageUrl;
        this.A02 = imageUrl2;
        this.A01 = bbv;
        this.A05 = z;
        this.A07 = z2;
        this.A04 = num;
        this.A06 = z3;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52400GQz) {
                C52400GQz gQz = (C52400GQz) obj;
                if (!0qQ.A0K(this.A03, gQz.A03) || !0qQ.A0K(this.A02, gQz.A02) || !0qQ.A0K(this.A01, gQz.A01) || this.A05 != gQz.A05 || this.A07 != gQz.A07 || !0qQ.A0K(this.A04, gQz.A04) || this.A06 != gQz.A06 || !0qQ.A0K(this.A00, gQz.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31);
        return AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A07, A09) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
