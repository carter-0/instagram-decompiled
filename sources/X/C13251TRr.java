package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: X.TRr  reason: case insensitive filesystem */
public final class C13251TRr extends AbstractList implements C13975TnR, RandomAccess {
    public final C13975TnR A00;

    public final C13975TnR FPa() {
        return this;
    }

    public final List FPq() {
        return this.A00.FPq();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C8421QuC) this.A00).get(i);
    }

    public final Iterator iterator() {
        return new TM8(this);
    }

    public final ListIterator listIterator(int i) {
        return new C13125TMj(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C13251TRr(C13975TnR tnR) {
        this.A00 = tnR;
    }
}
