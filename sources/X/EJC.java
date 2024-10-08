package X;

import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;

public final class EJC extends ExY {
    public final InfoCenterFactShareInfoIntf A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJC) {
                EJC ejc = (EJC) obj;
                if (!0qQ.A0K(this.A01, ejc.A01) || !0qQ.A0K(this.A00, ejc.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJC(InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, String str) {
        super(2FW.A11, str);
        this.A01 = str;
        this.A00 = infoCenterFactShareInfoIntf;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
