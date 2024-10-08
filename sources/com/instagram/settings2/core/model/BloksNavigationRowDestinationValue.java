package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C64185LSs;

public final class BloksNavigationRowDestinationValue extends C64185LSs {
    public final C64185LSs A00;
    public final C64185LSs A01;
    public final DictionaryValue A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BloksNavigationRowDestinationValue) {
                BloksNavigationRowDestinationValue bloksNavigationRowDestinationValue = (BloksNavigationRowDestinationValue) obj;
                if (!0qQ.A0K(this.A03, bloksNavigationRowDestinationValue.A03) || !0qQ.A0K(this.A00, bloksNavigationRowDestinationValue.A00) || !0qQ.A0K(this.A01, bloksNavigationRowDestinationValue.A01) || !0qQ.A0K(this.A02, bloksNavigationRowDestinationValue.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A03))) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public BloksNavigationRowDestinationValue(C64185LSs lSs, C64185LSs lSs2, DictionaryValue dictionaryValue, String str) {
        this.A03 = str;
        this.A00 = lSs;
        this.A01 = lSs2;
        this.A02 = dictionaryValue;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { appId: ");
        A1A.append(this.A03);
        A1A.append(", navbarTitle: ");
        A1A.append(this.A00);
        A1A.append(", params: ");
        A1A.append(this.A02);
        A1A.append(" , showTabBar: ");
        return C64185LSs.A01(this.A01, A1A);
    }
}
