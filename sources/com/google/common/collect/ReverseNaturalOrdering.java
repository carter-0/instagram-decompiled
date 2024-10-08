package com.google.common.collect;

import X.C264654Qt;
import java.io.Serializable;

public final class ReverseNaturalOrdering extends C264654Qt implements Serializable {
    public static final ReverseNaturalOrdering A00 = new Object();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private Object readResolve() {
        return A00;
    }

    public final C264654Qt A01() {
        return NaturalOrdering.A00;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        obj.getClass();
        if (obj == comparable) {
            return 0;
        }
        return comparable.compareTo(obj);
    }
}
