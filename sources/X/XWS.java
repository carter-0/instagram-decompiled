package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public abstract class XWS {
    public static final XSL A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return XSL.CREATE_MENTION;
            case 1:
            case 2:
                return XSL.CREATE_QUOTE;
            case 3:
                return XSL.CREATE_REPLY;
            case 4:
                return XSL.CREATE_TAG;
            case 5:
                return XSL.LOCATION_TAG;
            case 6:
                return XSL.CREATE_QUOTED_SEARCH_TOPIC;
            case 7:
                return XSL.DRAFT_REMINDER_ACTIVITY_FEED;
            case 8:
                return XSL.DRAFT_REMINDER_PUSH;
            case 9:
                return XSL.DRAFTS_PREVIEW_SHEET;
            case 10:
                return XSL.FROM_DEEPLINK;
            case 11:
                return XSL.FROM_LINK;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return XSL.IMPORT_MEDIA;
            case 13:
                return XSL.MAIN_TAB_BAR;
            case 14:
                return XSL.MAIN_TAB_BAR_LONG_PRESS;
            case 15:
                return XSL.PERMALINK_INLINE_COMPOSER;
            case 16:
                return XSL.PROFILE_COMPLETION_MILESTONE;
            case 17:
                return XSL.PROFILE_NULL_STATE;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return XSL.QUICK_PROMOTION;
            case 19:
                return XSL.SAVE_DRAFT_ERROR_TOAST;
            case 20:
                return XSL.SHARE_TO_THREADS;
            case 21:
                return XSL.TOP_OF_FEED;
            case 22:
                return XSL.TOP_OF_PROFILE;
            case 23:
                return XSL.IG_REELS_COMMENT;
            case 24:
                return XSL.IG_FEED_COMMENT;
            case 25:
            case 27:
                return XSL.APP_SHORTCUT;
            case 26:
                return XSL.BIRTHDAY_ICON_SWITCHER;
            default:
                throw new RuntimeException();
        }
    }
}
