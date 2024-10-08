package X;

/* renamed from: X.4RN  reason: invalid class name */
public abstract class AnonymousClass4RN {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass4RN)) {
            return false;
        }
        AnonymousClass4RN r7 = (AnonymousClass4RN) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A02 == r7.A02 && this.A04 == r7.A04;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }

    public AnonymousClass4RN(AnonymousClass4RG r3) {
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A03 = r3.A03;
        this.A02 = r3.A02;
        this.A04 = r3.A04;
    }
}
