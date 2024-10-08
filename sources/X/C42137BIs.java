package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;

/* renamed from: X.BIs  reason: case insensitive filesystem */
public final class C42137BIs extends AnonymousClass0T0 implements DUY {
    public final FriendshipStatus A00;
    public final User A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;

    public final C42137BIs FGL(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42137BIs) {
                C42137BIs bIs = (C42137BIs) obj;
                if (!0qQ.A0K(this.A02, bIs.A02) || !0qQ.A0K(this.A03, bIs.A03) || !0qQ.A0K(this.A01, bIs.A01) || !0qQ.A0K(this.A00, bIs.A00) || !0qQ.A0K(this.A04, bIs.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean BrC() {
        return this.A02;
    }

    public final Integer CA7() {
        return this.A03;
    }

    public final User CCd() {
        return this.A01;
    }

    public final FriendshipStatus CFC() {
        return this.A00;
    }

    public final Integer CFy() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryPollVoter", C44983CoM.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C42137BIs(FriendshipStatus friendshipStatus, User user, Boolean bool, Integer num, Integer num2) {
        this.A02 = bool;
        this.A03 = num;
        this.A01 = user;
        this.A00 = friendshipStatus;
        this.A04 = num2;
    }

    public final DUY EAN(1E9 r1) {
        return this;
    }
}
