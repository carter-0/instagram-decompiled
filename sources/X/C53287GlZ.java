package X;

/* renamed from: X.GlZ  reason: case insensitive filesystem */
public final class C53287GlZ extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C54617HLa A02;
    public final Integer A03;
    public final Integer A04;
    public final AnonymousClass62P A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53287GlZ) {
                C53287GlZ glZ = (C53287GlZ) obj;
                if (this.A02 != glZ.A02 || !0qQ.A0K(this.A05, glZ.A05) || this.A00 != glZ.A00 || !0qQ.A0K(this.A03, glZ.A03) || this.A01 != glZ.A01 || !0qQ.A0K(this.A04, glZ.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0K(this.A02)) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A01) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C53287GlZ(C54617HLa hLa, Integer num, Integer num2, AnonymousClass62P r4, int i, int i2) {
        this.A02 = hLa;
        this.A05 = r4;
        this.A00 = i;
        this.A03 = num;
        this.A01 = i2;
        this.A04 = num2;
    }
}
