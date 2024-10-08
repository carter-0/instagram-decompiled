package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: X.TRu  reason: case insensitive filesystem */
public final class C13254TRu extends AbstractList<String> implements C41844B3l, RandomAccess {
    public final C41844B3l A00;

    public final C41844B3l CBh() {
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

    public C13254TRu(C41844B3l b3l) {
        this.A00 = b3l;
    }

    public final void A7Z(AnonymousClass97R r2) {
        throw C66580MXl.A11();
    }
}
