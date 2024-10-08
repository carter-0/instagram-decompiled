package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3FO  reason: invalid class name */
public abstract class AnonymousClass3FO {
    public static final 0zk A00 = new 0zk("CLOSED");

    public static final Object A00(0sL r5, 139 r6, long j) {
        while (true) {
            if (r6.A00 >= j && !r6.A03()) {
                return r6;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass13A.A00;
            Object obj = atomicReferenceFieldUpdater.get(r6);
            0zk r0 = A00;
            if (obj == r0) {
                return r0;
            }
            139 r1 = (139) ((AnonymousClass13A) obj);
            if (r1 == null) {
                r1 = (139) r5.invoke(Long.valueOf(r6.A00 + 1), r6);
                if (1Ev.A00(r6, (Object) null, r1, atomicReferenceFieldUpdater)) {
                    if (r6.A03()) {
                        r6.A02();
                    }
                }
            }
            r6 = r1;
        }
    }
}
