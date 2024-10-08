package X;

public final class IIV implements AnonymousClass2WY {
    public final float A00;
    public final Integer A01;

    public final void ABy(2TC r8, 2V1 r9) {
        long j;
        int i;
        long j2;
        2TG r4;
        long j3;
        long j4;
        long j5;
        0qQ.A0B(r8, 1);
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            float f = this.A00;
            2TG A02 = 2TC.A02(r8);
            A02.A00 = f;
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            long j6 = A02.A0F;
            if (i2 == 0) {
                j = j6 & -1048577;
            } else {
                j = j6 | 1048576;
            }
            A02.A0F = j;
            int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            int i4 = r8.A01;
            i = i4 | 8;
            if (i3 == 0) {
                i = i4 & -9;
            }
        } else if (intValue != 1) {
            if (intValue == 2) {
                float f2 = this.A00;
                r8.A08 = true;
                r4 = 2TC.A02(r8);
                r4.A02 = f2;
                j3 = r4.A0F;
                j4 = 33554432;
            } else if (intValue != 3) {
                float f3 = this.A00;
                2TG A022 = 2TC.A02(r8);
                A022.A04 = f3;
                int i5 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
                long j7 = A022.A0F;
                if (i5 == 0) {
                    j5 = j7 & -524289;
                } else {
                    j5 = j7 | 524288;
                }
                A022.A0F = j5;
                int i6 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
                int i7 = r8.A01;
                i = i7 | 4;
                if (i6 == 0) {
                    i = i7 & -5;
                }
            } else {
                float f4 = this.A00;
                r8.A08 = true;
                r4 = 2TC.A02(r8);
                r4.A03 = f4;
                j3 = r4.A0F;
                j4 = 67108864;
            }
            r4.A0F = j3 | j4;
            return;
        } else {
            float f5 = this.A00;
            2TG A023 = 2TC.A02(r8);
            A023.A01 = f5;
            int i8 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
            long j8 = A023.A0F;
            if (i8 == 0) {
                j2 = j8 & -2097153;
            } else {
                j2 = j8 | 2097152;
            }
            A023.A0F = j2;
            int i9 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
            int i10 = r8.A01;
            i = i10 | 16;
            if (i9 == 0) {
                i = i10 & -17;
            }
        }
        r8.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IIV) {
                IIV iiv = (IIV) obj;
                if (!(this.A01 == iiv.A01 && Float.compare(this.A00, iiv.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static 2WX A00(2WX r2, Integer num, float f) {
        return new 2WX(r2, new IIV(num, f));
    }

    public final int hashCode() {
        Integer num = this.A01;
        return C51966G9m.A02(C51971G9r.A0D(num, HSM.A00(num)) * 31, this.A00);
    }

    public IIV(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FloatStyleItem(field=");
        A1A.append(HSM.A00(this.A01));
        A1A.append(", value=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
