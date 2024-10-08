package com.facebook.location.platform.api;

import X.AnonymousClass7TE;
import X.Pxg;
import X.SWY;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class LocationResult extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(LocationResult.class);
    @SafeParcelable.Field(100)
    public final Bundle mExtras;
    @SafeParcelable.Field(subClass = Location.class, value = 1)
    public List mLocations;

    public static LocationResult create(List list, Bundle bundle) {
        return new LocationResult(list, bundle);
    }

    public static LocationResult fromIntent(Intent intent) {
        return (LocationResult) intent.getParcelableExtra("com.facebook.location");
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public List getLocations() {
        return this.mLocations;
    }

    public LocationResult(List list, Bundle bundle) {
        this.mLocations = list;
        this.mExtras = bundle;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LocationResult{mLocations=");
        A1A.append(this.mLocations);
        A1A.append(", mExtras=");
        return Pxg.A0p(this.mExtras, A1A);
    }

    public LocationResult(List list) {
        this.mLocations = list;
        this.mExtras = AnonymousClass7TE.A0a();
    }

    public static LocationResult create(Location location) {
        return new LocationResult(Collections.singletonList(location));
    }

    public LocationResult() {
        this.mLocations = AnonymousClass7TE.A1C();
        this.mExtras = null;
    }

    public static LocationResult create(List list) {
        return new LocationResult(list);
    }
}
