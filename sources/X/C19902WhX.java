package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: X.WhX  reason: case insensitive filesystem */
public final class C19902WhX implements Runnable {
    public final /* synthetic */ WC4 A00;

    public C19902WhX(WC4 wc4) {
        this.A00 = wc4;
    }

    public final void run() {
        WC4 wc4 = this.A00;
        if (wc4.A03) {
            if (wc4.A06) {
                wc4.A06 = false;
                C18503Vsz vsz = wc4.A0F;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                vsz.A06 = currentAnimationTimeMillis;
                vsz.A07 = -1;
                vsz.A05 = currentAnimationTimeMillis;
                vsz.A00 = 0.5f;
            }
            C18503Vsz vsz2 = wc4.A0F;
            if ((vsz2.A07 <= 0 || AnimationUtils.currentAnimationTimeMillis() <= vsz2.A07 + ((long) vsz2.A02)) && wc4.A02()) {
                if (wc4.A05) {
                    wc4.A05 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    wc4.A0C.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (vsz2.A05 != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float A002 = C18503Vsz.A00(vsz2, currentAnimationTimeMillis2);
                    vsz2.A05 = currentAnimationTimeMillis2;
                    ListView listView = wc4.A0E;
                    listView.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - vsz2.A05)) * ((-4.0f * A002 * A002) + (A002 * 4.0f)) * vsz2.A01));
                    wc4.A0C.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            wc4.A03 = false;
        }
    }
}
