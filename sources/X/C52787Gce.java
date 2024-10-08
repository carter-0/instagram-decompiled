package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gce  reason: case insensitive filesystem */
public final class C52787Gce extends Drawable {
    public float A00;
    public int A01 = 0;
    public boolean A02 = true;
    public final Paint A03 = AnonymousClass7TE.A0V(5);
    public final Path A04 = C51965G9l.A0C();

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        if (this.A02) {
            Path path = this.A04;
            path.reset();
            float f = this.A00 * 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f, f);
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, this.A00);
            path.arcTo(rectF, 180.0f, 90.0f, true);
            path.lineTo(0.0f, 0.0f);
            path.close();
            this.A02 = false;
        }
        Rect bounds = getBounds();
        if ((this.A01 & 1) == 0) {
            int save = canvas.save();
            AnonymousClass7TF.A13(canvas, bounds);
            canvas.drawPath(this.A04, this.A03);
            canvas.restoreToCount(save);
        }
        if ((this.A01 & 8) == 0) {
            int save2 = canvas.save();
            canvas.translate((float) bounds.right, (float) bounds.bottom);
            canvas.rotate(180.0f);
            canvas.drawPath(this.A04, this.A03);
            canvas.restoreToCount(save2);
        }
        if ((this.A01 & 4) == 0) {
            int save3 = canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.bottom);
            canvas.rotate(270.0f);
            canvas.drawPath(this.A04, this.A03);
            canvas.restoreToCount(save3);
        }
        if ((this.A01 & 2) == 0) {
            int save4 = canvas.save();
            canvas.translate((float) bounds.right, (float) bounds.top);
            canvas.rotate(90.0f);
            canvas.drawPath(this.A04, this.A03);
            canvas.restoreToCount(save4);
        }
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }
}
