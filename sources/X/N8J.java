package X;

import java.util.List;

public final class N8J extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final AnonymousClass7FE A00;
    public final C328667Fr A01;
    public final AnonymousClass7LQ A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8J) {
                N8J n8j = (N8J) obj;
                if (!0qQ.A0K(this.A02, n8j.A02) || !0qQ.A0K(this.A01, n8j.A01) || !0qQ.A0K(this.A03, n8j.A03) || !0qQ.A0K(this.A00, n8j.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02))));
    }

    public N8J(AnonymousClass7FE r1, C328667Fr r2, AnonymousClass7LQ r3, List list) {
        AnonymousClass7TG.A1Q(r2, list);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = list;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
