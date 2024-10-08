package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsAudioMuteReasonType implements Parcelable {
    UNRECOGNIZED("ClipsAudioMuteReasonType_unspecified"),
    ORIGINAL_AUDIO_MUTED("original_audio_muted"),
    OUTSIDE_TERRITORY("outside_territory"),
    SONG_NOT_AVAILABLE("song_not_available"),
    LABEL_GO_DARK("label_go_dark");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsAudioMuteReasonType[] clipsAudioMuteReasonTypeArr;
        A02 = 0oU.A00(clipsAudioMuteReasonTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsAudioMuteReasonType clipsAudioMuteReasonType : values()) {
            A0x.put(clipsAudioMuteReasonType.A00, clipsAudioMuteReasonType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(94);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsAudioMuteReasonType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
