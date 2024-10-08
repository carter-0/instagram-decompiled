package com.facebookpay.common.recyclerview.adapteritems;

import X.RH6;
import X.SWV;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.Date;

public final class SelectionPickupFulfillmentOptionItem extends SelectionFulfillmentOptionItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(18);
    public Integer A00;
    public final CurrencyAmount A01;
    public final Distance A02;
    public final RH6 A03;
    public final ShippingAddress A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Date A09;
    public final Date A0A;
    public final boolean A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SelectionPickupFulfillmentOptionItem(com.facebookpay.common.models.CurrencyAmount r9, com.facebookpay.common.models.Distance r10, X.RH6 r11, com.facebookpay.shippingaddress.model.ShippingAddress r12, java.lang.Boolean r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.Date r18, java.util.Date r19, boolean r20) {
        /*
            r8 = this;
            r3 = r11
            r4 = r14
            r5 = r15
            r6 = r16
            X.C51974G9v.A1P(r11, r14, r15, r6)
            r1 = r8
            r2 = r9
            r7 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A03 = r11
            r8.A00 = r14
            r8.A07 = r15
            r8.A08 = r6
            r8.A01 = r9
            r8.A06 = r7
            r0 = r18
            r8.A0A = r0
            r0 = r19
            r8.A09 = r0
            r8.A04 = r12
            r8.A05 = r13
            r8.A02 = r10
            r0 = r20
            r8.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem.<init>(com.facebookpay.common.models.CurrencyAmount, com.facebookpay.common.models.Distance, X.RH6, com.facebookpay.shippingaddress.model.ShippingAddress, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, boolean):void");
    }
}
