package X;

import java.io.IOException;

/* renamed from: X.Chw  reason: case insensitive filesystem */
public abstract class C44624Chw {
    public static BIK parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            BEB beb = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("attribution_app_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("attribution_app_name".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("pivot_page_header".equals(A17)) {
                    beb = C44090CVh.parseFromJson(r10);
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("attribution_app_id", r10, "ClipsAttributionInfo");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("attribution_app_name", r10, "ClipsAttributionInfo");
            } else if (beb != null || !(r10 instanceof 0c9)) {
                return new BIK(beb, str, str2);
            } else {
                AnonymousClass7TF.A1L("pivot_page_header", r10, "ClipsAttributionInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
