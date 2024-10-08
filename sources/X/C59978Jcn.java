package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jcn  reason: case insensitive filesystem */
public final class C59978Jcn extends Drawable {
    public final int A00;
    public final int A01;
    public final Path A02;
    public final Bitmap A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        AnonymousClass7TG.A0z(canvas, this);
        canvas.clipPath(this.A02);
        Bitmap bitmap = this.A03;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = this.A01;
        int i2 = this.A00;
        boolean z = 1MF.A02;
        Matrix A0U = AnonymousClass7TE.A0U();
        1MF.A0J(A0U, width, height, i, i2, 0, false);
        canvas.drawBitmap(bitmap, A0U, (Paint) null);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public C59978Jcn(Bitmap bitmap, Path path, int i, int i2) {
        this.A03 = bitmap;
        this.A02 = path;
        this.A01 = i;
        this.A00 = i2;
        Matrix A0U = AnonymousClass7TE.A0U();
        RectF A0Y = AnonymousClass7TE.A0Y();
        Path path2 = this.A02;
        path2.computeBounds(A0Y, true);
        float max = Math.max(A0Y.width(), A0Y.height());
        A0U.setScale(((float) this.A01) / max, ((float) this.A00) / max);
        A0U.postTranslate(-A0Y.left, -A0Y.top);
        path2.transform(A0U);
    }
}
