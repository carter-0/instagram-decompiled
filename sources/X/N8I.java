package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class N8I extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final DirectMessageIdentifier A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8I) {
                N8I n8i = (N8I) obj;
                if (!0qQ.A0K(this.A03, n8i.A03) || !0qQ.A0K(this.A02, n8i.A02) || this.A00 != n8i.A00 || this.A01 != n8i.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A03)) + this.A00) * 31) + this.A01;
    }

    public N8I(DirectMessageIdentifier directMessageIdentifier, String str, int i, int i2) {
        this.A03 = str;
        this.A02 = directMessageIdentifier;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
