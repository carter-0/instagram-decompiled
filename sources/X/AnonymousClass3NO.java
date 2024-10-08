package X;

import android.view.MotionEvent;

/* renamed from: X.3NO  reason: invalid class name */
public final class AnonymousClass3NO implements Runnable {
    public MotionEvent A00;
    public boolean A01;
    public final AnonymousClass3NM A02;

    public final void run() {
        this.A01 = true;
        MotionEvent motionEvent = this.A00;
        if (motionEvent != null) {
            AnonymousClass3NM.A00(motionEvent, this.A02);
            motionEvent.recycle();
            this.A00 = null;
        }
    }

    public AnonymousClass3NO(AnonymousClass3NM r1) {
        this.A02 = r1;
    }
}
