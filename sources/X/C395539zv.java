package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import java.io.IOException;

/* renamed from: X.9zv  reason: invalid class name and case insensitive filesystem */
public abstract class C395539zv {
    public static C66091jJ parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C66091jJ r0 = new C66091jJ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A02 = parseFromJson;
                } else if ("sticker_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A04 = str;
                } else if ("store_sticker".equals(A17)) {
                    DirectStoreSticker parseFromJson2 = D1W.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A03 = parseFromJson2;
                } else if ("replied_to_message".equals(A17)) {
                    r0.A01 = C254933tI.A00(r4);
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
