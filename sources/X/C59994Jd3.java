package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jd3  reason: case insensitive filesystem */
public final class C59994Jd3 extends Drawable {
    public final Bitmap A00;
    public final Bitmap A01;
    public final Paint A02 = JTO.A0C();

    public final void draw(Canvas canvas) {
        int i;
        0qQ.A0B(canvas, 0);
        float centerX = (float) getBounds().centerX();
        float centerY = (float) getBounds().centerY();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Matrix A0U = AnonymousClass7TE.A0U();
            A0U.setRotate(3.0f, ((float) (bitmap.getWidth() / 2)) + centerX, ((float) (bitmap.getHeight() / 2)) + centerY);
            A0U.postTranslate(12.0f, 0.0f);
            i = canvas.save();
            canvas.concat(A0U);
            try {
                A00(bitmap, canvas);
            } finally {
                canvas.restoreToCount(i);
            }
        }
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            i = canvas.save();
            canvas.rotate(-7.0f, centerX - ((float) (bitmap2.getWidth() / 2)), centerY + ((float) (bitmap2.getHeight() / 2)));
            A00(bitmap2, canvas);
            canvas.restoreToCount(i);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return (int) (((double) bitmap.getHeight()) * 1.1d);
        }
        return 0;
    }

    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return (int) (((double) bitmap.getHeight()) * 1.1d);
        }
        return 0;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public final void setTint(int i) {
        this.A02.setColorFilter(C9162RRn.A00(AnonymousClass05K.A1I, i));
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (colorStateList == null) {
            this.A02.setColorFilter((ColorFilter) null);
        } else {
            setTint(colorStateList.getDefaultColor());
        }
    }

    public C59994Jd3(Bitmap bitmap, Bitmap bitmap2) {
        this.A01 = bitmap;
        this.A00 = bitmap2;
    }

    private final void A00(Bitmap bitmap, Canvas canvas) {
        canvas.drawBitmap(bitmap, ((float) getBounds().centerX()) - (JTO.A02(bitmap) / 2.0f), ((float) getBounds().centerY()) - (JTO.A01(bitmap) / 2.0f), this.A02);
    }
}
