package com.facebook.privacy.zone.api;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C66581MXm;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.zone.policy.ZonePolicy;
import kotlin.Deprecated;

public class ZonedValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(41);
    public final ZonePolicy A00;
    public final Object A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String A0y;
        0qQ.A0B(parcel, 0);
        Object obj = this.A01;
        if (obj == null) {
            A0y = "NULL";
        } else {
            A0y = C66581MXm.A0y(obj);
        }
        parcel.writeString(A0y);
        parcel.writeValue(obj);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public ZonedValue(ZonePolicy zonePolicy, Object obj, String str) {
        AnonymousClass7TG.A1Q(zonePolicy, str);
        this.A01 = obj;
        this.A00 = zonePolicy;
        this.A02 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Please use the constructor with Annotation Site ID")
    public ZonedValue(ZonePolicy zonePolicy, Object obj) {
        this(zonePolicy, obj, "UNKNOWN");
        0qQ.A0B(zonePolicy, 2);
    }
}
