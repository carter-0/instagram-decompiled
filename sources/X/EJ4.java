package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;

public final class EJ4 extends ExY {
    public final DirectAnimatedMedia A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ4) {
                EJ4 ej4 = (EJ4) obj;
                if (!0qQ.A0K(this.A01, ej4.A01) || !0qQ.A0K(this.A00, ej4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJ4(DirectAnimatedMedia directAnimatedMedia, String str) {
        super(2FW.A0K, str);
        this.A01 = str;
        this.A00 = directAnimatedMedia;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
