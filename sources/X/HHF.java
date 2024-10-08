package X;

import java.util.List;

public final class HHF extends C55545HjR {
    public final Integer A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HHF(Integer num, List list) {
        super(list);
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HHF) {
                HHF hhf = (HHF) obj;
                if (!0qQ.A0K(this.A01, hhf.A01) || this.A00 != hhf.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AnonymousClass7TE.A0K(this.A01);
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "FAILURE";
                break;
            default:
                str = "LOADING";
                break;
        }
        return A0K + C51966G9m.A04(str, intValue);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HorizontalAccountsResult(accounts=");
        A1A.append(this.A01);
        A1A.append(Pxd.A00(120));
        switch (this.A00.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "FAILURE";
                break;
            default:
                str = "LOADING";
                break;
        }
        return C51975G9x.A0i(str, A1A);
    }
}
