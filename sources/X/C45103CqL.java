package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CqL  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45103CqL {
    public static Map A00(AdsIAWRatingInfoIntf adsIAWRatingInfoIntf) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (adsIAWRatingInfoIntf.AfA() != null) {
            A1H.put("banner_display_text", adsIAWRatingInfoIntf.AfA());
        }
        if (adsIAWRatingInfoIntf.CRN() != null) {
            A1H.put("is_detail_page_enabled", adsIAWRatingInfoIntf.CRN());
        }
        if (adsIAWRatingInfoIntf.BjU() != null) {
            List<AdsRatingAndReviewStarType> BjU = adsIAWRatingInfoIntf.BjU();
            if (BjU != null) {
                arrayList = AnonymousClass7TG.A0r(BjU);
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : BjU) {
                    0qQ.A0B(adsRatingAndReviewStarType, 0);
                    arrayList.add(adsRatingAndReviewStarType.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("rating_and_review_stars", arrayList);
        }
        if (adsIAWRatingInfoIntf.BjZ() != null) {
            A1H.put("rating_score", AnonymousClass7TH.A0D(adsIAWRatingInfoIntf.BjZ()));
        }
        if (adsIAWRatingInfoIntf.BoI() != null) {
            A1H.put("review_count", adsIAWRatingInfoIntf.BoI());
        }
        return 0Yt.A0B(A1H);
    }
}
