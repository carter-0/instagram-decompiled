package X;

import com.instagram.model.direct.DirectIfyXma;

public final class EJB extends ExY {
    public final DirectIfyXma A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJB) {
                EJB ejb = (EJB) obj;
                if (!0qQ.A0K(this.A01, ejb.A01) || !0qQ.A0K(this.A00, ejb.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJB(DirectIfyXma directIfyXma, String str) {
        super(2FW.A10, str);
        this.A01 = str;
        this.A00 = directIfyXma;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
