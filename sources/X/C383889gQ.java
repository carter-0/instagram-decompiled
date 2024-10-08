package X;

import java.util.concurrent.ExecutionException;

/* renamed from: X.9gQ  reason: invalid class name and case insensitive filesystem */
public final class C383889gQ extends C367958rq implements AnonymousClass2hV, C367968rr {
    public C383889gQ(C367658rM r2, C368338sS r3) {
        super(new C367698rQ(r2, r3));
    }

    public final void A00(Object obj) {
        C367698rQ r0 = this.A00;
        obj.getClass();
        int A00 = r0.A00(obj);
        r0.A01(A00).A05(r0.A0D, obj, A00, false);
    }

    public final Object apply(Object obj) {
        try {
            return this.A00.A02(obj);
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
