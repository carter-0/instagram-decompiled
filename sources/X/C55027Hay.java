package X;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.Hay  reason: case insensitive filesystem */
public abstract class C55027Hay {
    public static final void A00(DisplayMetrics displayMetrics, int[] iArr, int i, int i2, boolean z) {
        int i3 = displayMetrics.widthPixels;
        int A05 = C51970G9q.A05(z ? 1 : 0);
        RectF rectF = 0nA.A01;
        int A01 = AnonymousClass1GB.A01(TypedValue.applyDimension(1, (float) A05, displayMetrics));
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        } else if (mode == 1073741824) {
            i3 = size;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            A01 = Math.min(A01, size2);
        } else if (mode2 == 1073741824) {
            A01 = size2;
        }
        iArr[0] = i3;
        iArr[1] = A01;
    }
}
