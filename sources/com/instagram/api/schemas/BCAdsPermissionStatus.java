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

public enum BCAdsPermissionStatus implements Parcelable {
    UNRECOGNIZED("BCAdsPermissionStatus_unspecified"),
    APPROVED("2"),
    APPROVED_V2("7"),
    CANCELED("6"),
    DEFAULT("0"),
    PENDING_APPROVAL(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    REJECTED("3"),
    REVOKED("4");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BCAdsPermissionStatus[] bCAdsPermissionStatusArr;
        A02 = 0oU.A00(bCAdsPermissionStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BCAdsPermissionStatus bCAdsPermissionStatus : values()) {
            A0x.put(bCAdsPermissionStatus.A00, bCAdsPermissionStatus);
        }
        A01 = A0x;
        CREATOR = new SWT(58);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BCAdsPermissionStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
