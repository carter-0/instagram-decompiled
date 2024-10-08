package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.Jdd  reason: case insensitive filesystem */
public final class C60027Jdd extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ LBQ A00;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = 0;
        if (motionEvent != null) {
            MotionEvent motionEvent3 = motionEvent2;
            if (motionEvent2 != null) {
                LBQ lbq = this.A00;
                lbq.A02 = motionEvent2.getRawY() - motionEvent.getRawY();
                float f3 = f;
                lbq.A03 = f;
                float f4 = f2;
                lbq.A04 = f2;
                while (true) {
                    List list = lbq.A0G;
                    if (i >= list.size()) {
                        return true;
                    }
                    ((AnonymousClass88I) list.get(i)).DG3(motionEvent3, f3, f4, lbq.A07, lbq.A08);
                    i++;
                }
            }
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = 0;
        while (true) {
            LBQ lbq = this.A00;
            List list = lbq.A0G;
            if (i >= list.size()) {
                return true;
            }
            float f3 = f;
            float f4 = f2;
            ((AnonymousClass88I) list.get(i)).DhL(f3, f4, lbq.A00, lbq.A01, lbq.A07, lbq.A08);
            i++;
        }
    }

    public C60027Jdd(LBQ lbq) {
        this.A00 = lbq;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        LBQ lbq = this.A00;
        lbq.A00 = motionEvent.getRawX();
        lbq.A01 = motionEvent.getRawY();
        int i = 0;
        lbq.A07 = false;
        lbq.A08 = false;
        lbq.A04 = 0.0f;
        lbq.A02 = 0.0f;
        while (true) {
            List list = lbq.A0G;
            if (i >= list.size()) {
                return true;
            }
            ((AnonymousClass88I) list.get(i)).DsQ(lbq.A00, lbq.A01);
            i++;
        }
    }
}
