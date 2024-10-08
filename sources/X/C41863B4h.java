package X;

import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4h  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41863B4h {
    public static Map A00(FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowContentPreview();
        A1H.put("should_show_content_preview", Boolean.valueOf(fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowContentPreview()));
        fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowSocialContext();
        return C41845B3m.A0u("should_show_social_context", Boolean.valueOf(fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowSocialContext()), A1H);
    }
}
