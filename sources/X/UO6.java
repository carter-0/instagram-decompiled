package X;

import java.util.List;

public final class UO6 extends AnonymousClass0T0 implements X4H {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public UO6(List list, int i, String str) {
        C16518UwN uwN;
        this.A00 = i;
        this.A03 = str;
        this.A01 = list;
        switch (i) {
            case 0:
                uwN = C16518UwN.HOW_IT_WORKS;
                break;
            case 1:
                uwN = C16518UwN.SERVICES;
                break;
            default:
                uwN = C16518UwN.SOCIAL_PROOF;
                break;
        }
        this.A02 = uwN;
    }

    public final C16518UwN CAZ() {
        return (C16518UwN) this.A02;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof UO6)) {
            return false;
        }
        UO6 uo6 = (UO6) obj;
        if (uo6.A00 != i || !0qQ.A0K(this.A03, uo6.A03) || !0qQ.A0K(this.A01, uo6.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A03));
    }
}
