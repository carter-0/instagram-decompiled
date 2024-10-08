package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CW0;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ColorAtTextRangeDict extends AnonymousClass0T0 implements Parcelable, ColorAtTextRangeDictIntf {
    public static final Parcelable.Creator CREATOR = DE7.A00(15);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final ColorAtTextRangeDict F1t() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ColorAtTextRangeDict) {
                ColorAtTextRangeDict colorAtTextRangeDict = (ColorAtTextRangeDict) obj;
                if (!0qQ.A0K(this.A02, colorAtTextRangeDict.A02) || !0qQ.A0K(this.A03, colorAtTextRangeDict.A03) || !0qQ.A0K(this.A00, colorAtTextRangeDict.A00) || !0qQ.A0K(this.A01, colorAtTextRangeDict.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
    }

    public final String BD2() {
        return this.A02;
    }

    public final String BD3() {
        return this.A03;
    }

    public final Integer BMP() {
        return this.A00;
    }

    public final Integer BXp() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTColorAtTextRangeDict", CW0.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public ColorAtTextRangeDict(Integer num, Integer num2, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = num;
        this.A01 = num2;
    }
}
