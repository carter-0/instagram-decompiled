package com.instagram.discovery.mediamap.model;

import X.0qQ;
import X.1aC;
import X.DbX;
import X.VN9;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.user.model.User;
import java.io.IOException;

public final class LocationPageInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(32);
    public VN9 A00 = null;
    public LocationPageInfoPageOperationHourResponse A01 = null;
    public Integer A02 = null;
    public Integer A03 = null;
    public Integer A04 = null;
    public String A05 = null;
    public String A06 = null;
    public String A07 = null;
    public String A08 = null;
    public String A09 = null;
    public String A0A = null;
    public String A0B = null;
    public boolean A0C = false;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        User user;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A06);
        int i2 = -1;
        parcel.writeInt(DbX.A02(this.A03));
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeInt(DbX.A02(this.A04));
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        VN9 vn9 = this.A00;
        String str = null;
        if (!(vn9 == null || (user = vn9.A00) == null)) {
            try {
                Parcelable.Creator creator = User.CREATOR;
                str = 1aC.A07(user);
            } catch (IOException unused) {
            }
        }
        parcel.writeString(str);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        Integer num = this.A02;
        if (num != null) {
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public final User A00() {
        VN9 vn9 = this.A00;
        if (vn9 != null) {
            return vn9.A00;
        }
        return null;
    }
}
