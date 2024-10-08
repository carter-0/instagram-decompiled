package X;

import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4oz  reason: invalid class name and case insensitive filesystem */
public abstract class C274744oz {
    public static C239733Hx parseFromJson(16F r9) {
        String str;
        String str2;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = null;
            Boolean bool = null;
            Float f = null;
            Float f2 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("delay_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                } else if ("gesture_types".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            if (r9.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r9.A1P();
                            }
                            IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType = (IGAdsStoryInteractiveMediaGestureType) IGAdsStoryInteractiveMediaGestureType.A01.get(str2);
                            if (iGAdsStoryInteractiveMediaGestureType == null) {
                                iGAdsStoryInteractiveMediaGestureType = IGAdsStoryInteractiveMediaGestureType.UNRECOGNIZED;
                            }
                            arrayList.add(iGAdsStoryInteractiveMediaGestureType);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("interactive_media_design_option".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = (IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum) IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.A01.get(str);
                    if (iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum == null) {
                        iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.UNRECOGNIZED;
                    }
                } else if ("is_interactive_media_available".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if ("safezone_left_and_right".equals(A0q)) {
                    f = new Float(r9.A0U());
                } else if ("safezone_top_and_bottom".equals(A0q)) {
                    f2 = new Float(r9.A0U());
                }
                r9.A0z();
            }
            return new C239733Hx(iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum, bool, f, f2, num, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
