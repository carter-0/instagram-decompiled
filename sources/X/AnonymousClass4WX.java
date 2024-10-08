package X;

/* renamed from: X.4WX  reason: invalid class name */
public final class AnonymousClass4WX extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final C376509Ig A03;
    public final AnonymousClass4WV A04;
    public final C245853da A05;
    public final AnonymousClass3TO A06;
    public final Float A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final AnonymousClass3W1 A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WX) {
                AnonymousClass4WX r5 = (AnonymousClass4WX) obj;
                if (!(this.A01 == r5.A01 && this.A0C == r5.A0C && 0qQ.A0K(this.A07, r5.A07) && this.A09 == r5.A09 && 0qQ.A0K(this.A08, r5.A08) && this.A04 == r5.A04 && Float.compare(this.A00, r5.A00) == 0 && this.A0B == r5.A0B && this.A0A == r5.A0A && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A05 == r5.A05 && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A0D, r5.A0D))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4WX(C376509Ig r2, AnonymousClass3W1 r3, AnonymousClass4WV r4, C245853da r5, AnonymousClass3TO r6, Float f, Integer num, float f2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(r6, 11);
        0qQ.A0B(r5, 12);
        this.A01 = i;
        this.A0C = z;
        this.A07 = f;
        this.A09 = z2;
        this.A08 = num;
        this.A04 = r4;
        this.A00 = f2;
        this.A0B = z3;
        this.A0A = z4;
        this.A02 = i2;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r2;
        this.A0D = r3;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A01 * 31;
        int i2 = 1237;
        if (this.A0C) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        Float f = this.A07;
        int i4 = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        Integer num = this.A08;
        if (num != null) {
            i4 = num.hashCode();
        }
        int hashCode2 = (((((i7 + i4) * 31) + this.A04.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (hashCode2 + i8) * 31;
        int i10 = 1237;
        if (this.A0A) {
            i10 = 1231;
        }
        return ((((((((((i9 + i10) * 31) + this.A02) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A0D.hashCode();
    }
}
