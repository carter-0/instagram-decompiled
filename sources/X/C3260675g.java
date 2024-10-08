package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.75g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3260675g implements View.OnTouchListener {
    public final /* synthetic */ C329307Ij A00;

    public /* synthetic */ C3260675g(C329307Ij r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C328887Gq r0 = this.A00.A09;
        if (r0 == null) {
            return false;
        }
        r0.A01();
        return false;
    }
}
