package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0c  reason: case insensitive filesystem */
public final class C14656U0c extends Drawable {
    public final Paint A00;
    public final Path A01 = new Path();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Path path = this.A01;
        path.addCircle(((float) AnonymousClass7TF.A06(this)) / 2.0f, ((float) JTP.A06(this)) / 2.0f, ((float) AnonymousClass7TF.A06(this)) / 2.0f, Path.Direction.CW);
        canvas.save();
        AnonymousClass7TG.A0z(canvas, this);
        canvas.drawPath(path, this.A00);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C14656U0c() {
        Paint paint = new Paint(3);
        C13988Tno.A0p(-1, paint);
        this.A00 = paint;
    }
}
