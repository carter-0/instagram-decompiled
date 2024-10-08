package X;

import java.util.ArrayList;

/* renamed from: X.Jtp  reason: case insensitive filesystem */
public final class C60931Jtp extends AnonymousClass0T0 {
    public String A00 = null;
    public ArrayList A01 = AnonymousClass7TE.A1C();
    public boolean A02 = false;
    public boolean A03 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60931Jtp) {
                C60931Jtp jtp = (C60931Jtp) obj;
                if (!0qQ.A0K(this.A01, jtp.A01) || !0qQ.A0K(this.A00, jtp.A00) || this.A03 != jtp.A03 || this.A02 != jtp.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A00)) * 31));
    }
}
