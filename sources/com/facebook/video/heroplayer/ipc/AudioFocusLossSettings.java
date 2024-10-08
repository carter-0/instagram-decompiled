package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass4OH;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class AudioFocusLossSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(29);
    public final float A00;
    public final AnonymousClass4OH A01;
    public final AnonymousClass4OH A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFocusLossSettings)) {
            return false;
        }
        AudioFocusLossSettings audioFocusLossSettings = (AudioFocusLossSettings) obj;
        return Float.compare(audioFocusLossSettings.A00, this.A00) == 0 && this.A01 == audioFocusLossSettings.A01 && this.A02 == audioFocusLossSettings.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Float.valueOf(this.A00)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioFocusLossSettings{mAudioFocusLossBehavior=");
        sb.append(this.A01);
        sb.append(", mAudioFocusTransientLossBehavior=");
        sb.append(this.A02);
        sb.append(", mAudioFocusTransientLossDuckVolume=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.name());
        parcel.writeString(this.A02.name());
        parcel.writeFloat(this.A00);
    }

    public AudioFocusLossSettings(Parcel parcel) {
        AnonymousClass4OH valueOf;
        AnonymousClass4OH valueOf2;
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = AnonymousClass4OH.A02;
        } else {
            valueOf = AnonymousClass4OH.valueOf(readString);
        }
        this.A01 = valueOf;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = AnonymousClass4OH.A02;
        } else {
            valueOf2 = AnonymousClass4OH.valueOf(readString2);
        }
        this.A02 = valueOf2;
        this.A00 = parcel.readFloat();
    }

    public AudioFocusLossSettings() {
        this.A01 = AnonymousClass4OH.PAUSE;
        this.A02 = AnonymousClass4OH.A02;
        this.A00 = 0.0f;
    }
}
