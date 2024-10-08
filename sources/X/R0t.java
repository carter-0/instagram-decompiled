package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class R0t<K, V> extends C13237TRd<K, V> {
    public final 1UV A00;
    public final Map A01;

    public final boolean remove(Object obj) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A01);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (this.A00.apply(A1J) && 2PP.A00(A1J.getValue(), obj)) {
                A0u.remove();
                return true;
            }
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A01);
        boolean z = false;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (this.A00.apply(A1J) && collection.contains(A1J.getValue())) {
                A0u.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A01);
        boolean z = false;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (this.A00.apply(A1J) && !collection.contains(A1J.getValue())) {
                A0u.remove();
                z = true;
            }
        }
        return z;
    }

    public R0t(1UV r1, Map map, Map map2) {
        super(map);
        this.A01 = map2;
        this.A00 = r1;
    }

    public final Object[] toArray(Object[] objArr) {
        return C11307SKv.A00(this).toArray(objArr);
    }

    public final Object[] toArray() {
        return C11307SKv.A00(this).toArray();
    }
}
