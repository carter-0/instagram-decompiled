package X;

import com.instagram.react.modules.base.IgReactQEModule;

public abstract class XWV {
    public static final XSI A00(Integer num) {
        switch (num.intValue()) {
            case 2:
                return XSI.POST_IS_RESHARE_FROM_THREADS;
            case 3:
                return XSI.POST_WITH_PAID_PARTNERSHIP;
            case 4:
                return XSI.POST_CAPTION_LIMIT;
            case 5:
                return XSI.POST_AUDIENCE_CLOSE_FRIENDS;
            case 6:
                return XSI.POST_IS_OPEN_CAROUSEL;
            case 7:
                return XSI.POST_DIRECT_TO_PROFILE;
            case 8:
                return XSI.POST_HAS_POLL;
            case 9:
                return XSI.POST_WITH_FLIPSIDE;
            case 10:
                return XSI.POST_WITH_FUNDRAISER;
            case 11:
                return XSI.POST_CONTAIN_VIDEO;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return XSI.MORE_THAN_TEN_CAROUSEL_ITEMS;
            case 13:
                return XSI.POST_WITH_EVENT_REMINDER;
            case 14:
                return XSI.POST_WITH_SCHEDULE;
            default:
                return XSI.UNKNOWN;
        }
    }
}
