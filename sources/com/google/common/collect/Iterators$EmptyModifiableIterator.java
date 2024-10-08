package com.google.common.collect;

import X.Pxe;
import X.Pxh;
import java.util.Iterator;

public enum Iterators$EmptyModifiableIterator implements Iterator {
    ;

    public final boolean hasNext() {
        return false;
    }

    public final void remove() {
        Pxh.A1T(false);
    }

    /* access modifiers changed from: public */
    Iterators$EmptyModifiableIterator() {
    }

    public final Object next() {
        throw Pxe.A1C();
    }
}
