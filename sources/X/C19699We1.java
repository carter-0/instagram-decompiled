package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.We1  reason: case insensitive filesystem */
public final class C19699We1 implements C317956o7 {
    public final GestureDetector A00;
    public final C283285Gy A01;
    public final /* synthetic */ C19700We2 A02;

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A00.onTouchEvent(motionEvent);
    }

    public final boolean DsV(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A00.onTouchEvent(motionEvent);
    }

    public final void EHq(float f, float f2) {
    }

    public final void destroy() {
    }

    public C19699We1(Context context, C19700We2 we2, C317156mo r6) {
        this.A02 = we2;
        C14978UHw uHw = new C14978UHw(0, new GC9(context), r6);
        this.A01 = uHw;
        this.A00 = new GestureDetector(context, uHw);
    }
}
