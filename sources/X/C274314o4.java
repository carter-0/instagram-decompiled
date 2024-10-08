package X;

import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import java.io.IOException;

/* renamed from: X.4o4  reason: invalid class name and case insensitive filesystem */
public abstract class C274314o4 {
    public static C274324o7 parseFromJson(16F r18) {
        String str;
        String str2;
        16F r2 = r18;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            1Xj r6 = null;
            Boolean bool8 = null;
            Integer num = null;
            1Xj r7 = null;
            String str3 = null;
            RepostRestrictedReason repostRestrictedReason = null;
            1Xj r8 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("can_quote_attachment".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                    xDTTextAppQuoteAttachmentEligibility = (XDTTextAppQuoteAttachmentEligibility) XDTTextAppQuoteAttachmentEligibility.A01.get(str2);
                    if (xDTTextAppQuoteAttachmentEligibility == null) {
                        xDTTextAppQuoteAttachmentEligibility = XDTTextAppQuoteAttachmentEligibility.UNRECOGNIZED;
                    }
                } else if ("can_quote_post".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("can_repost".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("can_unlink_quote".equals(A0q)) {
                    bool3 = Boolean.valueOf(r2.A0d());
                } else if ("can_unlink_quoted_attachment".equals(A0q)) {
                    bool4 = Boolean.valueOf(r2.A0d());
                } else if ("is_reposted_by_viewer".equals(A0q)) {
                    bool5 = Boolean.valueOf(r2.A0d());
                } else if ("is_reshared_to_ig_by_viewer".equals(A0q)) {
                    bool6 = Boolean.valueOf(r2.A0d());
                } else if ("quoted_attachment_author_attribution_allowed".equals(A0q)) {
                    bool7 = Boolean.valueOf(r2.A0d());
                } else if ("quoted_attachment_post".equals(A0q)) {
                    r6 = 1Xj.A00(r2);
                } else if ("quoted_attachment_post_unavailable".equals(A0q)) {
                    bool8 = Boolean.valueOf(r2.A0d());
                } else if ("quoted_attachment_usage_count".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("quoted_post".equals(A0q)) {
                    r7 = 1Xj.A00(r2);
                } else if ("quoted_post_caption".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("repost_restricted_reason".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    repostRestrictedReason = (RepostRestrictedReason) RepostRestrictedReason.A01.get(str);
                    if (repostRestrictedReason == null) {
                        repostRestrictedReason = RepostRestrictedReason.UNRECOGNIZED;
                    }
                } else if ("reposted_post".equals(A0q)) {
                    r8 = 1Xj.A00(r2);
                }
                r2.A0z();
            }
            return new C274324o7(repostRestrictedReason, xDTTextAppQuoteAttachmentEligibility, r6, r7, r8, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, num, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
