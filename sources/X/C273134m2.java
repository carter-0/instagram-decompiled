package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4m2  reason: invalid class name and case insensitive filesystem */
public final class C273134m2 implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass9J2 A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C243613Zn A02;

    public C273134m2(AnonymousClass9J2 r1, AnonymousClass0iw r2, C243613Zn r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener A002;
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getAction() != 0 || (A002 = ((C244033aX) this.A02.A08.getValue()).A00(this.A00, this.A01.getModuleName())) == null) {
            return false;
        }
        return A002.onTouch(view, motionEvent);
    }
}
