package com.instagram.settings2.core.model;

import X.AnonymousClass7TE;
import X.C21248XQt;
import X.C64185LSs;

public final class DerivedStringValue extends C64185LSs {
    public final C21248XQt A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DerivedStringValue) && this.A00 == ((DerivedStringValue) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public DerivedStringValue(C21248XQt xQt) {
        this.A00 = xQt;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        return C64185LSs.A01(this.A00, A1A);
    }
}
