package X;

import com.instagram.api.schemas.AudioBrowserPlaylistType;

public final class DLW extends 0Yg implements 0sP {
    public static final DLW A00 = new DLW();

    public DLW() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AudioBrowserPlaylistType.A01.get(obj);
        if (obj2 == null) {
            return AudioBrowserPlaylistType.UNRECOGNIZED;
        }
        return obj2;
    }
}
