package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Sgo  reason: case insensitive filesystem */
public abstract class C11802Sgo implements C13765Tgd {
    public final List A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SRb, X.QGR] */
    public static QGR A00(C11802Sgo sgo) {
        return new C11388SRb(sgo.A00);
    }

    public final List BKA() {
        return this.A00;
    }

    public final boolean CcS() {
        List list = this.A00;
        if (list.isEmpty() || (list.size() == 1 && ((ST4) list.get(0)).A03())) {
            return true;
        }
        return false;
    }

    public C11802Sgo(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        List list = this.A00;
        if (!list.isEmpty()) {
            A1A.append("values=");
            A1A.append(Arrays.toString(list.toArray()));
        }
        return A1A.toString();
    }
}
