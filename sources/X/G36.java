package X;

import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;

public final class G36 extends 0Yg implements 0sP {
    public static final G36 A00 = new G36();

    public G36() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = TextAppUserFavoriteNotificationPostType.A01.get(obj);
        if (obj2 == null) {
            return TextAppUserFavoriteNotificationPostType.UNRECOGNIZED;
        }
        return obj2;
    }
}
