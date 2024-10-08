package X;

import android.content.Context;
import android.view.MotionEvent;

public final class GC9 {
    public final float A00;

    public GC9(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = 0nA.A04(context, 5);
    }

    public final boolean A01(MotionEvent motionEvent, MotionEvent motionEvent2, C317156mo r13, float f, float f2, boolean z) {
        0qQ.A0B(r13, 5);
        int intValue = A00(motionEvent, motionEvent2, f, f2, z).intValue();
        if (intValue == 2) {
            return r13.Dq1(motionEvent, motionEvent2, f, f2);
        }
        if (intValue == 3) {
            return r13.Dps(motionEvent2.getRawY() - motionEvent.getRawY(), f2);
        }
        if (intValue == 0) {
            return r13.Dpu();
        }
        if (intValue == 1) {
            return r13.Dpw();
        }
        if (intValue == 4) {
            return false;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final Integer A00(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, boolean z) {
        if (!z && motionEvent != null) {
            float abs = Math.abs(f2);
            float abs2 = Math.abs(f);
            if (abs > abs2) {
                if (motionEvent2.getRawY() - motionEvent.getRawY() < 0.0f) {
                    return AnonymousClass05K.A0C;
                }
                if (motionEvent.getY() > this.A00) {
                    return AnonymousClass05K.A0N;
                }
            } else if (abs2 > abs) {
                float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
                if (rawX < 0.0f) {
                    return AnonymousClass05K.A00;
                }
                if (rawX > 0.0f) {
                    return AnonymousClass05K.A01;
                }
            }
        }
        return AnonymousClass05K.A0Y;
    }
}
