package com.instagram.model.shopping.incentives.igfunded;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C63333KvG;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IgFundedIncentiveBannerButton extends AnonymousClass0T0 implements Parcelable, IgFundedIncentiveBannerButtonIntf {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(99);
    public final IgFundedIncentiveBannerButtonStyleType A00;
    public final IgFundedIncentiveButtonDestinationType A01;
    public final String A02;

    public final IgFundedIncentiveBannerButton FFW() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgFundedIncentiveBannerButton) {
                IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = (IgFundedIncentiveBannerButton) obj;
                if (!(this.A01 == igFundedIncentiveBannerButton.A01 && this.A00 == igFundedIncentiveBannerButton.A00 && 0qQ.A0K(this.A02, igFundedIncentiveBannerButton.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
    }

    public final IgFundedIncentiveButtonDestinationType AwZ() {
        return this.A01;
    }

    public final IgFundedIncentiveBannerButtonStyleType C26() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingIGFundedIncentiveBannerButtonStyle", C63333KvG.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public IgFundedIncentiveBannerButton(IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType, IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType, String str) {
        AnonymousClass7TG.A1U(igFundedIncentiveButtonDestinationType, igFundedIncentiveBannerButtonStyleType, str);
        this.A01 = igFundedIncentiveButtonDestinationType;
        this.A00 = igFundedIncentiveBannerButtonStyleType;
        this.A02 = str;
    }
}
