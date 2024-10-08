package X;

import android.view.MotionEvent;

/* renamed from: X.UHw  reason: case insensitive filesystem */
public final class C14978UHw extends C283285Gy {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C14978UHw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onDown(motionEvent);
        }
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f3 = f;
        float f4 = f2;
        if (this.A00 != 0) {
            0qQ.A0B(motionEvent2, 1);
            if (motionEvent != null) {
                return ((GC9) this.A01).A01(motionEvent3, motionEvent4, ((C305836Jt) this.A02).A0d, f3, f4, false);
            }
            return false;
        }
        0qQ.A0B(motionEvent2, 1);
        if (motionEvent == null) {
            return false;
        }
        ((GC9) this.A02).A01(motionEvent3, motionEvent4, (C317156mo) this.A01, f3, f4, false);
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onSingleTapUp(motionEvent);
        }
        0qQ.A0B(motionEvent, 0);
        ((C305836Jt) this.A02).A0d.Dqb(motionEvent.getRawX(), motionEvent.getRawY());
        return true;
    }
}
