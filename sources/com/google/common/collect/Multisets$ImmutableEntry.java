package com.google.common.collect;

import X.1J2;
import X.S79;
import java.io.Serializable;

public class Multisets$ImmutableEntry extends S79 implements Serializable {
    public static final long serialVersionUID = 0;
    public final int count;
    public final Object element;

    public Multisets$ImmutableEntry(Object obj, int i) {
        this.element = obj;
        this.count = i;
        1J2.A00(i, "count");
    }
}
