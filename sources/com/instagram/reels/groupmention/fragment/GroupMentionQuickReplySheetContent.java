package com.instagram.reels.groupmention.fragment;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class GroupMentionQuickReplySheetContent extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(96);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public GroupMentionQuickReplySheetContent(ImageUrl imageUrl, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, imageUrl);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = imageUrl;
    }
}
