package X;

import android.view.MotionEvent;

public abstract class HRT {
    public static final void A00(C304926Ft r5, 0sP r6, long j, boolean z) {
        GPV gpv = r5.A02;
        if (gpv != null) {
            MotionEvent motionEvent = gpv.A02.A00;
            int action = motionEvent.getAction();
            if (z) {
                motionEvent.setAction(3);
            }
            float A01 = C289295dM.A01(j);
            float A02 = C289295dM.A02(j);
            motionEvent.offsetLocation(-A01, -A02);
            r6.invoke(motionEvent);
            motionEvent.offsetLocation(A01, A02);
            motionEvent.setAction(action);
            return;
        }
        throw AnonymousClass7TE.A0w("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
