package com.instagram.model.shopping;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16594Uxo;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class ShoppingHomeDestination extends AnonymousClass0T0 implements Parcelable {
    public static final C71269Ogb CREATOR = new C71269Ogb(91);
    public C16594Uxo A00;
    public String A01 = null;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;
    public String A05 = null;
    public String A06 = null;
    public List A07 = null;

    public ShoppingHomeDestination() {
        C16594Uxo uxo = C16594Uxo.UNKNOWN;
        0qQ.A0B(uxo, 1);
        this.A00 = uxo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingHomeDestination) {
                ShoppingHomeDestination shoppingHomeDestination = (ShoppingHomeDestination) obj;
                if (this.A00 != shoppingHomeDestination.A00 || !0qQ.A0K(this.A02, shoppingHomeDestination.A02) || !0qQ.A0K(this.A03, shoppingHomeDestination.A03) || !0qQ.A0K(this.A04, shoppingHomeDestination.A04) || !0qQ.A0K(this.A07, shoppingHomeDestination.A07) || !0qQ.A0K(this.A01, shoppingHomeDestination.A01) || !0qQ.A0K(this.A05, shoppingHomeDestination.A05) || !0qQ.A0K(this.A06, shoppingHomeDestination.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        C16594Uxo uxo = this.A00;
        if (uxo != null) {
            str = uxo.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeStringList(this.A07);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return ((((((((((((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }
}
