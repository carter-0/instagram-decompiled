package X;

/* renamed from: X.5VN  reason: invalid class name */
public final class AnonymousClass5VN {
    public static final AnonymousClass5VN A04 = new AnonymousClass5VN(0.0f, 0.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5VN) {
                AnonymousClass5VN r5 = (AnonymousClass5VN) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A00);
    }

    public final long A00() {
        float f = this.A01;
        float f2 = this.A03;
        return C289325dP.A00(f + ((this.A02 - f) / 2.0f), f2 + ((this.A00 - f2) / 2.0f));
    }

    public final long A01() {
        return C288015bE.A00(this.A02 - this.A01, this.A00 - this.A03);
    }

    public final AnonymousClass5VN A02(float f, float f2) {
        return new AnonymousClass5VN(this.A01 + f, this.A03 + f2, this.A02 + f, this.A00 + f2);
    }

    public final AnonymousClass5VN A03(long j) {
        float f = this.A01;
        float A012 = C289295dM.A01(j);
        float f2 = this.A03;
        float A022 = C289295dM.A02(j);
        return new AnonymousClass5VN(f + A012, f2 + A022, this.A02 + A012, this.A00 + A022);
    }

    public final AnonymousClass5VN A04(AnonymousClass5VN r6) {
        return new AnonymousClass5VN(Math.max(this.A01, r6.A01), Math.max(this.A03, r6.A03), Math.min(this.A02, r6.A02), Math.min(this.A00, r6.A00));
    }

    public final boolean A05(AnonymousClass5VN r4) {
        if (this.A02 <= r4.A01 || r4.A02 <= this.A01 || this.A00 <= r4.A03 || r4.A00 <= this.A03) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A17("Rect.fromLTRB(", C392309ub.A00(this.A01), ", ", C392309ub.A00(this.A03), ", ", C392309ub.A00(this.A02), ", ", C392309ub.A00(this.A00), ')');
    }

    public AnonymousClass5VN(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }
}
