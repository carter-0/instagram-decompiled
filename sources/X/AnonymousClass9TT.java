package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.text.TextColorScheme;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9TT  reason: invalid class name */
public abstract class AnonymousClass9TT {
    public static final int A00(28D r10, AnonymousClass80D r11, AnonymousClass8D8 r12) {
        CameraTool cameraTool;
        String str;
        0qQ.A0B(r10, 0);
        boolean A1V = AnonymousClass7TF.A1V(r11.A1C);
        boolean A1V2 = AnonymousClass7TF.A1V(r11.A0o);
        boolean A1V3 = AnonymousClass7TF.A1V(r11.A15);
        boolean A1V4 = AnonymousClass7TF.A1V(r11.A1t);
        boolean A1V5 = AnonymousClass7TF.A1V(r11.A1D);
        boolean A1W = AnonymousClass7TF.A1W(28D.A2g, r11.A0B);
        GenAIToolInfoDict genAIToolInfoDict = r11.A0I;
        if (genAIToolInfoDict != null) {
            cameraTool = genAIToolInfoDict.A00;
        } else {
            cameraTool = null;
        }
        boolean A1V6 = AnonymousClass7TF.A1V(C59808JZc.A00(cameraTool));
        if (A1W) {
            return 26;
        }
        if (C348017xk.A02(r10)) {
            return 2;
        }
        if (r10 == 28D.A2V || r10 == 28D.A2U || r10 == 28D.A4u || r10 == 28D.A2W) {
            return 5;
        }
        if (A1V || A1V2 || A1V3) {
            return 4;
        }
        if (A1V4) {
            return 8;
        }
        if (r10 == 28D.A3P) {
            return 24;
        }
        if (r10 == 28D.A37) {
            return 108;
        }
        if (A1V5) {
            if (r10 == 28D.A0O) {
                return 3;
            }
            return 10;
        } else if (r10 == 28D.A0K) {
            return 32;
        } else {
            if (A1V6) {
                return 1;
            }
            if (r12 == null) {
                return 0;
            }
            int intValue = r12.A05().intValue();
            switch (intValue) {
                case 2:
                    return 9;
                case 3:
                    return 16;
                case 4:
                    return 11;
                case 5:
                    return 12;
                case 6:
                    return 23;
                case 8:
                    return 27;
                case 9:
                    return 62;
                case 10:
                    return 21;
                case 11:
                    return 17;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    return 6;
                case 15:
                    return 14;
                case 16:
                    return 22;
                case 19:
                    return 15;
                case 20:
                    return 20;
                case 22:
                    return 5;
                case 24:
                    return 30;
                case 25:
                    return 28;
                case 26:
                    return 29;
                case 27:
                    C3499382n r0 = r11.A12;
                    if (r0 == null || !r0.A05) {
                        return 61;
                    }
                    return 33;
                case 28:
                    return 31;
                case 30:
                    return 109;
                case 31:
                    return 112;
                case 36:
                    return 113;
                default:
                    switch (intValue) {
                        case 1:
                            str = "CLIPS_PROMPT";
                            break;
                        case 2:
                            str = "COUNTDOWN";
                            break;
                        case 3:
                            str = "CREATOR_FAN_ENGAGEMENT";
                            break;
                        case 4:
                            str = "FUNDRAISER_DUPLICATE";
                            break;
                        case 5:
                            str = "FUNDRAISER_THANKS";
                            break;
                        case 6:
                            str = "GROUP_PROFILE";
                            break;
                        case 7:
                            str = "HASHTAG";
                            break;
                        case 8:
                            str = "JOIN_CHAT";
                            break;
                        case 9:
                            str = "CHANNEL_CHALLENGE";
                            break;
                        case 10:
                            str = "LINK";
                            break;
                        case 11:
                            str = "PROMPT";
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            str = "QUESTION_RESPONSE";
                            break;
                        case 13:
                            str = AnonymousClass000.A00(1027);
                            break;
                        case 14:
                            str = "REELS_VISUAL_REPLIES";
                            break;
                        case 15:
                            str = "SMB_SUPPORT";
                            break;
                        case 16:
                            str = "STANDALONE_FUNDRAISER";
                            break;
                        case 17:
                            str = "SUBSCRIBER_CHAT";
                            break;
                        case EglBase14Impl.EGLExt_SDK_VERSION:
                            str = "SUBSCRIPTIONS_PROMO";
                            break;
                        case 19:
                            str = "SUPPORT_PERSONALIZED_ADS";
                            break;
                        case 20:
                            str = "UPCOMING_EVENT";
                            break;
                        case 21:
                            str = "USER_PAY_BADGES_THANKS";
                            break;
                        case 22:
                            str = "MENTION";
                            break;
                        case 23:
                            str = "GROUP_MENTION";
                            break;
                        case 24:
                            str = "SUPERLATIVE_STORY";
                            break;
                        case 25:
                            str = "EVENT";
                            break;
                        case 26:
                            str = "FOLLOWER_MILESTONE";
                            break;
                        case 27:
                            str = "STORIES_TEMPLATES";
                            break;
                        case 28:
                            str = "TEXT";
                            break;
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                            str = "NOTIFY_ME";
                            break;
                        case 30:
                            str = "PROFILE";
                            break;
                        case 31:
                            str = "PROFILE_CARD";
                            break;
                        case 32:
                            str = "MUSIC_PICK";
                            break;
                        case 33:
                            str = "ACHIEVEMENTS";
                            break;
                        case 34:
                            str = "SHARE_PLATFORM";
                            break;
                        case 35:
                            str = "INTERNAL";
                            break;
                        case 36:
                            str = "QUICK_SNAP_RECAP";
                            break;
                        default:
                            str = "AUTO_IMPORT_MUSIC";
                            break;
                    }
                    throw AnonymousClass7TE.A1B(002.A0R("Unhandled sticker share type: ", str));
            }
        }
    }

    public static final void A01(AnonymousClass80D r4, C352218Cl r5, int i) {
        GenAIToolInfoDict genAIToolInfoDict;
        AnonymousClass802 r3;
        int i2;
        int i3;
        0qQ.A0B(r5, 0);
        r5.A0Y = r4.A2H;
        r5.A0n = r4.A2e;
        r5.A08 = i;
        r5.A0X = r4.A2G;
        r5.A0w = r4.A3I;
        if (!(r4.A1e == null || (r3 = r4.A0w) == null)) {
            0v6 r0 = null;
            int i4 = r3.A01;
            if (i4 < 0 || i4 >= r3.A0A.size()) {
                i2 = 0;
            } else {
                i2 = r3.A01;
            }
            if (((TextColorScheme) r3.A0A.get(i2)).A06 != null) {
                AnonymousClass802 r2 = r4.A0w;
                if (r2 != null) {
                    int i5 = r2.A01;
                    if (i5 < 0 || i5 >= r2.A0A.size()) {
                        i3 = 0;
                    } else {
                        i3 = r2.A01;
                    }
                    r0 = A1P.A00((TextColorScheme) r2.A0A.get(i3));
                }
                r5.A0I = r0;
            }
        }
        if (r4.A1U != null) {
            r5.A0y = true;
        }
        if (r5.A0p == null && (genAIToolInfoDict = r4.A0I) != null) {
            r5.A0p = AnonymousClass7TE.A1I(new LMH(genAIToolInfoDict.A00, C63192Ksz.A00(genAIToolInfoDict)));
        }
        if (r4.A23.booleanValue()) {
            r5.A0y = true;
            r5.A19 = true;
        }
    }
}
