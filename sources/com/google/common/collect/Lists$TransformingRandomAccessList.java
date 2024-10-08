package com.google.common.collect;

import X.AnonymousClass2hV;
import X.AnonymousClass5GB;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Lists$TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final AnonymousClass2hV function;

    public final Object get(int i) {
        return this.function.apply(this.fromList.get(i));
    }

    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass5GB(this, this.fromList.listIterator(i));
    }

    public final Object remove(int i) {
        return this.function.apply(this.fromList.remove(i));
    }

    public final void removeRange(int i, int i2) {
        this.fromList.subList(i, i2).clear();
    }

    public final int size() {
        return this.fromList.size();
    }

    public Lists$TransformingRandomAccessList(AnonymousClass2hV r1, List list) {
        list.getClass();
        this.fromList = list;
        this.function = r1;
    }

    public final Iterator iterator() {
        return listIterator();
    }
}
