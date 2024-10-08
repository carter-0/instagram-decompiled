package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.Tr9  reason: case insensitive filesystem */
public final class C14171Tr9 extends C317396nC implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public final ScaleGestureDetector A01;
    public final C273444ma A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14171Tr9(Context context, C273424mY r4, C273444ma r5) {
        super(context, r4);
        0qQ.A0B(context, 1);
        this.A02 = r5;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A01 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        scaleGestureDetector.setStylusScaleEnabled(false);
    }

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A01.onTouchEvent(motionEvent);
        if (this.A00 || super.DL9(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean DsV(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        ScaleGestureDetector scaleGestureDetector = this.A01;
        scaleGestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && this.A00) {
            this.A00 = false;
            this.A02.onScaleEnd(scaleGestureDetector);
        }
        if (this.A00) {
            return true;
        }
        super.DsV(motionEvent);
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        this.A00 = true;
        return this.A02.onScale(scaleGestureDetector);
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        this.A00 = true;
        return this.A02.onScaleBegin(scaleGestureDetector);
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        this.A02.onScaleEnd(scaleGestureDetector);
    }

    public final boolean A03() {
        if (this.A00 || this.A00) {
            return true;
        }
        return false;
    }
}
