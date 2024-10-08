package com.instagram.model.rtc;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C69277Nid;
import X.C69278Nie;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class RtcJoinCallArgs extends AnonymousClass0T0 implements RtcEnterCallArgs {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(75);
    public final int A00;
    public final C69278Nie A01;
    public final RtcCallKey A02;
    public final RtcIgNotification A03;
    public final String A04;
    public final String A05;
    public final C69277Nid A06;
    public final RtcCallAudience A07;
    public final RtcCallFunnelSessionId A08;
    public final RtcCallSource A09;
    public final boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcJoinCallArgs) {
                RtcJoinCallArgs rtcJoinCallArgs = (RtcJoinCallArgs) obj;
                if (this.A06 != rtcJoinCallArgs.A06 || !0qQ.A0K(this.A07, rtcJoinCallArgs.A07) || !0qQ.A0K(this.A09, rtcJoinCallArgs.A09) || this.A0A != rtcJoinCallArgs.A0A || !0qQ.A0K(this.A02, rtcJoinCallArgs.A02) || !0qQ.A0K(this.A05, rtcJoinCallArgs.A05) || this.A00 != rtcJoinCallArgs.A00 || !0qQ.A0K(this.A03, rtcJoinCallArgs.A03) || !0qQ.A0K(this.A04, rtcJoinCallArgs.A04) || !0qQ.A0K(this.A08, rtcJoinCallArgs.A08) || this.A01 != rtcJoinCallArgs.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A06);
        this.A07.writeToParcel(parcel, i);
        this.A09.writeToParcel(parcel, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        RtcIgNotification rtcIgNotification = this.A03;
        if (rtcIgNotification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rtcIgNotification.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A08, i);
        AnonymousClass7TE.A1T(parcel, this.A01);
    }

    public final RtcCallAudience AdH() {
        return this.A07;
    }

    public final RtcCallFunnelSessionId AjV() {
        return this.A08;
    }

    public final C69277Nid Azh() {
        return this.A06;
    }

    public final String BWg() {
        return this.A04;
    }

    public final RtcCallSource Bxh() {
        return this.A09;
    }

    public final boolean CGf() {
        return this.A0A;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A07, AnonymousClass7TE.A0K(this.A06))));
        return AnonymousClass7TE.A0N(this.A01, (((((((((AnonymousClass7TF.A07(this.A02, A092) + AnonymousClass7TG.A0E(this.A05)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A08)) * 31);
    }

    public RtcJoinCallArgs(C69277Nid nid, C69278Nie nie, RtcCallAudience rtcCallAudience, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallKey rtcCallKey, RtcCallSource rtcCallSource, RtcIgNotification rtcIgNotification, String str, String str2, int i, boolean z) {
        AnonymousClass7TG.A1U(nid, rtcCallAudience, rtcCallSource);
        0qQ.A0B(rtcCallKey, 5);
        0qQ.A0B(nie, 11);
        this.A06 = nid;
        this.A07 = rtcCallAudience;
        this.A09 = rtcCallSource;
        this.A0A = z;
        this.A02 = rtcCallKey;
        this.A05 = str;
        this.A00 = i;
        this.A03 = rtcIgNotification;
        this.A04 = str2;
        this.A08 = rtcCallFunnelSessionId;
        this.A01 = nie;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcJoinCallArgs(e2eeCallType=");
        A1A.append(this.A06);
        A1A.append(", audience=");
        A1A.append(this.A07);
        A1A.append(", source=");
        A1A.append(this.A09);
        A1A.append(", withVideo=");
        A1A.append(this.A0A);
        A1A.append(", callKey=");
        A1A.append(this.A02);
        A1A.append(", recipientUserId=");
        A1A.append(this.A05);
        A1A.append(", notificationId=");
        A1A.append(this.A00);
        A1A.append(", igNotification=");
        A1A.append(this.A03);
        A1A.append(", notificationTag=");
        A1A.append(this.A04);
        A1A.append(", callFunnelSessionId=");
        A1A.append(this.A08);
        A1A.append(", e2eeInfraOnlyExpGroup=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
