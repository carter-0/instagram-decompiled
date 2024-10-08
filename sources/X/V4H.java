package X;

import java.util.Arrays;

public final class V4H {
    public float[] A00;
    public int[] A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof V4H)) {
            return false;
        }
        V4H v4h = (V4H) obj;
        if (!Arrays.equals(this.A01, v4h.A01) || !Arrays.equals(this.A00, v4h.A00)) {
            return false;
        }
        return true;
    }
}
