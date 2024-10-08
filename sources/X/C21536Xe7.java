package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.Xe7  reason: case insensitive filesystem */
public abstract class C21536Xe7 {
    public static final C21411XaK A00 = new C21411XaK(new ReferenceQueue());

    public static void A00(Y9I y9i, Object obj) {
        C21411XaK xaK = A00;
        Y5S y5s = new Y5S(y9i, obj, xaK.A01);
        synchronized (xaK) {
            02V.A07(xaK.A02.add(y5s), (String) null);
            if (!xaK.A00) {
                xaK.A00 = true;
                new Y5I(xaK).start();
            }
        }
    }
}
