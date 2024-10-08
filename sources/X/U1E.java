package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class U1E extends Drawable implements Animatable {
    public static final C16778V5l A0F = new Object();
    public int A00;
    public long A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public AnonymousClass766 A08;
    public XBU A09;
    public C18032VkC A0A;
    public final Runnable A0B;
    public final VLV A0C;
    public volatile C16778V5l A0D;
    public volatile boolean A0E;

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        C18032VkC vkC;
        long max;
        XBU xbu = this.A09;
        if (xbu != null && (vkC = this.A0A) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A0E) {
                max = uptimeMillis - this.A01;
            } else {
                max = Math.max(this.A05, 0);
            }
            int A002 = vkC.A00(max);
            if (A002 == -1) {
                A002 = xbu.getFrameCount() - 1;
                this.A0E = false;
            }
            if (xbu.AQZ(canvas, this, A002)) {
                this.A02 = A002;
            } else {
                this.A00++;
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.A0E) {
                long A022 = vkC.A02(uptimeMillis2 - this.A01);
                if (A022 != -1) {
                    scheduleSelf(this.A0B, this.A01 + this.A04 + A022);
                } else {
                    this.A0E = false;
                }
            }
            this.A05 = max;
        }
    }

    public final int getIntrinsicHeight() {
        XBU xbu = this.A09;
        if (xbu == null) {
            return super.getIntrinsicHeight();
        }
        return xbu.BId();
    }

    public final int getIntrinsicWidth() {
        XBU xbu = this.A09;
        if (xbu == null) {
            return super.getIntrinsicWidth();
        }
        return xbu.BIg();
    }

    public final boolean isRunning() {
        return this.A0E;
    }

    public final boolean onLevelChange(int i) {
        if (this.A0E) {
            return false;
        }
        long j = (long) i;
        if (this.A05 == j) {
            return false;
        }
        this.A05 = j;
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        AnonymousClass766 r0 = this.A08;
        if (r0 == null) {
            r0 = new AnonymousClass766();
            this.A08 = r0;
        }
        r0.A00 = i;
        XBU xbu = this.A09;
        if (xbu != null) {
            xbu.EOY(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass766 r0 = this.A08;
        if (r0 == null) {
            r0 = new AnonymousClass766();
            this.A08 = r0;
        }
        r0.A00(colorFilter);
        XBU xbu = this.A09;
        if (xbu != null) {
            xbu.ESG(colorFilter);
        }
    }

    public final void start() {
        XBU xbu;
        if (!this.A0E && (xbu = this.A09) != null && xbu.getFrameCount() > 1) {
            this.A0E = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A01 = uptimeMillis - this.A07;
            this.A05 = uptimeMillis - this.A06;
            this.A02 = this.A03;
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.A0E) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A01;
            this.A06 = uptimeMillis - this.A05;
            this.A03 = this.A02;
            this.A0E = false;
            this.A01 = 0;
            this.A05 = -1;
            this.A02 = -1;
            unscheduleSelf(this.A0B);
        }
    }

    public U1E(XBU xbu) {
        C18032VkC vkC;
        this.A04 = 8;
        this.A0D = A0F;
        VLV vlv = new VLV(this);
        this.A0C = vlv;
        this.A0B = new Wi4(this);
        this.A09 = xbu;
        if (xbu == null) {
            vkC = null;
        } else {
            vkC = new C18032VkC(xbu);
        }
        this.A0A = vkC;
        if (xbu != null) {
            xbu.EOf(vlv);
        }
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        XBU xbu = this.A09;
        if (xbu != null) {
            xbu.EPy(rect);
        }
    }

    public U1E() {
        this((XBU) null);
    }
}
