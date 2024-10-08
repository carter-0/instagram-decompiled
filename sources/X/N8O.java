package X;

import java.util.List;

public final class N8O extends AnonymousClass0T0 implements C74245PrZ {
    public final C70703OGy A00;
    public final List A01;
    public final boolean A02;

    public N8O(C70703OGy oGy, List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = oGy;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8O) {
                N8O n8o = (N8O) obj;
                if (!0qQ.A0K(this.A01, n8o.A01) || this.A02 != n8o.A02 || !0qQ.A0K(this.A00, n8o.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CutoverOpenMessagesUpdatedAction(messagesRows=");
        A1A.append(this.A01);
        A1A.append(", hasLoadedOldestMessage=");
        A1A.append(this.A02);
        A1A.append(", viewModelGenerator=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
