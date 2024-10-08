package X;

import com.instagram.api.schemas.TextAppOnlineStatusVisibilitySetting;

public final class G44 extends 0Yg implements 0sP {
    public static final G44 A00 = new G44();

    public G44() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = TextAppOnlineStatusVisibilitySetting.A01.get(obj);
        if (obj2 == null) {
            return TextAppOnlineStatusVisibilitySetting.UNRECOGNIZED;
        }
        return obj2;
    }
}
