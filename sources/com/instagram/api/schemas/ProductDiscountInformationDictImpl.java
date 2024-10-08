package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44262Cbx;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ProductDiscountInformationDictImpl extends AnonymousClass0T0 implements ProductDiscountInformationDict, Parcelable {
    public static final Parcelable.Creator CREATOR = DE6.A00(22);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public ProductDiscountInformationDictImpl(String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final ProductDiscountInformationDictImpl F7s() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDiscountInformationDictImpl) {
                ProductDiscountInformationDictImpl productDiscountInformationDictImpl = (ProductDiscountInformationDictImpl) obj;
                if (!0qQ.A0K(this.A00, productDiscountInformationDictImpl.A00) || !0qQ.A0K(this.A01, productDiscountInformationDictImpl.A01) || !0qQ.A0K(this.A02, productDiscountInformationDictImpl.A02) || !0qQ.A0K(this.A03, productDiscountInformationDictImpl.A03) || !0qQ.A0K(this.A04, productDiscountInformationDictImpl.A04)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductDiscountInformationDict", C44262Cbx.A00(this));
    }

    public final String getCtaText() {
        return this.A00;
    }

    public final String getDescription() {
        return this.A01;
    }

    public final String getId() {
        return this.A02;
    }

    public final String getName() {
        return this.A03;
    }

    public final String getSeeDetailsText() {
        return this.A04;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, ((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }
}
