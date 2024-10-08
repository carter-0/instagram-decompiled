package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.SAa  reason: case insensitive filesystem */
public abstract class C11099SAa {
    public static final boolean A01(int i, int i2, int i3, int i4, int[] iArr) {
        if (iArr.length != i * i2 || i3 < 0 || i3 >= i2 || i4 < 0 || i4 >= i || ((float) Color.alpha(iArr[(i3 * i) + i4])) <= 0.0f) {
            return false;
        }
        return true;
    }

    public static final void A00(Drawable drawable, C13499TbQ tbQ) {
        Drawable drawable2 = drawable;
        S0s s0s = new S0s();
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ALPHA_8);
        0qQ.A07(createBitmap);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        int[] iArr = new int[(width * height)];
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        Rect A0W = AnonymousClass7TE.A0W();
        drawable2.copyBounds(A0W);
        Canvas A0B = JTO.A0B(createBitmap);
        A0B.translate(-((float) A0W.left), -((float) A0W.top));
        A0B.save();
        float min = Math.min(Math.min(100.0f / ((float) intrinsicWidth), 100.0f / ((float) intrinsicHeight)), 1.0f);
        A0B.scale(min, min, (float) A0W.left, (float) A0W.top);
        if (drawable2 instanceof AnonymousClass5MK) {
            ((AnonymousClass5MK) drawable2).AQX(A0B);
        } else {
            drawable2.draw(A0B);
        }
        createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        A0B.restore();
        createBitmap.recycle();
        0nY.A00().ATE(new RAX(s0s, tbQ, iArr, min, width, height));
    }
}
