package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.68p  reason: invalid class name and case insensitive filesystem */
public final class C3034068p extends 1aJ {
    public final int A00 = 1;
    public final C3033868n A01;
    public final C3033168g A02;
    public final AtomicInteger A03;

    public C3034068p(C3033868n r2, C3033168g r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = new AtomicInteger();
    }

    public final void A02(1aL r4) {
        C3033168g r2 = this.A02;
        r2.Eyt(r4);
        if (this.A03.incrementAndGet() == this.A00) {
            r2.A03(this.A01);
        }
    }
}
