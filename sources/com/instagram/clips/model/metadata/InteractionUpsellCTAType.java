package com.instagram.clips.model.metadata;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum InteractionUpsellCTAType implements Parcelable {
    UNRECOGNIZED("InteractionUpsellCTAType_unspecified"),
    COMMENT_CONSUMPTION_UPSELL("3"),
    COMMENT_PRODUCTION_UPSELL("2"),
    FOLLOWU_UPSELL("5"),
    LIKE_UPSELL(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    NO_UPSELL("0"),
    PROFILE_CLICK("6"),
    RESHARE_UPSELL("4");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        InteractionUpsellCTAType[] interactionUpsellCTATypeArr;
        A02 = 0oU.A00(interactionUpsellCTATypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (InteractionUpsellCTAType interactionUpsellCTAType : values()) {
            linkedHashMap.put(interactionUpsellCTAType.A00, interactionUpsellCTAType);
        }
        A01 = linkedHashMap;
        CREATOR = new W6D(77);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    InteractionUpsellCTAType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
