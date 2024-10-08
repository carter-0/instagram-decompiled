package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class UOL extends AnonymousClass0T0 implements C20854X1g {
    public final C20852X1e A00;
    public final Integer A01;
    public final boolean A02;

    public UOL(C20852X1e x1e, Integer num, boolean z) {
        0qQ.A0B(x1e, 1);
        this.A00 = x1e;
        this.A02 = z;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOL) {
                UOL uol = (UOL) obj;
                if (!(0qQ.A0K(this.A00, uol.A00) && this.A02 == uol.A02 && this.A01 == uol.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00));
        int intValue = this.A01.intValue();
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
        return A09 + str.hashCode() + intValue;
    }

    public UOL() {
        this(C19662WdQ.A00, AnonymousClass05K.A00, false);
    }
}
