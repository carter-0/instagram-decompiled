package com.instagram.avatar.ui;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public enum UpdateProfilePicturePagerAdapter$UpdateProfileTabType implements Parcelable {
    UPDATE_PROFILE_PICTURE_TAB(0),
    UPDATE_AVATAR_TAB(1);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType[] updateProfilePicturePagerAdapter$UpdateProfileTabTypeArr;
        A01 = 0oU.A00(updateProfilePicturePagerAdapter$UpdateProfileTabTypeArr);
        CREATOR = FK6.A00(83);
    }

    /* access modifiers changed from: public */
    UpdateProfilePicturePagerAdapter$UpdateProfileTabType(int i) {
        this.A00 = i;
    }
}
