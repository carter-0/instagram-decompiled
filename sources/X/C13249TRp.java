package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.TRp  reason: case insensitive filesystem */
public final class C13249TRp extends AbstractList<String> implements C13977TnT, RandomAccess {
    public final C13977TnT A00;

    public final C13977TnT CBg() {
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

    public C13249TRp(C13977TnT tnT) {
        this.A00 = tnT;
    }

    public final void A7X(AnonymousClass5L9 r2) {
        throw C66580MXl.A11();
    }
}
