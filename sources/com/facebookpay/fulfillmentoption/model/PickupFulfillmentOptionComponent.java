package com.facebookpay.fulfillmentoption.model;

import X.AnonymousClass7TG;
import X.SWV;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.Date;

public final class PickupFulfillmentOptionComponent extends FulfillmentOptionComponent {
    public static final Parcelable.Creator CREATOR = SWV.A00(96);
    public final CurrencyAmount A00;
    public final Distance A01;
    public final ShippingAddress A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Date A07;
    public final Date A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupFulfillmentOptionComponent(CurrencyAmount currencyAmount, Distance distance, ShippingAddress shippingAddress, Boolean bool, String str, String str2, String str3, Date date, Date date2, boolean z) {
        super(currencyAmount, str, str2, str3);
        AnonymousClass7TG.A1O(str, str2);
        this.A05 = str;
        this.A06 = str2;
        this.A00 = currencyAmount;
        this.A04 = str3;
        this.A08 = date;
        this.A07 = date2;
        this.A03 = bool;
        this.A02 = shippingAddress;
        this.A01 = distance;
        this.A09 = z;
    }
}
