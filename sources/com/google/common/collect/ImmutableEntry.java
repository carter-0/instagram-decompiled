package com.google.common.collect;

import X.AnonymousClass42Q;
import X.C66580MXl;
import java.io.Serializable;

public class ImmutableEntry extends AnonymousClass42Q implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object key;
    public final Object value;

    public final Object getKey() {
        return this.key;
    }

    public final Object getValue() {
        return this.value;
    }

    public ImmutableEntry(Object obj, Object obj2) {
        this.key = obj;
        this.value = obj2;
    }

    public final Object setValue(Object obj) {
        throw C66580MXl.A11();
    }
}
