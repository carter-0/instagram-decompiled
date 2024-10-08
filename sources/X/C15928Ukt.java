package X;

/* renamed from: X.Ukt  reason: case insensitive filesystem */
public final class C15928Ukt extends V2K {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C61081JwJ A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15928Ukt) {
                C15928Ukt ukt = (C15928Ukt) obj;
                if (!(this.A01 == ukt.A01 && 0qQ.A0K(this.A03, ukt.A03) && this.A02 == ukt.A02 && this.A00 == ukt.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, this.A01 * 31) + this.A02) * 31) + this.A00;
    }

    public C15928Ukt(C61081JwJ jwJ, int i, int i2, int i3) {
        this.A01 = i;
        this.A03 = jwJ;
        this.A02 = i2;
        this.A00 = i3;
    }
}
