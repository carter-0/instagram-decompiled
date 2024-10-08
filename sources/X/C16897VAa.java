package X;

import com.instagram.business.promote.model.InstagramPromoteSuggestionReason;
import com.instagram.business.promote.model.SuggestedPromotion;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.VAa  reason: case insensitive filesystem */
public abstract class C16897VAa {
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.business.promote.model.SuggestedPromotion, java.lang.Object] */
    public static SuggestedPromotion parseFromJson(16F r4) {
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C273654mx.A00(143).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A03 = A0l;
                } else if ("organic_media_igid".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    obj.A05 = A0l2;
                } else if ("organic_media_fbid".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    obj.A04 = A0l3;
                } else if ("thumbnail_url".equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r4);
                    0qQ.A0B(A00, 0);
                    obj.A01 = A00;
                } else if ("reason".equals(A17)) {
                    String A1Q = r4.A1Q();
                    if (!(A1Q == null || A1Q.length() == 0)) {
                        if (A1Q.equalsIgnoreCase("MOST_COMMENTS")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.MOST_COMMENTS;
                        } else if (A1Q.equalsIgnoreCase("MOST_ENGAGEMENT")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.MOST_ENGAGEMENT;
                        } else if (A1Q.equalsIgnoreCase("MOST_LIKES")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.MOST_LIKES;
                        } else if (A1Q.equalsIgnoreCase("MOST_LIKES_LAST_28D")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.MOST_LIKES_LAST_28D;
                        } else if (A1Q.equalsIgnoreCase("MOST_REACH")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.MOST_REACH;
                        } else if (A1Q.equalsIgnoreCase("MOST_RECENT")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.MOST_RECENT;
                        }
                        obj.A00 = instagramPromoteSuggestionReason;
                    }
                    instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                    obj.A00 = instagramPromoteSuggestionReason;
                } else if (AnonymousClass000.A00(3024).equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
