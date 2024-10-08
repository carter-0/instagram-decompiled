package com.instagram.fx.igxfb;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class IgxfbNetEgoCTABannerParams extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(62);
    public final String A00;
    public final String A01;
    public final String A02;

    public IgxfbNetEgoCTABannerParams(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgxfbNetEgoCTABannerParams) {
                IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams = (IgxfbNetEgoCTABannerParams) obj;
                if (!0qQ.A0K(this.A00, igxfbNetEgoCTABannerParams.A00) || !0qQ.A0K(this.A01, igxfbNetEgoCTABannerParams.A01) || !0qQ.A0K(this.A02, igxfbNetEgoCTABannerParams.A02)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }
}
