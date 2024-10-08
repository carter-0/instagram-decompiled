package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cal  reason: case insensitive filesystem */
public abstract class C44224Cal {
    public static C42050BFd parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("multi_ad_media_items".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            XET parseFromJson = C41915B6n.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("multi_ads_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("multi_ads_unit_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (arrayList == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("multi_ad_media_items", r10, "MultiSubmitLeadAdResponse");
            } else if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("multi_ads_type", r10, "MultiSubmitLeadAdResponse");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new C42050BFd(arrayList, num.intValue(), str);
            } else {
                AnonymousClass7TF.A1L("multi_ads_unit_id", r10, "MultiSubmitLeadAdResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
