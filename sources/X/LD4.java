package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;

public final class LD4 {
    public final DirectShareTarget A00;
    public final UserStoryTarget A01;
    public final ShareType A02;

    public final boolean A00() {
        if (this.A00 == null || this.A02 != ShareType.DIRECT_STORY_SHARE) {
            return false;
        }
        return true;
    }

    public LD4(DirectShareTarget directShareTarget, UserStoryTarget userStoryTarget, ShareType shareType) {
        C63159KsS ksS = C63159KsS.$redex_init_class;
        switch (shareType.ordinal()) {
            case 0:
            case 14:
            case 26:
                break;
            case 1:
            case 3:
            case 15:
                directShareTarget.getClass();
                break;
            case 2:
            case 16:
            case 25:
                userStoryTarget.getClass();
                break;
            default:
                throw AnonymousClass7TE.A0w("Unhandled share type sent");
        }
        this.A00 = directShareTarget;
        this.A01 = userStoryTarget;
        this.A02 = shareType;
    }
}
