package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

public final class N8K extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final DirectMessageIdentifier A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8K) {
                N8K n8k = (N8K) obj;
                if (!(0qQ.A0K(this.A01, n8k.A01) && this.A03 == n8k.A03 && this.A00 == n8k.A00 && this.A04 == n8k.A04 && 0qQ.A0K(this.A02, n8k.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A04, (AnonymousClass7TF.A09(this.A03, A0K) + this.A00) * 31));
    }

    public N8K(DirectMessageIdentifier directMessageIdentifier, List list, int i, boolean z, boolean z2) {
        this.A01 = directMessageIdentifier;
        this.A03 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A02 = list;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
