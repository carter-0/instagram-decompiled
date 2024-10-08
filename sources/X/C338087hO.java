package X;

/* renamed from: X.7hO  reason: invalid class name and case insensitive filesystem */
public final class C338087hO extends AnonymousClass0T0 {
    public static final C338087hO A0D = new C338087hO((2Sa) null, (C338587iC) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, false);
    public final float A00;
    public final int A01;
    public final int A02;
    public final 2Sa A03;
    public final C338587iC A04;
    public final Boolean A05;
    public final Integer A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C338087hO) {
                C338087hO r5 = (C338087hO) obj;
                if (!(0qQ.A0K(this.A03, r5.A03) && this.A09 == r5.A09 && this.A07 == r5.A07 && this.A0B == r5.A0B && this.A0A == r5.A0A && this.A01 == r5.A01 && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A06, r5.A06) && this.A08 == r5.A08 && Float.compare(this.A00, r5.A00) == 0 && 0qQ.A0K(this.A05, r5.A05) && this.A0C == r5.A0C && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        2Sa r0 = this.A03;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31 * 31;
        int i5 = 1237;
        if (this.A07) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (((i8 + i9) * 31) + this.A01) * 31;
        C338587iC r02 = this.A04;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.A06;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        int i13 = 1237;
        if (this.A08) {
            i13 = 1231;
        }
        int floatToIntBits = (((i12 + i13) * 31 * 31) + Float.floatToIntBits(this.A00)) * 31;
        Boolean bool = this.A05;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i14 = (floatToIntBits + i) * 31;
        int i15 = 1237;
        if (this.A0C) {
            i15 = 1231;
        }
        return ((i14 + i15) * 31) + this.A02;
    }

    public C338087hO(2Sa r3, C338587iC r4, Boolean bool, Integer num, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = r3;
        this.A09 = z;
        this.A07 = z2;
        this.A0B = z3;
        this.A0A = z4;
        this.A01 = i;
        this.A04 = r4;
        this.A06 = num;
        this.A08 = z5;
        this.A00 = f;
        this.A05 = bool;
        this.A0C = z6;
        this.A02 = i2;
        if (num != null && num.intValue() <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Estimated viewport count must be > 0: ");
            sb.append(num);
            throw new IllegalArgumentException(sb.toString());
        } else if (f < 0.0f) {
            throw new IllegalArgumentException(002.A0N("range ratio has to be bigger or equal to 0: ", f));
        }
    }

    public C338087hO() {
        this((2Sa) null, (C338587iC) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, false);
    }
}
