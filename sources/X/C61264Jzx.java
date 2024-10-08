package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.Jzx  reason: case insensitive filesystem */
public final class C61264Jzx extends AnonymousClass0T0 implements Comparable {
    public final int A00;
    public final Medium A01;
    public final 1Xj A02;
    public final Integer A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61264Jzx) {
                C61264Jzx jzx = (C61264Jzx) obj;
                if (!0qQ.A0K(this.A02, jzx.A02) || !0qQ.A0K(this.A01, jzx.A01) || !0qQ.A0K(this.A04, jzx.A04) || this.A03 != jzx.A03 || this.A00 != jzx.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C61264Jzx jzx = (C61264Jzx) obj;
        0qQ.A0B(jzx, 0);
        return 0qQ.A00(this.A00, jzx.A00);
    }

    public final int hashCode() {
        String str;
        int A08 = AnonymousClass7TF.A08(this.A04, ((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "MEDIA";
        } else {
            str = "MEDIUM";
        }
        return C51971G9r.A0F(str, intValue, A08) + this.A00;
    }

    public C61264Jzx(Medium medium, 1Xj r2, Integer num, String str, int i) {
        this.A02 = r2;
        this.A01 = medium;
        this.A04 = str;
        this.A03 = num;
        this.A00 = i;
    }
}
