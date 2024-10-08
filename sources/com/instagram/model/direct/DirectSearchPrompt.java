package com.instagram.model.direct;

import X.0qQ;
import X.AnonymousClass9VB;
import X.C71269Ogb;
import android.os.Parcel;
import com.facebook.common.stringformat.StringFormatUtil;

public final class DirectSearchPrompt implements DirectSearchResult {
    public static final C71269Ogb CREATOR = C71269Ogb.A00(38);
    public AnonymousClass9VB A00;
    public String A01;
    public String A02;
    public String A03;

    public DirectSearchPrompt(AnonymousClass9VB r2, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        this.A03 = str;
        this.A00 = r2;
        this.A02 = str2;
        this.A01 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final String AEB() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("| promptText: %s | promptType: %s | promptId: %s | promptEmoji: %s |", new Object[]{"DirectSearchPrompt", this.A03, this.A00, this.A02, this.A01});
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
