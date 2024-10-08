package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum INLINE_SURVEY_QUESTION_TYPES implements Parcelable {
    UNRECOGNIZED("INLINE_SURVEY_QUESTION_TYPES_unspecified"),
    COMMENT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT),
    MULTIPLE("multiple"),
    SINGLE("single");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        INLINE_SURVEY_QUESTION_TYPES[] inline_survey_question_typesArr;
        A02 = 0oU.A00(inline_survey_question_typesArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types : values()) {
            linkedHashMap.put(inline_survey_question_types.A00, inline_survey_question_types);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(33);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    INLINE_SURVEY_QUESTION_TYPES(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
