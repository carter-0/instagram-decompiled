package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.NZt  reason: case insensitive filesystem */
public final class C68861NZt extends C69606Noo {
    public final ImageUrl A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68861NZt) {
                C68861NZt nZt = (C68861NZt) obj;
                if (!0qQ.A0K(this.A02, nZt.A02) || !0qQ.A0K(this.A03, nZt.A03) || this.A06 != nZt.A06 || !0qQ.A0K(this.A01, nZt.A01) || this.A05 != nZt.A05 || !0qQ.A0K(this.A04, nZt.A04) || !0qQ.A0K(this.A00, nZt.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A05, C51975G9x.A05(this.A01, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A03)) * 31)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C68861NZt(ImageUrl imageUrl, User user, String str, String str2, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A01 = user;
        this.A05 = z2;
        this.A04 = list;
        this.A00 = imageUrl;
    }
}
