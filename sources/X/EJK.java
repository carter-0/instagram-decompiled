package X;

import com.instagram.save.model.SavedCollection;

public final class EJK extends ExY {
    public final SavedCollection A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJK) {
                EJK ejk = (EJK) obj;
                if (!0qQ.A0K(this.A01, ejk.A01) || !0qQ.A0K(this.A00, ejk.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJK(SavedCollection savedCollection, String str) {
        super(2FW.A1Q, str);
        this.A01 = str;
        this.A00 = savedCollection;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
