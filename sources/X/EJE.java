package X;

import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;

public final class EJE extends ExY {
    public final InviteLinkShareInfo A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJE) {
                EJE eje = (EJE) obj;
                if (!0qQ.A0K(this.A01, eje.A01) || !0qQ.A0K(this.A00, eje.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJE(InviteLinkShareInfo inviteLinkShareInfo, String str) {
        super(2FW.A0S, str);
        this.A01 = str;
        this.A00 = inviteLinkShareInfo;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
