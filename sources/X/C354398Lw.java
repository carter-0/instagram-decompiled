package X;

/* renamed from: X.8Lw  reason: invalid class name and case insensitive filesystem */
public final class C354398Lw extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;

    public C354398Lw(Integer num, float f, int i, int i2) {
        0qQ.A0B(num, 4);
        this.A01 = i;
        this.A02 = i2;
        this.A00 = f;
        this.A03 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C354398Lw) {
                C354398Lw r5 = (C354398Lw) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int floatToIntBits = ((((this.A01 * 31) + this.A02) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "RIGHT";
                break;
            case 2:
                str = "END_NEXT";
                break;
            case 3:
                str = "END_CURRENT";
                break;
            default:
                str = "LEFT";
                break;
        }
        return floatToIntBits + str.hashCode() + intValue;
    }

    public C354398Lw() {
        this(AnonymousClass05K.A0N, 0.0f, 0, 0);
    }
}
