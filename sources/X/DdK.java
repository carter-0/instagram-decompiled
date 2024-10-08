package X;

import com.instagram.user.model.FollowStatus;

public abstract class DdK {
    public static final C46519DgM A00(FollowStatus followStatus, Boolean bool) {
        if (followStatus != null) {
            int ordinal = followStatus.ordinal();
            if (ordinal == 4) {
                return C46519DgM.FOLLOWING;
            }
            if (ordinal == 2) {
                return C46519DgM.LOADING;
            }
            if (ordinal != 3) {
                if (ordinal == 5) {
                    return C46519DgM.REQUESTED;
                }
            } else if (AnonymousClass7TF.A1Y(bool, true)) {
                return C46519DgM.FOLLOW_BACK;
            } else {
                return C46519DgM.FOLLOW;
            }
        }
        return C46519DgM.UNKNOWN;
    }
}
