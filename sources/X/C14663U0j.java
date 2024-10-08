package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0j  reason: case insensitive filesystem */
public final class C14663U0j extends Drawable {
    public final Path A00;
    public final Paint A01;
    public final Path A02 = new Path();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawPath(this.A02, this.A01);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Matrix matrix = new Matrix();
        RectF rectF = new RectF();
        Path path = this.A00;
        path.computeBounds(rectF, true);
        float max = Math.max(rectF.width(), rectF.height());
        matrix.setScale(((float) AnonymousClass7TF.A06(this)) / max, ((float) JTP.A06(this)) / max);
        matrix.postTranslate(-rectF.left, -rectF.top);
        path.transform(matrix);
        Path path2 = this.A02;
        path2.reset();
        path2.addRect(new RectF(rect), Path.Direction.CW);
        path2.op(path, Path.Op.DIFFERENCE);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C14663U0j(Path path, int i) {
        this.A00 = path;
        Paint A0D = JTP.A0D();
        AnonymousClass7TE.A1Q(A0D);
        A0D.setColor(i);
        this.A01 = A0D;
    }
}
