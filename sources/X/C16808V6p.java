package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.V6p  reason: case insensitive filesystem */
public abstract class C16808V6p {
    public static final C20972X7c A00(Resources resources, Drawable drawable, int i) {
        C20972X7c wKx;
        AnonymousClass7TG.A1N(resources, drawable);
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            0qQ.A07(bitmap);
            wKx = new C19091WKy(resources, bitmap, i);
        } else {
            wKx = new C19090WKx(drawable, i);
        }
        return wKx;
    }
}
