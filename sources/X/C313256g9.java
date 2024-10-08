package X;

import android.view.Choreographer;

/* renamed from: X.6g9  reason: invalid class name and case insensitive filesystem */
public final class C313256g9 implements Choreographer.FrameCallback {
    public final /* synthetic */ C313246g8 A00;

    public C313256g9(C313246g8 r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        C313246g8 r5 = this.A00;
        if (r5.A07) {
            long j2 = r5.A02;
            long currentTimeMillis = System.currentTimeMillis();
            r5.A02 = currentTimeMillis;
            float f = r5.A01 + (((float) (currentTimeMillis - j2)) / r5.A00);
            r5.A01 = f;
            C255773uh r3 = r5.A04;
            if (r3 != null) {
                C313206g3 r2 = r5.A0A;
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
