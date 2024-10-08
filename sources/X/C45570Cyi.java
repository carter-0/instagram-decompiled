package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cyi  reason: case insensitive filesystem */
public final class C45570Cyi {
    public static CEP parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("accounts".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C68144N2k parseFromJson = C69749NrY.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else if ("body_text".equals(A17)) {
                    r5.A01 = AnonymousClass7TG.A0l(r6);
                } else if ("cover_image_url".equals(A17)) {
                    r5.A02 = AnonymousClass7TG.A0l(r6);
                } else if ("header_text".equals(A17)) {
                    r5.A03 = AnonymousClass7TG.A0l(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            List list = r5.A04;
            0qQ.A0A(list);
            r5.A00 = new BBC(r5.A01, r5.A02, r5.A03, list);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
