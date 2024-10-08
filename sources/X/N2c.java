package X;

public final class N2c extends AnonymousClass0T0 {
    public final float A00;
    public final long A01;
    public final C66720MbR A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2c) {
                N2c n2c = (N2c) obj;
                if (!0qQ.A0K(this.A02, n2c.A02) || !0qQ.A0K(this.A03, n2c.A03) || this.A01 != n2c.A01 || Float.compare(this.A00, n2c.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(C51972G9s.A07(this.A01, ((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31), this.A00);
    }

    public N2c(C66720MbR mbR, String str, float f, long j) {
        this.A02 = mbR;
        this.A03 = str;
        this.A01 = j;
        this.A00 = f;
    }
}
