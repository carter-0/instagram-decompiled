package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C64185LSs;
import java.util.List;

public final class DictionaryValue extends C64185LSs {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DictionaryValue) {
                DictionaryValue dictionaryValue = (DictionaryValue) obj;
                if (!0qQ.A0K(this.A00, dictionaryValue.A00) || !0qQ.A0K(this.A01, dictionaryValue.A01)) {
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

    public DictionaryValue(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { keys: ");
        A1A.append(this.A00);
        A1A.append(", values: ");
        return C64185LSs.A01(this.A01, A1A);
    }
}
