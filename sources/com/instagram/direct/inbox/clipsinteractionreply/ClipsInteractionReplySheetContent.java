package com.instagram.direct.inbox.clipsinteractionreply;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.typedurl.ImageUrl;

public final class ClipsInteractionReplySheetContent extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(77);
    public final SocialContextType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
    }

    public ClipsInteractionReplySheetContent(SocialContextType socialContextType, ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1U(str, str2, str3);
        AnonymousClass7TF.A1E(socialContextType, 5, str5);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A00 = socialContextType;
        this.A01 = imageUrl;
        this.A06 = str5;
    }
}
