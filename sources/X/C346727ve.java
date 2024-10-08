package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.7ve  reason: invalid class name and case insensitive filesystem */
public abstract class C346727ve {
    public static final BitmapDrawable A00(Context context, Drawable drawable, int i, int i2) {
        0qQ.A0B(drawable, 1);
        Bitmap createBitmap = Bitmap.createBitmap((int) 0nA.A04(context, i), (int) 0nA.A04(context, i2), Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
