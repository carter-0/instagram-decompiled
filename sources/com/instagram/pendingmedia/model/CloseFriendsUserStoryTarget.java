package com.instagram.pendingmedia.model;

import X.0qQ;
import X.DbY;
import X.LVO;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class CloseFriendsUserStoryTarget implements UserStoryTarget {
    public static final LVO CREATOR = LVO.A00(74);
    public String A00 = "CLOSE_FRIENDS_WITH_BLACKLIST";
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            CloseFriendsUserStoryTarget closeFriendsUserStoryTarget = (CloseFriendsUserStoryTarget) obj;
            if (ImmutableList.copyOf((Collection) this.A01) != ImmutableList.copyOf((Collection) closeFriendsUserStoryTarget.A01) || !0qQ.A0K(this.A00, closeFriendsUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeList(ImmutableList.copyOf((Collection) this.A01));
    }

    public final String CAh() {
        return this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, ImmutableList.copyOf((Collection) this.A01)});
    }
}
