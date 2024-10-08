package X;

import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CqM  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45104CqM {
    public static Map A00(AdsRatingInfoIntf adsRatingInfoIntf) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (adsRatingInfoIntf.AyC() != null) {
            A1H.put("display_text", adsRatingInfoIntf.AyC());
        }
        if (adsRatingInfoIntf.CUs() != null) {
            A1H.put(C273654mx.A00(2924), adsRatingInfoIntf.CUs());
        }
        ArrayList arrayList = null;
        if (adsRatingInfoIntf.BjS() != null) {
            AdsRatingAndReviewDisplayFormat BjS = adsRatingInfoIntf.BjS();
            if (BjS != null) {
                str = BjS.A00;
            } else {
                str = null;
            }
            A1H.put(C273654mx.A00(908), str);
        }
        if (adsRatingInfoIntf.BjU() != null) {
            List<AdsRatingAndReviewStarType> BjU = adsRatingInfoIntf.BjU();
            if (BjU != null) {
                arrayList = AnonymousClass7TG.A0r(BjU);
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : BjU) {
                    0qQ.A0B(adsRatingAndReviewStarType, 0);
                    arrayList.add(adsRatingAndReviewStarType.A00);
                }
            }
            A1H.put("rating_and_review_stars", arrayList);
        }
        if (adsRatingInfoIntf.BjZ() != null) {
            A1H.put("rating_score", AnonymousClass7TH.A0D(adsRatingInfoIntf.BjZ()));
        }
        if (adsRatingInfoIntf.BoI() != null) {
            A1H.put("review_count", adsRatingInfoIntf.BoI());
        }
        return 0Yt.A0B(A1H);
    }
}
