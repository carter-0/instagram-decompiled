package X;

import android.graphics.RectF;

public final class I4V {
    public final long A00;

    public static RectF A01(float f, float f2, long j) {
        return new RectF(f, f2, f + Float.intBitsToFloat((int) (j >> 32)), f2 + A00(j));
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof I4V) || j != ((I4V) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        return 002.A0K("Size(packedValue=", ')', this.A00);
    }

    public /* synthetic */ I4V(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        return C51972G9s.A00(j);
    }
}
