package com.instagram.creation.capture.quickcapture.sundial.toast.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass8JL;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class ClipsPreloadedSettingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(32);
    public Boolean A00;
    public String A01;
    public String A02;
    public final AnonymousClass8JL A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A04, i);
        AnonymousClass7TE.A1T(parcel, this.A03);
    }

    public ClipsPreloadedSettingItem(AnonymousClass8JL r2, ImageUrl imageUrl, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, imageUrl);
        0qQ.A0B(r2, 4);
        this.A06 = str;
        this.A05 = str2;
        this.A04 = imageUrl;
        this.A03 = r2;
    }
}
