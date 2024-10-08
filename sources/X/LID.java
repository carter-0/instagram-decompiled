package X;

import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class LID {
    public static C63815L7w parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C63815L7w l7w = new C63815L7w();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("branded_content_tags".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            BrandedContentTag parseFromJson = LJX.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    l7w.A02 = arrayList;
                } else if ("media_gating_info".equals(A17)) {
                    l7w.A00 = C45512Cxm.parseFromJson(r5);
                } else if ("is_paid_partnership".equals(A17)) {
                    l7w.A03 = r5.A0d();
                } else if ("branded_content_project_metadata".equals(A17)) {
                    l7w.A01 = LGt.parseFromJson(r5);
                }
                r5.A0z();
            }
            return l7w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C63815L7w l7w) {
        r2.A0c();
        16P.A03(r2, "branded_content_tags");
        Iterator it = l7w.A02.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0l = JTO.A0l(it);
            if (A0l != null) {
                LJX.A00(r2, A0l);
            }
        }
        r2.A0Y();
        if (l7w.A00 != null) {
            r2.A0q("media_gating_info");
            C45512Cxm.A00(r2, l7w.A00);
        }
        r2.A0S("is_paid_partnership", l7w.A03);
        if (l7w.A01 != null) {
            r2.A0q("branded_content_project_metadata");
            LGt.A00(r2, l7w.A01);
        }
        r2.A0Z();
    }
}
