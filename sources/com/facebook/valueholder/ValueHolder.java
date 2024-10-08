package com.facebook.valueholder;

public final class ValueHolder {
    public Object value;

    public final Object getValue() {
        return this.value;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
