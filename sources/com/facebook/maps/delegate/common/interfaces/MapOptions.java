package com.facebook.maps.delegate.common.interfaces;

import X.C16652Uyo;
import X.C69419Nl1;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.maps.model.CameraPosition;

public class MapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(36);
    public float A00 = 21.0f;
    public float A01 = 2.0f;
    public int A02 = 1;
    public C69419Nl1 A03 = C69419Nl1.BOTTOM_RIGHT;
    public CameraPosition A04;
    public C16652Uyo A05 = C16652Uyo.UNKNOWN;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = true;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String name;
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        C16652Uyo uyo = this.A05;
        if (uyo == null) {
            name = null;
        } else {
            name = uyo.name();
        }
        parcel.writeString(name);
        parcel.writeString(this.A03.toString());
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
