package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public abstract class VG8 {
    public static final BitmapDrawable A00(Context context, int i) {
        Drawable drawable = context.getResources().getDrawable(i, (Resources.Theme) null);
        Canvas canvas = new Canvas();
        Bitmap A0B = AnonymousClass7TF.A0B(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        canvas.setBitmap(A0B);
        C13989Tnp.A13(drawable);
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), A0B);
    }
}
