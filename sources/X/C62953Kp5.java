package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Kp5  reason: case insensitive filesystem */
public abstract class C62953Kp5 {
    public static final Bitmap A00(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw AnonymousClass7TE.A0w("bitmap is null");
            } else if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                return bitmapDrawable.getBitmap();
            } else {
                return 0fO.A00(bitmapDrawable.getBitmap(), i, i2, true);
            }
        } else {
            Rect bounds = drawable.getBounds();
            int i3 = bounds.left;
            int i4 = bounds.top;
            int i5 = bounds.right;
            int i6 = bounds.bottom;
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(JTO.A0B(createBitmap));
            drawable.setBounds(i3, i4, i5, i6);
            return createBitmap;
        }
    }
}
