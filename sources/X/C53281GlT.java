package X;

import com.instagram.user.model.User;

/* renamed from: X.GlT  reason: case insensitive filesystem */
public final class C53281GlT extends AnonymousClass0T0 {
    public final int A00;
    public final 1Xj A01;
    public final AnonymousClass3W1 A02;
    public final User A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53281GlT) {
                C53281GlT glT = (C53281GlT) obj;
                if (this.A04 != glT.A04 || this.A00 != glT.A00 || !0qQ.A0K(this.A03, glT.A03) || !0qQ.A0K(this.A01, glT.A01) || !0qQ.A0K(this.A02, glT.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, (C51965G9l.A05(this.A04) + this.A00) * 31)));
    }

    public C53281GlT(1Xj r1, AnonymousClass3W1 r2, User user, int i, boolean z) {
        this.A04 = z;
        this.A00 = i;
        this.A03 = user;
        this.A01 = r1;
        this.A02 = r2;
    }
}
