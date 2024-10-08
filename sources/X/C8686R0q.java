package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.R0q  reason: case insensitive filesystem */
public final class C8686R0q extends R1F<K, V> {
    public final /* synthetic */ C8684R0i A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8686R0q(C8684R0i r0i) {
        super(r0i);
        this.A00 = r0i;
    }

    public final boolean remove(Object obj) {
        C8684R0i r0i = this.A00;
        if (!r0i.containsKey(obj)) {
            return false;
        }
        r0i.A01.remove(obj);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C8684R0i r0i = this.A00;
        Map map = r0i.A01;
        1UV r4 = r0i.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        boolean z = false;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (r4.apply(A1J) && collection.contains(A1J.getKey())) {
                A0u.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        C8684R0i r0i = this.A00;
        Map map = r0i.A01;
        1UV r4 = r0i.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        boolean z = false;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (r4.apply(A1J) && !collection.contains(A1J.getKey())) {
                A0u.remove();
                z = true;
            }
        }
        return z;
    }

    public final Object[] toArray(Object[] objArr) {
        return C11307SKv.A00(this).toArray(objArr);
    }

    public final Object[] toArray() {
        return C11307SKv.A00(this).toArray();
    }
}
