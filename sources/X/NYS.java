package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class NYS extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass77B A00;
    public final boolean A01;
    public final AnonymousClass7FT A02;
    public final DirectMessageIdentifier A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYS) {
                NYS nys = (NYS) obj;
                if (!0qQ.A0K(this.A03, nys.A03) || !0qQ.A0K(this.A00, nys.A00) || !0qQ.A0K(this.A02, nys.A02) || this.A01 != nys.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0C(this.A00)) * 31));
    }

    public NYS(AnonymousClass77B r1, AnonymousClass7FT r2, DirectMessageIdentifier directMessageIdentifier, boolean z) {
        super(r2);
        this.A03 = directMessageIdentifier;
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
