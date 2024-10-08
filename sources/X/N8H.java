package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

public final class N8H extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final MessageIdentifier A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8H) {
                N8H n8h = (N8H) obj;
                if (!0qQ.A0K(this.A01, n8h.A01) || this.A00 != n8h.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public N8H(MessageIdentifier messageIdentifier, int i) {
        this.A01 = messageIdentifier;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
