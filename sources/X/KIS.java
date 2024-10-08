package X;

import java.util.Iterator;
import java.util.Map;

public final class KIS extends 0ng {
    public final void run() {
        Iterator A0u = AnonymousClass7TF.A0u(C18409VrB.A00);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            C16522UwR uwR = (C16522UwR) A1J.getKey();
            AnonymousClass9DH r1 = (AnonymousClass9DH) A1J.getValue();
            if (r1.A02()) {
                Object A00 = r1.A00();
                if (A00 != null) {
                    C18409VrB.A01.put(uwR, A00);
                }
            } else {
                r1.A00 = new C64382Laz(uwR);
                r1.A00();
            }
        }
    }

    public KIS() {
        super(2022716810, 3, false, false);
    }
}
