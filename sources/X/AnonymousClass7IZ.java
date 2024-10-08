package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7IZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7IZ implements View.OnTouchListener {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ AnonymousClass7IZ(C329067Hl r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C70797OLs oLs = this.A00.A0g;
        if (oLs == null || !oLs.A00()) {
            return false;
        }
        return true;
    }
}
