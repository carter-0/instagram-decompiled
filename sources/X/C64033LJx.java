package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.LJx  reason: case insensitive filesystem */
public final class C64033LJx {
    public static C61294K1h parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("show_search".equals(A17)) {
                    r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("sticker_pack_id".equals(A17)) {
                        r1.A07 = AnonymousClass7TG.A0l(r4);
                    } else if ("stickers".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C317966o8 parseFromJson = C369258u7.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A08 = arrayList;
                    } else if (C273654mx.A00(169).equals(A17)) {
                        r1.A02 = AnonymousClass7TF.A0X(r4);
                    } else if ("has_next_page".equals(A17)) {
                        r1.A01 = AnonymousClass7TF.A0S(r4);
                    } else if ("avatar_revision_id".equals(A17)) {
                        r1.A04 = AnonymousClass7TG.A0l(r4);
                    } else if ("config_hash".equals(A17)) {
                        r1.A06 = AnonymousClass7TG.A0l(r4);
                    } else if ("avatar_id".equals(A17)) {
                        r1.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("avatar_style".equals(A17)) {
                        r1.A05 = AnonymousClass7TG.A0l(r4);
                    } else {
                        1XY.A01(r4, r1, A17);
                    }
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
