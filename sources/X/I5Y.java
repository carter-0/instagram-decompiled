package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import org.webrtc.EglBase14Impl;

public final class I5Y {
    public static final boolean A02(HNR hnr) {
        return 0sr.A1P(new HNR[]{HNR.A0W, HNR.A0Z, HNR.A0b, HNR.A0a, HNR.A0E, HNR.A1Z, HNR.A1b, HNR.A1c, HNR.A0x, HNR.A1P, HNR.A26}).contains(hnr);
    }

    public static final String A00(HNR hnr) {
        int ordinal = hnr.ordinal();
        if (ordinal == 28) {
            return "link";
        }
        if (ordinal == 18) {
            return "share";
        }
        if (ordinal == 31) {
            return "report";
        }
        if (ordinal == 100) {
            return "remove_from_your_blends";
        }
        if (ordinal == 74) {
            return "remix_this_reel";
        }
        if (ordinal == 13) {
            return "delete";
        }
        if (ordinal == 14) {
            return "delete_reel";
        }
        if (ordinal == 19) {
            return "edit";
        }
        if (ordinal == 82) {
            return "see_all_remixes";
        }
        if (ordinal == 142) {
            return "move_to_drafts";
        }
        if (ordinal == 156) {
            return "remove_from_your_blends";
        }
        if (ordinal == 12) {
            return "boost_reel";
        }
        switch (ordinal) {
            case 7:
            case 9:
                return "remove_from_your_blends";
            case 17:
                return C273654mx.A00(544);
            case 75:
                return "remix_original_reel";
            case 76:
                return "remix_sequence";
            case 77:
                return "remix_original_sequence";
            case 92:
                return "use_template";
            default:
                switch (ordinal) {
                    case 10:
                    case 11:
                        return "add_reel_to_profile";
                    case 16:
                        return "restore_reel";
                    case 66:
                    case 67:
                        return "remove_from_profile_grid";
                    case 86:
                        return "nominate";
                    default:
                        switch (ordinal) {
                            case 34:
                                return "remove_me_from_paid_partnership_label";
                            case 69:
                                return "remove_from_your_blends";
                            case 84:
                            case 85:
                                return "remove_audio_attribution";
                            case 141:
                                return "remove_originality_label";
                            default:
                                switch (ordinal) {
                                    case 36:
                                        return "tag_options";
                                    case 39:
                                        return "not_interested";
                                    case 89:
                                        return AnonymousClass000.A00(3913);
                                    case 99:
                                        return "save";
                                    default:
                                        switch (ordinal) {
                                            case 24:
                                                return AnonymousClass000.A00(1903);
                                            case 25:
                                                return AnonymousClass000.A00(4133);
                                            case 26:
                                            case 27:
                                            case 78:
                                            case 79:
                                            case 80:
                                            case 81:
                                                return "remove_from_your_blends";
                                            case 87:
                                                return "turn_on_reels_notifications";
                                            case 88:
                                                return "turn_off_reels_notifications";
                                            default:
                                                switch (ordinal) {
                                                    case 90:
                                                        return "insights";
                                                    case 91:
                                                        return "content_appreciation";
                                                    case 113:
                                                    case 114:
                                                        return "manage";
                                                    case 115:
                                                        return "remix";
                                                    case 116:
                                                    case 117:
                                                        return "remove_from_your_blends";
                                                    default:
                                                        switch (ordinal) {
                                                            case 125:
                                                                return "view_on_facebook";
                                                            case 129:
                                                                return "turn_on_gifts_media_level";
                                                            case 130:
                                                                return "turn_off_gifts_media_level";
                                                            case 131:
                                                                return "hide_gifts_count_media_level";
                                                            case 132:
                                                                return "unhide_gifts_count_media_level";
                                                            default:
                                                                return "unknown_option";
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static final boolean A01(1Xj r3, HNR hnr) {
        int ordinal = hnr.ordinal();
        if (ordinal != 48) {
            if (ordinal == 53 || ordinal == 52) {
                return false;
            }
            return true;
        } else if (!C246353eS.A01(r3).A00()) {
            return true;
        } else {
            return false;
        }
    }

    public final int A03(UserSession userSession, HNR hnr) {
        int i = 0;
        switch (hnr.ordinal()) {
            case 7:
                return 2131961868;
            case 8:
                return 2131956607;
            case 9:
                return 2131952385;
            case 10:
                if (C318996ps.A01()) {
                    C51967G9n.A0v();
                    return 2131955188;
                }
                break;
            case 11:
                return 2131955189;
            case 13:
                return 2131957531;
            case 14:
                return 2131955488;
            case 16:
                return 2131955695;
            case 17:
                return 2131953150;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return 2131973529;
            case 19:
                return 2131961425;
            case 21:
                return 2131969192;
            case 24:
                return 2131975592;
            case 25:
                return 2131975569;
            case 26:
                return 2131975593;
            case 27:
                return 2131975571;
            case 28:
                return 2131956749;
            case 31:
                return 2131972204;
            case 34:
                return 2131972038;
            case 36:
                return 2131974937;
            case 39:
                return 2131956119;
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return 2131971821;
            case 51:
            case 53:
                return 2131955643;
            case 52:
                return 2131973451;
            case 66:
                if (C318996ps.A01()) {
                    C51967G9n.A0v();
                    return 2131955700;
                }
                break;
            case 67:
                return 2131955701;
            case 69:
                return 2131972050;
            case 74:
                return 2131971961;
            case 75:
                return 2131971966;
            case 76:
                return 2131955730;
            case 77:
                return 2131955731;
            case 78:
                return 2131952898;
            case 79:
                return 2131975575;
            case 80:
                return 2131972376;
            case 81:
                return 2131972387;
            case 82:
                return 2131972977;
            case 83:
                return 2131956079;
            case 84:
                return 2131972025;
            case 85:
                return 2131972071;
            case 86:
                return 2131968490;
            case 87:
                return 2131975591;
            case 88:
                return 2131975568;
            case 89:
                return 2131955380;
            case 90:
                return 2131976633;
            case 91:
                return 2131956120;
            case 92:
                return 2131975067;
            case 93:
                return 2131963377;
            case 94:
                return 2131975882;
            case 95:
                return 2131963389;
            case 96:
                return 2131975886;
            case 98:
                return 2131976890;
            case 99:
                return 2131972502;
            case 100:
                i = 2131975985;
                if (I56.A03(userSession)) {
                    return 2131972593;
                }
                break;
            case 101:
                return 2131971539;
            case 105:
                return 2131965931;
            case 106:
                return 2131965933;
            case 109:
                return 2131953189;
            case 110:
                return 2131953201;
            case 113:
                return 2131965841;
            case 114:
                return 2131965842;
            case 115:
                return 2131971972;
            case 116:
                if (AnonymousClass3WS.A04(userSession)) {
                    return 2131965824;
                }
                i = 2131954758;
                if (AnonymousClass3WS.A02(userSession)) {
                    return 2131965824;
                }
                break;
            case 117:
                return 2131976523;
            case 122:
                return 2131962300;
            case 124:
                return 2131965850;
            case 125:
                return 2131976647;
            case 127:
                return 2131965934;
            case 128:
                return 2131965935;
            case 129:
                return 2131975594;
            case 130:
                return 2131975573;
            case 131:
                return 2131963373;
            case 132:
                return 2131975879;
            case 133:
                return 2131966730;
            case 141:
                return 2131957154;
            case 142:
                return 2131971807;
            case 143:
                return C63504KyF.A00(userSession).Bms();
            case 144:
                return C63504KyF.A00(userSession).Bmr();
            case 145:
                return C63504KyF.A00(userSession).AwD();
            case 146:
                return C63504KyF.A00(userSession).AwC();
            case 147:
                return 2131971804;
            case 148:
                return 2131971806;
            case 149:
                return 2131971805;
            case 150:
                return 2131966514;
            case 151:
                return 2131976719;
            case 152:
                return 2131952630;
            case 154:
                return 2131976718;
            case 155:
                return 2131975587;
            case 156:
                return 2131953871;
            case 157:
                return 2131955460;
            default:
                0f9 AEf = 0wj.A01.AEf(C52034GCg.__redex_internal_original_name, 817902720);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "Unsupported text row for Clips Viewer Overflow menu.");
                AEf.report();
                break;
        }
        return i;
    }
}
