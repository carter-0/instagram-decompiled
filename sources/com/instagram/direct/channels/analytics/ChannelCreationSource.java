package com.instagram.direct.channels.analytics;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public enum ChannelCreationSource implements Parcelable {
    ACTIVITY_FEED("activity_feed"),
    EDIT_PROFILE("edit_profile"),
    MIMICRY_UPSELL("mimicry_upsell"),
    MIMICRY_UPSELL_COMPOSER("mimicry_upsell_composer_banner"),
    OMNIPICKER("omnipicker"),
    PROFESSIONAL_DASHBOARD_NEXT_STEP("pro_dash_next_steps"),
    PROFILE("profile"),
    QUICK_PROMOTION("quick_promotion"),
    SUBSCRIBER_LIST("subscriber_list"),
    MESSAGING_LED("messaging_led"),
    SUBSCRIPTION_SETTINGS("subscription_settings"),
    SCHOOLS("schools");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        ChannelCreationSource[] channelCreationSourceArr;
        A01 = 0oU.A00(channelCreationSourceArr);
        CREATOR = new LVP(65);
    }

    /* access modifiers changed from: public */
    ChannelCreationSource(String str) {
        this.A00 = str;
    }
}
