package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public final class Q8S extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C11508SbV A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public Q8S(C11508SbV sbV) {
        this.A00 = sbV;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        double max;
        C11508SbV sbV = this.A00;
        Integer num = sbV.A00;
        if (num == AnonymousClass05K.A0N) {
            return false;
        }
        double d = (double) f2;
        if (num == AnonymousClass05K.A0C) {
            max = Math.min(d, -2000.0d);
        } else {
            max = Math.max(d, 2000.0d);
        }
        C11508SbV.A00(sbV, max);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        C11508SbV sbV = this.A00;
        if (f2 > 0.0f) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A00;
        }
        sbV.A00 = num;
        View view = sbV.A01;
        float max = Math.max(0.0f, view.getTranslationY() - f2);
        if (Float.compare(max, 0.0f) == 0) {
            sbV.A00 = AnonymousClass05K.A0N;
        }
        view.setTranslationY(max);
        return true;
    }
}
