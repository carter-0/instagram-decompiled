package com.instagram.model.shopping.productcheckoutproperties;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44921CnE;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfo;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo;
import com.instagram.model.payments.ImmutablePandoDeliveryWindowInfo;

public final class ImmutablePandoShippingAndReturnsMetadata extends 17P implements ShippingAndReturnsMetadataIntf {
    public static final C3035269k CREATOR = CTA.A00(50);

    public final DeliveryWindowInfo B2B() {
        return (DeliveryWindowInfo) A05(-790167400, ImmutablePandoDeliveryWindowInfo.class);
    }

    public final CurrencyAmountInfo Bo7() {
        return (CurrencyAmountInfo) A05(-1486755460, ImmutablePandoCurrencyAmountInfo.class);
    }

    public final CurrencyAmountInfo Btg() {
        return (CurrencyAmountInfo) A05(542894014, ImmutablePandoCurrencyAmountInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoShippingAndReturnsMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44921CnE.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoShippingAndReturnsMetadata] */
    public final Integer Bo9() {
        return getOptionalIntValueByHashCode(275589419);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoShippingAndReturnsMetadata] */
    public final Boolean CTd() {
        return getOptionalBooleanValueByHashCode(444038053);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoShippingAndReturnsMetadata] */
    public final ShippingAndReturnsMetadata FFZ() {
        DeliveryWindowInfoImpl deliveryWindowInfoImpl;
        CurrencyAmountInfoImpl currencyAmountInfoImpl;
        DeliveryWindowInfo B2B = B2B();
        CurrencyAmountInfoImpl currencyAmountInfoImpl2 = null;
        if (B2B != null) {
            deliveryWindowInfoImpl = B2B.FEf();
        } else {
            deliveryWindowInfoImpl = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(444038053);
        CurrencyAmountInfo Bo7 = Bo7();
        if (Bo7 != null) {
            currencyAmountInfoImpl = Bo7.FEe();
        } else {
            currencyAmountInfoImpl = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(275589419);
        CurrencyAmountInfo Btg = Btg();
        if (Btg != null) {
            currencyAmountInfoImpl2 = Btg.FEe();
        }
        return new ShippingAndReturnsMetadata(currencyAmountInfoImpl, currencyAmountInfoImpl2, deliveryWindowInfoImpl, optionalBooleanValueByHashCode, optionalIntValueByHashCode, A0i(436065880));
    }

    public final String getShippingCostStripped() {
        return A0i(436065880);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoShippingAndReturnsMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
