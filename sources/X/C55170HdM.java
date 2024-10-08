package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

/* renamed from: X.HdM  reason: case insensitive filesystem */
public abstract class C55170HdM {
    /* JADX WARNING: type inference failed for: r0v7, types: [X.5sM, java.lang.Object] */
    public static final C297795sM A00(Context context, C53277GlP glP) {
        MotionEvent motionEvent;
        AnonymousClass7TG.A1N(glP, context);
        MotionEvent motionEvent2 = (MotionEvent) glP.A04;
        if (motionEvent2 == null || (motionEvent = (MotionEvent) glP.A03) == null) {
            return null;
        }
        DisplayMetrics A0H = 0nA.A0H(context);
        float rawX = motionEvent2.getRawX();
        0qQ.A0B(A0H, 0);
        float f = rawX / A0H.density;
        float rawY = motionEvent2.getRawY() / A0H.density;
        float rawX2 = motionEvent.getRawX() / A0H.density;
        float rawY2 = motionEvent.getRawY();
        float f2 = A0H.density;
        float f3 = rawY2 / f2;
        float f4 = glP.A00 / f2;
        float f5 = glP.A01 / f2;
        ? obj = new Object();
        obj.A02 = f;
        obj.A03 = rawY;
        obj.A00 = rawX2;
        obj.A01 = f3;
        obj.A04 = f4;
        obj.A05 = f5;
        return obj;
    }
}
