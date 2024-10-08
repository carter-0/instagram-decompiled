package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Glk  reason: case insensitive filesystem */
public final class C53298Glk extends AnonymousClass0T0 {
    public final ImageUrl A00;
    public final Reel A01;
    public final FollowStatus A02;
    public final User A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C53298Glk(ImageUrl imageUrl, Reel reel, FollowStatus followStatus, User user, String str, String str2, String str3) {
        0qQ.A0B(followStatus, 5);
        this.A00 = imageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A02 = followStatus;
        this.A03 = user;
        this.A01 = reel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53298Glk) {
                C53298Glk glk = (C53298Glk) obj;
                if (!0qQ.A0K(this.A00, glk.A00) || !0qQ.A0K(this.A05, glk.A05) || !0qQ.A0K(this.A06, glk.A06) || !0qQ.A0K(this.A04, glk.A04) || this.A02 != glk.A02 || !0qQ.A0K(this.A03, glk.A03) || !0qQ.A0K(this.A01, glk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, (((AnonymousClass7TF.A08(this.A05, A0K) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31)) + AnonymousClass7TE.A0L(this.A01);
    }
}
