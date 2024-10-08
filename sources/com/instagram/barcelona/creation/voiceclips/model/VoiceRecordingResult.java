package com.instagram.barcelona.creation.voiceclips.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class VoiceRecordingResult extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = FK6.A00(86);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceRecordingResult) {
                VoiceRecordingResult voiceRecordingResult = (VoiceRecordingResult) obj;
                if (!0qQ.A0K(this.A01, voiceRecordingResult.A01) || !0qQ.A0K(this.A00, voiceRecordingResult.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public VoiceRecordingResult(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
