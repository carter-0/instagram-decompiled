package com.instagram.reels.channelchallenge.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class ChannelChallengeStickerWinnerModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(93);
    public final ImageUrl A00;
    public final User A01;
    public final String A02;

    public ChannelChallengeStickerWinnerModel(ImageUrl imageUrl, User user, String str) {
        0qQ.A0B(imageUrl, 2);
        this.A01 = user;
        this.A00 = imageUrl;
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
