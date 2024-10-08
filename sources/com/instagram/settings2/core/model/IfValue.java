package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C64185LSs;

public final class IfValue extends C64185LSs {
    public final C64185LSs A00;
    public final C64185LSs A01;
    public final C64185LSs A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IfValue) {
                IfValue ifValue = (IfValue) obj;
                if (!0qQ.A0K(this.A00, ifValue.A00) || !0qQ.A0K(this.A02, ifValue.A02) || !0qQ.A0K(this.A01, ifValue.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public IfValue(C64185LSs lSs, C64185LSs lSs2, C64185LSs lSs3) {
        this.A00 = lSs;
        this.A02 = lSs2;
        this.A01 = lSs3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        A1A.append(this.A00);
        A1A.append(" \n \t \n ");
        A1A.append(this.A02);
        A1A.append(" \n \t \n ");
        return C64185LSs.A01(this.A01, A1A);
    }
}
