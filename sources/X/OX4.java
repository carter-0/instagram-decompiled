package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public abstract class OX4 {
    public static final C268414dM A00(C61480nO r1, Callable callable, int i) {
        0qQ.A0B(r1, 1);
        C268414dM r0 = new C268414dM(callable, i);
        r1.ATE(r0);
        return r0;
    }

    public static final Object A01(1GK r1) {
        0qQ.A0B(r1, 0);
        A02(r1, new OTS());
        return r1.A07();
    }

    public static final boolean A02(1GK r4, OTS ots) {
        AnonymousClass1O9 r1;
        boolean z = true;
        r4.A03(new C72221Oyp((Object) ots, 1));
        boolean z2 = ots.A03;
        CountDownLatch countDownLatch = ots.A01;
        if (z2) {
            z = countDownLatch.await(ots.A00, ots.A02);
        } else {
            countDownLatch.await();
        }
        if (r4.A0D()) {
            Exception A06 = r4.A06();
            0qQ.A0A(A06);
            throw A06;
        } else if (!r4.A0B()) {
            return z;
        } else {
            synchronized (r4.A05) {
                r1 = r4.A00;
            }
            0qQ.A0A(r1);
            throw new C69544Nno(r1);
        }
    }
}
