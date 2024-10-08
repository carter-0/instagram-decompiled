package X;

/* renamed from: X.Ht6  reason: case insensitive filesystem */
public final class C56119Ht6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56119Ht6) {
                C56119Ht6 ht6 = (C56119Ht6) obj;
                if (!(this.A02 == ht6.A02 && this.A01 == ht6.A01 && this.A03 == ht6.A03 && Float.compare(this.A00, ht6.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(((((this.A02 * 31) + this.A01) * 31) + this.A03) * 31, this.A00);
    }

    public C56119Ht6(float f, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BodyParametricStyleParameters(thumbColor=");
        A1A.append(this.A02);
        A1A.append(", filledTrackColor=");
        A1A.append(this.A01);
        A1A.append(", unfilledTrackColor=");
        A1A.append(this.A03);
        A1A.append(", stepSize=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
