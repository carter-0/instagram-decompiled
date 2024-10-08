package X;

import java.util.Arrays;

public final class VUL {
    public int A00 = 0;
    public float[] A01 = new float[20];
    public long[] A02;

    public VUL() {
        long[] jArr = new long[20];
        this.A02 = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }
}
