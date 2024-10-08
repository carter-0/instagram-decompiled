package com.facebook.mantle.common.mantledatavalue;

import X.0dV;
import X.0qQ;
import X.C301295yt;
import X.C301305yu;

public final class MantleDataValue {
    public static final C301295yt Companion = new Object();
    public final C301305yu type;
    public final Object value;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5yt, java.lang.Object] */
    static {
        0dV.A0C("mantle-common-mantleDataValue");
    }

    private final int getTypeCode() {
        return this.type.A00;
    }

    public final C301305yu getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public MantleDataValue(int i, Object obj) {
        this.type = C301305yu.values()[i];
        this.value = obj;
    }

    public MantleDataValue(C301305yu r2, Object obj) {
        0qQ.A0B(r2, 1);
        this.type = r2;
        this.value = obj;
    }
}
