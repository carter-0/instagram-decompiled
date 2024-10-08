package com.instagram.nux.cal.model;

import X.0qQ;
import X.DbT;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;

public final class ContentText implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(61);
    public Boolean A00;
    public Integer A01;
    public List A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        0qQ.A0B(parcel, 0);
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str2 = "PARAGRAPH";
                    break;
                case 2:
                    str2 = "BULLETED_LIST";
                    break;
                default:
                    str2 = "HEADER";
                    break;
            }
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            str = DbT.A12(locale, str2);
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeStringList(this.A02);
        parcel.writeValue(this.A00);
    }
}
