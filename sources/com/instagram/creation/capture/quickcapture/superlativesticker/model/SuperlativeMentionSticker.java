package com.instagram.creation.capture.quickcapture.superlativesticker.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.LVP;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public final class SuperlativeMentionSticker implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(34);
    public final float A00;
    public final float A01;
    public final int A02;
    public final Rect A03;
    public final User A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A02);
    }

    public SuperlativeMentionSticker(Rect rect, User user, float f, float f2, int i) {
        AnonymousClass7TG.A1O(user, rect);
        this.A04 = user;
        this.A03 = rect;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }
}
