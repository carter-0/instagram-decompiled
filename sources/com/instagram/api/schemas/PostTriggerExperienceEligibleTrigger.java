package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PostTriggerExperienceEligibleTrigger implements Parcelable {
    UNRECOGNIZED("PostTriggerExperienceEligibleTrigger_unspecified"),
    CAPTION_TAP("5"),
    CTA_CLICK(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    DWELL_5S("6"),
    OPT_IN_TAP("4"),
    PROFILE_TAP("2"),
    RESHARE_BUTTON("7");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PostTriggerExperienceEligibleTrigger[] postTriggerExperienceEligibleTriggerArr;
        A02 = 0oU.A00(postTriggerExperienceEligibleTriggerArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger : values()) {
            linkedHashMap.put(postTriggerExperienceEligibleTrigger.A00, postTriggerExperienceEligibleTrigger);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(97);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PostTriggerExperienceEligibleTrigger(String str) {
        this.A00 = str;
    }
}
