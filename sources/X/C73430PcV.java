package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.PcV  reason: case insensitive filesystem */
public final class C73430PcV implements Iterator {
    public final Iterator A00;
    public final Iterator A01;
    public final /* synthetic */ C2596942s A02;

    public C73430PcV(C2596942s r1, Iterator it, Iterator it2) {
        this.A02 = r1;
        this.A01 = it;
        this.A00 = it2;
    }

    public final boolean hasNext() {
        if (this.A01.hasNext() || this.A00.hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A1J;
        C299305uu r2;
        Iterator it = this.A01;
        if (it.hasNext()) {
            A1J = AnonymousClass7TE.A1J(it);
            r2 = new C299305uu(DbT.A13(A1J), (String) null);
        } else {
            Iterator it2 = this.A00;
            if (it2.hasNext()) {
                A1J = AnonymousClass7TE.A1J(it2);
                r2 = new C299305uu((String) null, DbT.A13(A1J));
            } else {
                throw new NoSuchElementException();
            }
        }
        return new C73433PcY(r2, A1J.getValue());
    }
}
