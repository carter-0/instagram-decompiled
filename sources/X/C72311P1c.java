package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P1c  reason: case insensitive filesystem */
public final class C72311P1c implements C74543Pwc {
    public final StickerPackResponseItem A00;
    public final List A01;

    public final 0eP Bqn(N40 n40) {
        0qQ.A0B(n40, 0);
        List<DirectStoreSticker> list = this.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (DirectStoreSticker A002 : list) {
            C68196N5l A003 = OPH.A00(n40, A002, AnonymousClass05K.A0j, false);
            if (A003 != null) {
                A1C.add(A003);
            }
        }
        return AnonymousClass7TE.A1L(new C61154Jy6(this.A00.A03), A1C);
    }

    public final boolean Erk(N40 n40) {
        0qQ.A0B(n40, 0);
        if (!(!this.A01.isEmpty()) || !AnonymousClass7TF.A1W(n40.A00, AnonymousClass05K.A00)) {
            return false;
        }
        return true;
    }

    public final C61072JwA BDn(int i) {
        StickerPackResponseItem stickerPackResponseItem = this.A00;
        String str = stickerPackResponseItem.A00;
        if (str == null || stickerPackResponseItem.A01 == null) {
            return null;
        }
        return new C61072JwA(i, 11, (Object) new C61902KQv(new GSY(AnonymousClass05K.A01, (Integer) null, "sticker", stickerPackResponseItem.A02, 8), stickerPackResponseItem.A03, str));
    }

    public C72311P1c(StickerPackResponseItem stickerPackResponseItem, List list) {
        AnonymousClass7TG.A1O(stickerPackResponseItem, list);
        this.A00 = stickerPackResponseItem;
        this.A01 = list;
    }
}
