package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.TRw  reason: case insensitive filesystem */
public final class C13256TRw extends AbstractList<String> implements C13979TnV, RandomAccess {
    public final C13979TnV A00;

    public final C13979TnV CBi() {
        return this;
    }

    public final Object Bjc(int i) {
        return this.A00.Bjc(i);
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

    public C13256TRw(C13979TnV tnV) {
        this.A00 = tnV;
    }

    public final void A7a(TAP tap) {
        throw C66580MXl.A11();
    }
}
