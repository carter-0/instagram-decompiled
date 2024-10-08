package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.WBp  reason: case insensitive filesystem */
public final class C18897WBp implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass7HT A00;

    public C18897WBp(AnonymousClass7HT r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass7HT r1 = this.A00;
        C253913rc r0 = r1.A0B;
        if (r0 != null) {
            r0.A01(motionEvent);
        }
        AnonymousClass7HT.A03(motionEvent, r1);
        return true;
    }
}
