package com.facebook.location.platform.api;

import X.AnonymousClass7TE;
import X.SWY;
import android.os.Parcelable;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class LocationSettingsRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(LocationSettingsRequest.class);
    @SafeParcelable.Field(subClass = LocationRequest.class, value = 1)
    public List mLocationRequests;

    public List getLocationRequests() {
        return this.mLocationRequests;
    }

    public LocationSettingsRequest(List list) {
        this.mLocationRequests = list;
    }

    public LocationSettingsRequest() {
        this.mLocationRequests = AnonymousClass7TE.A1C();
    }
}
