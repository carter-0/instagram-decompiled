package X;

import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;
import java.io.IOException;

public abstract class CbG {
    public static C270134gF parseFromJson(16F r25) {
        String str;
        String str2;
        16F r2 = r25;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Integer num = null;
            C42054BFh bFh = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str3 = null;
            OverlayAdsFormatEnum overlayAdsFormatEnum = null;
            Integer num2 = null;
            String str4 = null;
            OverlayAdTapDestinationEnum overlayAdTapDestinationEnum = null;
            Integer num3 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            C42054BFh bFh2 = null;
            Integer num4 = null;
            Integer num5 = null;
            C42054BFh bFh3 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("apply_blur".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if ("apply_full_bleed_thumbnail".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r2);
                } else if ("apply_partial_width".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r2);
                } else if ("apply_vertical_safezone".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r2);
                } else if ("delay_time_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("description_text_style".equals(A17)) {
                    bFh = C45605CzH.parseFromJson(r2);
                } else if ("enable_long_press".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r2);
                } else if ("enable_swipe_left_to_dismiss".equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r2);
                } else if ("end_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("format".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                    overlayAdsFormatEnum = (OverlayAdsFormatEnum) OverlayAdsFormatEnum.A01.get(str2);
                    if (overlayAdsFormatEnum == null) {
                        overlayAdsFormatEnum = OverlayAdsFormatEnum.UNRECOGNIZED;
                    }
                } else if ("highlight_time_ms".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if ("initial_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("overlay_ad_tap_destination".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    overlayAdTapDestinationEnum = (OverlayAdTapDestinationEnum) OverlayAdTapDestinationEnum.A01.get(str);
                    if (overlayAdTapDestinationEnum == null) {
                        overlayAdTapDestinationEnum = OverlayAdTapDestinationEnum.UNRECOGNIZED;
                    }
                } else if ("overlay_ads_height".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if ("should_discard_overlay_ads".equals(A17)) {
                    bool7 = AnonymousClass7TF.A0S(r2);
                } else if ("show_border".equals(A17)) {
                    bool8 = AnonymousClass7TF.A0S(r2);
                } else if ("show_dismiss_button".equals(A17)) {
                    bool9 = AnonymousClass7TF.A0S(r2);
                } else if ("show_tap_feedback".equals(A17)) {
                    bool10 = AnonymousClass7TF.A0S(r2);
                } else if ("sponsored_text_style".equals(A17)) {
                    bFh2 = C45605CzH.parseFromJson(r2);
                } else if ("text_spacing".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r2);
                } else if ("thumbnail_size".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r2);
                } else if ("title_text_style".equals(A17)) {
                    bFh3 = C45605CzH.parseFromJson(r2);
                }
                r2.A0z();
            }
            return new C270134gF(overlayAdTapDestinationEnum, overlayAdsFormatEnum, bFh, bFh2, bFh3, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, num, num2, num3, num4, num5, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
