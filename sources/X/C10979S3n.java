package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.S3n  reason: case insensitive filesystem */
public final class C10979S3n {
    public final C10154RnV A00 = new C10154RnV();

    public final void A00() {
        this.A00.A00.getAndSet(0);
    }

    public final void A01(Object obj) {
        AtomicInteger atomicInteger = this.A00.A00;
        0qQ.A0B(atomicInteger, 0);
        if (atomicInteger.get() != 0) {
            throw new C13264TSf(this, obj);
        }
        throw new RL3();
    }
}
