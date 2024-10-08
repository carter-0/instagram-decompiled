package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BwPPostClickLandingExperineceType implements Parcelable {
    UNRECOGNIZED("BwPPostClickLandingExperineceType_unspecified"),
    BWI_STANDARD_IAB("4"),
    CUSTOM_IAB_FOR_1P("2"),
    CUSTOM_IAB_FOR_DTC("3"),
    STANDARD_IAB(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BwPPostClickLandingExperineceType[] bwPPostClickLandingExperineceTypeArr;
        A02 = 0oU.A00(bwPPostClickLandingExperineceTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType : values()) {
            A0x.put(bwPPostClickLandingExperineceType.A00, bwPPostClickLandingExperineceType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(76);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BwPPostClickLandingExperineceType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
