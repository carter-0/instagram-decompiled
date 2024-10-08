package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C64185LSs;

public final class BloksActionNavigationRowDestinationValue extends C64185LSs {
    public final DictionaryValue A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BloksActionNavigationRowDestinationValue) {
                BloksActionNavigationRowDestinationValue bloksActionNavigationRowDestinationValue = (BloksActionNavigationRowDestinationValue) obj;
                if (!0qQ.A0K(this.A01, bloksActionNavigationRowDestinationValue.A01) || !0qQ.A0K(this.A00, bloksActionNavigationRowDestinationValue.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TE.A0O(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BloksActionNavigationRowDestinationValue(DictionaryValue dictionaryValue, String str) {
        this.A01 = str;
        this.A00 = dictionaryValue;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { appId: ");
        A1A.append(this.A01);
        A1A.append(", params: ");
        return C64185LSs.A01(this.A00, A1A);
    }
}
