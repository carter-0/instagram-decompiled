package X;

import android.view.MotionEvent;
import android.view.View;

public final class WVJ implements XAL {
    public static final int[] A06 = new int[2];
    public Runnable A00;
    public final View A01;
    public final C14090Tph A02;
    public final C14090Tph A03;
    public final C14090Tph A04;
    public final C14002To4 A05;

    public WVJ(View view, C328287Ef r7) {
        C14090Tph tph;
        0qQ.A0B(view, 1);
        this.A01 = view;
        C14002To4 to4 = new C14002To4();
        to4.A01(0.5f);
        to4.A02(200.0f);
        this.A05 = to4;
        C14090Tph tph2 = new C14090Tph(C14001To3.A0G, view);
        tph2.A01 = to4;
        this.A03 = tph2;
        C14090Tph tph3 = new C14090Tph(C14001To3.A0H, view);
        tph3.A01 = to4;
        this.A04 = tph3;
        if (r7 != null) {
            tph = new C14090Tph(new C67706MtK(), r7);
            tph.A00 = 1.1f;
            tph.A01 = 0.0f;
            C14002To4 to42 = new C14002To4();
            to42.A01(0.5f);
            to42.A02(200.0f);
            tph.A01 = to42;
            tph.A02 = 0.01f;
            tph.A03(0.01f * 0.75f);
        } else {
            tph = null;
        }
        this.A02 = tph;
    }

    public final void EKR(MotionEvent motionEvent) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            this.A00 = null;
        }
        C20202Wn2 wn2 = new C20202Wn2(motionEvent, this);
        this.A01.postDelayed(wn2, 150);
        this.A00 = wn2;
    }

    public final void Exa() {
        Float f;
        C14002To4 to4;
        C14002To4 to42;
        Runnable runnable = this.A00;
        Float f2 = null;
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            this.A00 = null;
        }
        if (((float) this.A05.A02) != 1.0f) {
            this.A03.A09(1.0f);
            this.A04.A09(1.0f);
        }
        C14090Tph tph = this.A02;
        if (tph == null || (to42 = tph.A01) == null) {
            f = null;
        } else {
            f = Float.valueOf((float) to42.A02);
        }
        if (!0qQ.A0I(f, 1.0f)) {
            if (!(tph == null || (to4 = tph.A01) == null)) {
                f2 = Float.valueOf((float) to4.A02);
            }
            if (!0qQ.A0I(f2, Float.POSITIVE_INFINITY) && tph != null) {
                tph.A09(1.0f);
            }
        }
    }
}
