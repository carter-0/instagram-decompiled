package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class UOK extends AnonymousClass0T0 implements C20854X1g {
    public final C20852X1e A00;
    public final C20853X1f A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public UOK(C20852X1e x1e, C20853X1f x1f, Integer num, String str, boolean z) {
        0qQ.A0B(x1e, 1);
        this.A00 = x1e;
        this.A03 = str;
        this.A02 = num;
        this.A04 = z;
        this.A01 = x1f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOK) {
                UOK uok = (UOK) obj;
                if (!0qQ.A0K(this.A00, uok.A00) || !0qQ.A0K(this.A03, uok.A03) || this.A02 != uok.A02 || this.A04 != uok.A04 || !0qQ.A0K(this.A01, uok.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A00));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "CLASSIC";
                break;
            case 2:
                str = "DASHED";
                break;
            case 3:
                str = "MODERNIZED";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A04, C51971G9r.A0F(str, intValue, A08)));
    }
}
