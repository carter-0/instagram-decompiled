package X;

import android.view.MotionEvent;

/* renamed from: X.GNo  reason: case insensitive filesystem */
public final class C52322GNo implements Runnable {
    public final /* synthetic */ MotionEvent A00;
    public final /* synthetic */ C52129GFx A01;

    public C52322GNo(MotionEvent motionEvent, C52129GFx gFx) {
        this.A01 = gFx;
        this.A00 = motionEvent;
    }

    public final void run() {
        C52129GFx gFx = this.A01;
        gFx.A01 = AnonymousClass05K.A00;
        JRC jrc = gFx.A06;
        C267324bN r3 = gFx.A04;
        C52058GDe BzC = gFx.A05.BzC(r3);
        MotionEvent motionEvent = this.A00;
        jrc.DPD(r3, BzC, motionEvent.getX(), motionEvent.getY());
    }
}
