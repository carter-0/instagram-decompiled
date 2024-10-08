package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C41876B4u;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GrowthFrictionInterventionCategoriesImpl extends AnonymousClass0T0 implements Parcelable, GrowthFrictionInterventionCategories {
    public static final Parcelable.Creator CREATOR = new C376389Hu(7);
    public final GrowthFrictionInterventionDetail A00;
    public final GrowthFrictionInterventionDetail A01;
    public final GrowthFrictionInterventionDetail A02;

    public final GrowthFrictionInterventionCategoriesImpl F3a() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionCategoriesImpl) {
                GrowthFrictionInterventionCategoriesImpl growthFrictionInterventionCategoriesImpl = (GrowthFrictionInterventionCategoriesImpl) obj;
                if (!0qQ.A0K(this.A00, growthFrictionInterventionCategoriesImpl.A00) || !0qQ.A0K(this.A01, growthFrictionInterventionCategoriesImpl.A01) || !0qQ.A0K(this.A02, growthFrictionInterventionCategoriesImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail = this.A00;
        int i = 0;
        int hashCode = (growthFrictionInterventionDetail == null ? 0 : growthFrictionInterventionDetail.hashCode()) * 31;
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail2 = this.A01;
        int hashCode2 = (hashCode + (growthFrictionInterventionDetail2 == null ? 0 : growthFrictionInterventionDetail2.hashCode())) * 31;
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail3 = this.A02;
        if (growthFrictionInterventionDetail3 != null) {
            i = growthFrictionInterventionDetail3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public final GrowthFrictionInterventionDetail B6i() {
        return this.A00;
    }

    public final GrowthFrictionInterventionDetail BRb() {
        return this.A01;
    }

    public final GrowthFrictionInterventionDetail C3r() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGrowthFrictionInterventionCategories", C41876B4u.A00(this));
    }

    public GrowthFrictionInterventionCategoriesImpl(GrowthFrictionInterventionDetail growthFrictionInterventionDetail, GrowthFrictionInterventionDetail growthFrictionInterventionDetail2, GrowthFrictionInterventionDetail growthFrictionInterventionDetail3) {
        this.A00 = growthFrictionInterventionDetail;
        this.A01 = growthFrictionInterventionDetail2;
        this.A02 = growthFrictionInterventionDetail3;
    }
}
