package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C64185LSs;

public final class EqualsValue extends C64185LSs {
    public final C64185LSs A00;
    public final C64185LSs A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EqualsValue) {
                EqualsValue equalsValue = (EqualsValue) obj;
                if (!0qQ.A0K(this.A00, equalsValue.A00) || !0qQ.A0K(this.A01, equalsValue.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public EqualsValue(C64185LSs lSs, C64185LSs lSs2) {
        this.A00 = lSs;
        this.A01 = lSs2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        A1A.append(this.A00);
        A1A.append(" == ");
        return C64185LSs.A01(this.A01, A1A);
    }
}
