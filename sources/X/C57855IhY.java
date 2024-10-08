package X;

import android.view.MotionEvent;

/* renamed from: X.IhY  reason: case insensitive filesystem */
public final class C57855IhY implements Runnable {
    public final /* synthetic */ MotionEvent A00;
    public final /* synthetic */ C306166Lb A01;

    public C57855IhY(MotionEvent motionEvent, C306166Lb r2) {
        this.A01 = r2;
        this.A00 = motionEvent;
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        C306166Lb r4 = this.A01;
        if (currentTimeMillis - r4.A02 > 650 && r4.A03) {
            C309676Ze r3 = r4.A0C;
            if (r3.CVf()) {
                return;
            }
            if (C56339Hwq.A01(r4.A09)) {
                r3.DIX(C306166Lb.A00(this.A00, r4, C273654mx.A00(2892)), false);
                return;
            }
            r4.A03 = false;
            r3.DvB(false);
        }
    }
}
