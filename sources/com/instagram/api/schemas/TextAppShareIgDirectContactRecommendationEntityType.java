package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TextAppShareIgDirectContactRecommendationEntityType implements Parcelable {
    UNRECOGNIZED("TextAppShareIgDirectContactRecommendationEntityType_unspecified"),
    THREAD("thread");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextAppShareIgDirectContactRecommendationEntityType[] textAppShareIgDirectContactRecommendationEntityTypeArr;
        A02 = 0oU.A00(textAppShareIgDirectContactRecommendationEntityTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (TextAppShareIgDirectContactRecommendationEntityType textAppShareIgDirectContactRecommendationEntityType : values()) {
            A0x.put(textAppShareIgDirectContactRecommendationEntityType.A00, textAppShareIgDirectContactRecommendationEntityType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(30);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextAppShareIgDirectContactRecommendationEntityType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
