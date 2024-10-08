package com.instagram.ui.primer;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.C51974G9v;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class PrimerBottomSheetConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(81);
    public final int A00;
    public final TitleIcon A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public PrimerBottomSheetConfig(TitleIcon titleIcon, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, String str2, String str3, String str4, List list, int i, boolean z, boolean z2, boolean z3) {
        C51974G9v.A0d(1, str, list, str2, str3);
        this.A0A = str;
        this.A01 = titleIcon;
        this.A00 = i;
        this.A0D = list;
        this.A0B = str2;
        this.A0C = str3;
        this.A0F = z;
        this.A0E = z2;
        this.A08 = num;
        this.A0G = z3;
        this.A04 = num2;
        this.A05 = num3;
        this.A03 = num4;
        this.A02 = num5;
        this.A06 = num6;
        this.A07 = num7;
        this.A09 = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        TitleIcon titleIcon = this.A01;
        if (titleIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            titleIcon.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0D);
        while (A1F.hasNext()) {
            ((InfoItem) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        AnonymousClass7TG.A16(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A0G ? 1 : 0);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A06, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
        parcel.writeString(this.A09);
    }
}
