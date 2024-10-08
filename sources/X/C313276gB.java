package X;

import android.view.Choreographer;

/* renamed from: X.6gB  reason: invalid class name and case insensitive filesystem */
public final class C313276gB implements Choreographer.FrameCallback {
    public final /* synthetic */ C313266gA A00;

    public C313276gB(C313266gA r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        C313266gA r5 = this.A00;
        if (r5.A08) {
            long j2 = r5.A02;
            long currentTimeMillis = System.currentTimeMillis();
            r5.A02 = currentTimeMillis;
            float f = r5.A01 + (((float) (currentTimeMillis - j2)) / r5.A00);
            r5.A01 = f;
            C255773uh r3 = r5.A04;
            if (r3 != null) {
                C313206g3 r2 = r5.A0B;
                r2.DaT(r3, f);
                if (r5.A01 >= 1.0f) {
                    r2.DaM(r3);
                } else {
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
    }
}
