package com.facebook.papaya.store;

import X.0qQ;
import X.C16588Uxi;

public final class Property {
    public final long id;
    public final C16588Uxi type;
    public final Object value;

    private final int getTypeCode() {
        return this.type.A00;
    }

    public final long getId() {
        return this.id;
    }

    public final C16588Uxi getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public Property(long j, Object obj, int i) {
        this.id = j;
        this.type = C16588Uxi.values()[i];
        this.value = obj;
    }

    public Property(long j, Object obj, C16588Uxi uxi) {
        0qQ.A0B(uxi, 3);
        this.id = j;
        this.type = uxi;
        this.value = obj;
    }
}
