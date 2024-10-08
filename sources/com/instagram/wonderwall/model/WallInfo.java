package com.instagram.wonderwall.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public final class WallInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(6);
    public final User A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallInfo) {
                WallInfo wallInfo = (WallInfo) obj;
                if (!0qQ.A0K(this.A01, wallInfo.A01) || !0qQ.A0K(this.A04, wallInfo.A04) || !0qQ.A0K(this.A00, wallInfo.A00) || this.A03 != wallInfo.A03 || this.A02 != wallInfo.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A01)))));
    }

    public WallInfo(User user, String str, String str2, boolean z, boolean z2) {
        AnonymousClass7TG.A1U(str, str2, user);
        this.A01 = str;
        this.A04 = str2;
        this.A00 = user;
        this.A03 = z;
        this.A02 = z2;
    }
}
