package com.instagram.pendingmedia.model;

import X.0qQ;
import X.DbY;
import X.LVO;
import android.os.Parcel;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class GroupUserStoryTarget implements UserStoryTarget {
    public static final LVO CREATOR = LVO.A00(76);
    public DirectThreadKey A00;
    public String A01 = null;
    public String A02 = "GROUP";
    public List A03 = null;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            GroupUserStoryTarget groupUserStoryTarget = (GroupUserStoryTarget) obj;
            if (!0qQ.A0K(this.A02, groupUserStoryTarget.A02) || !0qQ.A0K(Collections.unmodifiableList(this.A03), Collections.unmodifiableList(groupUserStoryTarget.A03)) || !0qQ.A0K(this.A01, groupUserStoryTarget.A01) || !0qQ.A0K(this.A00, groupUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeTypedList(Collections.unmodifiableList(this.A03));
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final String CAh() {
        return this.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Collections.unmodifiableList(this.A03), this.A01, this.A00});
    }
}
