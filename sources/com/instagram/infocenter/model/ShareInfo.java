package com.instagram.infocenter.model;

import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.VEB;
import X.VED;
import X.W6E;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

public final class ShareInfo implements InfoCenterShareInfoIntf {
    public static final Parcelable.Creator CREATOR = new W6E(79);
    public ImageUrl A00;
    public ExtendedImageUrl A01;
    public ExtendedImageUrl A02;
    public ExtendedImageUrl A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final int[] Alf() {
        List list = this.A0C;
        if (list == null) {
            return null;
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = Color.parseColor(AnonymousClass7TE.A19(list, i));
        }
        return iArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(VED.A00(this.A05));
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeStringList(this.A0B);
        parcel.writeStringList(this.A0C);
        parcel.writeString(VEB.A00(this.A04));
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    public ShareInfo() {
        Integer num = AnonymousClass05K.A00;
        this.A05 = num;
        this.A04 = num;
    }
}
