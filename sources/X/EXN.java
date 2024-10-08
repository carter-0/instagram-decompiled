package X;

public enum EXN {
    SIGN_UP((String) 0),
    LOG_IN((String) 1),
    PROFILE_PIC((String) 2),
    PROFILE_PIC_REG((String) 3),
    NUX_FIND_FRIENDS_DIALOG((String) 4),
    NUX_FIND_FRIENDS((String) 5),
    NUX_MAIN_SCREEN((String) 6),
    NUX_DISCOVER_PEOPLE_SCREEN((String) 7),
    MEGAPHONE((String) 8),
    OPTION_FOLLOW_PEOPLE((String) 9),
    GRAPHQL_AUTH((String) 10),
    SHARE_PHOTO((String) 11),
    OPTION_LINKED_ACCOUNTS((String) 12),
    FOLLOW_PEOPLE((String) 13),
    BUSINESS_BACK_TO_PERSONAL((String) 14),
    CLAIM_PAGE((String) 15),
    DELTA_CHALLENGE((String) 16),
    REEL_SETTINGS((String) 17),
    SHARE_ADVANCED_SETTINGS((String) 18),
    REEL_VIEWER_SELF_STORY((String) 19),
    DIRECT_INBOX_TAB((String) 20),
    QUICK_PROMOTION((String) 21),
    REAUTH((String) 22),
    BUSINESS_SWITCH_PAGE((String) 23),
    DISCO((String) 24);
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EXN[] exnArr;
        A01 = 0oU.A00(exnArr);
    }

    public static EXN A00(String str, String str2, int i) {
        return new EXN(str, i, str2);
    }

    public final String A01() {
        String str;
        String str2 = this.A00;
        switch (str2.hashCode()) {
            case -1664686436:
                str = "ig_fb_reels_composer_rowshare";
                break;
            case -1170684298:
                str = "ig_fb_reels_share_later_feed_overflow_menu";
                break;
            case -993045025:
                if (str2.equals("profile_photo_change_chaining_upsell")) {
                    return "ig_profile_photo_change_chaining";
                }
                break;
            case -685986003:
                str = "ig_fb_reels_rowshare";
                break;
            case -239843260:
                str = "ig_fb_reels_share_later";
                break;
            case -41098153:
                if (str2.equals("reachability")) {
                    return "ig_interop_reachability_settings";
                }
                break;
            case 26599175:
                str = "ig_fb_profile_pic_reg";
                break;
            case 403918290:
                if (str2.equals("share_photo")) {
                    return "ig_fb_share_feed";
                }
                break;
            case 577549183:
                str = "ig_fb_nux_find_friends";
                break;
            case 888343635:
                str = "ig_fb_share_later_feed";
                break;
            case 1119220651:
                if (str2.equals("options_linked_accounts")) {
                    return "ig_fb_share_settings";
                }
                break;
            case 1646110401:
                str = "ig_fb_self_story_overflow_menu";
                break;
            case 1670988475:
                if (str2.equals("business_switch_page")) {
                    return "ig_fb_business_connect_fb_page";
                }
                break;
            case 1885511361:
                str = "ig_fb_reels_share_later_overflow_menu";
                break;
            case 1958063037:
                if (str2.equals("interop")) {
                    return 002.A0R("ig_", str2);
                }
                break;
            case 2005015377:
                str = "ig_fb_stories_share_sheet";
                break;
        }
        if (str2.equals(str)) {
            return str2;
        }
        return 002.A0R("ig_fb_", str2);
    }

    /* access modifiers changed from: public */
    EXN(String str) {
        this.A00 = str;
    }

    /* access modifiers changed from: public */
    EXN(int i) {
        this.A00 = r2;
    }
}
