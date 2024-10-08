package com.instagram.tagging.activity.mediaTaggingInfo;

import X.0qQ;
import X.1iA;
import X.AnonymousClass7TE;
import X.C51972G9s;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.ArrayList;
import java.util.List;

public final class MediaTaggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(71);
    public float A00 = 1.0f;
    public int A01;
    public ImageUrl A02;
    public 1iA A03;
    public ClipInfo A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public ArrayList A09 = AnonymousClass7TE.A1C();
    public ArrayList A0A = AnonymousClass7TE.A1C();
    public ArrayList A0B;
    public ArrayList A0C = AnonymousClass7TE.A1C();
    public ArrayList A0D = AnonymousClass7TE.A1C();
    public ArrayList A0E = AnonymousClass7TE.A1C();
    public List A0F = AnonymousClass7TE.A1C();
    public List A0G = AnonymousClass7TE.A1C();
    public boolean A0H;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A08);
        parcel.writeTypedList(this.A0B);
        parcel.writeTypedList(this.A0A);
        parcel.writeTypedList(this.A0F);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeTypedList(this.A0C);
        parcel.writeTypedList(this.A0D);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeSerializable(this.A03);
        parcel.writeStringList(this.A0G);
        parcel.writeValue(this.A04);
        parcel.writeStringList(this.A0E);
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
    }

    public MediaTaggingInfo(ImageUrl imageUrl, 1iA r4, ClipInfo clipInfo, String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list, List list2, List list3, List list4) {
        ArrayList arrayList5;
        List list5;
        C51972G9s.A1B(str, r4);
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0B = A1C;
        this.A06 = str;
        this.A02 = imageUrl;
        this.A08 = str2;
        this.A03 = r4;
        if (arrayList != null) {
            A1C.addAll(arrayList);
        }
        if (list != null) {
            this.A0F = list;
        }
        if (arrayList2 != null) {
            this.A0C.addAll(arrayList2);
        }
        if (arrayList3 != null) {
            this.A0D.addAll(arrayList3);
        }
        if (!(arrayList4 == null || (list5 = this.A0G) == null)) {
            list5.addAll(arrayList4);
        }
        if (list2 != null) {
            this.A0E.addAll(list2);
        }
        List list6 = list3;
        if (list3 != null) {
            this.A09.addAll(list6);
        }
        List list7 = list4;
        if (!(list4 == null || (arrayList5 = this.A0A) == null)) {
            arrayList5.addAll(list7);
        }
        this.A04 = clipInfo;
        this.A05 = str3;
        this.A07 = str4;
    }
}
