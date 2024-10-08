package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;

/* renamed from: X.CLu  reason: case insensitive filesystem */
public final class C43950CLu extends 17P implements DTG {
    public final IGLiveFriendChatGuestStatus BzJ() {
        Object A0M = A0M(-892481550, DL6.A00);
        if (A0M != null) {
            return (IGLiveFriendChatGuestStatus) A0M;
        }
        throw AnonymousClass7TE.A0z("Required field 'status' was either missing or null for LiveChatInfo.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CLu, X.DTG] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44209CZw.A00(this));
    }

    public final long Amz() {
        Long A0L = A0L(739114850);
        if (A0L != null) {
            return A0L.longValue();
        }
        throw AnonymousClass7TE.A0z("Required field 'chat_id' was either missing or null for LiveChatInfo.");
    }

    public final long BIu() {
        Long A0L = A0L(1198966417);
        if (A0L != null) {
            return A0L.longValue();
        }
        throw AnonymousClass7TE.A0z("Required field 'inviter_id' was either missing or null for LiveChatInfo.");
    }

    public final BFL F5V() {
        return new BFL(BzJ(), Amz(), BIu());
    }
}
