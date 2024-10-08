package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public final class N1Q extends C283285Gy {
    public final int A00;
    public final int A01;
    public final C74315Psr A02;

    public N1Q(Context context, C74315Psr psr) {
        0qQ.A0B(psr, 2);
        this.A02 = psr;
        this.A01 = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.A00 = ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 2;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        if (motionEvent != null) {
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(y) >= ((float) this.A01) && Math.abs(f2) >= ((float) this.A00) && y > 0.0f) {
                this.A02.Dpq();
                return true;
            }
        }
        return false;
    }
}
