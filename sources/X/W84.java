package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class W84 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C18024Vk0 A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        boolean z;
        boolean z2;
        if (f > f2) {
            if (f > 0.0f) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A0C;
            }
        } else if (f2 > 0.0f) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        C18024Vk0 vk0 = this.A00;
        int i = vk0.A05;
        if ((!AnonymousClass7TF.A1S(i & 4, 4) || num != AnonymousClass05K.A0C) && !((i & 8) == 8 && num == AnonymousClass05K.A0N)) {
            z = false;
        } else {
            z = true;
        }
        if (((i & 2) == 2 && num == AnonymousClass05K.A01) || ((i & 1) == 1 && num == AnonymousClass05K.A00)) {
            z2 = true;
        } else {
            z2 = false;
        }
        X0T x0t = vk0.A0C;
        if (x0t == null || (!z && !z2)) {
            return false;
        }
        motionEvent2.getX();
        motionEvent2.getY();
        Integer num2 = AnonymousClass05K.A00;
        C14724U4o u4o = (C14724U4o) x0t;
        if (u4o.getParent() != null) {
            JTP.A15(u4o, false);
        }
        X83 x83 = u4o.A04;
        if (x83 != null) {
            x83.DAc();
        }
        vk0.A0F = num2;
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public W84(C18024Vk0 vk0) {
        this.A00 = vk0;
    }
}
