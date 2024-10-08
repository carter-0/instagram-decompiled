package X;

import android.view.Choreographer;

/* renamed from: X.6g7  reason: invalid class name and case insensitive filesystem */
public final class C313236g7 implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass6g5 A00;

    public C313236g7(AnonymousClass6g5 r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        AnonymousClass6g5 r5 = this.A00;
        if (r5.A07) {
            long j2 = r5.A02;
            long currentTimeMillis = System.currentTimeMillis();
            r5.A02 = currentTimeMillis;
            float f = r5.A00 + (((float) (currentTimeMillis - j2)) / r5.A01);
            r5.A00 = f;
            C313206g3 r3 = r5.A09;
            Object obj = r5.A05;
            if (obj != null) {
                r3.DaT(obj, f);
                if (r5.A00 >= 1.0f) {
                    Object obj2 = r5.A05;
                    if (obj2 != null) {
                        r3.DaM(obj2);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
