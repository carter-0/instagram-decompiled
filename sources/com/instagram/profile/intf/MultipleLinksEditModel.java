package com.instagram.profile.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class MultipleLinksEditModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(90);
    public final Integer A00;
    public final String A01;

    public MultipleLinksEditModel(Integer num, String str) {
        0qQ.A0B(num, 1);
        this.A00 = num;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultipleLinksEditModel) {
                MultipleLinksEditModel multipleLinksEditModel = (MultipleLinksEditModel) obj;
                if (this.A00 != multipleLinksEditModel.A00 || !0qQ.A0K(this.A01, multipleLinksEditModel.A01)) {
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
        if (1 - this.A00.intValue() != 0) {
            str = "CREATE";
        } else {
            str = "EDIT";
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "CREATE";
        } else {
            str = "EDIT";
        }
        return ((str.hashCode() + intValue) * 31) + AnonymousClass7TG.A0E(this.A01);
    }
}
