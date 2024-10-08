package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C64185LSs;

public final class FbtLinkTokenValue extends C64185LSs {
    public final C64185LSs A00;
    public final C64185LSs A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbtLinkTokenValue) {
                FbtLinkTokenValue fbtLinkTokenValue = (FbtLinkTokenValue) obj;
                if (!0qQ.A0K(this.A02, fbtLinkTokenValue.A02) || !0qQ.A0K(this.A00, fbtLinkTokenValue.A00) || !0qQ.A0K(this.A01, fbtLinkTokenValue.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public FbtLinkTokenValue(C64185LSs lSs, C64185LSs lSs2, String str) {
        this.A02 = str;
        this.A00 = lSs;
        this.A01 = lSs2;
    }
}
