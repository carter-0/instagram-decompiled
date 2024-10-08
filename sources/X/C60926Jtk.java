package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.Jtk  reason: case insensitive filesystem */
public final class C60926Jtk extends AnonymousClass0T0 {
    public final Medium A00;
    public final AnonymousClass3Q2 A01;
    public final boolean A02;
    public final boolean A03;

    public C60926Jtk(Medium medium, AnonymousClass3Q2 r3) {
        0qQ.A0B(medium, 1);
        this.A00 = medium;
        this.A01 = r3;
        this.A02 = medium.A05();
        this.A03 = medium.CeS();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60926Jtk) {
                C60926Jtk jtk = (C60926Jtk) obj;
                if (!0qQ.A0K(this.A00, jtk.A00) || !0qQ.A0K(this.A01, jtk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }
}
