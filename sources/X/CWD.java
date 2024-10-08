package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CWD {
    public static Map A00(CommerceReviewStatisticsDictIntf commerceReviewStatisticsDictIntf) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (commerceReviewStatisticsDictIntf.Aeb() != null) {
            A1H.put("average_rating", AnonymousClass7TH.A0D(commerceReviewStatisticsDictIntf.Aeb()));
        }
        if (commerceReviewStatisticsDictIntf.Bja() != null) {
            List<AdsRatingAndReviewStarType> Bja = commerceReviewStatisticsDictIntf.Bja();
            if (Bja != null) {
                arrayList = AnonymousClass7TG.A0r(Bja);
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : Bja) {
                    0qQ.A0B(adsRatingAndReviewStarType, 0);
                    arrayList.add(adsRatingAndReviewStarType.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("rating_stars", arrayList);
        }
        if (commerceReviewStatisticsDictIntf.BoI() != null) {
            A1H.put("review_count", commerceReviewStatisticsDictIntf.BoI());
        }
        return 0Yt.A0B(A1H);
    }
}
