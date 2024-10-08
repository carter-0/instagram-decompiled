package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;

public final class U1H extends Drawable implements Drawable.Callback {
    public int A00 = -1;
    public Shader A01;
    public final Paint A02;
    public final Resources A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final Canvas A06;

    public U1H(Context context, int i, int i2, int i3) {
        Resources A0A = AnonymousClass7TF.A0A(context);
        this.A03 = A0A;
        Bitmap A002 = 0fO.A00(AnonymousClass6MX.A00(A0A, i), i2, i3, false);
        0qQ.A07(A002);
        this.A04 = A002;
        Bitmap A0B = AnonymousClass7TF.A0B(A002.getWidth(), A002.getHeight());
        this.A05 = A0B;
        this.A06 = new Canvas(A0B);
        Paint paint = new Paint(1);
        paint.setAlpha(255);
        this.A02 = paint;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Shader shader = this.A01;
        Paint paint = this.A02;
        if (shader != null) {
            paint.setShader(shader);
        } else {
            paint.setColor(C51973G9u.A01(this.A00, paint.getAlpha()));
        }
        Bitmap bitmap = this.A05;
        bitmap.eraseColor(0);
        Canvas canvas2 = this.A06;
        canvas2.drawBitmap(this.A04, 0.0f, 0.0f, paint);
        Pxi.A0v(paint, PorterDuff.Mode.SRC_ATOP);
        canvas2.save();
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode((Xfermode) null);
        paint.setShader((Shader) null);
        canvas.drawBitmap(bitmap, (float) getBounds().left, (float) getBounds().top, paint);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
