package X;

import android.view.MotionEvent;

/* renamed from: X.8Pn  reason: invalid class name and case insensitive filesystem */
public final class C355318Pn extends C283285Gy {
    public final /* synthetic */ C355308Pm A00;

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C355318Pn(C355308Pm r1) {
        this.A00 = r1;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C355308Pm r2 = this.A00;
        C355338Pp r1 = r2.A0J;
        if (r1.A06) {
            r1.A01();
        }
        return r2.A0C;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C355308Pm r4 = this.A00;
        float f3 = (float) (r4.A08 - r4.A05);
        if (!r4.A0C) {
            return false;
        }
        float f4 = r4.A00;
        if (f4 >= f3) {
            return false;
        }
        C355338Pp r1 = r4.A0J;
        r1.A00 = f3;
        r1.A03 = f4;
        r1.A07 = true;
        r1.A04 = -f;
        r1.A02();
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C355308Pm r2 = this.A00;
        return C355308Pm.A03(r2, r2.A00 + f, true);
    }
}
