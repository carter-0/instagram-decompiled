package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.enums.EnumEntries;

public abstract class OPJ {
    public static PUH parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Long l = null;
            C69304Nj5 nj5 = null;
            C68137N2b n2b = null;
            C317966o8 r8 = null;
            C317966o8 r9 = null;
            DirectStoreSticker directStoreSticker = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("sticker_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    EnumEntries enumEntries = C69304Nj5.A01;
                    0qQ.A0B(str, 0);
                    nj5 = (C69304Nj5) C69304Nj5.A00.get(str);
                    if (nj5 == null) {
                        nj5 = C69304Nj5.UNKNOWN;
                    }
                } else if ("giphy_sticker".equals(A17)) {
                    n2b = C70894OQm.parseFromJson(r14);
                } else if ("ai_sticker".equals(A17)) {
                    r8 = C369258u7.parseFromJson(r14);
                } else if (AnonymousClass000.A00(278).equals(A17)) {
                    r9 = C369258u7.parseFromJson(r14);
                } else if ("store_sticker".equals(A17)) {
                    directStoreSticker = D1W.parseFromJson(r14);
                } else {
                    l = C41847B3o.A14(r14, l, A17, "last_used_timestamp");
                }
                r14.A0z();
            }
            if (nj5 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sticker_type", r14, "RecentDirectSticker");
            } else if (l != null || !(r14 instanceof 0c9)) {
                return new PUH(r8, r9, nj5, n2b, directStoreSticker, l.longValue());
            } else {
                AnonymousClass7TF.A1L("last_used_timestamp", r14, "RecentDirectSticker");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(PUH puh) {
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        C69304Nj5 nj5 = puh.A03;
        EnumEntries enumEntries = C69304Nj5.A01;
        A0K.A0R("sticker_type", nj5.name());
        C68137N2b n2b = puh.A04;
        if (n2b != null) {
            A0K.A0q("giphy_sticker");
            C70894OQm.A00(A0K, n2b);
        }
        C317966o8 r1 = puh.A01;
        if (r1 != null) {
            A0K.A0q("ai_sticker");
            C369258u7.A00(A0K, r1);
        }
        C317966o8 r12 = puh.A02;
        if (r12 != null) {
            A0K.A0q(AnonymousClass000.A00(278));
            C369258u7.A00(A0K, r12);
        }
        DirectStoreSticker directStoreSticker = puh.A05;
        if (directStoreSticker != null) {
            A0K.A0q("store_sticker");
            D1W.A00(A0K, directStoreSticker);
        }
        A0K.A0Q("last_used_timestamp", puh.A00);
        return AnonymousClass7TG.A0k(A0K, A0v);
    }
}
