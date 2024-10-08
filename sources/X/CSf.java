package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.FriendshipStatusImpl;
import com.instagram.user.model.ImmutablePandoFriendshipStatus;
import com.instagram.user.model.User;

public final class CSf extends 17P implements DUY {
    public User A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSf] */
    public final Integer CA7() {
        return getOptionalIntValueByHashCode(3711);
    }

    public final User CCd() {
        return this.A00;
    }

    public final FriendshipStatus CFC() {
        return (FriendshipStatus) A05(-558283416, ImmutablePandoFriendshipStatus.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUY, X.CSf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44983CoM.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSf] */
    public final Boolean BrC() {
        return getOptionalBooleanValueByHashCode(3526267);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSf] */
    public final Integer CFy() {
        return getOptionalIntValueByHashCode(3625706);
    }

    public final DUY EAN(1E9 r2) {
        this.A00 = C41847B3o.A0y(r2, this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CSf] */
    public final C42137BIs FGL(1E9 r7) {
        User user;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(3526267);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(3711);
        User A0y = C41847B3o.A0y(r7, this);
        FriendshipStatusImpl friendshipStatusImpl = null;
        if (A0y != null) {
            user = C41846B3n.A0b(r7, A0y);
        } else {
            user = null;
        }
        FriendshipStatus CFC = CFC();
        if (CFC != null) {
            friendshipStatusImpl = CFC.FGn();
        }
        return new C42137BIs(friendshipStatusImpl, user, optionalBooleanValueByHashCode, optionalIntValueByHashCode, getOptionalIntValueByHashCode(3625706));
    }
}
