package X;

/* renamed from: X.4RO  reason: invalid class name */
public final class AnonymousClass4RO {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public AnonymousClass4RO(float f, float f2, long j, long j2, long j3) {
        this.A04 = j3;
        this.A03 = j2;
        this.A02 = j;
        this.A01 = f2;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass4RO)) {
            return false;
        }
        AnonymousClass4RO r7 = (AnonymousClass4RO) obj;
        return this.A04 == r7.A04 && this.A03 == r7.A03 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00;
    }

    public AnonymousClass4RO(AnonymousClass4RI r9) {
        long j = r9.A04;
        long j2 = r9.A03;
        long j3 = r9.A02;
        float f = r9.A01;
        float f2 = r9.A00;
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = f;
        this.A00 = f2;
    }

    public final int hashCode() {
        int i;
        long j = this.A04;
        long j2 = this.A03;
        long j3 = this.A02;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.A01;
        int i3 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        float f2 = this.A00;
        if (f2 != 0.0f) {
            i3 = Float.floatToIntBits(f2);
        }
        return i4 + i3;
    }
}
