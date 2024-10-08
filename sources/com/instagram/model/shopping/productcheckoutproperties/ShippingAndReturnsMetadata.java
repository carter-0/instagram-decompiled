package com.instagram.model.shopping.productcheckoutproperties;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C44921CnE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.DeliveryWindowInfo;

public final class ShippingAndReturnsMetadata extends AnonymousClass0T0 implements Parcelable, ShippingAndReturnsMetadataIntf {
    public static final Parcelable.Creator CREATOR = new LVO(8);
    public final CurrencyAmountInfo A00;
    public final CurrencyAmountInfo A01;
    public final DeliveryWindowInfo A02;
    public final Boolean A03;
    public final Integer A04;
    public final String A05;

    public final ShippingAndReturnsMetadata FFZ() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShippingAndReturnsMetadata) {
                ShippingAndReturnsMetadata shippingAndReturnsMetadata = (ShippingAndReturnsMetadata) obj;
                if (!0qQ.A0K(this.A02, shippingAndReturnsMetadata.A02) || !0qQ.A0K(this.A03, shippingAndReturnsMetadata.A03) || !0qQ.A0K(this.A00, shippingAndReturnsMetadata.A00) || !0qQ.A0K(this.A04, shippingAndReturnsMetadata.A04) || !0qQ.A0K(this.A01, shippingAndReturnsMetadata.A01) || !0qQ.A0K(this.A05, shippingAndReturnsMetadata.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        C41848B3p.A1I(parcel, this.A03);
        parcel.writeParcelable(this.A00, i);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
    }

    public final DeliveryWindowInfo B2B() {
        return this.A02;
    }

    public final CurrencyAmountInfo Bo7() {
        return this.A00;
    }

    public final Integer Bo9() {
        return this.A04;
    }

    public final CurrencyAmountInfo Btg() {
        return this.A01;
    }

    public final Boolean CTd() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShippingAndReturnDict", C44921CnE.A00(this));
    }

    public final String getShippingCostStripped() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A05);
    }

    public ShippingAndReturnsMetadata(CurrencyAmountInfo currencyAmountInfo, CurrencyAmountInfo currencyAmountInfo2, DeliveryWindowInfo deliveryWindowInfo, Boolean bool, Integer num, String str) {
        this.A02 = deliveryWindowInfo;
        this.A03 = bool;
        this.A00 = currencyAmountInfo;
        this.A04 = num;
        this.A01 = currencyAmountInfo2;
        this.A05 = str;
    }
}
