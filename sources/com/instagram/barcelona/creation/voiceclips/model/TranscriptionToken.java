package com.instagram.barcelona.creation.voiceclips.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.DbS;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class TranscriptionToken extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(85);
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public TranscriptionToken(String str, int i, int i2, boolean z) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TranscriptionToken) {
                TranscriptionToken transcriptionToken = (TranscriptionToken) obj;
                if (!(0qQ.A0K(this.A02, transcriptionToken.A02) && this.A01 == transcriptionToken.A01 && this.A00 == transcriptionToken.A00 && this.A03 == transcriptionToken.A03)) {
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
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A03, (((AnonymousClass7TE.A0O(this.A02) + this.A01) * 31) + this.A00) * 31);
    }
}
