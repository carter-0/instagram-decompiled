package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class WHN implements XBU {
    public long A00;
    public XBU A01;
    public WHO A02;
    public boolean A03 = false;
    public ColorFilter A04;
    public Rect A05;
    public final AnonymousClass0JR A06;
    public final Runnable A07 = new Wi3(this);
    public final ScheduledExecutorService A08;

    public static synchronized void A00(WHN whn) {
        synchronized (whn) {
            if (!whn.A03) {
                whn.A03 = true;
                whn.A08.schedule(whn.A07, 1000, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final boolean AQZ(Canvas canvas, Drawable drawable, int i) {
        this.A00 = this.A06.now();
        boolean A1P = AnonymousClass7TF.A1P(this.A01.AQZ(canvas, drawable, i) ? 1 : 0);
        A00(this);
        return A1P;
    }

    public final int B84(int i) {
        return this.A01.B84(i);
    }

    public final int BId() {
        return this.A01.BId();
    }

    public final int BIg() {
        return this.A01.BIg();
    }

    public final int BOg() {
        return this.A01.BOg();
    }

    public final void EOY(int i) {
        this.A01.EOY(i);
    }

    public final void EOf(VLV vlv) {
        this.A01.EOf(vlv);
    }

    public final void EPy(Rect rect) {
        this.A01.EPy(rect);
        this.A05 = rect;
    }

    public final void ESG(ColorFilter colorFilter) {
        this.A01.ESG(colorFilter);
        this.A04 = colorFilter;
    }

    public final int getFrameCount() {
        return this.A01.getFrameCount();
    }

    public final int getLoopCount() {
        return this.A01.getLoopCount();
    }

    public WHN(AnonymousClass0JR r2, XBU xbu, WHO who, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = xbu;
        this.A02 = who;
        this.A06 = r2;
        this.A08 = scheduledExecutorService;
    }
}
