package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

public final class TS8 extends AbstractSequentialList<Map.Entry<K, V>> {
    public final /* synthetic */ LinkedListMultimap A00;

    public TS8(LinkedListMultimap linkedListMultimap) {
        this.A00 = linkedListMultimap;
    }

    public final ListIterator listIterator(int i) {
        return new C13127TMl(this.A00, i);
    }

    public final int size() {
        return this.A00.A01;
    }
}
