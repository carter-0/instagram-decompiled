package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.S0i  reason: case insensitive filesystem */
public final class C10908S0i {
    public Object A00;

    public final void A00(Object obj, Object obj2) {
        if (this.A00 == obj) {
            this.A00 = obj2;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
