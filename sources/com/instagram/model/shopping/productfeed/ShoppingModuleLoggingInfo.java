package com.instagram.model.shopping.productfeed;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C62570Ki1;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShoppingModuleLoggingInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(21);
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public C62570Ki1 A03 = null;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingModuleLoggingInfo) {
                ShoppingModuleLoggingInfo shoppingModuleLoggingInfo = (ShoppingModuleLoggingInfo) obj;
                if (!(0qQ.A0K(this.A04, shoppingModuleLoggingInfo.A04) && 0qQ.A0K(this.A05, shoppingModuleLoggingInfo.A05) && this.A00 == shoppingModuleLoggingInfo.A00 && 0qQ.A0K(this.A06, shoppingModuleLoggingInfo.A06) && this.A03 == shoppingModuleLoggingInfo.A03 && this.A02 == shoppingModuleLoggingInfo.A02 && this.A01 == shoppingModuleLoggingInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        C62570Ki1 ki1 = this.A03;
        if (ki1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, ki1);
        }
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A04)));
        int A013 = AnonymousClass7TF.A01(this.A02, (AnonymousClass7TF.A08(this.A06, A012) + AnonymousClass7TG.A0C(this.A03)) * 31);
        long j = this.A01;
        return A013 + ((int) (j ^ (j >>> 32)));
    }
}
