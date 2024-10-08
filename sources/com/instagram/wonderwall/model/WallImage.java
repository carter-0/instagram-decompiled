package com.instagram.wonderwall.model;

import X.0qQ;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public interface WallImage extends Parcelable {

    public final class CircularAvatar implements WallImage {
        public static final Parcelable.Creator CREATOR = new SWU(4);
        public final User A00;
        public final User A01;

        public CircularAvatar(User user, User user2) {
            0qQ.A0B(user, 1);
            this.A01 = user;
            this.A00 = user2;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeParcelable(this.A01, i);
            parcel.writeParcelable(this.A00, i);
        }
    }

    public final class Drawable implements WallImage {
        public static final Parcelable.Creator CREATOR = new SWU(5);
        public final int A00;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(this.A00);
        }

        public Drawable(int i) {
            this.A00 = i;
        }
    }
}
