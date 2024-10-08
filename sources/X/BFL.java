package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;

public final class BFL extends AnonymousClass0T0 implements DTG {
    public final long A00;
    public final long A01;
    public final IGLiveFriendChatGuestStatus A02;

    public BFL(IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus, long j, long j2) {
        0qQ.A0B(iGLiveFriendChatGuestStatus, 3);
        this.A00 = j;
        this.A01 = j2;
        this.A02 = iGLiveFriendChatGuestStatus;
    }

    public final BFL F5V() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFL) {
                BFL bfl = (BFL) obj;
                if (!(this.A00 == bfl.A00 && this.A01 == bfl.A01 && this.A02 == bfl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long Amz() {
        return this.A00;
    }

    public final long BIu() {
        return this.A01;
    }

    public final IGLiveFriendChatGuestStatus BzJ() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTLiveChatInfo", C44209CZw.A00(this));
    }

    public final int hashCode() {
        long j = this.A00;
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A01(this.A01, ((int) (j ^ (j >>> 32))) * 31));
    }
}
