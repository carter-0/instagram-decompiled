package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44253Cbo;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ProductAffiliateInformationDictImpl extends AnonymousClass0T0 implements Parcelable, ProductAffiliateInformationDict {
    public static final Parcelable.Creator CREATOR = DE6.A00(17);
    public final String A00;
    public final String A01;

    public final ProductAffiliateInformationDictImpl F7m() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductAffiliateInformationDictImpl) {
                ProductAffiliateInformationDictImpl productAffiliateInformationDictImpl = (ProductAffiliateInformationDictImpl) obj;
                if (!0qQ.A0K(this.A00, productAffiliateInformationDictImpl.A00) || !0qQ.A0K(this.A01, productAffiliateInformationDictImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final String AaC() {
        return this.A00;
    }

    public final String ApW() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductAffiliateInformationDict", C44253Cbo.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public ProductAffiliateInformationDictImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
