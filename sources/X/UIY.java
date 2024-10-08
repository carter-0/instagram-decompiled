package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

public final class UIY extends AnonymousClass763 implements Runnable {
    public float A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    public final void run() {
        this.A03 = false;
        this.A00 += (float) ((int) ((20.0f / ((float) this.A01)) * 360.0f));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.A00;
        if (!this.A02) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) (i2 + (i3 / 2)), (float) (i5 + (i6 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.A03) {
            this.A03 = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }
}
