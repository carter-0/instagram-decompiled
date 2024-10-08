package X;

import android.view.MotionEvent;

/* renamed from: X.6tr  reason: invalid class name and case insensitive filesystem */
public final class C321276tr implements C317516nO {
    public final /* synthetic */ C321266tq A00;
    public final /* synthetic */ boolean A01;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public C321276tr(C321266tq r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A01) {
            return true;
        }
        this.A00.A00 = f;
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C321266tq r1 = this.A00;
        r1.A0D.invoke();
        C321266tq.A02(r1);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A01) {
            C321266tq r8 = this.A00;
            r8.A05.requestDisallowInterceptTouchEvent(true);
            2cs r4 = r8.A08;
            C71412ct r3 = r4.A09;
            if (r3.A00 % 1.0d == 0.0d) {
                C321266tq.A00(r8);
            }
            r4.A05(r3.A00 - ((double) (f / ((float) (r8.A0C.getWidth() * 3)))));
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C321266tq r1 = this.A00;
        r1.A02.invoke();
        r1.A03 = true;
        return true;
    }
}
