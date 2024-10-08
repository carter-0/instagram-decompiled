package com.instagram.creation.genai.attribution.bottomsheet;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class CreationGenAIAttributionBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(38);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public CreationGenAIAttributionBottomSheetParams(String str, Integer num, String str2) {
        0qQ.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
        this.A02 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        switch (this.A00.intValue()) {
            case 1:
                str = "IMAGINE";
                break;
            case 2:
                str = "AI_CONTEXTUAL_BACKGROUND";
                break;
            case 3:
                str = "MEMU_IN_FEED";
                break;
            default:
                str = "IMAGINE_ME";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
