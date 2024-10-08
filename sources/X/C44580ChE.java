package X;

import java.io.IOException;

/* renamed from: X.ChE  reason: case insensitive filesystem */
public abstract class C44580ChE {
    public static BIE parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            Boolean bool = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            BID bid = null;
            BIF bif = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("can_viewer_link_back_to_original_media_from_vcr".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("comment_info".equals(A17)) {
                    bid = C44578ChC.parseFromJson(r9);
                } else if ("original_media".equals(A17)) {
                    bif = C44581ChF.parseFromJson(r9);
                }
                r9.A0z();
            }
            if (bool == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_viewer_link_back_to_original_media_from_vcr", r9, "VisualRepliesInfo");
            } else if (bid == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("comment_info", r9, "VisualRepliesInfo");
            } else if (bif != null || !(r9 instanceof 0c9)) {
                return new BIE(bid, bif, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("original_media", r9, "VisualRepliesInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
