package com.google.android.gms.safetynet;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(73);
    public long A00 = 0;
    public ParcelFileDescriptor A01 = null;
    public DataHolder A02 = null;
    public String A03 = null;
    public byte[] A04 = null;

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A03);
        C301145yd.A0A(parcel, this.A02, 3, i, false);
        C301145yd.A0A(parcel, this.A01, 4, i, false);
        C301145yd.A08(parcel, 5, this.A00);
        C301145yd.A0F(parcel, this.A04, 6, false);
        C301145yd.A06(parcel, A032);
        this.A01 = null;
    }
}
