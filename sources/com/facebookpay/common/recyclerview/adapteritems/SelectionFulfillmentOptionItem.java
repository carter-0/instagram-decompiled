package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41848B3p;
import X.C51974G9v;
import X.RH6;
import X.S9Z;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public class SelectionFulfillmentOptionItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(11);
    public Integer A00;
    public final CurrencyAmount A01;
    public final RH6 A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final CurrencyAmount A00() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A01;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A01;
        }
        return this.A01;
    }

    public final String A01() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A03;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A06;
        }
        return this.A03;
    }

    public final String A02() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A05;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A08;
        }
        return this.A05;
    }

    public final RH6 BJZ() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A02;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A03;
        }
        return this.A02;
    }

    public final Integer Bs1() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A00;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A00;
        }
        return this.A00;
    }

    public final void Ejn(Integer num) {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            0qQ.A0B(num, 0);
            ((SelectionShippingFulfillmentOptionItem) this).A00 = num;
        } else if (this instanceof SelectionPickupFulfillmentOptionItem) {
            0qQ.A0B(num, 0);
            ((SelectionPickupFulfillmentOptionItem) this).A00 = num;
        } else {
            0qQ.A0B(num, 0);
            this.A00 = num;
        }
    }

    public final String getId() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A04;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A07;
        }
        return this.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            SelectionShippingFulfillmentOptionItem selectionShippingFulfillmentOptionItem = (SelectionShippingFulfillmentOptionItem) this;
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, selectionShippingFulfillmentOptionItem.A02);
            parcel.writeString(S9Z.A01(selectionShippingFulfillmentOptionItem.A00));
            parcel.writeString(selectionShippingFulfillmentOptionItem.A04);
            parcel.writeString(selectionShippingFulfillmentOptionItem.A05);
            parcel.writeParcelable(selectionShippingFulfillmentOptionItem.A01, i);
            parcel.writeString(selectionShippingFulfillmentOptionItem.A03);
            parcel.writeSerializable(selectionShippingFulfillmentOptionItem.A07);
            parcel.writeSerializable(selectionShippingFulfillmentOptionItem.A06);
        } else if (this instanceof SelectionPickupFulfillmentOptionItem) {
            SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) this;
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, selectionPickupFulfillmentOptionItem.A03);
            parcel.writeString(S9Z.A01(selectionPickupFulfillmentOptionItem.A00));
            parcel.writeString(selectionPickupFulfillmentOptionItem.A07);
            parcel.writeString(selectionPickupFulfillmentOptionItem.A08);
            parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A01, i);
            parcel.writeString(selectionPickupFulfillmentOptionItem.A06);
            parcel.writeSerializable(selectionPickupFulfillmentOptionItem.A0A);
            parcel.writeSerializable(selectionPickupFulfillmentOptionItem.A09);
            parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A04, i);
            parcel.writeInt(C41848B3p.A1Y(parcel, selectionPickupFulfillmentOptionItem.A05) ? 1 : 0);
            parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A02, i);
            parcel.writeInt(selectionPickupFulfillmentOptionItem.A0B ? 1 : 0);
        } else {
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, this.A02);
            parcel.writeString(S9Z.A01(this.A00));
            parcel.writeString(this.A04);
            parcel.writeString(this.A05);
            parcel.writeParcelable(this.A01, i);
            parcel.writeString(this.A03);
        }
    }

    public SelectionFulfillmentOptionItem(CurrencyAmount currencyAmount, RH6 rh6, Integer num, String str, String str2, String str3) {
        C51974G9v.A1P(rh6, num, str, str2);
        this.A02 = rh6;
        this.A00 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = currencyAmount;
        this.A03 = str3;
    }
}
