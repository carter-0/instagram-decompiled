package com.instagram.user.userlist.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;

public final class SocialContextFollowListFragmentConfig extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(95);
    public int A00;
    public User A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final FollowListData A07;
    public final String A08;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SocialContextFollowListFragmentConfig) {
                SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = (SocialContextFollowListFragmentConfig) obj;
                if (!0qQ.A0K(this.A08, socialContextFollowListFragmentConfig.A08) || !0qQ.A0K(this.A07, socialContextFollowListFragmentConfig.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A07, i);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A07, AnonymousClass7TE.A0O(this.A08));
    }

    public SocialContextFollowListFragmentConfig(FollowListData followListData, String str) {
        AnonymousClass7TG.A1O(str, followListData);
        this.A08 = str;
        this.A07 = followListData;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SocialContextFollowListFragmentConfig(displayedProfileUserId=");
        A1A.append(this.A08);
        A1A.append(", followListData=");
        return AnonymousClass7TG.A0n(this.A07, A1A);
    }
}
