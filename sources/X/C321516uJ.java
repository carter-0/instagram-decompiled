package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.6uJ  reason: invalid class name and case insensitive filesystem */
public final class C321516uJ implements View.OnTouchListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass32J A02;

    public C321516uJ(1Xj r1, AnonymousClass32J r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass32J r3 = this.A02;
        if (r3 == null) {
            return false;
        }
        0qQ.A0A(view);
        0qQ.A0A(motionEvent);
        if (r3.DII(motionEvent, view, this.A01, this.A00)) {
            return true;
        }
        return false;
    }
}
