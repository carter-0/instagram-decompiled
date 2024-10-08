package X;

/* renamed from: X.7Cr  reason: invalid class name and case insensitive filesystem */
public final class C327907Cr extends AnonymousClass0T0 {
    public final float A00;
    public final AnonymousClass9IV A01;
    public final C327897Cq A02;
    public final Integer A03;
    public final Integer A04;

    public C327907Cr(AnonymousClass9IV r2, C327897Cq r3, Integer num, Integer num2, float f) {
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = f;
        this.A03 = num;
        this.A04 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C327907Cr) {
                C327907Cr r5 = (C327907Cr) obj;
                if (!(this.A02 == r5.A02 && 0qQ.A0K(this.A01, r5.A01) && Float.compare(this.A00, r5.A00) == 0 && 0qQ.A0K(this.A03, r5.A03) && this.A04 == r5.A04)) {
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
        int hashCode3 = this.A02.hashCode() * 31;
        AnonymousClass9IV r0 = this.A01;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int floatToIntBits = (((hashCode3 + hashCode) * 31) + Float.floatToIntBits(this.A00)) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = (floatToIntBits + hashCode2) * 31;
        Integer num2 = this.A04;
        if (num2 != null) {
            i = C226302gX.A02(num2).hashCode() + num2.intValue();
        }
        return i2 + i;
    }
}
