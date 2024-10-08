package com.instagram.discovery.refinement.model;

import X.2Ob;
import X.C16505Uw1;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.keyword.Keyword;
import java.util.Arrays;

public final class RefinementAttributes implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(37);
    public QueryInformation A00;
    public C16505Uw1 A01;
    public Keyword A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RefinementAttributes refinementAttributes = (RefinementAttributes) obj;
            if (!2Ob.A00(this.A04, refinementAttributes.A04) || !2Ob.A00(this.A03, refinementAttributes.A03) || this.A05 != refinementAttributes.A05 || !2Ob.A00(this.A02, refinementAttributes.A02) || !2Ob.A00(this.A01, refinementAttributes.A01)) {
                return false;
            }
        }
        return true;
    }

    public final void A00() {
        C16505Uw1 uw1;
        if (this.A04 != null) {
            uw1 = C16505Uw1.CATEGORY_ID;
        } else if (this.A03 != null) {
            uw1 = C16505Uw1.CATEGORY;
        } else if (this.A05) {
            uw1 = C16505Uw1.ON_SALE;
        } else if (this.A02 != null) {
            uw1 = C16505Uw1.KEYWORD;
        } else {
            return;
        }
        this.A01 = uw1;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, Boolean.valueOf(this.A05), this.A02, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
    }
}
