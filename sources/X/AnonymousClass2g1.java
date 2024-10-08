package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.2g1  reason: invalid class name */
public enum AnonymousClass2g1 {
    BOTTOM_NAVIGATION_BAR("bottom_navigation_bar"),
    TOP_NAVIGATION_BAR("top_navigation_bar"),
    PROFILE_PAGE("profile_page"),
    PROFILE_MENU("profile_menu"),
    ACCOUNT_SWITCHER("account_switcher"),
    ACTIVITY_FEED("activity_feed"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    BOTTOM_SHEET_VERTICAL("bottom_sheet_vertical"),
    BOTTOM_SHEET_HORIZONTAL("bottom_sheet_horizontal"),
    BOTTOM_SHEET("bottom_sheet"),
    PINNED_ROWS("pinned_rows"),
    APP_ICON("app_icon"),
    INVALID("invalid");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        AnonymousClass2g1[] r0;
        A01 = 0oU.A00(r0);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass2g1(String str) {
        this.A00 = str;
    }
}
