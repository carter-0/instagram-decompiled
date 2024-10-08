package com.instagram.business.promote.model;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import java.util.ArrayList;
import java.util.List;

public final class PromoteDataSnapshot implements Parcelable {
    public static final W6D CREATOR = new W6D(39);
    public int A00;
    public int A01;
    public Estimate A02;
    public Estimate A03;
    public XFBCTXWelcomeMessageStatus A04;
    public XIGIGBoostCallToAction A05;
    public XIGIGBoostCallToAction A06;
    public XIGIGBoostDestination A07;
    public AdCreativeAuthorizationCategory A08 = AdCreativeAuthorizationCategory.A04;
    public PromoteReachEstimationStore A09 = new PromoteReachEstimationStore();
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final List A0D = new ArrayList();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A09, i);
        parcel.writeList(this.A0D);
        parcel.writeParcelable(this.A08, i);
    }
}
