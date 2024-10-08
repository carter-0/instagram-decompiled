package com.instagram.creation.photo.edit.effectfilter;

import X.002;
import X.09i;
import X.AB4;
import X.AnonymousClass05K;
import X.C353978Kd;
import X.C366508p8;
import X.C376419Hx;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterModelProvider;
import com.instagram.model.filterkit.TextureAsset;
import java.util.Collection;
import java.util.LinkedList;

public class PhotoFilter implements FilterModelProvider {
    public static final Parcelable.Creator CREATOR = new C376419Hx(86);
    public float A00;
    public int A01;
    public int A02;
    public ColorFilter A03;
    public boolean A04 = false;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final ImmutableList A09;
    public final UserSession A0A;
    public final Integer A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final int describeContents() {
        return 0;
    }

    public final void A00(int i) {
        this.A03.A00 = ((float) i) / 100.0f;
    }

    public final /* bridge */ /* synthetic */ FilterModel B5t() {
        return this.A03;
    }

    public final String toString() {
        return 002.A0g("PhotoFilter", " ", this.A0C);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A08);
        parcel.writeTypedList(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(AB4.A01(this.A0B));
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeString(this.A0A.A05);
    }

    public PhotoFilter(Parcel parcel) {
        boolean z = false;
        Parcelable readParcelable = parcel.readParcelable(ColorFilter.class.getClassLoader());
        readParcelable.getClass();
        this.A03 = (ColorFilter) readParcelable;
        this.A08 = parcel.readInt();
        LinkedList linkedList = new LinkedList();
        parcel.readTypedList(linkedList, TextureAsset.CREATOR);
        this.A09 = ImmutableList.copyOf((Collection) linkedList);
        this.A0C = parcel.readString();
        this.A0D = parcel.readInt() == 1;
        this.A01 = parcel.readInt();
        this.A06 = this.A06;
        this.A02 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A06 = parcel.readInt() == 1;
        this.A04 = parcel.readInt() == 1;
        this.A07 = parcel.readInt() == 1;
        String readString = parcel.readString();
        readString.getClass();
        this.A0B = AB4.A00(readString);
        this.A0F = parcel.readInt() == 1;
        this.A0G = parcel.readInt() == 1;
        this.A05 = parcel.readInt() == 1;
        this.A0E = parcel.readByte() == 1 ? true : z;
        String readString2 = parcel.readString();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", readString2);
        this.A0A = 09i.A0A.A06(bundle);
    }

    public PhotoFilter(UserSession userSession, C353978Kd r8, Integer num) {
        boolean z = false;
        this.A0A = userSession;
        int i = r8.A00;
        this.A08 = i;
        ColorFilter colorFilter = new ColorFilter(C366508p8.A01(i));
        this.A03 = colorFilter;
        if (i >= 1000) {
            colorFilter.A00 = 0.5f;
        }
        this.A09 = ImmutableList.copyOf((Collection) r8.A06);
        this.A0C = r8.A05;
        this.A0D = r8.A07;
        this.A06 = false;
        this.A0B = num;
        this.A0F = false;
        this.A0G = true;
        this.A0E = false;
        this.A05 = num != AnonymousClass05K.A01 ? true : z;
    }
}
