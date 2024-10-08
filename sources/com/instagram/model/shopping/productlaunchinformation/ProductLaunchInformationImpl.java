package com.instagram.model.shopping.productlaunchinformation;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C44929CnM;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ProductLaunchInformationImpl extends AnonymousClass0T0 implements Parcelable, ProductLaunchInformation {
    public static final Parcelable.Creator CREATOR = new LVO(23);
    public final Boolean A00;
    public final Boolean A01;
    public final Long A02;
    public final String A03;

    public final ProductLaunchInformationImpl FFd() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductLaunchInformationImpl) {
                ProductLaunchInformationImpl productLaunchInformationImpl = (ProductLaunchInformationImpl) obj;
                if (!0qQ.A0K(this.A03, productLaunchInformationImpl.A03) || !0qQ.A0K(this.A00, productLaunchInformationImpl.A00) || !0qQ.A0K(this.A01, productLaunchInformationImpl.A01) || !0qQ.A0K(this.A02, productLaunchInformationImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        C41848B3p.A1I(parcel, this.A00);
        C41848B3p.A1I(parcel, this.A01);
        C41848B3p.A1K(parcel, this.A02);
    }

    public final String AzA() {
        return this.A03;
    }

    public final Boolean BBR() {
        return this.A00;
    }

    public final Long BLg() {
        return this.A02;
    }

    public final Boolean CUw() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductLaunchInformationDict", C44929CnM.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public ProductLaunchInformationImpl(Boolean bool, Boolean bool2, Long l, String str) {
        this.A03 = str;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = l;
    }
}
