package com.instagram.model.shopping.incentives.igfunded;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C63333KvG;
import X.CTA;
import X.MOT;
import X.MOU;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIgFundedIncentiveBannerButton extends 17P implements IgFundedIncentiveBannerButtonIntf {
    public static final C3035269k CREATOR = new CTA(47);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentiveBannerButton] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final IgFundedIncentiveButtonDestinationType AwZ() {
        return (IgFundedIncentiveButtonDestinationType) A0M(-1429847026, MOT.A00);
    }

    public final IgFundedIncentiveBannerButtonStyleType C26() {
        return (IgFundedIncentiveBannerButtonStyleType) A0M(109780401, MOU.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentiveBannerButton, com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C63333KvG.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IgFundedIncentiveBannerButton FFW() {
        return new IgFundedIncentiveBannerButton(C26(), AwZ(), A0P());
    }

    public final String getText() {
        return A0P();
    }
}
