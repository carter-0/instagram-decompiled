package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.LkB  reason: case insensitive filesystem */
public final class C64911LkB implements C273534mk {
    public final int A00;
    public final Object A01;

    public C64911LkB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void AGc() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C61868KPh kPh = (C61868KPh) obj;
            kPh.A0C.post(new C65902M3r(AnonymousClass1Nd.A00(kPh.A0A())));
            return;
        }
        AnonymousClass8ZV r1 = (AnonymousClass8ZV) obj;
        AtomicInteger atomicInteger = r1.A0E;
        if (atomicInteger == null) {
            throw AnonymousClass7TE.A0y();
        } else if (atomicInteger.decrementAndGet() == 0) {
            AnonymousClass8ZV.A01(r1);
        }
    }

    public final /* synthetic */ void AGe() {
    }
}
