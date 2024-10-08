package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.N8g  reason: case insensitive filesystem */
public final class C68269N8g extends AnonymousClass0T0 implements C74251Prf {
    public final long A00;
    public final User A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68269N8g) {
                C68269N8g n8g = (C68269N8g) obj;
                if (!(0qQ.A0K(this.A02, n8g.A02) && 0qQ.A0K(this.A01, n8g.A01) && this.A00 == n8g.A00 && this.A05 == n8g.A05 && this.A04 == n8g.A04 && this.A06 == n8g.A06 && 0qQ.A0K(this.A03, n8g.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, C51972G9s.A07(this.A00, (AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31)))));
    }

    public C68269N8g(User user, String str, List list, long j, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A01 = user;
        this.A00 = j;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A03 = list;
    }
}
