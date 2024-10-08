package X;

/* renamed from: X.Jto  reason: case insensitive filesystem */
public final class C60930Jto extends AnonymousClass0T0 {
    public final int A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60930Jto) {
                C60930Jto jto = (C60930Jto) obj;
                if (!(this.A03 == jto.A03 && this.A02 == jto.A02 && this.A00 == jto.A00 && 0qQ.A0K(this.A01, jto.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A03)) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public C60930Jto(Integer num, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A00 = i;
        this.A01 = num;
    }
}
