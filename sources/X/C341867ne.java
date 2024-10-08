package X;

import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.7ne  reason: invalid class name and case insensitive filesystem */
public final class C341867ne implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Float A05;
    public final C340607lX A06;
    public final C340467lJ A07;

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C340607lX r5 = this.A06;
        if (!r5.isConnected() || !this.A00 || !((Boolean) r5.AlD().A01(C342687p0.A0f)).booleanValue()) {
            return false;
        }
        float currentSpan = (scaleGestureDetector.getCurrentSpan() - this.A01) / ((float) this.A07.getWidth());
        Float f = this.A05;
        if (f != null) {
            r5.Evu((AnonymousClass8GD) null, Math.min(1.0f, Math.max(-1.0f, (currentSpan * 2.0f) + f.floatValue())));
        } else {
            int i = this.A03;
            int i2 = this.A04;
            r5.Er9((AnonymousClass8GD) null, Math.min(i, Math.max(i2, ((int) (currentSpan * ((float) (i - i2)))) + this.A02)));
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ViewParent parent;
        C340607lX r3 = this.A06;
        boolean z = false;
        if (r3.isConnected() && this.A00 && ((Boolean) r3.AlD().A01(C342687p0.A0f)).booleanValue()) {
            View view = this.A07.getView();
            z = true;
            if (!(view == null || (parent = view.getParent()) == null)) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            Object A022 = r3.Bt2().A02(C342717p3.A11);
            A022.getClass();
            this.A02 = ((Number) A022).intValue();
            if (((Boolean) r3.AlD().A01(C342687p0.A0U)).booleanValue()) {
                this.A05 = (Float) r3.Bt2().A02(C342717p3.A0t);
            }
            this.A03 = ((Number) r3.AlD().A01(C342687p0.A0j)).intValue();
            this.A04 = ((Number) r3.AlD().A01(C342687p0.A0l)).intValue();
            this.A01 = scaleGestureDetector.getCurrentSpan();
        }
        return z;
    }

    public C341867ne(C340607lX r1, C340467lJ r2) {
        this.A06 = r1;
        this.A07 = r2;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
