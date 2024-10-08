package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcg  reason: case insensitive filesystem */
public final class C52789Gcg extends Drawable {
    public Bitmap A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C58294Ipb.A00);
    public final RectF A02 = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.A02, (Paint) this.A01.getValue());
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C52789Gcg(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A02.set((float) i, (float) i2, (float) i3, (float) i4);
    }
}
