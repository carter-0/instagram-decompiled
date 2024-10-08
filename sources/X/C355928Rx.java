package X;

import android.view.MotionEvent;

/* renamed from: X.8Rx  reason: invalid class name and case insensitive filesystem */
public final class C355928Rx extends C283285Gy {
    public final /* synthetic */ C355898Ru A00;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3 = motionEvent2;
        0qQ.A0B(motionEvent2, 1);
        if (motionEvent == null) {
            return false;
        }
        C355898Ru r2 = this.A00;
        r2.A03 = motionEvent2.getRawY() - motionEvent.getRawY();
        float f3 = f;
        r2.A04 = f;
        float f4 = f2;
        r2.A05 = f2;
        for (AnonymousClass88I DG3 : r2.A0T) {
            DG3.DG3(motionEvent3, f3, f4, r2.A07, r2.A08);
        }
        return true;
    }

    public C355928Rx(C355898Ru r1) {
        this.A00 = r1;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C355898Ru r1 = this.A00;
        r1.A07 = true;
        r1.A08 = true;
        r1.A09 = true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C355898Ru r2 = this.A00;
        for (AnonymousClass88I DhL : r2.A0T) {
            float f3 = f;
            float f4 = f2;
            DhL.DhL(f3, f4, r2.A00, r2.A01, r2.A07, r2.A08);
        }
        return true;
    }
}
