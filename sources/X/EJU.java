package X;

import com.instagram.model.direct.DirectPendingLayeredXma;

public final class EJU extends ExY {
    public DirectPendingLayeredXma A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJU) {
                EJU eju = (EJU) obj;
                if (!0qQ.A0K(this.A02, eju.A02) || !0qQ.A0K(this.A01, eju.A01) || !0qQ.A0K(this.A03, eju.A03) || !0qQ.A0K(this.A00, eju.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJU(DirectPendingLayeredXma directPendingLayeredXma, String str, String str2, String str3) {
        super(2FW.A0c, str);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = directPendingLayeredXma;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
