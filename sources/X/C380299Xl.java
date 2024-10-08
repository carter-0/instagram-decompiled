package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.9Xl  reason: invalid class name and case insensitive filesystem */
public final class C380299Xl extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C380299Xl(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                ((C317046md) this.A02).A01 = false;
                ((C317576nU) this.A01).DiD();
                return true;
            case 2:
                0qQ.A0B(motionEvent, 0);
                ((C309686Zf) this.A01).DA9(motionEvent.getRawX());
                return true;
            default:
                return true;
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                C355448Qa r1 = (C355448Qa) this.A01;
                if (r1 != null) {
                    r1.DM7((C380599Yu) this.A02);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(motionEvent, 0);
                ((C317046md) this.A02).A01 = true;
                super.onLongPress(motionEvent);
                return;
            case 2:
                0qQ.A0B(motionEvent, 0);
                ((C309686Zf) this.A01).DP2(motionEvent.getRawX(), motionEvent.getRawY());
                ((C255783ui) this.A02).A1H = false;
                return;
            default:
                ((C17809VgM) this.A02).A01.D4l((C247733gp) this.A01);
                return;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                C355448Qa r1 = (C355448Qa) this.A01;
                if (r1 == null) {
                    return true;
                }
                r1.DMP((C380599Yu) this.A02);
                return true;
            case 2:
                0qQ.A0B(motionEvent, 0);
                ((C309686Zf) this.A01).Dqb(motionEvent.getRawX(), motionEvent.getRawY());
                ((C255783ui) this.A02).A1H = false;
                return true;
            case 3:
                ((C17809VgM) this.A02).A01.D4l((C247733gp) this.A01);
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
