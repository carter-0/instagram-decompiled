package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.model.reels.Reel;

/* renamed from: X.6bq  reason: invalid class name and case insensitive filesystem */
public final class C310926bq implements C229222n2 {
    public final String BK2(AnonymousClass30Y r4) {
        String str;
        0qQ.A0B(r4, 0);
        Reel reel = ((C250973mM) r4.A03).A0H;
        IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
        if (intentAwareAdsInfo == null || (str = intentAwareAdsInfo.A06) == null) {
            str = reel.getId();
            0qQ.A07(str);
        }
        return 002.A0R("intentAwareAdStories_", str);
    }
}
