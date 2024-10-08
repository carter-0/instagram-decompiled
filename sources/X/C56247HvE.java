package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HvE  reason: case insensitive filesystem */
public final class C56247HvE {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.5u5, X.H2p] */
    public static C54195H2p parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? r3 = new C298815u5();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("ad_preview_media_items".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41938B7p parseFromJson = C41939B7q.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r3.A00 = arrayList;
                } else {
                    AnonymousClass93W.A00(r5, r3, A17);
                }
                r5.A0z();
            }
            r3.A01();
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
