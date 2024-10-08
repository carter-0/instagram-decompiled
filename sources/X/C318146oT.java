package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6oT  reason: invalid class name and case insensitive filesystem */
public abstract class C318146oT {
    public static final C269794fh A00;
    public static final C269794fh A01;

    public static final C269794fh A00(Looper looper) {
        C318206oZ r0 = C318406ot.A00;
        if (looper != null) {
            C318206oZ r02 = C318206oZ.$redex_init_class;
            return new C269794fh(new C318426ov(new Handler(looper), true));
        }
        throw new NullPointerException("looper == null");
    }

    static {
        0nX r2 = new 0nX(-20);
        C318206oZ r0 = C318156oU.A00;
        A00 = new C269794fh(new C318396os(r2));
        C318206oZ r1 = C318406ot.A00;
        if (r1 != null) {
            A01 = new C269794fh(r1);
            return;
        }
        throw new NullPointerException("scheduler == null");
    }
}
