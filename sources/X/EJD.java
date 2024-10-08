package X;

import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;

public final class EJD extends ExY {
    public final InfoCenterShareInfoIntf A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJD) {
                EJD ejd = (EJD) obj;
                if (!0qQ.A0K(this.A01, ejd.A01) || !0qQ.A0K(this.A00, ejd.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJD(InfoCenterShareInfoIntf infoCenterShareInfoIntf, String str) {
        super(2FW.A12, str);
        this.A01 = str;
        this.A00 = infoCenterShareInfoIntf;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
