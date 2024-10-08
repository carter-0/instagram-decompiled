package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4MA  reason: invalid class name */
public abstract class AnonymousClass4MA {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "IG_FEED_PROVIDER";
            case 2:
                return "IG_STORY_PROVIDER";
            case 3:
                return "IG_REELS_CLIP_PROVIDER";
            case 4:
                return "IG_BROADCAST_PROVIDER";
            case 5:
                return "IG_IGTV_PROVIDER";
            case 6:
                return "IG_BK_PROVIDER";
            case 7:
                return "IG_DISCOVERY_PROVIDER";
            case 8:
                return "IG_CLIPS_MIDCARD_PROVIDER";
            case 9:
                return "IG_CLIPS_MULTIADS_PROVIDER";
            case 10:
                return AnonymousClass000.A00(4367);
            case 11:
                return "FB_PROVIDER";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "IG_DIRECT_PRIVACY_AWARE_PROVIDER";
            case 13:
                return "IG_MEDIA_METADATA_PROVIDER";
            case 14:
                return "IG_MUSIC_PROVIDER";
            case 15:
                return "IG_COWATCH";
            case 16:
                return AnonymousClass000.A00(2534);
            case 17:
                return "OC_HERO_PROVIDER";
            default:
                return "NO_OP_PROVIDER";
        }
    }
}
