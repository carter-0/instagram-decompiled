package X;

/* renamed from: X.8mS  reason: invalid class name and case insensitive filesystem */
public final class C365058mS extends AnonymousClass804 {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C365058mS) {
                C365058mS r5 = (C365058mS) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getTypeName() {
        return "REMIX";
    }

    public final int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return floatToIntBits + i;
    }
}
