package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Ssf  reason: case insensitive filesystem */
public final class C12391Ssf implements B1A {
    public final /* synthetic */ 2KE A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ CountDownLatch A02;

    public C12391Ssf(2KE r1, Set set, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = set;
        this.A02 = countDownLatch;
    }

    public final void D5F(PyF pyF) {
        if (!pyF.A07() || pyF.A04() == null || !((C294495mY) pyF.A04()).A03) {
            this.A00.A00 = true;
        }
        Set set = this.A01;
        set.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
        CountDownLatch countDownLatch = this.A02;
        countDownLatch.countDown();
        if (countDownLatch.getCount() == 0) {
            2KE r1 = this.A00;
            if (!r1.A00) {
                2KE.A00(r1);
            }
        }
    }
}
