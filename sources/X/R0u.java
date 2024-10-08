package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class R0u extends TS2<K, Collection<V>> {
    public final /* synthetic */ QzM A00;

    public R0u(QzM qzM) {
        this.A00 = qzM;
    }

    /* renamed from: A00 */
    public final Collection remove(Object obj) {
        LinkedHashSet A0y;
        QzM qzM = this.A00;
        C257513xW r5 = qzM.A01;
        Collection collection = (Collection) r5.ACX().get(obj);
        if (collection != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Pxi.A1V(qzM.A00, obj, next)) {
                    it.remove();
                    A1C.add(next);
                }
            }
            if (!A1C.isEmpty()) {
                if (!(r5 instanceof AnonymousClass42M)) {
                    return Collections.unmodifiableList(A1C);
                }
                if (A1C instanceof Collection) {
                    A0y = new LinkedHashSet(A1C);
                } else {
                    A0y = DbS.A0y();
                    C11307SKv.A02(A0y, A1C.iterator());
                }
                return Collections.unmodifiableSet(A0y);
            }
        }
        return null;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean containsKey(Object obj) {
        QzM qzM = this.A00;
        Collection collection = (Collection) qzM.A01.ACX().get(obj);
        if (collection == null || QzM.A00(new C12610Szu(qzM, obj), collection).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        QzM qzM = this.A00;
        Collection collection = (Collection) qzM.A01.ACX().get(obj);
        if (collection != null) {
            Collection A002 = QzM.A00(new C12610Szu(qzM, obj), collection);
            if (!A002.isEmpty()) {
                return A002;
            }
        }
        return null;
    }
}
