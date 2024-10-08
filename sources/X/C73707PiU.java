package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.PiU  reason: case insensitive filesystem */
public final class C73707PiU extends 0Yg implements C62320sa {
    public static final C73707PiU A00 = new C73707PiU();

    public C73707PiU() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        OMB omb;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            Enumeration<String> aliases = AnonymousClass2HI.A00().aliases();
            0qQ.A07(aliases);
            AnonymousClass3T3 r7 = new AnonymousClass3T3(C242173Sx.A09(C74005PnW.A00, C242173Sx.A0A(C242173Sx.A0E(C74004PnV.A00, C242173Sx.A09(C74003PnU.A00, 2YX.A00(new 0sp(aliases)))))));
            while (r7.hasNext()) {
                AnonymousClass2HI.A00().deleteEntry(002.A0Q("W3C_PAYMENT_ENCRYPTION_KEY_", AnonymousClass7TE.A0R(r7.next())));
            }
            Enumeration<String> aliases2 = AnonymousClass2HI.A00().aliases();
            0qQ.A07(aliases2);
            Iterator it = 2YX.A00(new 0sp(aliases2)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (0qQ.A0K(next, 002.A0Q("W3C_PAYMENT_ENCRYPTION_KEY_", currentTimeMillis))) {
                    if (next != null) {
                        throw new SecurityException(002.A0Q("Please throttle your call, not more than one key per millisecond. Timestamp:", currentTimeMillis));
                    }
                }
            }
            omb = new OMB(currentTimeMillis);
        }
        return omb;
    }
}
