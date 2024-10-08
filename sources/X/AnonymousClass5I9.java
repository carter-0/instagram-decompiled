package X;

import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5I9  reason: invalid class name */
public abstract class AnonymousClass5I9 {
    public static AdsRatingInfo parseFromJson(16F r9) {
        String str;
        String str2;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str3 = null;
            Boolean bool = null;
            AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = null;
            ArrayList arrayList = null;
            Float f = null;
            Integer num = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("display_text".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("is_iaw_banner_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if ("rating_and_review_display_format".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                    adsRatingAndReviewDisplayFormat = (AdsRatingAndReviewDisplayFormat) AdsRatingAndReviewDisplayFormat.A01.get(str2);
                    if (adsRatingAndReviewDisplayFormat == null) {
                        adsRatingAndReviewDisplayFormat = AdsRatingAndReviewDisplayFormat.UNRECOGNIZED;
                    }
                } else if ("rating_and_review_stars".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            if (r9.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r9.A1P();
                            }
                            arrayList.add(CUS.A00(str));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("rating_score".equals(A0q)) {
                    f = new Float(r9.A0U());
                } else if ("review_count".equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                }
                r9.A0z();
            }
            return new AdsRatingInfo(adsRatingAndReviewDisplayFormat, bool, f, num, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, AdsRatingInfo adsRatingInfo) {
        r2.A0c();
        String str = adsRatingInfo.A04;
        if (str != null) {
            r2.A0R("display_text", str);
        }
        Boolean bool = adsRatingInfo.A01;
        if (bool != null) {
            r2.A0S("is_iaw_banner_enabled", bool.booleanValue());
        }
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = adsRatingInfo.A00;
        if (adsRatingAndReviewDisplayFormat != null) {
            r2.A0R("rating_and_review_display_format", adsRatingAndReviewDisplayFormat.A00);
        }
        List<AdsRatingAndReviewStarType> list = adsRatingInfo.A05;
        if (list != null) {
            16P.A03(r2, "rating_and_review_stars");
            for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : list) {
                if (adsRatingAndReviewStarType != null) {
                    r2.A0t(adsRatingAndReviewStarType.A00);
                }
            }
            r2.A0Y();
        }
        Float f = adsRatingInfo.A02;
        if (f != null) {
            r2.A0O("rating_score", f.floatValue());
        }
        Integer num = adsRatingInfo.A03;
        if (num != null) {
            r2.A0P("review_count", num.intValue());
        }
        r2.A0Z();
    }
}
