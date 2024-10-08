package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class R1K extends TSJ<E> {
    public final /* synthetic */ Set A00;
    public final /* synthetic */ Set A01;

    public R1K(Set set, Set set2) {
        this.A00 = set;
        this.A01 = set2;
    }

    public final boolean contains(Object obj) {
        if (!this.A00.contains(obj) || !this.A01.contains(obj)) {
            return false;
        }
        return true;
    }

    public final boolean containsAll(Collection collection) {
        if (!this.A00.containsAll(collection) || !this.A01.containsAll(collection)) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.A01, this.A00);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C8662Qz3(this);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.A00) {
            if (this.A01.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
