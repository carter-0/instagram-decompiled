package com.facebookpay.common.recyclerview.adapteritems;

import X.C51974G9v;
import X.RH6;
import X.SWV;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.Date;

public final class SelectionShippingFulfillmentOptionItem extends SelectionFulfillmentOptionItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(21);
    public Integer A00;
    public final CurrencyAmount A01;
    public final RH6 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Date A06;
    public final Date A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionShippingFulfillmentOptionItem(CurrencyAmount currencyAmount, RH6 rh6, Integer num, String str, String str2, String str3, Date date, Date date2) {
        super(currencyAmount, rh6, num, str, str2, str3);
        C51974G9v.A1P(rh6, num, str, str2);
        this.A02 = rh6;
        this.A00 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = currencyAmount;
        this.A03 = str3;
        this.A07 = date;
        this.A06 = date2;
    }
}
