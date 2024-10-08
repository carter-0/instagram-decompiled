package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import java.util.List;

public abstract class OPH {
    public static final C68196N5l A00(N40 n40, DirectStoreSticker directStoreSticker, Integer num, boolean z) {
        0qQ.A0B(directStoreSticker, 1);
        if (JTP.A0o(directStoreSticker.A00.A00).length() == 0) {
            return null;
        }
        return new C68196N5l(new C61064Jw2(Boolean.valueOf(z), num, 4, n40.A01()), directStoreSticker);
    }

    public static final 0eP A01(C232262tL r1, C232262tL r2, N40 n40, List list, int i) {
        0eP A1L;
        if (i == -1 || list.size() <= i) {
            A1L = AnonymousClass7TE.A1L(r1, list);
        } else {
            A1L = AnonymousClass7TE.A1L(r2, 00k.A0d(list, i));
        }
        if (n40.A01()) {
            return AnonymousClass7TE.A1L((Object) null, A1L.A01);
        }
        return A1L;
    }
}
