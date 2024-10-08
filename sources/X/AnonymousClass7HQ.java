package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.7HQ  reason: invalid class name */
public final class AnonymousClass7HQ extends C253913rc implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public boolean A01;
    public final float A02 = 2.0f;
    public final GestureDetector A03;

    public final boolean A01(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            this.A03.onTouchEvent(motionEvent);
        }
        return this.A00.onTouchEvent(motionEvent);
    }

    public AnonymousClass7HQ(Context context) {
        super(context);
        this.A03 = new GestureDetector(context, new AnonymousClass7HR(this, this), (Handler) null);
    }

    public final float A00() {
        if (this.A01) {
            return this.A02;
        }
        return this.A00.getScaleFactor();
    }
}
