package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;

public abstract class CUS {
    public static final AdsRatingAndReviewStarType A00(String str) {
        AdsRatingAndReviewStarType adsRatingAndReviewStarType = (AdsRatingAndReviewStarType) AdsRatingAndReviewStarType.A01.get(str);
        if (adsRatingAndReviewStarType == null) {
            return AdsRatingAndReviewStarType.UNRECOGNIZED;
        }
        return adsRatingAndReviewStarType;
    }
}
