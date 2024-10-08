package com.instagram.brandedcontent.disclosure;

import X.0sn;
import X.FK6;
import X.JTS;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import java.util.HashMap;
import java.util.List;

public final class BrandedContentDisclosureArgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(94);
    public BrandedContentGatingInfoIntf A00 = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
    public BrandedContentProjectMetadataIntf A01;
    public String A02;
    public String A03 = "feed";
    public List A04 = 0sn.A00;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JTS.A0v(parcel);
    }
}
