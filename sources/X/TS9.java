package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

public final class TS9 extends AbstractSequentialList<V> {
    public final /* synthetic */ LinkedListMultimap A00;
    public final /* synthetic */ Object A01;

    public TS9(LinkedListMultimap linkedListMultimap, Object obj) {
        this.A00 = linkedListMultimap;
        this.A01 = obj;
    }

    public final ListIterator listIterator(int i) {
        return new C13128TMm(this.A00, this.A01, i);
    }

    public final int size() {
        C9131RQf rQf = (C9131RQf) this.A00.A04.get(this.A01);
        if (rQf == null) {
            return 0;
        }
        return rQf.A00;
    }
}
