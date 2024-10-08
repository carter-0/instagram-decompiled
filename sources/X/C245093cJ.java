package X;

/* renamed from: X.3cJ  reason: invalid class name and case insensitive filesystem */
public final class C245093cJ {
    public final float A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C245093cJ)) {
            return false;
        }
        C245093cJ r4 = (C245093cJ) obj;
        Integer num = this.A01;
        if (num != r4.A01) {
            return false;
        }
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0N || Float.compare(this.A00, r4.A00) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.A00);
        switch (this.A01.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return "undefined";
        }
        if (intValue == 1) {
            return Float.toString(this.A00);
        }
        if (intValue != 2) {
            return "auto";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append("%");
        return sb.toString();
    }

    public C245093cJ(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
