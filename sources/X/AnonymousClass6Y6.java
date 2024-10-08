package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* renamed from: X.6Y6  reason: invalid class name */
public final class AnonymousClass6Y6 extends C309306Xt {
    public static final V4M A05 = new AnonymousClass6Y7();
    public float A00;
    public C309336Xw A01;
    public boolean A02 = false;
    public final C14090Tph A03;
    public final C14002To4 A04;

    public final void draw(Canvas canvas) {
        float f;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible()) {
            Canvas canvas2 = canvas;
            if (canvas.getClipBounds(rect)) {
                canvas.save();
                C309336Xw r3 = this.A01;
                C309276Xq r2 = this.A09;
                if (r2.A01 == 0 && r2.A00 == 0) {
                    f = 1.0f;
                } else {
                    f = this.A00;
                }
                r3.A00.A00();
                r3.A03(canvas, f);
                Paint paint = this.A08;
                r3.A04(canvas, paint);
                r3.A05(canvas2, paint, 0.0f, this.A00, C18108Vlc.A01(r2.A05[0], this.A01));
                canvas.restore();
            }
        }
    }

    public final int getIntrinsicHeight() {
        return this.A01.A01();
    }

    public final int getIntrinsicWidth() {
        return this.A01.A02();
    }

    public final void jumpToCurrentState() {
        this.A03.A01();
        this.A00 = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i) {
        boolean z = this.A02;
        C14090Tph tph = this.A03;
        if (z) {
            tph.A01();
            this.A00 = ((float) i) / 10000.0f;
            invalidateSelf();
            return true;
        }
        tph.A03 = this.A00 * 10000.0f;
        tph.A07 = true;
        tph.A09((float) i);
        return true;
    }

    public AnonymousClass6Y6(Context context, C309276Xq r6, C309336Xw r7) {
        super(context, r6);
        this.A01 = r7;
        r7.A01 = this;
        C14002To4 to4 = new C14002To4();
        this.A04 = to4;
        to4.A01(1.0f);
        to4.A02(50.0f);
        C14090Tph tph = new C14090Tph(A05, this);
        this.A03 = tph;
        tph.A01 = to4;
        if (this.A00 != 1.0f) {
            this.A00 = 1.0f;
            invalidateSelf();
        }
    }

    public final boolean A04(boolean z, boolean z2, boolean z3) {
        boolean A042 = super.A04(z, z2, z3);
        float f = Settings.Global.getFloat(this.A07.getContentResolver(), "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.A02 = true;
            return A042;
        }
        this.A02 = false;
        this.A04.A02(50.0f / f);
        return A042;
    }
}
