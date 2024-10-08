package com.instagram.newsfeed.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class PillsFilterCategory extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(59);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PillsFilterCategory) {
                PillsFilterCategory pillsFilterCategory = (PillsFilterCategory) obj;
                if (!0qQ.A0K(this.A01, pillsFilterCategory.A01) || !0qQ.A0K(this.A02, pillsFilterCategory.A02) || !0qQ.A0K(this.A00, pillsFilterCategory.A00)) {
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
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)));
    }

    public PillsFilterCategory(String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
