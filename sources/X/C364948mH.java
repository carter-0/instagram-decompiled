package X;

import android.view.Choreographer;

/* renamed from: X.8mH  reason: invalid class name and case insensitive filesystem */
public abstract class C364948mH {
    public Choreographer.FrameCallback A00;

    public void A00(long j) {
        C364938mG r5 = (C364938mG) this;
        C364898mC r4 = r5.A01;
        long j2 = C364898mC.A05;
        if (r4.A03 && !r4.A04) {
            if (r4.A00 <= j) {
                long j3 = C364898mC.A05;
                r4.A00 = j3 * ((j / j3) + 1);
                r5.A00.EF7();
                return;
            }
            r4.A02.A00(r4.A01);
        }
    }
}
