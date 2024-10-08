package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V75 {
    public static Map A00(C21042XAv xAv) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAv.AXo() != null) {
            linkedHashMap.put("accessibility_label", xAv.AXo());
        }
        if (xAv.AeI() != null) {
            linkedHashMap.put("avatar_id", xAv.AeI());
        }
        if (xAv.AeK() != null) {
            linkedHashMap.put("avatar_revision_id", xAv.AeK());
        }
        if (xAv.AeR() != null) {
            linkedHashMap.put("avatar_sticker_id", xAv.AeR());
        }
        if (xAv.AeW() != null) {
            linkedHashMap.put("avatar_style", xAv.AeW());
        }
        if (xAv.Aup() != null) {
            linkedHashMap.put("custom_avatar_cdn_url", xAv.Aup());
        }
        if (xAv.B2z() != null) {
            linkedHashMap.put("expression_id", xAv.B2z());
        }
        if (xAv.BAa() != null) {
            linkedHashMap.put("has_avatar", xAv.BAa());
        }
        if (xAv.getMediaType() != null) {
            linkedHashMap.put("media_type", xAv.getMediaType());
        }
        if (xAv.getUserId() != null) {
            linkedHashMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, xAv.getUserId());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
