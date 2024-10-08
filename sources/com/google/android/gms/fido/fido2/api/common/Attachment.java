package com.google.android.gms.fido.fido2.api.common;

import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;

public enum Attachment implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = SWX.A00(56);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    Attachment(String str) {
        this.A00 = str;
    }

    public static Attachment A00(String str) {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.A00)) {
                return attachment;
            }
        }
        throw new Exception(String.format("Attachment %s not supported", new Object[]{str}));
    }
}
