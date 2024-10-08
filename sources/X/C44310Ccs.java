package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ccs  reason: case insensitive filesystem */
public abstract class C44310Ccs {
    public static XMA parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C233492vo r4 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("client_gap_rules".equals(A17)) {
                    r4 = C250043ko.parseFromJson(r7);
                } else if ("multi_ads_media_items".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            XET parseFromJson = C41915B6n.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r7.A0z();
            }
            if (arrayList != null || !(r7 instanceof 0c9)) {
                return new XMA(r4, arrayList);
            }
            AnonymousClass7TF.A1L("multi_ads_media_items", r7, "ReelsIAARenderData");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
