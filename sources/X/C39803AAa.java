package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.AAa  reason: case insensitive filesystem */
public final class C39803AAa {
    public static C384619hc parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(C11152SCh.MAX_FACTORIAL).equals(A17)) {
                    r1.A00 = AnonymousClass3HR.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("background_image_uris".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        r1.A02 = arrayList;
                    } else if ("sticker_id".equals(A17)) {
                        r1.A01 = AnonymousClass7TG.A0l(r4);
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
