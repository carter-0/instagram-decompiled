package com.instagram.pendingmedia.model;

import X.0qQ;
import X.DbX;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.Arrays;

public final class BrandedContentTag implements Parcelable {
    public static final LVO CREATOR = LVO.A00(73);
    public User A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public BrandedContentTag(BrandedContentTag brandedContentTag) {
        0qQ.A0B(brandedContentTag, 1);
        this.A02 = "";
        this.A01 = brandedContentTag.A01;
        this.A02 = brandedContentTag.A02;
        this.A04 = brandedContentTag.A04;
        this.A03 = brandedContentTag.A03;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedContentTag)) {
            return false;
        }
        BrandedContentTag brandedContentTag = (BrandedContentTag) obj;
        return 0qQ.A0K(this.A01, brandedContentTag.A01) && 0qQ.A0K(this.A02, brandedContentTag.A02) && this.A04 == brandedContentTag.A04 && this.A03 == brandedContentTag.A03;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(String.valueOf(this.A04));
        parcel.writeString(String.valueOf(this.A03));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Boolean.valueOf(this.A04), Boolean.valueOf(this.A03)});
    }

    public BrandedContentTag(User user, boolean z, boolean z2) {
        String str = "";
        this.A02 = str;
        this.A01 = DbX.A0r(user);
        this.A02 = user != null ? user.getUsername() : str;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = user;
    }

    public BrandedContentTag(User user) {
        this.A02 = "";
        this.A01 = user.getId();
        this.A02 = user.getUsername();
        this.A00 = user;
    }

    public BrandedContentTag() {
        this.A02 = "";
    }
}
