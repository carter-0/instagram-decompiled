package com.instagram.model.direct;

import X.0qQ;
import X.C51968G9o;
import X.C69393NkX;
import X.C71269Ogb;
import android.os.Parcel;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

public final class DirectSearchMetaAIResponse implements DirectSearchResult {
    public static final C71269Ogb CREATOR = C71269Ogb.A00(37);
    public C69393NkX A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeTypedList(this.A01);
        parcel.writeString(this.A00.toString());
    }

    public final String AEB() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("| promptListSize: %s | showKeyboardSendKey: %s |", "DirectSearchMetaAIResponse", C51968G9o.A0t(this.A01), this.A00.toString());
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
