package X;

import java.util.Arrays;

public final class B0R extends C392259uT {
    public int A00;
    public float[] A01;

    public final void A02(int i) {
        float[] fArr = this.A01;
        int length = fArr.length;
        if (length < i) {
            int i2 = length * 2;
            if (i < i2) {
                i = i2;
            }
            float[] copyOf = Arrays.copyOf(fArr, i);
            0qQ.A07(copyOf);
            this.A01 = copyOf;
        }
    }
}
