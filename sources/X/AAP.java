package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

public abstract class AAP {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 200;
            case 2:
            case 4:
                return IgNetworkConsentStorage.MAX_ENTRIES;
            case 3:
            case 5:
                return 3000;
            case 6:
            case 7:
                return 300;
            case 8:
                return 7000;
            default:
                return 800;
        }
    }

    public static final Integer A01(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "TEXT_INTRO";
                break;
            case 2:
                str = "IG_LOGO_WHITE_AUDIO_TEXT_STILL";
                break;
            case 3:
                str = "IG_LOGO_CHANGE_COLOR_AUDIO_TEXT_MOVE_LEFT";
                break;
            case 4:
                str = "IG_LOGO_WHITE_AUDIO_TEXT_STILL_MIDDLE";
                break;
            case 5:
                str = "IG_LOGO_WHITE_AUDIO_TEXT_MOVE_RIGHT";
                break;
            case 6:
                str = "FADE_OUT";
                break;
            case 7:
                str = "FADE_IN";
                break;
            case 8:
                str = "IG_LOGO_WHITE_LONG_DURATION";
                break;
            default:
                str = "IG_LOGO_INTRO";
                break;
        }
        if (str.equals("IG_LOGO_WHITE_LONG_DURATION")) {
            return AnonymousClass05K.A0u;
        }
        return AnonymousClass05K.A00(9)[(intValue + 1) % AnonymousClass05K.A00(9).length];
    }
}
