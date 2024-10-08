package com.instagram.discovery.mediamap.intf;

import X.0oU;
import X.Dbb;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public enum MapEntryPoint implements Parcelable {
    EXTERNAL_URL("external_url"),
    MAIN_FEED_QP("main_feed_qp"),
    EXPLORE_BUTTON("explore_button"),
    EXPLORE_PILL("explore_pill"),
    EXPLORE_SEARCH("explore_search"),
    GUIDE("guide"),
    HASHTAG_PAGE("hashtag_page"),
    LOCATION_PAGE_BUTTON("location_page_button"),
    LOCATION_PAGE_EFFECTS_BUTTON("location_page_effects_button"),
    LOCATION_PAGE_MAP("location_page_map"),
    LOCATION_PAGE_TAKEOVER("location_page"),
    STORY_VIEWER("story_viewer"),
    PLACES_HCM("places_hcm"),
    SAVE_HOME("save_home");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        MapEntryPoint[] mapEntryPointArr;
        A01 = 0oU.A00(mapEntryPointArr);
        CREATOR = new W6E(30);
    }

    /* access modifiers changed from: public */
    MapEntryPoint(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
