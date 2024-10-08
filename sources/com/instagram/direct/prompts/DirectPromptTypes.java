package com.instagram.direct.prompts;

import X.0oU;
import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public enum DirectPromptTypes implements Parcelable {
    UNKNOWN(0, "unknown"),
    ADD_YOURS(148, "add_yours"),
    QUESTIONS(150, "questions"),
    SHARED_STACK(153, "shared_stack"),
    ROLL_CALL(154, "roll_call"),
    CHALLENGES(162, "challenges"),
    DAILY_PROMPT(163, "daily_prompt");
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(name());
    }

    /* access modifiers changed from: public */
    static {
        DirectPromptTypes[] directPromptTypesArr;
        A02 = 0oU.A00(directPromptTypesArr);
        CREATOR = new C376399Hv(2);
    }

    /* access modifiers changed from: public */
    DirectPromptTypes(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
