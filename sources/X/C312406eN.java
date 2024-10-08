package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6eN  reason: invalid class name and case insensitive filesystem */
public final class C312406eN {
    public static synchronized C312426eP A00(Context context, C312156dv r13, 0lg r14) {
        C312426eP r0;
        synchronized (C312406eN.class) {
            Executor r6 = new 0nQ(0nY.A00(), 575, 3, false, false);
            Map map = C312426eP.A01;
            r0 = (C312426eP) r14.A01(C312426eP.class, new C312496eW(context, r13, r14, r6, r6, r6));
        }
        return r0;
    }
}
