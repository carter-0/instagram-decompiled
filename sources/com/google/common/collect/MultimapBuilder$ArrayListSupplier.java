package com.google.common.collect;

import X.C635813i;
import java.io.Serializable;
import java.util.ArrayList;

public final class MultimapBuilder$ArrayListSupplier implements C635813i, Serializable {
    public final int expectedValuesPerKey = 2;

    public final /* bridge */ /* synthetic */ Object get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
