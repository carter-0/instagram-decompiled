package com.instagram.creation.capture.opencarousel.configuration;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class OpenCarouselCaptureConfig extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(14);
    public final float A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public OpenCarouselCaptureConfig(String str, String str2, float f, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = f;
        this.A03 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OpenCarouselCaptureConfig) {
                OpenCarouselCaptureConfig openCarouselCaptureConfig = (OpenCarouselCaptureConfig) obj;
                if (!0qQ.A0K(this.A01, openCarouselCaptureConfig.A01) || !0qQ.A0K(this.A02, openCarouselCaptureConfig.A02) || Float.compare(this.A00, openCarouselCaptureConfig.A00) != 0 || this.A03 != openCarouselCaptureConfig.A03) {
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
        parcel.writeString(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public final int hashCode() {
        int A002 = AnonymousClass7TF.A00((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31, this.A00);
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return A002 + i;
    }
}
