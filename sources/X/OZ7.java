package X;

public final class OZ7 {
    public static final OZ7 A00 = new Object();

    public static final AnonymousClass779 A00(Integer num) {
        int intValue;
        if (!(num == null || (intValue = num.intValue()) == 0)) {
            if (intValue == 1000) {
                return AnonymousClass779.IG_SINGLE_IMAGE_POST_SHARE;
            }
            if (intValue == 1001) {
                return AnonymousClass779.IG_MULTIPOST_SHARE;
            }
            if (intValue == 1002) {
                return AnonymousClass779.IG_STORY_REPLY;
            }
            if (intValue == 1003) {
                return AnonymousClass779.IG_STORY_PHOTO_SHARE;
            }
            if (intValue == 1004) {
                return AnonymousClass779.IG_STORY_PHOTO_MENTION;
            }
            if (intValue == 1005) {
                return AnonymousClass779.IG_CLIPS_SHARE;
            }
            if (intValue == 1006) {
                return AnonymousClass779.IG_SINGLE_VIDEO_POST_SHARE;
            }
            if (intValue == 1007) {
                return AnonymousClass779.IG_STORY_VIDEO_SHARE;
            }
            if (intValue == 1008) {
                return AnonymousClass779.IG_STORY_REACTION;
            }
            if (intValue == 1009) {
                return AnonymousClass779.IG_IGTV_SHARE;
            }
            if (intValue == 1010) {
                return AnonymousClass779.IG_SHOP_SHARE;
            }
            if (intValue == 1011) {
                return AnonymousClass779.IG_PROFILE_SHARE;
            }
            if (intValue == 1012) {
                return AnonymousClass779.IG_STORY_PHOTO_HIGHLIGHT_SHARE;
            }
            if (intValue == 1013) {
                return AnonymousClass779.IG_STORY_VIDEO_HIGHLIGHT_SHARE;
            }
            if (intValue == 1014) {
                return AnonymousClass779.IG_STORY_VIDEO_MENTION;
            }
            if (intValue == 1015) {
                return AnonymousClass779.IG_STORY_HIGHLIGHT_REPLY;
            }
            if (intValue == 1016) {
                return AnonymousClass779.IG_STORY_HIGHLIGHT_REACTION;
            }
            if (intValue == 1017) {
                return AnonymousClass779.IG_EXTERNAL_LINK;
            }
            if (intValue == 1018) {
                return AnonymousClass779.IG_RECEIVER_FETCH;
            }
            if (intValue == 2000) {
                return AnonymousClass779.FB_FEED_SHARE;
            }
            if (intValue == 2001) {
                return AnonymousClass779.FB_STORY_REPLY;
            }
            if (intValue == 2002) {
                return AnonymousClass779.FB_STORY_SHARE;
            }
            if (intValue == 2003) {
                return AnonymousClass779.FB_STORY_MENTION;
            }
            if (intValue == 2004) {
                return AnonymousClass779.FB_FEED_VIDEO_SHARE;
            }
            if (intValue == 2005) {
                return AnonymousClass779.FB_GAMING_CUSTOM_UPDATE;
            }
            if (intValue == 2006) {
                return AnonymousClass779.FB_PRODUCER_STORY_REPLY;
            }
            if (intValue == 2007) {
                return AnonymousClass779.FB_EVENT;
            }
            if (intValue == 3000) {
                return AnonymousClass779.MSG_EXTERNAL_LINK_SHARE;
            }
            if (intValue == 3001) {
                return AnonymousClass779.MSG_P2P_PAYMENT;
            }
            if (intValue == 3002) {
                return AnonymousClass779.MSG_LOCATION_SHARING;
            }
            if (intValue == 4000) {
                return AnonymousClass779.RTC_AUDIO_CALL;
            }
            if (intValue == 4001) {
                return AnonymousClass779.RTC_VIDEO_CALL;
            }
            if (intValue == 4002) {
                return AnonymousClass779.RTC_MISSED_AUDIO_CALL;
            }
            if (intValue == 4003) {
                return AnonymousClass779.RTC_MISSED_VIDEO_CALL;
            }
            if (intValue == 4004) {
                return AnonymousClass779.RTC_GROUP_AUDIO_CALL;
            }
            if (intValue == 4005) {
                return AnonymousClass779.RTC_GROUP_VIDEO_CALL;
            }
            if (intValue == 4006) {
                return AnonymousClass779.RTC_MISSED_GROUP_AUDIO_CALL;
            }
            if (intValue == 4007) {
                return AnonymousClass779.RTC_MISSED_GROUP_VIDEO_CALL;
            }
            if (intValue == 5000) {
                return AnonymousClass779.DATACLASS_SENDER_COPY;
            }
        }
        return AnonymousClass779.UNSUPPORTED;
    }

    public final AnonymousClass779 A01(C74552Pwl pwl, int i, boolean z) {
        Integer CH5;
        C74555Pww CH8;
        int ordinal;
        if (z) {
            CH5 = pwl.Bmc(i);
            CH8 = pwl.Bmd(i);
        } else {
            CH5 = pwl.CH5(i);
            CH8 = pwl.CH8(i);
        }
        if (CH5 == null || CH5.intValue() != 5000 || CH8 == null) {
            return A00(CH5);
        }
        C69424Nl6 nl6 = (C69424Nl6) ((AnonymousClass3FZ) CH8).A04("target_type", C69424Nl6.A12);
        if (nl6 == null || (ordinal = nl6.ordinal()) == 0 || ordinal != 20) {
            return AnonymousClass779.UNSUPPORTED;
        }
        return AnonymousClass779.IG_EXTERNAL_LINK;
    }
}
