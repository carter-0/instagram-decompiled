package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.LHv  reason: case insensitive filesystem */
public final class C63995LHv {
    public static K1S parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            K1S k1s = new K1S();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("has_next_page".equals(A17)) {
                    k1s.A00 = AnonymousClass7TF.A0S(r5);
                } else {
                    ArrayList arrayList = null;
                    if (C273654mx.A00(169).equals(A17)) {
                        k1s.A01 = AnonymousClass7TG.A0l(r5);
                    } else if ("show_search".equals(A17)) {
                        r5.A0d();
                    } else if ("stickers".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C317966o8 parseFromJson = C369258u7.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        k1s.A02 = arrayList;
                    } else {
                        1XY.A01(r5, k1s, A17);
                    }
                }
                r5.A0z();
            }
            return k1s;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
