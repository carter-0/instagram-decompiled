package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Tl  reason: invalid class name and case insensitive filesystem */
public final class C308276Tl {
    public final List A00 = new ArrayList();

    public final void A01(Object obj) {
        A03(obj, 0);
    }

    public final void A02(Object obj) {
        A03(obj, 1);
    }

    public final AnonymousClass6Tm A00() {
        return new AnonymousClass6Tm(this.A00);
    }

    public final void A03(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw new IllegalArgumentException("Arguments must be continuous");
    }
}
