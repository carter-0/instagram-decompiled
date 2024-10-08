package com.instagram.rtc.statemodel;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.DbS;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class RtcSettingsParticipant extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(17);
    public final int A00;
    public final ImageUrl A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public RtcSettingsParticipant(ImageUrl imageUrl, Long l, String str, String str2, String str3, String str4, List list, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        C51974G9v.A1N(str3, str4, imageUrl);
        0qQ.A0B(list, 8);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = l;
        this.A00 = i;
        this.A06 = str3;
        this.A03 = str4;
        this.A01 = imageUrl;
        this.A07 = list;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = z3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcSettingsParticipant) {
                RtcSettingsParticipant rtcSettingsParticipant = (RtcSettingsParticipant) obj;
                if (!0qQ.A0K(this.A04, rtcSettingsParticipant.A04) || !0qQ.A0K(this.A05, rtcSettingsParticipant.A05) || !0qQ.A0K(this.A02, rtcSettingsParticipant.A02) || this.A00 != rtcSettingsParticipant.A00 || !0qQ.A0K(this.A06, rtcSettingsParticipant.A06) || !0qQ.A0K(this.A03, rtcSettingsParticipant.A03) || !0qQ.A0K(this.A01, rtcSettingsParticipant.A01) || !0qQ.A0K(this.A07, rtcSettingsParticipant.A07) || this.A09 != rtcSettingsParticipant.A09 || this.A0A != rtcSettingsParticipant.A0A || this.A08 != rtcSettingsParticipant.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        AnonymousClass7TG.A15(parcel, this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeStringList(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A06, (((((AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A00) * 31)))))));
    }
}
