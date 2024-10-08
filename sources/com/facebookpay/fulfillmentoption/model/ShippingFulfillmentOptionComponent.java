package com.facebookpay.fulfillmentoption.model;

import X.AnonymousClass7TG;
import X.SWV;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.Date;

public final class ShippingFulfillmentOptionComponent extends FulfillmentOptionComponent {
    public static final Parcelable.Creator CREATOR = SWV.A00(97);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Date A04;
    public final Date A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingFulfillmentOptionComponent(CurrencyAmount currencyAmount, String str, String str2, String str3, Date date, Date date2) {
        super(currencyAmount, str, str2, str3);
        AnonymousClass7TG.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = currencyAmount;
        this.A01 = str3;
        this.A05 = date;
        this.A04 = date2;
    }
}
