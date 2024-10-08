package com.google.common.collect;

public enum BoundType {
    OPEN(false),
    CLOSED(true);
    
    public final boolean inclusive;

    /* access modifiers changed from: public */
    BoundType(boolean z) {
        this.inclusive = z;
    }
}
