package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class OTS {
    public final long A00;
    public final CountDownLatch A01;
    public final TimeUnit A02;
    public final boolean A03;

    public OTS(long j, TimeUnit timeUnit) {
        this.A01 = new CountDownLatch(1);
        this.A03 = true;
        this.A00 = j;
        this.A02 = timeUnit;
    }

    public OTS() {
        this.A01 = new CountDownLatch(1);
        this.A03 = false;
        this.A00 = -1;
        this.A02 = null;
    }
}
