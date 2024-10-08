package com.instagram.pendingmedia.model;

import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import java.util.Arrays;

public final class SimpleUserStoryTarget implements UserStoryTarget {
    public static final C376399Hv CREATOR = new C376399Hv(67);
    public String A00 = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String CAh() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((SimpleUserStoryTarget) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}
