package X;

import java.util.Arrays;

/* renamed from: X.Wh0  reason: case insensitive filesystem */
public final class C19873Wh0 implements Comparable {
    public final double A00;
    public final double A01;
    public final double A02;
    public final float[] A03 = new float[1];

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(((C19873Wh0) obj).A02, this.A02);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19873Wh0)) {
            return false;
        }
        C19873Wh0 wh0 = (C19873Wh0) obj;
        if (wh0.A00 == this.A00 && wh0.A01 == this.A01 && wh0.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.A00), Double.valueOf(this.A01), Double.valueOf(this.A02)});
    }

    public C19873Wh0(double d, double d2, double d3) {
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
    }
}
