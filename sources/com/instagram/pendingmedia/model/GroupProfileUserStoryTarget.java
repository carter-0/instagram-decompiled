package com.instagram.pendingmedia.model;

import X.0qQ;
import X.DbY;
import X.LVO;
import android.os.Parcel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Arrays;

public final class GroupProfileUserStoryTarget implements UserStoryTarget {
    public static final LVO CREATOR = LVO.A00(75);
    public PendingRecipient A00 = null;
    public String A01 = "GROUP_PROFILE";

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            GroupProfileUserStoryTarget groupProfileUserStoryTarget = (GroupProfileUserStoryTarget) obj;
            if (!0qQ.A0K(this.A01, groupProfileUserStoryTarget.A01) || !0qQ.A0K(this.A00, groupProfileUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        PendingRecipient pendingRecipient = this.A00;
        if (pendingRecipient != null) {
            pendingRecipient.writeToParcel(parcel, i);
        }
    }

    public final String CAh() {
        return this.A01;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
