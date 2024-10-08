package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.0mj  reason: invalid class name */
public final class AnonymousClass0mj extends BitmapDrawable {
    public final /* synthetic */ Bitmap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0mj(Resources resources, Bitmap bitmap, Bitmap bitmap2) {
        super(resources, bitmap);
        this.A00 = bitmap2;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        Bitmap bitmap = this.A00;
        canvas.scale(-1.0f, 1.0f, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        super.draw(canvas);
        canvas.restore();
    }
}
