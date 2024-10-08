package X;

import android.view.MotionEvent;

/* renamed from: X.4uy  reason: invalid class name and case insensitive filesystem */
public abstract class C277354uy {
    public static final 1Jm A00(MotionEvent motionEvent, String str) {
        1Jm r2;
        String str2 = str;
        0qQ.A0B(str, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (!(actionMasked == 1 || actionMasked == 3)) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            long eventTime = motionEvent.getEventTime();
            long downTime = motionEvent.getDownTime();
            int actionIndex = motionEvent.getActionIndex();
            int pointerCount = motionEvent.getPointerCount();
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int actionMasked2 = motionEvent.getActionMasked();
            boolean z = false;
            if (actionMasked2 == 3) {
                z = true;
            }
            r2 = new C277364uz(str2, rawX, rawY, actionIndex, pointerCount, eventTime, downTime, z);
            return r2;
        }
        long eventTime2 = motionEvent.getEventTime();
        r2 = new C2595342b(str2, motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getActionIndex(), motionEvent.getPointerCount(), eventTime2);
        return r2;
    }
}
