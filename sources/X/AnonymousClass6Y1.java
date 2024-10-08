package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* renamed from: X.6Y1  reason: invalid class name */
public final class AnonymousClass6Y1 extends C309306Xt {
    public C309336Xw A00;
    public C309356Xy A01;

    public final void draw(Canvas canvas) {
        float f;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible()) {
            Canvas canvas2 = canvas;
            if (canvas.getClipBounds(rect)) {
                canvas.save();
                C309336Xw r2 = this.A00;
                C309276Xq r1 = this.A09;
                if (r1.A01 == 0 && r1.A00 == 0) {
                    f = 1.0f;
                } else {
                    f = this.A00;
                }
                r2.A00.A00();
                r2.A03(canvas, f);
                C309336Xw r0 = this.A00;
                Paint paint = this.A08;
                r0.A04(canvas, paint);
                int i = 0;
                while (true) {
                    C309356Xy r12 = this.A01;
                    int[] iArr = r12.A02;
                    if (i < iArr.length) {
                        C309336Xw r4 = this.A00;
                        float[] fArr = r12.A01;
                        int i2 = i * 2;
                        r4.A05(canvas2, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                        i++;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        }
    }

    public final int getIntrinsicHeight() {
        return this.A00.A01();
    }

    public final int getIntrinsicWidth() {
        return this.A00.A02();
    }

    public final boolean A04(boolean z, boolean z2, boolean z3) {
        boolean A04 = super.A04(z, z2, z3);
        if (!isRunning()) {
            this.A01.A00();
        }
        Settings.Global.getFloat(this.A07.getContentResolver(), "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.A01.A03();
        }
        return A04;
    }
}
