package com.instagram.creation.capture.quickcapture.sundial.tts.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class VoiceOption extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(33);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOption) {
                VoiceOption voiceOption = (VoiceOption) obj;
                if (!0qQ.A0K(this.A00, voiceOption.A00) || !0qQ.A0K(this.A02, voiceOption.A02) || !0qQ.A0K(this.A01, voiceOption.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0E(this.A01);
    }

    public VoiceOption(String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
