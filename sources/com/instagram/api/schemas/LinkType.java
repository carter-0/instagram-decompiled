package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum LinkType implements Parcelable {
    UNRECOGNIZED("LinkType_unspecified"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    DISCUSSION_TOPIC("discussion_topic"),
    IG_MEDIA("ig_media");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkType[] linkTypeArr;
        A02 = 0oU.A00(linkTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (LinkType linkType : values()) {
            linkedHashMap.put(linkType.A00, linkType);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(52);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LinkType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
