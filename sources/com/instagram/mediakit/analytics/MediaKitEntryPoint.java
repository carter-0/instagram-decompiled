package com.instagram.mediakit.analytics;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public enum MediaKitEntryPoint implements Parcelable {
    BRANDED_CONTENT_SETTINGS("bc_settings"),
    DEV_OPTIONS("dev_options"),
    DIRECT_XMA("direct_xma"),
    EXTERNAL_LINK("external_link"),
    PRO_DASH_TIP("pro_dash_tip"),
    PROFILE("profile"),
    QP("qp"),
    UNKNOWN("unknown");
    
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
        MediaKitEntryPoint[] mediaKitEntryPointArr;
        A01 = 0oU.A00(mediaKitEntryPointArr);
        CREATOR = new C71269Ogb(11);
    }

    /* access modifiers changed from: public */
    MediaKitEntryPoint(String str) {
        this.A00 = str;
    }
}
