package com.instagram.common.typedurl;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class GifUrlLoggingExtras extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(89);
    public final Long A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GifUrlLoggingExtras) {
                GifUrlLoggingExtras gifUrlLoggingExtras = (GifUrlLoggingExtras) obj;
                if (!0qQ.A0K(this.A00, gifUrlLoggingExtras.A00) || !0qQ.A0K(this.A01, gifUrlLoggingExtras.A01) || !0qQ.A0K(this.A02, gifUrlLoggingExtras.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A15(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public GifUrlLoggingExtras(Long l, String str, String str2) {
        this.A00 = l;
        this.A01 = str;
        this.A02 = str2;
    }
}
