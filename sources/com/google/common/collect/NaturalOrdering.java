package com.google.common.collect;

import X.C264654Qt;
import java.io.Serializable;

public final class NaturalOrdering extends C264654Qt implements Serializable {
    public static final NaturalOrdering A00 = new Object();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    private Object readResolve() {
        return A00;
    }

    public final C264654Qt A01() {
        return ReverseNaturalOrdering.A00;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        obj2.getClass();
        return comparable.compareTo(obj2);
    }
}
