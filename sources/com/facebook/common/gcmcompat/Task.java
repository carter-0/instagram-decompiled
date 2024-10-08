package com.facebook.common.gcmcompat;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbY;
import X.Pxf;
import X.Pxg;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.location.platform.api.Location;

public abstract class Task implements Parcelable {
    public final String A00;
    public final String A01;
    public final int A02;
    public final Bundle A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeBundle(this.A03);
    }

    public Task(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = AnonymousClass7TF.A1S(parcel.readInt(), 1);
        this.A04 = DbY.A1X(parcel);
        this.A02 = parcel.readInt();
        this.A05 = Pxg.A1V(parcel);
        this.A03 = parcel.readBundle(Pxf.A0W(this));
    }

    public void A00(Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("retry_policy", 0);
        A0a.putInt("initial_backoff_seconds", 30);
        A0a.putInt("maximum_backoff_seconds", ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS);
        bundle.putString("tag", this.A01);
        bundle.putBoolean("update_current", this.A06);
        bundle.putBoolean("persisted", this.A04);
        bundle.putString("service", this.A00);
        bundle.putInt("requiredNetwork", this.A02);
        bundle.putBoolean("requiresCharging", this.A05);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", A0a);
        bundle.putBundle(Location.EXTRAS, this.A03);
    }
}
