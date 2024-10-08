package X;

import android.graphics.Rect;

public abstract class S9P {
    public static final void A00(Rect rect, float f, float f2, float f3) {
        0qQ.A0B(rect, 0);
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        float f4 = ((float) width) * f3;
        int i3 = (int) (((float) i) - f4);
        rect.left = i3;
        float f5 = (float) height;
        int i4 = (int) (((float) i2) - (f5 * f));
        rect.top = i4;
        rect.right = (int) (((float) (i3 + width)) + (f4 * 2.0f));
        rect.bottom = (int) (((float) (i4 + height)) + (f5 * (f + f2)));
    }

    public static final void A01(Rect rect, int i, int i2) {
        float f;
        float f2;
        float f3;
        0qQ.A0B(rect, 0);
        float f4 = (float) i;
        if (i < i2) {
            f = 0.8f;
        } else {
            f = 0.66f;
            if (i > i2) {
                float f5 = ((float) i2) * 0.9f;
                f2 = f5;
                f3 = (3.0f * f5) / 4.0f;
                float f6 = (float) (i / 2);
                float f7 = f3 / 2.0f;
                float f8 = (float) (i2 / 2);
                float f9 = f2 / 2.0f;
                rect.set((int) (f6 - f7), (int) (f8 - f9), (int) (f6 + f7), (int) (f8 + f9));
            }
        }
        f3 = f4 * f;
        f2 = (4.0f * f3) / 3.0f;
        float f62 = (float) (i / 2);
        float f72 = f3 / 2.0f;
        float f82 = (float) (i2 / 2);
        float f92 = f2 / 2.0f;
        rect.set((int) (f62 - f72), (int) (f82 - f92), (int) (f62 + f72), (int) (f82 + f92));
    }
}
