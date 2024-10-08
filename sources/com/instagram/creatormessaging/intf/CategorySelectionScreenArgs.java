package com.instagram.creatormessaging.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.FanClubCategoryType;

public final class CategorySelectionScreenArgs extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(55);
    public final FanClubCategoryType A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CategorySelectionScreenArgs) {
                CategorySelectionScreenArgs categorySelectionScreenArgs = (CategorySelectionScreenArgs) obj;
                if (this.A00 != categorySelectionScreenArgs.A00 || !0qQ.A0K(this.A01, categorySelectionScreenArgs.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public CategorySelectionScreenArgs(FanClubCategoryType fanClubCategoryType, String str) {
        AnonymousClass7TG.A1O(fanClubCategoryType, str);
        this.A00 = fanClubCategoryType;
        this.A01 = str;
    }
}
