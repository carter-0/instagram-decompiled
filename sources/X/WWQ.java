package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class WWQ implements AnonymousClass3O9 {
    public List A00;
    public final QP6 A01;
    public final boolean A02;

    public final List A00() {
        List<C21017X9t> list = this.A00;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C21017X9t vXz : list) {
            A0r.add(new C17496VXz(vXz));
        }
        return A0r;
    }

    public final 1UQ B5J() {
        return 1UQ.A0N;
    }

    public final Integer B9V() {
        return (Integer) this.A01.A01;
    }

    public final C67241sS BJP() {
        return (C67241sS) this.A01.A03;
    }

    public final /* synthetic */ Integer BVp() {
        return null;
    }

    public final String C9L() {
        return this.A01.A06;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0N;
    }

    public final Integer CEl() {
        return (Integer) this.A01.A04;
    }

    public final String getId() {
        return this.A01.A05;
    }

    public WWQ(QP6 qp6) {
        ArrayList arrayList;
        this.A01 = qp6;
        this.A02 = AnonymousClass7TG.A1X((Boolean) qp6.A02);
        Collection collection = (Collection) qp6.A00;
        if (collection != null) {
            arrayList = new ArrayList(collection);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((UMz) ((C21017X9t) it.next())).A01 == null) {
                        it.remove();
                    }
                }
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
    }
}
