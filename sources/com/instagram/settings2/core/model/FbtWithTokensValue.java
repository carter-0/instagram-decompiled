package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C64185LSs;
import java.util.List;

public final class FbtWithTokensValue extends C64185LSs {
    public final int A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbtWithTokensValue) {
                FbtWithTokensValue fbtWithTokensValue = (FbtWithTokensValue) obj;
                if (this.A00 != fbtWithTokensValue.A00 || !0qQ.A0K(this.A01, fbtWithTokensValue.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }

    public FbtWithTokensValue(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}
