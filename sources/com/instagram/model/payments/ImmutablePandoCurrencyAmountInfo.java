package com.instagram.model.payments;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import X.CmI;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCurrencyAmountInfo extends 17P implements CurrencyAmountInfo {
    public static final C3035269k CREATOR = CTA.A00(36);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo, com.instagram.model.payments.CurrencyAmountInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CmI.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo] */
    public final Integer BXp() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo, X.17P] */
    public final CurrencyAmountInfoImpl FEe() {
        return new CurrencyAmountInfoImpl(getOptionalIntValueByHashCode(-1019779949), A0i(-1413853096), A0i(-565489467), A0i(575402001));
    }

    public final String getAmount() {
        return A0i(-1413853096);
    }

    public final String getAmountWithOffset() {
        return A0i(-565489467);
    }

    public final String getCurrency() {
        return A0i(575402001);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
