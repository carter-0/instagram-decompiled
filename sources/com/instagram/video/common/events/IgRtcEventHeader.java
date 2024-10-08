package com.instagram.video.common.events;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class IgRtcEventHeader extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(97);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Long A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgRtcEventHeader) {
                IgRtcEventHeader igRtcEventHeader = (IgRtcEventHeader) obj;
                if (!0qQ.A0K(this.A06, igRtcEventHeader.A06) || !0qQ.A0K(this.A04, igRtcEventHeader.A04) || !0qQ.A0K(this.A07, igRtcEventHeader.A07) || !0qQ.A0K(this.A01, igRtcEventHeader.A01) || !0qQ.A0K(this.A05, igRtcEventHeader.A05) || !0qQ.A0K(this.A03, igRtcEventHeader.A03) || !0qQ.A0K(this.A00, igRtcEventHeader.A00) || !0qQ.A0K(this.A02, igRtcEventHeader.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C41848B3p.A1K(parcel, this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0C(this.A06) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public IgRtcEventHeader(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4) {
        this.A06 = l;
        this.A04 = str;
        this.A07 = str2;
        this.A01 = num;
        this.A05 = str3;
        this.A03 = str4;
        this.A00 = num2;
        this.A02 = num3;
    }
}
