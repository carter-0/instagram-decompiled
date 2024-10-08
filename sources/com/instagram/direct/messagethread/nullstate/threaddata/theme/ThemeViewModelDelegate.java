package com.instagram.direct.messagethread.nullstate.threaddata.theme;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51972G9s;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ThemeViewModelDelegate extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(90);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final int[] A0B;
    public final int[] A0C;

    public ThemeViewModelDelegate(String str, String str2, String str3, String str4, String str5, String str6, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(str, 1);
        C51972G9s.A1E(iArr, iArr2);
        this.A09 = str;
        this.A04 = i;
        this.A0A = str2;
        this.A03 = i2;
        this.A01 = i3;
        this.A0C = iArr;
        this.A0B = iArr2;
        this.A02 = i4;
        this.A00 = i5;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThemeViewModelDelegate) {
                ThemeViewModelDelegate themeViewModelDelegate = (ThemeViewModelDelegate) obj;
                if (!0qQ.A0K(this.A09, themeViewModelDelegate.A09) || this.A04 != themeViewModelDelegate.A04 || !0qQ.A0K(this.A0A, themeViewModelDelegate.A0A) || this.A03 != themeViewModelDelegate.A03 || this.A01 != themeViewModelDelegate.A01 || !0qQ.A0K(this.A0C, themeViewModelDelegate.A0C) || !0qQ.A0K(this.A0B, themeViewModelDelegate.A0B) || this.A02 != themeViewModelDelegate.A02 || this.A00 != themeViewModelDelegate.A00 || !0qQ.A0K(this.A08, themeViewModelDelegate.A08) || !0qQ.A0K(this.A06, themeViewModelDelegate.A06) || !0qQ.A0K(this.A07, themeViewModelDelegate.A07) || !0qQ.A0K(this.A05, themeViewModelDelegate.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return ((((((((((((((((((((((AnonymousClass7TE.A0O(this.A09) + this.A04) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + this.A03) * 31) + this.A01) * 31) + Arrays.hashCode(this.A0C)) * 31) + Arrays.hashCode(this.A0B)) * 31) + this.A02) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + C41845B3m.A00(this.A05);
    }
}
