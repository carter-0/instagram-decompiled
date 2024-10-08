package X;

import android.net.Uri;

public final class S4T {
    public Uri A00;
    public C249903kY A01;
    public float[] A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            S4T s4t = (S4T) obj;
            this.A02.getClass();
            s4t.A02.getClass();
            float[] fArr = s4t.A02;
            int length = fArr.length;
            float[] fArr2 = this.A02;
            int length2 = fArr2.length;
            if (length == length2) {
                int i = 0;
                while (i < length2) {
                    if (Float.compare(fArr[i], fArr2[i]) == 0) {
                        i++;
                    }
                }
                return 2Ob.A00(this.A00, s4t.A00);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        this.A02.getClass();
        int A0E = C51971G9r.A0E(this.A00);
        int i2 = 0;
        while (true) {
            float[] fArr = this.A02;
            if (i2 >= fArr.length) {
                return A0E;
            }
            int i3 = A0E * 31;
            float f = fArr[i2];
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            A0E = i3 + i;
            i2++;
        }
    }
}
