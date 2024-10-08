package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Tom  reason: case insensitive filesystem */
public abstract class C14045Tom {
    public static final Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap A0B = AnonymousClass7TF.A0B(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Canvas canvas = new Canvas();
        canvas.setBitmap(A0B);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return A0B;
    }
}
