package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QnZ  reason: case insensitive filesystem */
public final class C8293QnZ extends C2818659w {
    public final AtomicReference A00 = new AtomicReference();

    public final void A9U(AnonymousClass5A7 r2) {
        0qQ.A0B(r2, 0);
        super.A9U(r2);
        Object obj = this.A00.get();
        if (obj != null) {
            r2.DvN(obj);
        }
    }

    public final void A02(Object obj) {
        super.A02(obj);
        this.A00.set(obj);
    }
}
