package X;

/* renamed from: X.5d0  reason: invalid class name and case insensitive filesystem */
public final class C289095d0 implements Comparable {
    public final float A00;

    public static final boolean A01(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.A00, ((C289095d0) obj).A00);
    }

    public final boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof C289095d0) || Float.compare(f, ((C289095d0) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C289095d0(float f) {
        this.A00 = f;
    }

    public static String A00(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(".dp");
        return sb.toString();
    }
}
