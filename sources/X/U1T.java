package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;

public final class U1T extends Drawable implements Choreographer.FrameCallback {
    public int A00;
    public Bitmap A01;
    public boolean A02;
    public long A03;
    public final C20997X8u A04;
    public final Runnable A05;
    public final Paint A06 = new Paint(2);
    public final Rect A07;
    public final RectF A08;
    public final 0ng A09;

    public U1T(C20997X8u x8u) {
        this.A04 = x8u;
        this.A07 = new Rect(0, 0, x8u.getWidth(), x8u.getHeight());
        this.A08 = new RectF();
        this.A02 = true;
        this.A09 = new C15858Uji(this);
        this.A05 = new C19985Wiw(this);
        try {
            this.A01 = Bitmap.createBitmap(x8u.getWidth(), x8u.getHeight(), Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            0wb.A06("BloksGif", "Failed to create buffer", e);
            throw e;
        }
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        try {
            Bitmap bitmap = this.A01;
            0qQ.A0A(bitmap);
            canvas.drawBitmap(bitmap, this.A07, this.A08, this.A06);
            if (this.A02) {
                this.A02 = false;
                Choreographer.getInstance().postFrameCallback(this);
            }
        } catch (RuntimeException e) {
            0wb.A06("BloksGif", "Failed to draw buffer", e);
            throw e;
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A08.set(rect);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return this.A04.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A04.getWidth();
    }

    public final void doFrame(long j) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.A03;
        if (j2 > 0) {
            i = (int) (currentTimeMillis - j2);
        } else {
            i = 0;
        }
        this.A00 = (this.A00 + i) % this.A04.getDuration();
        this.A03 = currentTimeMillis;
        0nY.A00().ATE(this.A09);
    }
}
