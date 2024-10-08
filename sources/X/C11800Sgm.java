package X;

import java.util.List;

/* renamed from: X.Sgm  reason: case insensitive filesystem */
public final class C11800Sgm implements C13765Tgd {
    public final List A00;

    public final C11388SRb ALS() {
        List list = this.A00;
        if (((ST4) AnonymousClass7TE.A13(list)).A03()) {
            return new QGV(list);
        }
        return new QGU(list);
    }

    public final List BKA() {
        return this.A00;
    }

    public final boolean CcS() {
        List list = this.A00;
        if (list.size() != 1 || !((ST4) list.get(0)).A03()) {
            return false;
        }
        return true;
    }

    public C11800Sgm(List list) {
        this.A00 = list;
    }
}
