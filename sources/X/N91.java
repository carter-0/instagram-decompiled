package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class N91 extends AnonymousClass0T0 implements C74269Prx {
    public final long A00;
    public final String A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N91) {
                N91 n91 = (N91) obj;
                if (!(this.A00 == n91.A00 && 0qQ.A0K(this.A01, n91.A01) && this.A02 == n91.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A03 = (C51975G9x.A03(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "STARTED";
                break;
            case 2:
                str = "IN_PROGRESS";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return A03 + C51966G9m.A04(str, intValue);
    }

    public N91(Integer num, String str, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = num;
    }
}
