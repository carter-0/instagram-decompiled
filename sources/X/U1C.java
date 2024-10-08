package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class U1C extends Drawable implements Animatable {
    public XBU A00;
    public final AnonymousClass766 A01;
    public final C17654Vbk A02;
    public final Wi5 A03 = new Wi5(this);

    public final void draw(Canvas canvas) {
        long max;
        0qQ.A0B(canvas, 0);
        C17654Vbk vbk = this.A02;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (vbk.A06) {
            max = uptimeMillis - vbk.A05;
        } else {
            max = Math.max(vbk.A03, 0);
        }
        C18032VkC vkC = vbk.A07;
        int A002 = vkC.A00(max);
        vbk.A03 = max;
        if (A002 == -1) {
            A002 = this.A00.getFrameCount() - 1;
            vbk.A06 = false;
        } else if (A002 == 0 && vbk.A01 != -1) {
            SystemClock.uptimeMillis();
        }
        if (this.A00.AQZ(canvas, this, A002)) {
            vbk.A01 = A002;
        } else {
            vbk.A00++;
        }
        if (vbk.A06) {
            long A022 = vkC.A02(SystemClock.uptimeMillis() - vbk.A05);
            if (A022 != -1) {
                long j = A022 + 8;
                if (j != -1) {
                    scheduleSelf(this.A03, j);
                    return;
                }
            } else {
                vbk.A06 = false;
            }
        }
        vbk.A06 = false;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A00.EPy(rect);
    }

    public final int getIntrinsicHeight() {
        return this.A00.BId();
    }

    public final int getIntrinsicWidth() {
        return this.A00.BIg();
    }

    public final boolean isRunning() {
        return this.A02.A06;
    }

    public final void setAlpha(int i) {
        this.A01.A00 = i;
        this.A00.EOY(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.A00(colorFilter);
        this.A00.ESG(colorFilter);
    }

    public final void start() {
        if (this.A00.getFrameCount() > 0) {
            C17654Vbk vbk = this.A02;
            if (!vbk.A06) {
                long uptimeMillis = SystemClock.uptimeMillis();
                vbk.A05 = uptimeMillis - vbk.A04;
                vbk.A03 = uptimeMillis - vbk.A02;
                vbk.A01 = -1;
                vbk.A06 = true;
            }
            invalidateSelf();
        }
    }

    public final void stop() {
        C17654Vbk vbk = this.A02;
        if (vbk.A06) {
            long uptimeMillis = SystemClock.uptimeMillis();
            vbk.A04 = uptimeMillis - vbk.A05;
            vbk.A02 = uptimeMillis - vbk.A03;
            vbk.A05 = 0;
            vbk.A03 = -1;
            vbk.A01 = -1;
            vbk.A06 = false;
        }
        unscheduleSelf(this.A03);
    }

    public U1C(XBU xbu) {
        this.A00 = xbu;
        this.A02 = new C17654Vbk(new C18032VkC(xbu));
        AnonymousClass766 r0 = new AnonymousClass766();
        r0.A01(this);
        this.A01 = r0;
    }
}
