package X;

import com.instagram.user.model.User;

/* renamed from: X.BEy  reason: case insensitive filesystem */
public final class C42045BEy extends AnonymousClass0T0 implements DRD {
    public final long A00;
    public final long A01;
    public final User A02;
    public final Float A03;
    public final Float A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C42045BEy(User user, Float f, Float f2, String str, String str2, String str3, long j, long j2) {
        AnonymousClass7TF.A1F(str, 1, str3);
        this.A05 = str;
        this.A06 = str2;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = f;
        this.A02 = user;
        this.A04 = f2;
        this.A07 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42045BEy) {
                C42045BEy bEy = (C42045BEy) obj;
                if (!0qQ.A0K(this.A05, bEy.A05) || !0qQ.A0K(this.A06, bEy.A06) || this.A00 != bEy.A00 || this.A01 != bEy.A01 || !0qQ.A0K(this.A03, bEy.A03) || !0qQ.A0K(this.A02, bEy.A02) || !0qQ.A0K(this.A04, bEy.A04) || !0qQ.A0K(this.A07, bEy.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A00, (AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0E(this.A06)) * 31);
        return C41845B3m.A01(this.A07, (((((AnonymousClass7TF.A01(this.A01, A012) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31);
    }
}
