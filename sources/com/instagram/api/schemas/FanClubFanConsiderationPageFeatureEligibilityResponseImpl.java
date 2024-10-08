package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.C41863B4h;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class FanClubFanConsiderationPageFeatureEligibilityResponseImpl extends AnonymousClass0T0 implements Parcelable, FanClubFanConsiderationPageFeatureEligibilityResponse {
    public static final Parcelable.Creator CREATOR = new C376409Hw(99);
    public final boolean A00;
    public final boolean A01;

    public final FanClubFanConsiderationPageFeatureEligibilityResponseImpl F2x() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClubFanConsiderationPageFeatureEligibilityResponseImpl) {
                FanClubFanConsiderationPageFeatureEligibilityResponseImpl fanClubFanConsiderationPageFeatureEligibilityResponseImpl = (FanClubFanConsiderationPageFeatureEligibilityResponseImpl) obj;
                if (!(this.A00 == fanClubFanConsiderationPageFeatureEligibilityResponseImpl.A00 && this.A01 == fanClubFanConsiderationPageFeatureEligibilityResponseImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFanClubFanConsiderationPageFeatureEligibilityResponse", C41863B4h.A00(this));
    }

    public final boolean getShouldShowContentPreview() {
        return this.A00;
    }

    public final boolean getShouldShowSocialContext() {
        return this.A01;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public FanClubFanConsiderationPageFeatureEligibilityResponseImpl(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
