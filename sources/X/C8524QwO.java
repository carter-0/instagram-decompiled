package X;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.QwO  reason: case insensitive filesystem */
public class C8524QwO extends C13239TRf implements List {
    public final /* synthetic */ C8528QwS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8524QwO(C13239TRf tRf, C8528QwS qwS, Object obj, List list) {
        super(tRf, qwS, obj, list);
        this.A00 = qwS;
    }

    public final void add(int i, Object obj) {
        A01();
        boolean isEmpty = this.A00.isEmpty();
        ((List) this.A00).add(i, obj);
        this.A00.A00++;
        if (isEmpty) {
            A00();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.A00).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.A00.size();
        this.A00.A00 += size2 - size;
        if (size != 0) {
            return addAll;
        }
        A00();
        return true;
    }

    public final Object get(int i) {
        A01();
        return ((List) this.A00).get(i);
    }

    public final int indexOf(Object obj) {
        A01();
        return ((List) this.A00).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        A01();
        return ((List) this.A00).lastIndexOf(obj);
    }

    public final ListIterator listIterator(int i) {
        A01();
        return new C8522QwM(this, i);
    }

    public final Object remove(int i) {
        A01();
        Object remove = ((List) this.A00).remove(i);
        C8528QwS qwS = this.A00;
        qwS.A00--;
        A02();
        return remove;
    }

    public final Object set(int i, Object obj) {
        A01();
        return ((List) this.A00).set(i, obj);
    }

    public final List subList(int i, int i2) {
        A01();
        C8528QwS qwS = this.A00;
        Object obj = this.A02;
        List subList = ((List) this.A00).subList(i, i2);
        C13239TRf tRf = this.A01;
        if (tRf == null) {
            tRf = this;
        }
        if (subList instanceof RandomAccess) {
            return new C8524QwO(tRf, qwS, obj, subList);
        }
        return new C8524QwO(tRf, qwS, obj, subList);
    }

    public final ListIterator listIterator() {
        A01();
        return new C8522QwM(this);
    }
}
