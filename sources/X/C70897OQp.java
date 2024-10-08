package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.OQp  reason: case insensitive filesystem */
public abstract class C70897OQp {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "thread";
            case 2:
                return "share_sheet";
            case 3:
                return "in_call";
            case 4:
                return "in_call_sharesheet";
            case 5:
                return "thread_single_feed";
            case 6:
                return C273654mx.A00(2270);
            case 7:
                return "direct_share_local_entrypoint";
            case 8:
                return "bloks";
            case 9:
                return "rooms_tab_watch_together";
            case 10:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_REELS_TOGETHER;
            default:
                return "deep_link";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "THREAD";
            case 2:
                return "SHARE_SHEET";
            case 3:
                return "IN_CALL";
            case 4:
                return "IN_CALL_SHARESHEET";
            case 5:
                return "THREAD_SINGLE_FEED";
            case 6:
                return "DIRECT_SHARE";
            case 7:
                return "DIRECT_SHARE_LOCAL";
            case 8:
                return "BLOKS";
            case 9:
                return "ROOMS_TAB_WATCH_TOGETHER";
            case 10:
                return "REELS_TOGETHER";
            default:
                return "DEEP_LINK";
        }
    }
}
