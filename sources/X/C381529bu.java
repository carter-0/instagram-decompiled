package X;

/* renamed from: X.9bu  reason: invalid class name and case insensitive filesystem */
public final class C381529bu extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final C376429Hy A03;
    public final C376429Hy A04;
    public final C391109sM A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381529bu) {
                C381529bu r5 = (C381529bu) obj;
                if (!(this.A05 == r5.A05 && this.A02 == r5.A02 && 0qQ.A0K(this.A03, r5.A03) && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && 0qQ.A0K(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A03, (AnonymousClass7TE.A0K(this.A05) + this.A02) * 31), this.A00), this.A01));
    }

    public C381529bu(C376429Hy r1, C376429Hy r2, C391109sM r3, float f, float f2, int i) {
        this.A05 = r3;
        this.A02 = i;
        this.A03 = r1;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = r2;
    }
}
