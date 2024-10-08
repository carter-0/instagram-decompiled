package com.instagram.nido.impl;

import X.AnonymousClass7TE;
import X.C59713JUw;
import X.C65521Luk;
import X.C74486Pvg;

public abstract class NidoFeatureProviderImpl {
    public static boolean A00;

    public static final C74486Pvg A00(Integer num) {
        int intValue;
        C74486Pvg jUw;
        if (num == null || (intValue = num.intValue()) == -1) {
            return null;
        }
        if (intValue == 0) {
            jUw = new C59713JUw();
        } else if (intValue == 1) {
            jUw = new C65521Luk();
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return jUw;
    }
}
