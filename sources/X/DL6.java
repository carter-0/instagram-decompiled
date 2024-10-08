package X;

import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;

public final class DL6 extends 0Yg implements 0sP {
    public static final DL6 A00 = new DL6();

    public DL6() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveFriendChatGuestStatus.A01.get(obj);
        if (obj2 == null) {
            return IGLiveFriendChatGuestStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
