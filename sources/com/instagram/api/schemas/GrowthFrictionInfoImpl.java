package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C41875B4t;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GrowthFrictionInfoImpl extends AnonymousClass0T0 implements Parcelable, GrowthFrictionInfo {
    public static final Parcelable.Creator CREATOR = new C376389Hu(6);
    public final GrowthFrictionInterventionCategories A00;
    public final boolean A01;

    public final GrowthFrictionInfoImpl F3Y() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInfoImpl) {
                GrowthFrictionInfoImpl growthFrictionInfoImpl = (GrowthFrictionInfoImpl) obj;
                if (this.A01 != growthFrictionInfoImpl.A01 || !0qQ.A0K(this.A00, growthFrictionInfoImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final boolean BAW() {
        return this.A01;
    }

    public final GrowthFrictionInterventionCategories BIc() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGrowthFrictionInfo", C41875B4t.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        GrowthFrictionInterventionCategories growthFrictionInterventionCategories = this.A00;
        if (growthFrictionInterventionCategories == null) {
            hashCode = 0;
        } else {
            hashCode = growthFrictionInterventionCategories.hashCode();
        }
        return i2 + hashCode;
    }

    public GrowthFrictionInfoImpl(GrowthFrictionInterventionCategories growthFrictionInterventionCategories, boolean z) {
        this.A01 = z;
        this.A00 = growthFrictionInterventionCategories;
    }
}
