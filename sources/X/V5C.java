package X;

import android.graphics.Rect;

public abstract class V5C {
    public static final Rect[] A00(int i, int i2, int i3, boolean z) {
        Rect[] rectArr = new Rect[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            rectArr[i5] = new Rect();
        }
        if (i2 != 0) {
            double d = ((double) i2) / ((double) i3);
            while (i4 < i3) {
                int A00 = AnonymousClass1GB.A00(((double) i4) * d);
                int i6 = i4 + 1;
                int A002 = i2 - AnonymousClass1GB.A00(((double) i6) * d);
                Rect rect = rectArr[i4];
                if (i != 1) {
                    rect.top = A00;
                    rect.bottom = A002;
                } else if (!z) {
                    rect.left = A00;
                    rect.right = A002;
                } else {
                    rect.left = A002;
                    rect.right = A00;
                }
                i4 = i6;
            }
        }
        return rectArr;
    }
}
