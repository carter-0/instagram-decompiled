package X;

import com.facebook.proxygen.RootCACallbacks;

/* renamed from: X.XyJ  reason: case insensitive filesystem */
public final class C22261XyJ implements RootCACallbacks {
    public static final C22261XyJ A00 = new C22261XyJ();

    public final byte[][] getSystemRootCAs() {
        C11342SNz sNz = XMQ.A00;
        if (sNz != null) {
            return sNz.A02();
        }
        throw AnonymousClass7TE.A0y();
    }
}
