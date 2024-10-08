package X;

import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;

/* renamed from: X.7xk  reason: invalid class name and case insensitive filesystem */
public abstract class C348017xk {
    public static final Integer A01(28D r2) {
        0qQ.A0B(r2, 0);
        switch (r2.ordinal()) {
            case 4:
            case 7:
            case 9:
            case 13:
            case 51:
            case 164:
                return AnonymousClass05K.A1I;
            case 5:
            case 130:
                return AnonymousClass05K.A0j;
            case 14:
                return AnonymousClass05K.A0N;
            case 15:
                return AnonymousClass05K.A0Y;
            case 16:
            case 135:
                return AnonymousClass05K.A0u;
            case 17:
            case 31:
                return AnonymousClass05K.A0C;
            case 39:
                return AnonymousClass05K.A02;
            case 48:
                return AnonymousClass05K.A05;
            case 49:
                return AnonymousClass05K.A06;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
            case 105:
                return AnonymousClass05K.A07;
            case 179:
            case 485:
            case 486:
            case 487:
                return AnonymousClass05K.A15;
            case 218:
                return AnonymousClass05K.A1F;
            case 231:
                return AnonymousClass05K.A09;
            case 246:
                return AnonymousClass05K.A0A;
            case 247:
                return AnonymousClass05K.A08;
            case 249:
                return AnonymousClass05K.A0B;
            case C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                return AnonymousClass05K.A0D;
            case 251:
                return AnonymousClass05K.A0E;
            case 252:
                return AnonymousClass05K.A0F;
            case 275:
                return AnonymousClass05K.A0G;
            case 276:
                return AnonymousClass05K.A03;
            case 277:
                return AnonymousClass05K.A04;
            case 366:
                return AnonymousClass05K.A0H;
            case 401:
            case 402:
                return AnonymousClass05K.A0I;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized entry point for media import: ");
                sb.append(r2);
                0kD.A07("EntryPointUtil", sb.toString(), (Throwable) null);
                return AnonymousClass05K.A0J;
        }
    }

    public static final boolean A02(28D r2) {
        0qQ.A0B(r2, 0);
        if (r2 == 28D.A5D || r2 == 28D.A2g || r2 == 28D.A5G) {
            return true;
        }
        return false;
    }

    public static final 28D A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2075285002:
                if (str.equals("action_story_share_threads")) {
                    return 28D.A5G;
                }
                break;
            case -2027472363:
                if (str.equals(AnonymousClass000.A00(3804))) {
                    return 28D.A42;
                }
                break;
            case -1752799159:
                if (str.equals(AnonymousClass000.A00(1710))) {
                    return 28D.A4K;
                }
                break;
            case -1533607595:
                if (str.equals("quick_camera_launcher_shortcut_variant_avatar")) {
                    return 28D.A3L;
                }
                break;
            case -1411076672:
                if (str.equals("camera_upsell_dialog")) {
                    return 28D.A0e;
                }
                break;
            case -1385596165:
                str2 = "external_url";
                break;
            case -1316163253:
                if (str.equals("profile_tap_on_ar_notification")) {
                    return 28D.A0Q;
                }
                break;
            case -1278884738:
                if (str.equals(AnonymousClass000.A00(1609))) {
                    return 28D.A3d;
                }
                break;
            case -1130641820:
                if (str.equals("inspiration_hub_create_post")) {
                    return 28D.A3J;
                }
                break;
            case -939907210:
                if (str.equals("your_story_dialog_option")) {
                    return 28D.A5Y;
                }
                break;
            case -865541175:
                if (str.equals(AnonymousClass000.A00(2751))) {
                    return 28D.A0d;
                }
                break;
            case -811302394:
                if (str.equals("story_share_intent")) {
                    return 28D.A4v;
                }
                break;
            case -471528113:
                if (str.equals("camera_tab_bar")) {
                    return 28D.A0a;
                }
                break;
            case -182151899:
                if (str.equals(AnonymousClass000.A00(1711))) {
                    return 28D.A3o;
                }
                break;
            case -154070497:
                if (str.equals("quick_camera_ar_effect_test_link")) {
                    return 28D.A0T;
                }
                break;
            case -138284514:
                if (str.equals(AnonymousClass000.A00(2981))) {
                    return 28D.A4V;
                }
                break;
            case -104996226:
                if (str.equals(AnonymousClass000.A00(136))) {
                    return 28D.A44;
                }
                break;
            case -38101822:
                if (str.equals("quick_camera_ar_effect_share_link")) {
                    return 28D.A0R;
                }
                break;
            case 25999906:
                if (str.equals("quick_camera_startup_uri")) {
                    return 28D.A0M;
                }
                break;
            case 109854522:
                if (str.equals("swipe")) {
                    return 28D.A5B;
                }
                break;
            case 137920146:
                if (str.equals("camera_action_bar_button_main_feed")) {
                    return 28D.A3N;
                }
                break;
            case 171320519:
                if (str.equals("story_captured_media_recovery")) {
                    return 28D.A0i;
                }
                break;
            case 179250025:
                if (str.equals("promote_media_picker_create_story")) {
                    return 28D.A45;
                }
                break;
            case 676472861:
                if (str.equals("your_story_placeholder")) {
                    return 28D.A5X;
                }
                break;
            case 791895943:
                if (str.equals("action_fb_post_reshare")) {
                    return 28D.A2g;
                }
                break;
            case 963440836:
                if (str.equals(AnonymousClass000.A00(1846))) {
                    return 28D.A4a;
                }
                break;
            case 1198338927:
                if (str.equals(AnonymousClass000.A00(1265))) {
                    return 28D.A4W;
                }
                break;
            case 1364086253:
                str2 = "third_party_intent";
                break;
            case 1383860305:
                if (str.equals(AnonymousClass000.A00(3897))) {
                    return 28D.A4D;
                }
                break;
            case 1479815600:
                if (str.equals("quick_camera_launcher_shortcut_variant_glyph")) {
                    return 28D.A3M;
                }
                break;
            case 1791076262:
                if (str.equals(AnonymousClass000.A00(3112))) {
                    return 28D.A2j;
                }
                break;
            case 1904101413:
                if (str.equals("activity_recreated")) {
                    return 28D.A0L;
                }
                break;
            case 1965399843:
                if (str.equals("profile_picture_tap_on_self_profile")) {
                    return 28D.A43;
                }
                break;
            case 2017458945:
                if (str.equals(AnonymousClass000.A00(2799))) {
                    return 28D.A0s;
                }
                break;
            case 2026871498:
                if (str.equals(AnonymousClass000.A00(2980))) {
                    return 28D.A4X;
                }
                break;
        }
        if (str.equals(str2)) {
            return 28D.A5D;
        }
        return 28D.A5J;
    }
}
