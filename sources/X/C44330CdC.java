package X;

import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CdC  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44330CdC {
    public static Map A00(ScheduledLiveDiscountInfo scheduledLiveDiscountInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (scheduledLiveDiscountInfo.Axs() != null) {
            A1H.put("discount_id", scheduledLiveDiscountInfo.Axs());
        }
        if (scheduledLiveDiscountInfo.CP7() != null) {
            A1H.put("is_auto_tagged", scheduledLiveDiscountInfo.CP7());
        }
        return 0Yt.A0B(A1H);
    }
}
