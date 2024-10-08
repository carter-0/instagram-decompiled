package X;

import com.facebook.msys.mci.Execution;
import java.util.concurrent.Executor;

/* renamed from: X.5x2  reason: invalid class name and case insensitive filesystem */
public abstract class C300375x2 {
    public static final void A00(C62880wX r3) {
        0qQ.A0B(r3, 0);
        if (!C300385x3.A00.getAndSet(true)) {
            C300185wg r2 = (C300185wg) r3.A01(C300185wg.class, new C73920Pm0(r3, 36));
            Execution.initialize(r2.A0C, (Executor) null);
            C300395x4.A01(r2);
        }
    }
}
