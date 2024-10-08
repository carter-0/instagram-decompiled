package com.google.common.collect;

import X.AnonymousClass2hV;
import X.R1N;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public class Lists$TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final AnonymousClass2hV function;

    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    public final ListIterator listIterator(int i) {
        return new R1N(this, this.fromList.listIterator(i));
    }

    public final void removeRange(int i, int i2) {
        this.fromList.subList(i, i2).clear();
    }

    public final int size() {
        return this.fromList.size();
    }

    public Lists$TransformingSequentialList(AnonymousClass2hV r1, List list) {
        list.getClass();
        this.fromList = list;
        this.function = r1;
    }
}
