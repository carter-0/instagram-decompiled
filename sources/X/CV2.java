package X;

import com.instagram.api.schemas.BoostUpsellBannerPayloadSchema;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CV2 {
    public static Map A00(BoostUpsellBannerPayloadSchema boostUpsellBannerPayloadSchema) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (boostUpsellBannerPayloadSchema.getActionUrl() != null) {
            A1H.put("action_url", boostUpsellBannerPayloadSchema.getActionUrl());
        }
        if (boostUpsellBannerPayloadSchema.Ago() != null) {
            A1H.put("body_text", boostUpsellBannerPayloadSchema.Ago());
        }
        if (boostUpsellBannerPayloadSchema.AnY() != null) {
            A1H.put("clickable_text", boostUpsellBannerPayloadSchema.AnY());
        }
        return 0Yt.A0B(A1H);
    }
}
