package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Tqp  reason: case insensitive filesystem */
public final class C14153Tqp extends AnonymousClass369 {
    public final C320216s0 A00;
    public final C14031ToX A01;
    public final Set A02 = new HashSet();

    public final Class C9I() {
        return AnonymousClass3UL.class;
    }

    public final void FN9(AnonymousClass345 r5, int i) {
        Object A012 = this.A01.A01(i);
        if (A012 instanceof AnonymousClass3UL) {
            AnonymousClass3UL r3 = (AnonymousClass3UL) A012;
            if (this.A02.add(r3.getId())) {
                this.A00.A0E(r3, 0);
            }
        }
    }

    public C14153Tqp(C320216s0 r2, C14031ToX toX) {
        this.A01 = toX;
        this.A00 = r2;
    }
}
