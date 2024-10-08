package X;

import com.instagram.direct.model.DirectAREffectShare;

public final class EJ3 extends ExY {
    public final DirectAREffectShare A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ3) {
                EJ3 ej3 = (EJ3) obj;
                if (!0qQ.A0K(this.A01, ej3.A01) || !0qQ.A0K(this.A00, ej3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJ3(DirectAREffectShare directAREffectShare, String str) {
        super(2FW.A0M, str);
        this.A01 = str;
        this.A00 = directAREffectShare;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
