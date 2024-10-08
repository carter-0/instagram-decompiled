package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

public final class N1V extends C283285Gy implements C317156mo, View.OnTouchListener {
    public C74464PvJ A00;
    public C74427Puh A01;
    public OA5 A02;
    public final C67676MsC A03 = new C67676MsC(this, 1);
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        motionEvent.getX();
        motionEvent.getY();
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3 = motionEvent2;
        0qQ.A0B(motionEvent2, 1);
        MotionEvent motionEvent4 = motionEvent;
        if (motionEvent == null) {
            return false;
        }
        if (this.A00 != null) {
            return ((GC9) this.A06.getValue()).A01(motionEvent4, motionEvent3, this, f, f2, false);
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        boolean onTouchEvent = ((GestureDetector) this.A04.getValue()).onTouchEvent(motionEvent);
        motionEvent.getAction();
        boolean onTouchEvent2 = ((ScaleGestureDetector) this.A05.getValue()).onTouchEvent(motionEvent);
        if (onTouchEvent || onTouchEvent2) {
            return true;
        }
        return false;
    }

    public final boolean Dps(float f, float f2) {
        C74464PvJ pvJ = this.A00;
        if (pvJ == null || !pvJ.Dpr()) {
            return false;
        }
        return true;
    }

    public final boolean Dpu() {
        C74464PvJ pvJ = this.A00;
        if (pvJ == null || !pvJ.Dpu()) {
            return false;
        }
        return true;
    }

    public final boolean Dpw() {
        return false;
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C74464PvJ pvJ = this.A00;
        if (pvJ == null || !pvJ.Dq0()) {
            return false;
        }
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C74427Puh puh = this.A01;
        if (puh == null || !puh.D9u()) {
            return false;
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C74427Puh puh = this.A01;
        if (puh == null) {
            return false;
        }
        puh.Dl0();
        return true;
    }

    public N1V(Context context) {
        this.A04 = AnonymousClass0eN.A01(new C58691Iw0(5, context, this));
        this.A06 = AnonymousClass0eN.A01(new C73919Plz(context, 17));
        this.A05 = AnonymousClass0eN.A01(new C58691Iw0(6, context, this));
    }
}
