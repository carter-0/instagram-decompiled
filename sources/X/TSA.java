package X;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public final class TSA extends AbstractSequentialList implements Serializable {
    public final C13647TeE A00;
    public final List A01;

    public final void clear() {
        this.A01.clear();
    }

    public final ListIterator listIterator(int i) {
        return new C8545Qwj(this, this.A01.listIterator(i));
    }

    public final int size() {
        return this.A01.size();
    }

    public TSA(C13647TeE teE, List list) {
        list.getClass();
        this.A01 = list;
        this.A00 = teE;
    }
}
