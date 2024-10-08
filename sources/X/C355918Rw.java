package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.8Rw  reason: invalid class name and case insensitive filesystem */
public final class C355918Rw implements View.OnTouchListener {
    public final /* synthetic */ C355898Ru A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        C355898Ru r3 = this.A00;
        Context applicationContext = r3.A0C.getApplicationContext();
        0qQ.A07(applicationContext);
        if (!AnonymousClass8FD.A00(applicationContext)) {
            return false;
        }
        boolean onTouchEvent = r3.A0F.onTouchEvent(motionEvent);
        float rawX = r3.A00 - motionEvent.getRawX();
        float rawY = r3.A01 - motionEvent.getRawY();
        if (!r3.A08 && !r3.A07) {
            boolean z = false;
            boolean z2 = false;
            if (Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) r3.A0B)) {
                z2 = true;
            }
            double degrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
            if (z2) {
                if (degrees < 45.0d) {
                    r3.A07 = true;
                } else {
                    if (r3.A01 > ((float) r3.A0A)) {
                        z = true;
                    }
                    r3.A08 = z;
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        for (AnonymousClass88I DHo : r3.A0T) {
            DHo.DHo(r3.A04, r3.A05, r3.A00, r3.A01, r3.A03, r3.A07, r3.A08);
        }
        r3.A03 = 0.0f;
        r3.A04 = 0.0f;
        r3.A05 = 0.0f;
        r3.A09 = false;
        return onTouchEvent;
    }

    public C355918Rw(C355898Ru r1) {
        this.A00 = r1;
    }
}
