package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.5Me  reason: invalid class name and case insensitive filesystem */
public final class C284355Me implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass5Gv A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() == 0) {
            AnonymousClass5Gv r1 = this.A00;
            if (r1.A0N) {
                r1.A08(true);
            }
        }
        AnonymousClass5Gv r12 = this.A00;
        if (!r12.A0N || !r12.A0R) {
            return false;
        }
        return true;
    }

    public C284355Me(AnonymousClass5Gv r1) {
        this.A00 = r1;
    }
}
