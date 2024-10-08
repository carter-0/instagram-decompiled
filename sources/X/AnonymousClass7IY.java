package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7IY  reason: invalid class name */
public final class AnonymousClass7IY implements View.OnTouchListener {
    public boolean A00 = false;
    public final /* synthetic */ C329067Hl A01;

    public AnonymousClass7IY(C329067Hl r2) {
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z = this.A00;
            if (actionMasked != 2) {
                if (z) {
                    this.A00 = false;
                }
            } else if (!z) {
                this.A00 = true;
                return false;
            }
        }
        return false;
    }
}
