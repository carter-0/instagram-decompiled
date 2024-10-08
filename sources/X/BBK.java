package X;

public final class BBK extends AnonymousClass0T0 {
    public final float A00;
    public final N4G A01;
    public final N4G A02;
    public final C61081JwJ A03;
    public final Float A04;
    public final Float A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBK) {
                BBK bbk = (BBK) obj;
                if (!0qQ.A0K(this.A06, bbk.A06) || !0qQ.A0K(this.A01, bbk.A01) || !0qQ.A0K(this.A03, bbk.A03) || !0qQ.A0K(this.A04, bbk.A04) || !0qQ.A0K(this.A05, bbk.A05) || Float.compare(this.A00, bbk.A00) != 0 || !0qQ.A0K(this.A02, bbk.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + Float.floatToIntBits(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public BBK(N4G n4g, N4G n4g2, C61081JwJ jwJ, Float f, Float f2, String str, float f3) {
        this.A06 = str;
        this.A01 = n4g;
        this.A03 = jwJ;
        this.A04 = f;
        this.A05 = f2;
        this.A00 = f3;
        this.A02 = n4g2;
    }
}
