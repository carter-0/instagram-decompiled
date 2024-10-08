package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

public final class GYE extends C283285Gy {
    public final GestureDetector A00;
    public final C317166mp A01;
    public final GC9 A02;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3 = motionEvent2;
        0qQ.A0B(motionEvent2, 1);
        MotionEvent motionEvent4 = motionEvent;
        if (motionEvent == null) {
            return false;
        }
        int intValue = this.A02.A00(motionEvent4, motionEvent3, f, f2, false).intValue();
        if (intValue == 2) {
            return this.A01.Dq1(motionEvent, motionEvent2, f, f2);
        }
        if (intValue == 3) {
            return this.A01.Dps(motionEvent2.getRawY() - motionEvent.getRawY(), f2);
        }
        return false;
    }

    public GYE(Context context, C317166mp r3) {
        AnonymousClass7TG.A1O(context, r3);
        this.A01 = r3;
        this.A00 = new GestureDetector(context, this);
        this.A02 = new GC9(context);
    }
}
