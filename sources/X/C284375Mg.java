package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.5Mg  reason: invalid class name and case insensitive filesystem */
public final class C284375Mg implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass5Gv A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        AnonymousClass5Gv r0 = this.A00;
        AnonymousClass5Gv.A03(motionEvent, r0);
        r0.A0G.onTouchEvent(motionEvent);
        return true;
    }

    public C284375Mg(AnonymousClass5Gv r1) {
        this.A00 = r1;
    }
}
