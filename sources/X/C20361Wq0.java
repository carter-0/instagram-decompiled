package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Wq0  reason: case insensitive filesystem */
public final class C20361Wq0 implements Runnable {
    public static final C20361Wq0 A00 = new C20361Wq0();

    public final void run() {
        float andSet = (float) C18411VrD.A05.getAndSet(0);
        float andSet2 = (float) C18411VrD.A04.getAndSet(0);
        float andSet3 = (float) C18411VrD.A03.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > 0.0f) {
            float f2 = andSet / f;
            float f3 = andSet3 / f;
            if (andSet2 / f > 0.25f || f3 > 0.1f) {
                Iterator A0s = AnonymousClass7TF.A0s(C18411VrD.A02);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    C18411VrD.A00((VQi) A1J.getKey(), -C66582MXn.A08(A1J));
                }
            } else if (f2 > 0.98f) {
                Iterator A0s2 = AnonymousClass7TF.A0s(C18411VrD.A02);
                while (A0s2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                    C18411VrD.A00((VQi) A1J2.getKey(), C66582MXn.A08(A1J2));
                }
            }
            C18411VrD.A02.clear();
        }
        ((Handler) C18411VrD.A06.getValue()).postDelayed(C18411VrD.A00, 2000);
    }
}
