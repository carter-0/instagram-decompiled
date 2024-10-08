package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class R1E extends TSD<K> {
    public final /* synthetic */ LinkedListMultimap A00;

    public R1E(LinkedListMultimap linkedListMultimap) {
        this.A00 = linkedListMultimap;
    }

    public final boolean contains(Object obj) {
        return this.A00.A04.containsKey(obj);
    }

    public final Iterator iterator() {
        return new TMQ(this.A00);
    }

    public final boolean remove(Object obj) {
        LinkedListMultimap linkedListMultimap = this.A00;
        C13128TMm tMm = new C13128TMm(linkedListMultimap, obj);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C11307SKv.A02(A1C, tMm);
        List unmodifiableList = Collections.unmodifiableList(A1C);
        LinkedListMultimap.A02(linkedListMultimap, obj);
        return AnonymousClass7TE.A1b(unmodifiableList);
    }

    public final int size() {
        return this.A00.A04.size();
    }
}
