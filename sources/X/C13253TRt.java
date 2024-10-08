package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: X.TRt  reason: case insensitive filesystem */
public final class C13253TRt extends AbstractList implements C13978TnU, RandomAccess {
    public final C13978TnU A00;

    public final C13978TnU FPc() {
        return this;
    }

    public final Object FPj(int i) {
        return this.A00.FPj(i);
    }

    public final List FPv() {
        return this.A00.FPv();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C8565Qx3) this.A00).get(i);
    }

    public final Iterator iterator() {
        return new TMA(this);
    }

    public final ListIterator listIterator(int i) {
        return new C13126TMk(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C13253TRt(C13978TnU tnU) {
        this.A00 = tnU;
    }

    public final void FQ2(TAQ taq) {
        throw C66580MXl.A11();
    }
}
