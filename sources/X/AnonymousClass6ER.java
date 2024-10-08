package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6ER  reason: invalid class name */
public final class AnonymousClass6ER extends AtomicInteger implements C65051aA {
    public Object A00;
    public final 1aL A01;
    public final AnonymousClass6EN A02;
    public volatile boolean A03;

    public final void dispose() {
        if (!this.A03) {
            this.A03 = true;
            this.A02.A00(this);
        }
    }

    public AnonymousClass6ER(1aL r1, AnonymousClass6EN r2) {
        this.A02 = r2;
        this.A01 = r1;
    }
}
