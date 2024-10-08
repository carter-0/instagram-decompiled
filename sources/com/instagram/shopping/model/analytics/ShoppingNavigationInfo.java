package com.instagram.shopping.model.analytics;

import X.0bb;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass327;
import X.AnonymousClass7TG;
import X.C13989Tnp;
import X.C41845B3m;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShoppingNavigationInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(46);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingNavigationInfo) {
                ShoppingNavigationInfo shoppingNavigationInfo = (ShoppingNavigationInfo) obj;
                if (!0qQ.A0K(this.A03, shoppingNavigationInfo.A03) || !0qQ.A0K(this.A00, shoppingNavigationInfo.A00) || !0qQ.A0K(this.A01, shoppingNavigationInfo.A01) || !0qQ.A0K(this.A02, shoppingNavigationInfo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final AnonymousClass327 A00() {
        0bb r2 = new 0bb();
        r2.A06("submodule", this.A03);
        r2.A06("prior_module", this.A00);
        r2.A06("prior_submodule", this.A01);
        C13989Tnp.A1K(r2, "shopping_session_id", this.A02);
        return r2;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public ShoppingNavigationInfo(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public ShoppingNavigationInfo() {
        this((String) null, (String) null, (String) null, (String) null);
    }
}
