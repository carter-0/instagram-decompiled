package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.C45432CwC;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;

public final class FBProductItemDetailsDictImpl extends AnonymousClass0T0 implements FBProductItemDetailsDict, Parcelable {
    public static final Parcelable.Creator CREATOR = DE7.A00(65);
    public final ProductCheckoutProperties A00;
    public final ProductImageContainer A01;
    public final ProductImageContainer A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final FBProductItemDetailsDictImpl F2u() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBProductItemDetailsDictImpl) {
                FBProductItemDetailsDictImpl fBProductItemDetailsDictImpl = (FBProductItemDetailsDictImpl) obj;
                if (!0qQ.A0K(this.A00, fBProductItemDetailsDictImpl.A00) || !0qQ.A0K(this.A03, fBProductItemDetailsDictImpl.A03) || !0qQ.A0K(this.A04, fBProductItemDetailsDictImpl.A04) || !0qQ.A0K(this.A05, fBProductItemDetailsDictImpl.A05) || !0qQ.A0K(this.A01, fBProductItemDetailsDictImpl.A01) || !0qQ.A0K(this.A06, fBProductItemDetailsDictImpl.A06) || !0qQ.A0K(this.A07, fBProductItemDetailsDictImpl.A07) || !0qQ.A0K(this.A08, fBProductItemDetailsDictImpl.A08) || !0qQ.A0K(this.A09, fBProductItemDetailsDictImpl.A09) || !0qQ.A0K(this.A0A, fBProductItemDetailsDictImpl.A0A) || !0qQ.A0K(this.A0B, fBProductItemDetailsDictImpl.A0B) || !0qQ.A0K(this.A0C, fBProductItemDetailsDictImpl.A0C) || !0qQ.A0K(this.A02, fBProductItemDetailsDictImpl.A02)) {
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
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A03) ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A02, i);
    }

    public final /* bridge */ /* synthetic */ C45432CwC AKA() {
        return new C45432CwC(this);
    }

    public final /* bridge */ /* synthetic */ ProductCheckoutPropertiesIntf An5() {
        return this.A00;
    }

    public final Boolean BCR() {
        return this.A03;
    }

    public final String BND() {
        return this.A04;
    }

    public final String BNE() {
        return this.A05;
    }

    public final ProductImageContainer BOr() {
        return this.A01;
    }

    public final String BaE() {
        return this.A06;
    }

    public final String BaI() {
        return this.A07;
    }

    public final String BaK() {
        return this.A08;
    }

    public final String BgN() {
        return this.A0A;
    }

    public final String C1f() {
        return this.A0B;
    }

    public final String C1g() {
        return this.A0C;
    }

    public final ProductImageContainer C6z() {
        return this.A02;
    }

    public final String getProductId() {
        return this.A09;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public FBProductItemDetailsDictImpl(ProductCheckoutProperties productCheckoutProperties, ProductImageContainer productImageContainer, ProductImageContainer productImageContainer2, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A00 = productCheckoutProperties;
        this.A03 = bool;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = productImageContainer;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A02 = productImageContainer2;
    }
}
