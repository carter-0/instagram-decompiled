package X;

import android.view.View;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.6TI  reason: invalid class name */
public abstract class AnonymousClass6TI {
    public static final AnonymousClass2Ta A00;
    public static final LayoutOutput A01;

    static {
        LayoutOutput layoutOutput = new LayoutOutput(0);
        A01 = layoutOutput;
        A00 = new AnonymousClass6TK(layoutOutput, (2Th) null, (Integer[]) null);
    }

    public static float[] A00(float f, float f2, float f3, float f4, float f5) {
        float[] fArr;
        float f6 = 0.0f;
        if (!Float.isNaN(f)) {
            if (!Float.isNaN(f4)) {
                f6 = f4;
            }
            float f7 = f5;
            if (Float.isNaN(f5)) {
                f7 = Float.POSITIVE_INFINITY;
            }
            if (f >= f6 && f <= f7) {
                return new float[]{f, f};
            }
            fArr = new float[2];
            fArr[0] = f4;
        } else if (!Float.isNaN(f2)) {
            if (Float.isNaN(f4)) {
                f4 = 0.0f;
            }
            fArr = new float[2];
            fArr[0] = Math.max(f2, f4);
        } else {
            if (!Float.isNaN(f3)) {
                return new float[]{f4, f3};
            }
            fArr = new float[2];
            fArr[0] = f4;
        }
        fArr[1] = f5;
        return fArr;
    }

    public static float[] A01(int i) {
        float[] fArr;
        float size = (float) View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            fArr = new float[2];
            fArr[0] = size;
        } else {
            fArr = new float[]{Float.NaN, Float.NaN};
            if (mode == Integer.MIN_VALUE) {
                fArr[0] = 0.0f;
            } else {
                return fArr;
            }
        }
        fArr[1] = size;
        return fArr;
    }
}
