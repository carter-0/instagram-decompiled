package X;

import com.instagram.api.schemas.RankingInfo;

public abstract class VF4 {
    public static final C14932UFv A00(RankingInfo rankingInfo) {
        0bb r2 = new 0bb();
        r2.A06("recommender_type", rankingInfo.A00);
        r2.A06("request_uuid", rankingInfo.A01);
        r2.A05("wpr_request_id", DbZ.A0d(rankingInfo.A02));
        return r2;
    }
}
