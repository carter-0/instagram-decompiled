package com.facebook.location.platform.api;

import X.AnonymousClass7TE;
import X.C9006RLa;
import X.SWY;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class LocationAvailability extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(LocationAvailability.class);
    @SafeParcelable.Field(1)
    public boolean mAvailable;
    @SafeParcelable.Field(3)
    public Bundle mExtras;
    @SafeParcelable.Field(2)
    public String mProvider;

    public static LocationAvailability create(String str, boolean z, Bundle bundle) {
        return new LocationAvailability(str, z, bundle);
    }

    public static LocationAvailability fromIntent(Intent intent) {
        return (LocationAvailability) intent.getParcelableExtra("com.facebook.locationavailability");
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public boolean isAvailable() {
        return this.mAvailable;
    }

    public Bundle optExtras() {
        Bundle bundle = this.mExtras;
        if (bundle == null) {
            return AnonymousClass7TE.A0a();
        }
        return bundle;
    }

    public LocationAvailability(String str, boolean z, Bundle bundle) {
        this.mProvider = str;
        this.mAvailable = z;
        this.mExtras = bundle;
    }

    public LocationAvailability(String str, boolean z) {
        this(str, z, AnonymousClass7TE.A0a());
    }

    public static LocationAvailability create(String str, boolean z) {
        return new LocationAvailability(str, z);
    }

    public LocationAvailability(C9006RLa rLa) {
        throw AnonymousClass7TE.A11("isAvailable");
    }

    public LocationAvailability() {
    }
}
