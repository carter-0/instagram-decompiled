package X;

import java.util.Map;

/* renamed from: X.RGn  reason: case insensitive filesystem */
public enum C8945RGn {
    IAB_WEBVIEW_END("iab_webview_end"),
    IAB_LAUNCH("iab_launch"),
    IAB_LANDING_PAGE_STARTED("iab_landing_page_started"),
    IAB_LANDING_PAGE_INTERACTIVE("iab_landing_page_interactive"),
    IAB_LANDING_PAGE_FINISHED("iab_landing_page_finished"),
    IAB_LANDING_PAGE_VIEW_ENDED("iab_landing_page_view_ended"),
    IAB_OPEN_EXTERNAL("iab_open_external"),
    IAB_COPY_LINK("iab_copy_link"),
    IAB_OPEN_MENU("iab_open_menu"),
    IAB_SCREENSHOT_IMPRESSION("iab_screenshot_impression"),
    IAB_SHARE("iab_share"),
    IAB_REPORT_START("iab_report_start"),
    IAB_REFRESH("iab_refresh"),
    IAB_FIRST_PAUSE("iab_first_pause"),
    IAB_DROP_PIXELS("iab_drop_pixels"),
    IAB_REACTIVATE_PIXELS("iab_reactivate_pixels"),
    IAB_OPEN_SECURE_INFO_POPUP("iab_open_secure_info_popup"),
    IAB_HISTORY("iab_history"),
    IAB_HISTORY_SAVE_URL("iab_history_save_url"),
    IAB_HISTORY_UX_INTERACTION("iab_history_ux_interaction"),
    IAB_VIEWABLE("iab_viewable"),
    IAB_NON_VIEWABLE("iab_non_viewable"),
    IAB_CHANGE_VIEW_MODE("iab_change_view_mode"),
    IAB_IPA_MATCH_KEY("iab_ipa_match_key"),
    IAB_FIRST_CONTENTFUL_PAINT("iab_first_contentful_paint"),
    IAB_UNIFIED("iab_unified"),
    EMPTY("empty");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass7TE.A1E();
        for (C8945RGn rGn : values()) {
            A01.put(rGn.A00, rGn);
        }
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("Type{");
        A16.append("value='");
        Pxf.A1P(A16, this.A00);
        return Pxg.A0x(A16);
    }

    /* access modifiers changed from: public */
    C8945RGn(String str) {
        this.A00 = str;
    }
}
