package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

public final class GC8 implements C317956o7 {
    public GC7 A00;
    public final GC9 A01;
    public final GestureDetector.OnGestureListener A02;
    public final GestureDetector A03;

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A03.onTouchEvent(motionEvent);
    }

    public final boolean DsV(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A03.onTouchEvent(motionEvent);
    }

    public final void EHq(float f, float f2) {
    }

    public final void destroy() {
    }

    public GC8(Context context, GC7 gc7) {
        this.A00 = gc7;
        this.A01 = new GC9(context);
        C52254GKv gKv = new C52254GKv(this);
        this.A02 = gKv;
        this.A03 = new GestureDetector(context, gKv);
    }
}
