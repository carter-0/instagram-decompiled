package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.user.model.User;

public final class GEO extends AnonymousClass0T0 implements C59522JMu {
    public final C267324bN A00;
    public final User A01;
    public final Integer A02;
    public final boolean A03;

    public GEO(C267324bN r2, User user, Integer num, boolean z) {
        0qQ.A0B(num, 4);
        this.A00 = r2;
        this.A01 = user;
        this.A03 = z;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GEO) {
                GEO geo = (GEO) obj;
                if (!0qQ.A0K(this.A00, geo.A00) || !0qQ.A0K(this.A01, geo.A01) || this.A03 != geo.A03 || this.A02 != geo.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "CLOSE_FRIENDS";
                break;
            case 2:
                str = "OPAL";
                break;
            case 3:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "FAN_CLUB";
                break;
        }
        return A09 + C51966G9m.A04(str, intValue);
    }
}
