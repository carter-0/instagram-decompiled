package X;

import android.os.Handler;

/* renamed from: X.VlR  reason: case insensitive filesystem */
public abstract class C18097VlR {
    public static void A00(Handler handler, C391719tX r2, C341687nM r3) {
        if (r3 == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            handler.post(new C20139Wlz(r2, r3));
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }

    public static void A01(C341687nM r1, Handler handler) {
        if (r1 == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            handler.post(new C19943WiG(r1));
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }
}
