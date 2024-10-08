package com.instagram.settings2.core.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C64185LSs;
import java.util.List;

public final class ModalValue extends C64185LSs {
    public final C64185LSs A00;
    public final C64185LSs A01;
    public final C64185LSs A02;
    public final C64185LSs A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModalValue) {
                ModalValue modalValue = (ModalValue) obj;
                if (!0qQ.A0K(this.A03, modalValue.A03) || !0qQ.A0K(this.A04, modalValue.A04) || !0qQ.A0K(this.A01, modalValue.A01) || !0qQ.A0K(this.A02, modalValue.A02) || !0qQ.A0K(this.A00, modalValue.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public ModalValue(C64185LSs lSs, C64185LSs lSs2, C64185LSs lSs3, C64185LSs lSs4, List list) {
        this.A03 = lSs;
        this.A04 = list;
        this.A01 = lSs2;
        this.A02 = lSs3;
        this.A00 = lSs4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        A1A.append(this.A03);
        A1A.append(", ");
        A1A.append(this.A04);
        A1A.append(", ");
        A1A.append((Object) null);
        A1A.append(", ");
        A1A.append(this.A01);
        A1A.append(", ");
        A1A.append(this.A02);
        A1A.append(", ");
        return C64185LSs.A01(this.A00, A1A);
    }
}
