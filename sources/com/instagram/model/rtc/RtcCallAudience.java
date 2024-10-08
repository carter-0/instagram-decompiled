package com.instagram.model.rtc;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.C51974G9v;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

public final class RtcCallAudience extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(70);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;

    public RtcCallAudience(ImageUrl imageUrl, String str, String str2, String str3, List list, List list2, boolean z) {
        0qQ.A0B(list, 1);
        C51974G9v.A0d(3, str, str2, imageUrl, str3);
        0qQ.A0B(list2, 7);
        this.A04 = list;
        this.A06 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
        this.A03 = str3;
        this.A05 = list2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcCallAudience) {
                RtcCallAudience rtcCallAudience = (RtcCallAudience) obj;
                if (!0qQ.A0K(this.A04, rtcCallAudience.A04) || this.A06 != rtcCallAudience.A06 || !0qQ.A0K(this.A01, rtcCallAudience.A01) || !0qQ.A0K(this.A02, rtcCallAudience.A02) || !0qQ.A0K(this.A00, rtcCallAudience.A00) || !0qQ.A0K(this.A03, rtcCallAudience.A03) || !0qQ.A0K(this.A05, rtcCallAudience.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A04);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A05);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A06, AnonymousClass7TE.A0K(this.A04)))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallAudience(avatarUrls=");
        A1A.append(this.A04);
        A1A.append(", isGroup=");
        A1A.append(this.A06);
        A1A.append(", callTarget=");
        A1A.append(this.A01);
        A1A.append(", caller=");
        A1A.append(this.A02);
        A1A.append(", callerAvatarUrl=");
        A1A.append(this.A00);
        A1A.append(", callerUserId=");
        A1A.append(this.A03);
        A1A.append(", callParticipantIds=");
        return AnonymousClass7TG.A0n(this.A05, A1A);
    }
}
