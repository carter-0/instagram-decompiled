package X;

import com.instagram.model.direct.DirectRoomsXma;

public final class EJL extends ExY {
    public final DirectRoomsXma A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJL) {
                EJL ejl = (EJL) obj;
                if (!0qQ.A0K(this.A01, ejl.A01) || !0qQ.A0K(this.A00, ejl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJL(DirectRoomsXma directRoomsXma, String str) {
        super(2FW.A1V, str);
        this.A01 = str;
        this.A00 = directRoomsXma;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
