package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Wn2  reason: case insensitive filesystem */
public final class C20202Wn2 implements Runnable {
    public final /* synthetic */ MotionEvent A00;
    public final /* synthetic */ WVJ A01;

    public C20202Wn2(MotionEvent motionEvent, WVJ wvj) {
        this.A01 = wvj;
        this.A00 = motionEvent;
    }

    public final void run() {
        WVJ wvj = this.A01;
        View view = wvj.A01;
        int[] iArr = WVJ.A06;
        view.getLocationOnScreen(iArr);
        MotionEvent motionEvent = this.A00;
        view.setPivotX(motionEvent.getRawX() - ((float) iArr[0]));
        view.setPivotY(motionEvent.getRawY() - ((float) iArr[1]));
        wvj.A03.A09(0.92f);
        wvj.A04.A09(0.92f);
        C14090Tph tph = wvj.A02;
        if (tph != null) {
            tph.A09(0.5f);
        }
        wvj.A00 = null;
    }
}
