package X;

import android.view.MotionEvent;

/* renamed from: X.UHv  reason: case insensitive filesystem */
public final class C14977UHv extends C283285Gy {
    public final /* synthetic */ C305836Jt A00;
    public final /* synthetic */ boolean A01;

    public C14977UHv(C305836Jt r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return this.A01;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A0d.DNs();
        return true;
    }
}
