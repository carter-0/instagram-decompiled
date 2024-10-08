package X;

import android.animation.ValueAnimator;

/* renamed from: X.3Ll  reason: invalid class name and case insensitive filesystem */
public final class C240583Ll implements Runnable {
    public final /* synthetic */ C226732hl A00;
    public final /* synthetic */ C226992iK A01;

    public C240583Ll(C226732hl r1, C226992iK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C226752hn r5 = this.A01.A01;
        C226852hx r3 = r5.A0G;
        int i = this.A00.A01.A01;
        ValueAnimator valueAnimator = r3.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        if (i == 0) {
            r3.A09.setAlpha(255);
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
            ofInt.setDuration((long) i);
            ofInt.addUpdateListener(r3.A08);
            ofInt.start();
            r3.A00 = ofInt;
        }
        C226852hx r32 = r5.A0I;
        ValueAnimator valueAnimator2 = r32.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        if (i == 0) {
            r32.A09.setAlpha(0);
            return;
        }
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{255, 0});
        ofInt2.setDuration((long) i);
        ofInt2.addUpdateListener(r32.A08);
        ofInt2.addListener(new Q4w(r32));
        ofInt2.start();
        r32.A00 = ofInt2;
    }
}
