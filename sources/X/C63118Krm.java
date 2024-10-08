package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Krm  reason: case insensitive filesystem */
public abstract class C63118Krm {
    public static final Path A00(float f, float f2, float f3, float f4, float f5, int i) {
        Path A0C = C51965G9l.A0C();
        float[] fArr = new float[8];
        if ((i & 1) == 1) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if ((i & 2) == 2) {
            fArr[2] = f;
            fArr[3] = f;
        }
        if ((i & 4) == 4) {
            fArr[4] = f;
            fArr[5] = f;
        }
        if ((i & 8) == 8) {
            fArr[6] = f;
            fArr[7] = f;
        }
        A0C.addRoundRect(new RectF(f2, f3, f4, f5), fArr, Path.Direction.CW);
        return A0C;
    }
}
