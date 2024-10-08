package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C64185LSs;

public final class FbtTextTokenValue extends C64185LSs {
    public final C64185LSs A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbtTextTokenValue) {
                FbtTextTokenValue fbtTextTokenValue = (FbtTextTokenValue) obj;
                if (!0qQ.A0K(this.A01, fbtTextTokenValue.A01) || !0qQ.A0K(this.A00, fbtTextTokenValue.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public FbtTextTokenValue(C64185LSs lSs, String str) {
        this.A01 = str;
        this.A00 = lSs;
    }
}
