package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class GPA extends Drawable {
    public float A00;
    public int A01 = 0;
    public Paint A02 = AnonymousClass7TE.A0V(1);
    public boolean A03 = true;
    public final Paint A04 = AnonymousClass7TE.A0V(5);
    public final Path A05 = C51965G9l.A0C();

    public final int getOpacity() {
        return -3;
    }

    public final void A00(int i) {
        if (this.A02.getColor() != i) {
            if (i != 0 || this.A01 == 0) {
                this.A02 = AnonymousClass7TE.A0V(1);
            } else {
                this.A02.setAlpha(255);
                this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            this.A02.setColor(i);
            this.A03 = true;
            invalidateSelf();
        }
    }

    public final void A01(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            if (this.A02.getColor() == 0 && this.A01 != 0) {
                this.A02.setAlpha(255);
                this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            this.A03 = true;
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        if (this.A01 == 0) {
            canvas2.drawRect(bounds, this.A02);
            float f = this.A00;
            canvas2.drawRoundRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, f, f, this.A04);
            return;
        }
        if (this.A03) {
            Path path = this.A05;
            path.reset();
            float f2 = this.A00 * 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, this.A00);
            path.arcTo(rectF, 180.0f, 90.0f, true);
            path.lineTo(0.0f, 0.0f);
            path.close();
            this.A03 = false;
        }
        canvas2.drawRect(bounds, this.A04);
        if ((this.A01 & 1) == 0) {
            int save = canvas2.save();
            AnonymousClass7TF.A13(canvas2, bounds);
            canvas2.drawPath(this.A05, this.A02);
            canvas2.restoreToCount(save);
        }
        if ((this.A01 & 8) == 0) {
            int save2 = canvas2.save();
            canvas2.translate((float) bounds.right, (float) bounds.bottom);
            canvas2.rotate(180.0f);
            canvas2.drawPath(this.A05, this.A02);
            canvas2.restoreToCount(save2);
        }
        if ((this.A01 & 4) == 0) {
            int save3 = canvas2.save();
            canvas2.translate((float) bounds.left, (float) bounds.bottom);
            canvas2.rotate(270.0f);
            canvas2.drawPath(this.A05, this.A02);
            canvas2.restoreToCount(save3);
        }
        if ((this.A01 & 2) == 0) {
            int save4 = canvas2.save();
            canvas2.translate((float) bounds.right, (float) bounds.top);
            canvas2.rotate(90.0f);
            canvas2.drawPath(this.A05, this.A02);
            canvas2.restoreToCount(save4);
        }
    }
}
