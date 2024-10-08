package com.instagram.model.payments;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C71269Ogb;
import X.CmI;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CurrencyAmountInfoImpl extends AnonymousClass0T0 implements Parcelable, CurrencyAmountInfo {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(60);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final CurrencyAmountInfoImpl FEe() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CurrencyAmountInfoImpl) {
                CurrencyAmountInfoImpl currencyAmountInfoImpl = (CurrencyAmountInfoImpl) obj;
                if (!0qQ.A0K(this.A01, currencyAmountInfoImpl.A01) || !0qQ.A0K(this.A02, currencyAmountInfoImpl.A02) || !0qQ.A0K(this.A03, currencyAmountInfoImpl.A03) || !0qQ.A0K(this.A00, currencyAmountInfoImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final Integer BXp() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCurrencyAmountDict", CmI.A00(this));
    }

    public final String getAmount() {
        return this.A01;
    }

    public final String getAmountWithOffset() {
        return this.A02;
    }

    public final String getCurrency() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public CurrencyAmountInfoImpl(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = num;
    }
}
