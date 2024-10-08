package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.Ca2;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class LoyaltyToplineInfoDictImpl extends AnonymousClass0T0 implements Parcelable, LoyaltyToplineInfoDict {
    public static final Parcelable.Creator CREATOR = new FK5(60);
    public final Boolean A00;
    public final String A01;

    public final LoyaltyToplineInfoDictImpl F5f() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoyaltyToplineInfoDictImpl) {
                LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl = (LoyaltyToplineInfoDictImpl) obj;
                if (!0qQ.A0K(this.A00, loyaltyToplineInfoDictImpl.A00) || !0qQ.A0K(this.A01, loyaltyToplineInfoDictImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A00) ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public final String BOk() {
        return this.A01;
    }

    public final Boolean Cee() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTLoyaltyToplineInfoDict", Ca2.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public LoyaltyToplineInfoDictImpl(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}
