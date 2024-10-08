package X;

import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYm  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44173CYm {
    public static Map A00(C255123tc r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.BEm() != null) {
            A1H.put(C273654mx.A00(737), AnonymousClass7TH.A0D(r3.BEm()));
        }
        if (r3.BEn() != null) {
            IGAdsFeedVideoWBViewerTypeEnum BEn = r3.BEn();
            if (BEn != null) {
                str = BEn.A00;
            } else {
                str = null;
            }
            A1H.put("ig_ads_feed_video_watch_and_browse_viewer_type", str);
        }
        if (r3.Cd2() != null) {
            A1H.put(C273654mx.A00(790), r3.Cd2());
        }
        return 0Yt.A0B(A1H);
    }
}
