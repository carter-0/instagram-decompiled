package X;

import android.graphics.Bitmap;
import android.graphics.Color;

/* renamed from: X.XqC  reason: case insensitive filesystem */
public final class C22002XqC {
    public static final C22002XqC A00 = new Object();

    public static final Bitmap A00(float[] fArr, int i, int i2) {
        int i3 = i;
        int i4 = i * i2;
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            if (fArr[i5] > 0.0f) {
                i6 = -1;
            }
            iArr[i5] = i6;
        }
        Bitmap A0B = AnonymousClass7TF.A0B(i, i2);
        A0B.setPixels(iArr, 0, i3, 0, 0, i, i2);
        return A0B;
    }

    public final Bitmap A01(Bitmap bitmap, float[] fArr) {
        float f;
        boolean z;
        int i;
        int i2;
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int length = fArr.length;
        int i3 = width * height;
        if (i3 != length) {
            return bitmap;
        }
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        int i4 = width2 * height2;
        int[] iArr = new int[i4];
        bitmap2.getPixels(iArr, 0, width2, 0, 0, width2, height2);
        for (int i5 = 0; i5 < width; i5++) {
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = (i6 * width) + i5;
                int min = Math.min(i7, length - 1);
                int i8 = -1;
                boolean z2 = false;
                do {
                    int i9 = -1;
                    do {
                        int i10 = i5 + i8;
                        if (i10 < 0 || i10 >= width || (i = i6 + i9) < 0 || i >= height || (i2 = i10 + (i * width)) >= length) {
                            f = 0.0f;
                        } else {
                            f = fArr[i2];
                        }
                        if (f < fArr[min]) {
                            z2 = true;
                        }
                        i9++;
                    } while (i9 < 2);
                    i8++;
                    z = true;
                } while (i8 < 2);
                float f2 = fArr[min];
                if (f2 <= 0.0f) {
                    z = false;
                }
                int i11 = iArr[i7];
                int i12 = (int) (255.0f * f2);
                int i13 = i12;
                int i14 = i12;
                int i15 = i12;
                if (!z2) {
                    i13 = (i11 >> 16) & 255;
                    i14 = 255 & (i11 >> 8);
                    i15 = i11 & 255;
                }
                if (!z) {
                    i12 = 100;
                }
                iArr[i7] = Color.argb(i12, i13, i14, i15);
            }
        }
        if (i4 == i3) {
            Bitmap A0B = AnonymousClass7TF.A0B(width, height);
            A0B.setPixels(iArr, 0, width, 0, 0, width, height);
            return A0B;
        }
        throw AnonymousClass7TE.A0z("Check failed.");
    }
}
