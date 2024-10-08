package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D2e  reason: case insensitive filesystem */
public abstract class C45705D2e {
    public static AdsIAWRatingInfo parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            Float f = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("banner_display_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("is_detail_page_enabled".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("rating_and_review_stars".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            if (r8.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r8.A1P();
                            }
                            arrayList.add(CUS.A00(str));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("rating_score".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r8);
                } else {
                    num = C41847B3o.A13(r8, num, A17, "review_count");
                }
                r8.A0z();
            }
            return new AdsIAWRatingInfo(bool, f, num, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AdsIAWRatingInfo adsIAWRatingInfo) {
        r2.A0c();
        String str = adsIAWRatingInfo.A03;
        if (str != null) {
            r2.A0R("banner_display_text", str);
        }
        Boolean bool = adsIAWRatingInfo.A00;
        if (bool != null) {
            r2.A0S("is_detail_page_enabled", bool.booleanValue());
        }
        List list = adsIAWRatingInfo.A04;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "rating_and_review_stars", list);
            while (A0s.hasNext()) {
                AdsRatingAndReviewStarType adsRatingAndReviewStarType = (AdsRatingAndReviewStarType) A0s.next();
                if (adsRatingAndReviewStarType != null) {
                    r2.A0t(adsRatingAndReviewStarType.A00);
                }
            }
            r2.A0Y();
        }
        Float f = adsIAWRatingInfo.A01;
        if (f != null) {
            r2.A0O("rating_score", f.floatValue());
        }
        Integer num = adsIAWRatingInfo.A02;
        if (num != null) {
            r2.A0P("review_count", num.intValue());
        }
        r2.A0Z();
    }
}
