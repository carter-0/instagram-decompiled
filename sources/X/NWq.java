package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

public final class NWq extends C69600Noi {
    public final DirectShareTarget A00;
    public final DirectThreadKey A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NWq) {
                NWq nWq = (NWq) obj;
                if (!0qQ.A0K(this.A02, nWq.A02) || !0qQ.A0K(this.A01, nWq.A01) || !0qQ.A0K(this.A00, nWq.A00) || !0qQ.A0K(this.A03, nWq.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C51975G9x.A05(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02))) * 31) + AnonymousClass7TG.A0E(this.A03);
    }

    public NWq(DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, String str, String str2) {
        this.A02 = str;
        this.A01 = directThreadKey;
        this.A00 = directShareTarget;
        this.A03 = str2;
    }
}
