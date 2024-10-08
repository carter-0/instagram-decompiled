package com.instagram.direct.request.response;

import X.0qQ;
import X.AnonymousClass7TG;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(7);
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final boolean A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo(ImageUrl imageUrl, String str, String str2, int i, boolean z, boolean z2) {
        AnonymousClass7TG.A1U(str, str2, imageUrl);
        this.A02 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A05 = z;
        this.A03 = z2;
        this.A00 = i;
    }
}
