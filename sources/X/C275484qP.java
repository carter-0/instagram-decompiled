package X;

import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import java.io.IOException;

/* renamed from: X.4qP  reason: invalid class name and case insensitive filesystem */
public abstract class C275484qP {
    public static C255113tb parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Float f = null;
            IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = null;
            Boolean bool = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("ig_ads_feed_video_watch_and_browse_viewer_min_screen_threshold".equals(A0q)) {
                    f = new Float(r7.A0U());
                } else if ("ig_ads_feed_video_watch_and_browse_viewer_type".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    iGAdsFeedVideoWBViewerTypeEnum = (IGAdsFeedVideoWBViewerTypeEnum) IGAdsFeedVideoWBViewerTypeEnum.A01.get(str);
                    if (iGAdsFeedVideoWBViewerTypeEnum == null) {
                        iGAdsFeedVideoWBViewerTypeEnum = IGAdsFeedVideoWBViewerTypeEnum.UNRECOGNIZED;
                    }
                } else if ("is_tall_video".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                }
                r7.A0z();
            }
            return new C255113tb(iGAdsFeedVideoWBViewerTypeEnum, bool, f);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
