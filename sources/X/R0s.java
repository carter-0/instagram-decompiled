package X;

import com.google.common.collect.Maps$EntryFunction;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class R0s extends C13237TRd<K, Collection<V>> {
    public final /* synthetic */ R0u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R0s(R0u r0u) {
        super(r0u);
        this.A00 = r0u;
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Collection)) {
            return false;
        }
        Collection collection = (Collection) obj;
        QzM qzM = this.A00.A00;
        Iterator A0u = AnonymousClass7TF.A0u(qzM.A01.ACX());
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Collection A002 = QzM.A00(new C12610Szu(qzM, key), Pxe.A18(A1J));
            if (!A002.isEmpty() && collection.equals(A002)) {
                if (A002.size() == Pxe.A18(A1J).size()) {
                    A0u.remove();
                    return true;
                }
                A002.clear();
                return true;
            }
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        return this.A00.A00.A08(new T03(Maps$EntryFunction.A01, new T00(collection)));
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.A00.A08(new T03(Maps$EntryFunction.A01, new T02(new T00(collection))));
    }
}
