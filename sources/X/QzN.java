package X;

import com.google.common.collect.ConcurrentHashMultiset;
import java.util.ArrayList;

public final class QzN extends AnonymousClass3W5<E>.EntrySet {
    public final /* synthetic */ ConcurrentHashMultiset A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QzN(ConcurrentHashMultiset concurrentHashMultiset) {
        super(concurrentHashMultiset);
        this.A00 = concurrentHashMultiset;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QzN, java.util.AbstractCollection] */
    public final Object[] toArray(Object[] objArr) {
        ArrayList A0v = DbS.A0v(C256393vh.computeArrayListCapacity(size()));
        C11307SKv.A02(A0v, iterator());
        return A0v.toArray(objArr);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QzN, java.util.AbstractCollection] */
    public final Object[] toArray() {
        ArrayList A0v = DbS.A0v(C256393vh.computeArrayListCapacity(size()));
        C11307SKv.A02(A0v, iterator());
        return A0v.toArray();
    }
}
