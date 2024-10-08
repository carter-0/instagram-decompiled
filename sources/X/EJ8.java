package X;

import com.instagram.save.model.SavedCollection;

public final class EJ8 extends ExY {
    public final SavedCollection A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ8) {
                EJ8 ej8 = (EJ8) obj;
                if (!0qQ.A0K(this.A01, ej8.A01) || !0qQ.A0K(this.A00, ej8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJ8(SavedCollection savedCollection, String str) {
        super(2FW.A0a, str);
        this.A01 = str;
        this.A00 = savedCollection;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
