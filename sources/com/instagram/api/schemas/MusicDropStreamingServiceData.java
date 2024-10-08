package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;

public final class MusicDropStreamingServiceData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = FK5.A00(86);
    public final MusicDropStreamingServiceEnum A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicDropStreamingServiceData) {
                MusicDropStreamingServiceData musicDropStreamingServiceData = (MusicDropStreamingServiceData) obj;
                if (!0qQ.A0K(this.A01, musicDropStreamingServiceData.A01) || this.A00 != musicDropStreamingServiceData.A00 || !0qQ.A0K(this.A02, musicDropStreamingServiceData.A02)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public MusicDropStreamingServiceData(MusicDropStreamingServiceEnum musicDropStreamingServiceEnum, String str, String str2) {
        AnonymousClass7TG.A1U(str, musicDropStreamingServiceEnum, str2);
        this.A01 = str;
        this.A00 = musicDropStreamingServiceEnum;
        this.A02 = str2;
    }
}
