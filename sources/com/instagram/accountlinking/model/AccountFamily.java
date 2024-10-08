package com.instagram.accountlinking.model;

import X.AnonymousClass9BP;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.List;

public final class AccountFamily implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(43);
    public AnonymousClass9BP A00;
    public User A01;
    public String A02;
    public List A03;
    public List A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A00);
        parcel.writeTypedList(this.A04);
        parcel.writeTypedList(this.A03);
    }
}
