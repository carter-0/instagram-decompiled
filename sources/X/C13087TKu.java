package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.TKu  reason: case insensitive filesystem */
public final class C13087TKu implements Runnable {
    public static final C13087TKu A00 = new C13087TKu();

    public final void run() {
        boolean z;
        Number number;
        long currentTimeMillis = System.currentTimeMillis();
        C376609Iq r0 = C11339SNv.A01;
        if (r0 == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        long j = currentTimeMillis - r0.A01;
        long j2 = 0;
        Iterator A1G = AnonymousClass7TE.A1G(C11339SNv.A04);
        while (A1G.hasNext()) {
            PzN pzN = (PzN) A1G.next();
            0qQ.A0A(pzN);
            if (pzN instanceof C7846QbU) {
                z = true;
            } else {
                z = pzN instanceof PzP;
            }
            long j3 = 0;
            if (z) {
                Object obj = pzN.A03.get("timestamp");
                if ((obj instanceof Long) && (number = (Number) obj) != null) {
                    j3 = number.longValue();
                }
            }
            if (j3 >= j) {
                break;
            }
            A1G.remove();
            j2++;
        }
        AtomicLong atomicLong = C11339SNv.A05;
        atomicLong.set(atomicLong.get() - j2);
        if (atomicLong.get() != 0) {
            C11339SNv.A00();
        }
    }
}
