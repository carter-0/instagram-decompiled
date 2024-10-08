package X;

import android.view.MotionEvent;

/* renamed from: X.Hq4  reason: case insensitive filesystem */
public final class C55940Hq4 {
    public float A00;
    public final int A01;

    public final boolean A00(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A00 = motionEvent.getX();
        } else if (action != 2 || AnonymousClass7TE.A00(this.A00, motionEvent.getX()) <= ((float) this.A01)) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    public C55940Hq4(int i) {
        this.A01 = i;
    }
}
