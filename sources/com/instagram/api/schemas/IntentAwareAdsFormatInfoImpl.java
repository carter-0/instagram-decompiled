package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C48335Ecs;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IntentAwareAdsFormatInfoImpl extends AnonymousClass0T0 implements Parcelable, IntentAwareAdsFormatInfo {
    public static final Parcelable.Creator CREATOR = FK5.A00(45);
    public final IntentAwareAdsFormatType A00;
    public final String A01;

    public final IntentAwareAdsFormatInfoImpl F5E() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IntentAwareAdsFormatInfoImpl) {
                IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl = (IntentAwareAdsFormatInfoImpl) obj;
                if (this.A00 != intentAwareAdsFormatInfoImpl.A00 || !0qQ.A0K(this.A01, intentAwareAdsFormatInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final IntentAwareAdsFormatType B7R() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIntentAwareAdsFormatInfo", C48335Ecs.A00(this));
    }

    public final String getTitle() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public IntentAwareAdsFormatInfoImpl(IntentAwareAdsFormatType intentAwareAdsFormatType, String str) {
        this.A00 = intentAwareAdsFormatType;
        this.A01 = str;
    }
}
