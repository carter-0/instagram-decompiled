package X;

import android.os.Handler;

/* renamed from: X.VlL  reason: case insensitive filesystem */
public abstract class C18091VlL {
    public static void A00(Handler handler, C341737nR r2) {
        if (r2 == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            handler.post(new C19926Whv(r2));
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }

    public static void A01(Handler handler, C341737nR r2, Throwable th) {
        if (r2 == null) {
            throw new IllegalArgumentException("stateCallback cannot be null");
        } else if (handler != null) {
            handler.post(new C20130Wlq(r2, th));
        } else {
            throw new IllegalArgumentException("handler cannot be null");
        }
    }
}
