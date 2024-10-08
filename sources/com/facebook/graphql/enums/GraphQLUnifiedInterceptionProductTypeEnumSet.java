package com.facebook.graphql.enums;

import X.0sc;
import X.AnonymousClass7TF;
import X.C21053XCe;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLUnifiedInterceptionProductTypeEnumSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[29];
        C21053XCe.A1O(new String[]{"WHATSAPP_DEEPLINK_PAGE", "WHATSAPP_PAGE"}, AnonymousClass7TF.A1X(new String[]{"ADD_PHOTO", "BRANDAWARENESS", "BRANDED_CONTENT", "BRANDTAGGING", "CALENDAR_HOTSPOTS", "CALL_NOW", "DEFAULT_MEDIA", "EVENT", "FUNDRAISER_DONATE_BUTTON", "HASHTAG", "JOB", "LDP", "MARKETPLACE_JOBS", "MARKETPLACE_VERTICALS", "MESSAGEPAGE", "MESSAGE_BUTTON", "MOVIE", PriceTableAnnotation$Companion.OFFER, "PAGES_INTEGRITY_FAKE_NEWS", "PAGES_INTEGRITY_UNPUBLISHED_CONTENT", "PRODUCT_TAGGING_NUX", "QPC", "SCHEDULE_POST_TIME", "SELL_MESSAGE", "SERVICE", "UNKNOWN", "VOLUNTEERING"}, strArr) ? 1 : 0, strArr);
        A00 = 0sc.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
