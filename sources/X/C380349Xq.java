package X;

import android.view.ScaleGestureDetector;
import android.view.ViewParent;

/* renamed from: X.9Xq  reason: invalid class name and case insensitive filesystem */
public final class C380349Xq extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Float A04;
    public final /* synthetic */ C380369Xs A05;

    public C380349Xq(C380369Xs r1) {
        this.A05 = r1;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C380369Xs r3 = this.A05;
        C340607lX r5 = r3.A0U;
        if (!r5.isConnected() || !r3.A0E) {
            return false;
        }
        if (!AnonymousClass7TG.A1V(C342687p0.A0f, r5.AlD())) {
            return false;
        }
        float currentSpan = (scaleGestureDetector.getCurrentSpan() - this.A00) / AnonymousClass7TE.A02(r3);
        Float f = this.A04;
        if (f != null) {
            r5.Evu((AnonymousClass8GD) null, Math.min(1.0f, Math.max(-1.0f, (currentSpan * 2.0f) + f.floatValue())));
        } else {
            int i = this.A02;
            int i2 = this.A03;
            r5.Er9((AnonymousClass8GD) null, Math.min(i, Math.max(i2, ((int) (currentSpan * ((float) (i - i2)))) + this.A01)));
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C380369Xs r4 = this.A05;
        C340607lX r3 = r4.A0U;
        boolean z = false;
        if (r3.isConnected() && r4.A0E) {
            if (AnonymousClass7TG.A1V(C342687p0.A0f, r3.AlD())) {
                ViewParent parent = r4.getParent();
                z = true;
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.A01 = AnonymousClass7TG.A08(C342717p3.A11, r3.Bt2());
                if (AnonymousClass7TG.A1V(C342687p0.A0U, r3.AlD())) {
                    this.A04 = (Float) r3.Bt2().A02(C342717p3.A0t);
                }
                this.A02 = AnonymousClass7TE.A0M(r3.AlD().A01(C342687p0.A0j));
                this.A03 = AnonymousClass7TE.A0M(r3.AlD().A01(C342687p0.A0l));
                this.A00 = scaleGestureDetector.getCurrentSpan();
            }
        }
        return z;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
