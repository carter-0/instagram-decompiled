package com.instagram.discovery.refinement.model;

import X.2Ob;
import X.AnonymousClass7TG;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class Refinement implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(36);
    public RefinementAttributes A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        RefinementAttributes refinementAttributes = this.A00;
        int ordinal = refinementAttributes.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return refinementAttributes.A03;
            }
            if (ordinal == 2) {
                return "on_sale";
            }
            if (ordinal == 3 && !TextUtils.isEmpty(refinementAttributes.A02.A03)) {
                return refinementAttributes.A02.A03;
            }
        }
        return refinementAttributes.A04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Refinement)) {
            return false;
        }
        return 2Ob.A00(this.A00, ((Refinement) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
