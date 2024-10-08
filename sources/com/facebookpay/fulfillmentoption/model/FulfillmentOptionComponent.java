package com.facebookpay.fulfillmentoption.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.C51971G9r;
import X.Pxh;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public class FulfillmentOptionComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(95);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final CurrencyAmount A00() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A00;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A00;
        }
        return this.A00;
    }

    public final String A01() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A01;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A04;
        }
        return this.A01;
    }

    public final String A02() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A02;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A05;
        }
        return this.A02;
    }

    public final String A03() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A03;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A06;
        }
        return this.A03;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FulfillmentOptionComponent) {
            FulfillmentOptionComponent fulfillmentOptionComponent = (FulfillmentOptionComponent) obj;
            if (!0qQ.A0K(A02(), fulfillmentOptionComponent.A02()) || !0qQ.A0K(A03(), fulfillmentOptionComponent.A03()) || !0qQ.A0K(A00(), fulfillmentOptionComponent.A00()) || !0qQ.A0K(A01(), fulfillmentOptionComponent.A01())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            ShippingFulfillmentOptionComponent shippingFulfillmentOptionComponent = (ShippingFulfillmentOptionComponent) this;
            0qQ.A0B(parcel, 0);
            parcel.writeString(shippingFulfillmentOptionComponent.A02);
            parcel.writeString(shippingFulfillmentOptionComponent.A03);
            parcel.writeParcelable(shippingFulfillmentOptionComponent.A00, i);
            parcel.writeString(shippingFulfillmentOptionComponent.A01);
            parcel.writeSerializable(shippingFulfillmentOptionComponent.A05);
            parcel.writeSerializable(shippingFulfillmentOptionComponent.A04);
        } else if (this instanceof PickupFulfillmentOptionComponent) {
            PickupFulfillmentOptionComponent pickupFulfillmentOptionComponent = (PickupFulfillmentOptionComponent) this;
            0qQ.A0B(parcel, 0);
            parcel.writeString(pickupFulfillmentOptionComponent.A05);
            parcel.writeString(pickupFulfillmentOptionComponent.A06);
            parcel.writeParcelable(pickupFulfillmentOptionComponent.A00, i);
            parcel.writeString(pickupFulfillmentOptionComponent.A04);
            parcel.writeSerializable(pickupFulfillmentOptionComponent.A08);
            parcel.writeSerializable(pickupFulfillmentOptionComponent.A07);
            parcel.writeInt(C41848B3p.A1Y(parcel, pickupFulfillmentOptionComponent.A03) ? 1 : 0);
            parcel.writeParcelable(pickupFulfillmentOptionComponent.A02, i);
            parcel.writeParcelable(pickupFulfillmentOptionComponent.A01, i);
            parcel.writeInt(pickupFulfillmentOptionComponent.A09 ? 1 : 0);
        } else {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A02);
            parcel.writeString(this.A03);
            parcel.writeParcelable(this.A00, i);
            parcel.writeString(this.A01);
        }
    }

    public FulfillmentOptionComponent(CurrencyAmount currencyAmount, String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = currencyAmount;
        this.A01 = str3;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(A03(), AnonymousClass7TE.A0O(A02())) + C51971G9r.A0E(A00())) * 31) + Pxh.A0B(A01());
    }
}
