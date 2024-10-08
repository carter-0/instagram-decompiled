package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxj  reason: case insensitive filesystem */
public enum C16589Uxj {
    BOOST_AUDIO_BROWSER("boost_audio_browser"),
    CLIPS_CAMERA_FORMAT("clips_camera_format"),
    CLIPS_CAMERA_FORMAT_V2("clips_camera_format_v2"),
    CLIPS_EDIT_METADATA("clips_edit_metadata"),
    AUDIO_GLOBAL_SEARCH("audio_global_search"),
    MEMORY_RESHARE("memory_reshare"),
    MENTION_RESHARE("mention_reshare"),
    MUSIC_AR_EFFECT("music_ar_effect"),
    MUSIC_AR_EFFECT_DEMO("music_ar_effect_demo"),
    MUSIC_CAMERA_FORMAT("music_camera_format"),
    MUSIC_IN_FEED("music_in_feed"),
    MUSIC_NOTES("music_notes"),
    MUSIC_ON_PROFILE("music_on_profile"),
    POST_CAPTURE_STICKER("post_capture_sticker"),
    QUESTION_RESPONSE("question_response"),
    QUESTION_RESPONSE_RESHARE("question_response_reshare"),
    STATUS(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS),
    UNSET("unset"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16589Uxj[] uxjArr;
        A02 = 0oU.A00(uxjArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (C16589Uxj uxj : values()) {
            linkedHashMap.put(uxj.A00, uxj);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16589Uxj(String str) {
        this.A00 = str;
    }
}
