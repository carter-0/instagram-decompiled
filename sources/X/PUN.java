package X;

import java.util.Set;

public final class PUN implements Runnable {
    public final /* synthetic */ C70969OTq A00;

    public PUN(C70969OTq oTq) {
        this.A00 = oTq;
    }

    public final void run() {
        Set<Object> set = this.A00.A04;
        for (Object A1U : set) {
            DbS.A1U(A1U);
        }
        set.clear();
    }
}
