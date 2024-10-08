package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C64185LSs;
import java.util.List;

public final class AndValue extends C64185LSs {
    public final List A00;

    public AndValue(List list) {
        this.A00 = list;
        if (list.size() <= 1) {
            throw AnonymousClass7TE.A0z("AndValue must have 2 or more values");
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AndValue) && 0qQ.A0K(this.A00, ((AndValue) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        return C64185LSs.A01(this.A00, A1A);
    }
}
