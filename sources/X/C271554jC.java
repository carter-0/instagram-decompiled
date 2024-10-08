package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4jC  reason: invalid class name and case insensitive filesystem */
public final class C271554jC implements View.OnTouchListener {
    public final /* synthetic */ C247453gM A00;

    public C271554jC(C247453gM r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        ((0sP) this.A00.A00.A05).invoke(motionEvent);
        return false;
    }
}
