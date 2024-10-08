package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: X.XqK  reason: case insensitive filesystem */
public final class C22004XqK {
    public static final C22004XqK A00 = new Object();

    public static final Bitmap A00(int[] iArr, int i, int i2) {
        int[] iArr2 = iArr;
        int i3 = i;
        if (iArr.length == i * i2) {
            Bitmap A0B = AnonymousClass7TF.A0B(i, i2);
            A0B.setPixels(iArr2, 0, i3, 0, 0, i, i2);
            return A0B;
        }
        throw AnonymousClass7TE.A0z("Check failed.");
    }

    public final Bitmap A02(Bitmap bitmap, float[] fArr) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] <= 0.0f) {
                iArr[i2] = iArr[i2] & 16777215;
            }
        }
        return A00(iArr, bitmap.getWidth(), bitmap.getHeight());
    }

    public final Bitmap A01(Bitmap bitmap, Rect rect, float[] fArr) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        int[] iArr = new int[(width2 * height2)];
        bitmap2.getPixels(iArr, 0, width2, 0, 0, width2, height2);
        Rect rect2 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK);
        for (int i = 0; i < width; i++) {
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = (i2 * width) + i;
                if (fArr[i3] > 0.0f) {
                    rect2.left = Math.min(i, rect2.left);
                    rect2.right = Math.max(i, rect2.right);
                    rect2.top = Math.min(i2, rect2.top);
                    rect2.bottom = Math.max(i2, rect2.bottom);
                } else {
                    iArr[i3] = iArr[i3] & 16777215;
                }
            }
        }
        if (rect2.left == Integer.MAX_VALUE) {
            return A00(iArr, bitmap2.getWidth(), bitmap2.getHeight());
        }
        Rect rect3 = rect;
        if (rect != null) {
            if (!Rect.intersects(rect2, rect3)) {
                return bitmap2;
            }
            rect2.set(Math.max(rect2.left, rect3.left), Math.max(rect2.top, rect3.top), Math.min(rect2.right, rect3.right), Math.min(rect2.bottom, rect3.bottom));
        }
        int width3 = rect2.width();
        int height3 = rect2.height();
        int[] iArr2 = new int[(width3 * height3)];
        for (int i4 = 0; i4 < width3; i4++) {
            for (int i5 = 0; i5 < height3; i5++) {
                iArr2[(i5 * width3) + i4] = iArr[rect2.left + i4 + ((rect2.top + i5) * width)];
            }
        }
        return A00(iArr2, width3, height3);
    }
}
