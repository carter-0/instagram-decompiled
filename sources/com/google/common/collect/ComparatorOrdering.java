package com.google.common.collect;

import X.C264654Qt;
import java.io.Serializable;
import java.util.Comparator;

public final class ComparatorOrdering extends C264654Qt implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }

    public ComparatorOrdering(Comparator comparator2) {
        comparator2.getClass();
        this.comparator = comparator2;
    }
}
