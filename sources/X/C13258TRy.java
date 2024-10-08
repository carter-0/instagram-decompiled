package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.TRy  reason: case insensitive filesystem */
public final class C13258TRy extends AbstractList<String> implements C13976TnS, RandomAccess {
    public final C13976TnS A00;

    public final C13976TnS CBj() {
        return this;
    }

    public final List CBK() {
        return this.A00.CBK();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final Iterator iterator() {
        return new C13120TMe(this);
    }

    public final ListIterator listIterator(int i) {
        return new C13122TMg(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C13258TRy(C13976TnS tnS) {
        this.A00 = tnS;
    }
}
