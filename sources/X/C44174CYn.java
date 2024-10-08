package X;

import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CYn  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44174CYn {
    public static Map A00(C239743Hy r6) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r6.Aw9() != null) {
            A1H.put("delay_time_in_ms", r6.Aw9());
        }
        String str = null;
        if (r6.B98() != null) {
            List<IGAdsStoryInteractiveMediaGestureType> B98 = r6.B98();
            if (B98 != null) {
                arrayList = AnonymousClass7TG.A0r(B98);
                for (IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType : B98) {
                    0qQ.A0B(iGAdsStoryInteractiveMediaGestureType, 0);
                    arrayList.add(iGAdsStoryInteractiveMediaGestureType.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("gesture_types", arrayList);
        }
        if (r6.BIK() != null) {
            IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum BIK = r6.BIK();
            if (BIK != null) {
                str = BIK.A00;
            }
            A1H.put("interactive_media_design_option", str);
        }
        if (r6.CVe() != null) {
            A1H.put("is_interactive_media_available", r6.CVe());
        }
        if (r6.Bp7() != null) {
            A1H.put("safezone_left_and_right", AnonymousClass7TH.A0D(r6.Bp7()));
        }
        if (r6.Bp8() != null) {
            A1H.put("safezone_top_and_bottom", AnonymousClass7TH.A0D(r6.Bp8()));
        }
        return 0Yt.A0B(A1H);
    }
}
