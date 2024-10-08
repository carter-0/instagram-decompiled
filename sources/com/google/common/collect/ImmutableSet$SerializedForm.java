package com.google.common.collect;

import java.io.Serializable;

public class ImmutableSet$SerializedForm implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public Object readResolve() {
        return ImmutableSet.A04(this.elements);
    }

    public ImmutableSet$SerializedForm(Object[] objArr) {
        this.elements = objArr;
    }
}
