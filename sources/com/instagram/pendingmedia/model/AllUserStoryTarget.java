package com.instagram.pendingmedia.model;

import X.0qQ;
import X.DbY;
import X.LVO;
import android.os.Parcel;
import java.util.Arrays;
import java.util.List;

public final class AllUserStoryTarget implements UserStoryTarget {
    public static final LVO CREATOR = LVO.A00(72);
    public String A00 = "ALL_WITH_BLACKLIST";
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            AllUserStoryTarget allUserStoryTarget = (AllUserStoryTarget) obj;
            if (this.A01 != allUserStoryTarget.A01 || !0qQ.A0K(this.A00, allUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }

    public final String CAh() {
        return this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }
}
