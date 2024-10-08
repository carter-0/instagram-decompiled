package com.instagram.ui.text;

import X.0qQ;
import X.ABK;
import X.C353818Jf;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class TextColorScheme implements Parcelable {
    public static final TextColorScheme A08 = new TextColorScheme(new C353818Jf());
    public float A00;
    public int A01;
    public int A02;
    public GradientDrawable.Orientation A03;
    public TextColors A04;
    public Integer A05;
    public String A06;
    public List A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A07);
        parcel.writeFloat(this.A00);
        GradientDrawable.Orientation orientation = this.A03;
        if (orientation != null) {
            parcel.writeString(orientation.name());
        }
        Integer num = this.A05;
        if (num != null) {
            str = ABK.A01(num);
        } else {
            str = null;
        }
        parcel.writeString(str);
        String str2 = this.A06;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
    }

    public final TextColorScheme A00(int... iArr) {
        C353818Jf r3 = new C353818Jf();
        r3.A02 = this.A02;
        r3.A01 = this.A01;
        r3.A02(Arrays.copyOf(iArr, iArr.length));
        r3.A00 = this.A00;
        TextColors textColors = this.A04;
        if (textColors != null) {
            r3.A04 = new TextColors(textColors.A01, textColors.A00);
        }
        GradientDrawable.Orientation orientation = this.A03;
        if (orientation != null) {
            r3.A03 = orientation;
        }
        return new TextColorScheme(r3);
    }

    public final int[] A01() {
        List list = this.A07;
        if (list == null) {
            return new int[0];
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Number) list.get(i)).intValue();
        }
        return iArr;
    }

    public TextColorScheme(C353818Jf r2) {
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A01 = r2.A01;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A06 = r2.A06;
    }

    public TextColorScheme() {
    }
}
