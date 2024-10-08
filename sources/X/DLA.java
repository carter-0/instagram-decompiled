package X;

import com.instagram.api.schemas.MediaNoticeIcon;

public final class DLA extends 0Yg implements 0sP {
    public static final DLA A00 = new DLA();

    public DLA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MediaNoticeIcon.A01.get(obj);
        if (obj2 == null) {
            return MediaNoticeIcon.UNRECOGNIZED;
        }
        return obj2;
    }
}
