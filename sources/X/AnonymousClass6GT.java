package X;

/* renamed from: X.6GT  reason: invalid class name */
public final class AnonymousClass6GT {
    public static final AnonymousClass6GT A08 = AnonymousClass6GU.A00(0.0f, 0.0f, 0.0f, 0.0f, AnonymousClass6GS.A00);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6GT) {
                AnonymousClass6GT r9 = (AnonymousClass6GT) obj;
                if (Float.compare(this.A01, r9.A01) == 0 && Float.compare(this.A03, r9.A03) == 0 && Float.compare(this.A02, r9.A02) == 0 && Float.compare(this.A00, r9.A00) == 0) {
                    long j = this.A06;
                    long j2 = r9.A06;
                    long j3 = AnonymousClass6GS.A00;
                    if (!(j == j2 && this.A07 == r9.A07 && this.A05 == r9.A05 && this.A04 == r9.A04)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A06;
        long j2 = AnonymousClass6GS.A00;
        long j3 = this.A07;
        long j4 = this.A05;
        long j5 = this.A04;
        return (((((((((((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A00)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb;
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A05;
        long j4 = this.A04;
        String A15 = 002.A15(C392309ub.A00(this.A01), ", ", C392309ub.A00(this.A03), ", ", C392309ub.A00(this.A02), ", ", C392309ub.A00(this.A00));
        long j5 = AnonymousClass6GS.A00;
        boolean z = false;
        if (j == j2) {
            z = true;
        }
        if (z && j2 == j3 && j3 == j4) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float A002 = AnonymousClass6GS.A00(j);
            int i = (intBitsToFloat > A002 ? 1 : (intBitsToFloat == A002 ? 0 : -1));
            sb = new StringBuilder();
            sb.append("RoundRect(rect=");
            if (i == 0) {
                sb.append(A15);
                sb.append(", radius=");
            } else {
                sb.append(A15);
                sb.append(", x=");
                sb.append(C392309ub.A00(intBitsToFloat));
                sb.append(", y=");
                intBitsToFloat = A002;
            }
            sb.append(C392309ub.A00(intBitsToFloat));
        } else {
            sb = new StringBuilder();
            sb.append("RoundRect(rect=");
            sb.append(A15);
            sb.append(", topLeft=");
            sb.append(AnonymousClass6GS.A01(j));
            sb.append(", topRight=");
            sb.append(AnonymousClass6GS.A01(j2));
            sb.append(", bottomRight=");
            sb.append(AnonymousClass6GS.A01(j3));
            sb.append(", bottomLeft=");
            sb.append(AnonymousClass6GS.A01(j4));
        }
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass6GT(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
    }
}
