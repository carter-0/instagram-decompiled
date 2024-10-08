package X;

import com.instagram.user.model.User;

/* renamed from: X.Jtq  reason: case insensitive filesystem */
public final class C60932Jtq extends AnonymousClass0T0 {
    public final long A00;
    public final C60954JuC A01;
    public final User A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60932Jtq) {
                C60932Jtq jtq = (C60932Jtq) obj;
                if (!0qQ.A0K(this.A01, jtq.A01) || !0qQ.A0K(this.A03, jtq.A03) || this.A04 != jtq.A04 || !0qQ.A0K(this.A02, jtq.A02) || this.A00 != jtq.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A01)))) + C51968G9o.A03(this.A00);
    }

    public C60932Jtq(C60954JuC juC, User user, String str, long j, boolean z) {
        C51974G9v.A1L(juC, str, user);
        this.A01 = juC;
        this.A03 = str;
        this.A04 = z;
        this.A02 = user;
        this.A00 = j;
    }
}
