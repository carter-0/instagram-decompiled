package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LYc  reason: case insensitive filesystem */
public final class C64276LYc implements View.OnTouchListener {
    public final List A00 = AnonymousClass7TE.A1C();
    public final 0sL A01;

    public C64276LYc() {
        MPF mpf = MPF.A00;
        0qQ.A0B(mpf, 1);
        this.A01 = mpf;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        AnonymousClass7TG.A1N(view, motionEvent);
        boolean A1a = AnonymousClass7TE.A1a(this.A01.invoke(view, motionEvent));
        Iterator it = this.A00.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                View A0H = JTO.A0H(it);
                if (z || A0H.dispatchTouchEvent(motionEvent)) {
                    z = true;
                }
            }
        }
        if (A1a || z) {
            return true;
        }
        return false;
    }
}
