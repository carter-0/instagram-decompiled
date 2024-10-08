package X;

/* renamed from: X.VvU  reason: case insensitive filesystem */
public abstract class C18634VvU {
    public final float A00;
    public final float A01;

    public static float A00(C18634VvU vvU, C18634VvU vvU2) {
        float f = vvU.A00;
        float f2 = vvU.A01;
        double d = (double) (f - vvU2.A00);
        double d2 = (double) (f2 - vvU2.A01);
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18634VvU)) {
            return false;
        }
        C18634VvU vvU = (C18634VvU) obj;
        if (this.A00 == vvU.A00 && this.A01 == vvU.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(this.A00);
        sb.append(',');
        sb.append(this.A01);
        return AnonymousClass7TG.A0p(sb);
    }

    public C18634VvU(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
