package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.LYf  reason: case insensitive filesystem */
public final class C64279LYf implements View.OnTouchListener {
    public final /* synthetic */ Dc2 A00;
    public final /* synthetic */ AnonymousClass3M8 A01;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A01.A00 = motionEvent.getY();
            return true;
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                AnonymousClass3M8 r6 = this.A01;
                float y = r6.A00 - motionEvent.getY();
                float f = (float) r6.A02;
                ((2cs) r6.A0N.getValue()).A06(Math.min((double) ((f + y) / f), 1.0d));
            }
            return false;
        } else {
            AnonymousClass3M8 r8 = this.A01;
            float y2 = r8.A00 - motionEvent.getY();
            float f2 = (float) r8.A02;
            if (((double) ((f2 + y2) / f2)) < 0.75d) {
                r8.A09(this.A00);
                return true;
            }
            ((2cs) r8.A0N.getValue()).A06(1.0d);
            return true;
        }
    }

    public C64279LYf(Dc2 dc2, AnonymousClass3M8 r2) {
        this.A01 = r2;
        this.A00 = dc2;
    }
}
