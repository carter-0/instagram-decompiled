package X;

import com.instagram.user.model.FollowStatus;

public abstract class GTO {
    public static final Integer A00(FollowStatus followStatus) {
        int ordinal = followStatus.ordinal();
        if (ordinal == 5) {
            return AnonymousClass05K.A0C;
        }
        if (ordinal == 3) {
            return AnonymousClass05K.A01;
        }
        if (ordinal != 4) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A00;
    }
}
