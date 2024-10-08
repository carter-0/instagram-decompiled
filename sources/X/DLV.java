package X;

import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;

public final class DLV extends 0Yg implements 0sP {
    public static final DLV A00 = new DLV();

    public DLV() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = PendingShareToFriendsStoryBadgePreviewState.A01.get(obj);
        if (obj2 == null) {
            return PendingShareToFriendsStoryBadgePreviewState.UNRECOGNIZED;
        }
        return obj2;
    }
}
