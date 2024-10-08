package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C64185LSs;

public final class OpenUrlDestinationValue extends C64185LSs {
    public final C64185LSs A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenUrlDestinationValue) && 0qQ.A0K(this.A00, ((OpenUrlDestinationValue) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public OpenUrlDestinationValue(C64185LSs lSs) {
        this.A00 = lSs;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        return C64185LSs.A01(this.A00, A1A);
    }
}
