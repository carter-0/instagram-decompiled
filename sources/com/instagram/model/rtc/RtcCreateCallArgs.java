package com.instagram.model.rtc;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C69277Nid;
import X.C69465Nm9;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

public final class RtcCreateCallArgs extends AnonymousClass0T0 implements RtcEnterCallArgs {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(73);
    public final int A00;
    public final C69465Nm9 A01;
    public final C69277Nid A02;
    public final RtcCallAudience A03;
    public final RtcCallFunnelSessionId A04;
    public final RtcCallSource A05;
    public final RtcIgNotification A06;
    public final RtcStartCoWatchPlaybackArguments A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcCreateCallArgs) {
                RtcCreateCallArgs rtcCreateCallArgs = (RtcCreateCallArgs) obj;
                if (this.A02 != rtcCreateCallArgs.A02 || !0qQ.A0K(this.A03, rtcCreateCallArgs.A03) || !0qQ.A0K(this.A05, rtcCreateCallArgs.A05) || this.A0B != rtcCreateCallArgs.A0B || !0qQ.A0K(this.A07, rtcCreateCallArgs.A07) || this.A0A != rtcCreateCallArgs.A0A || this.A09 != rtcCreateCallArgs.A09 || this.A00 != rtcCreateCallArgs.A00 || !0qQ.A0K(this.A06, rtcCreateCallArgs.A06) || !0qQ.A0K(this.A08, rtcCreateCallArgs.A08) || !0qQ.A0K(this.A04, rtcCreateCallArgs.A04) || this.A01 != rtcCreateCallArgs.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A02);
        this.A03.writeToParcel(parcel, i);
        this.A05.writeToParcel(parcel, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A00);
        RtcIgNotification rtcIgNotification = this.A06;
        if (rtcIgNotification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rtcIgNotification.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A04, i);
        C69465Nm9 nm9 = this.A01;
        if (nm9 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        AnonymousClass7TE.A1T(parcel, nm9);
    }

    public final RtcCallAudience AdH() {
        return this.A03;
    }

    public final RtcCallFunnelSessionId AjV() {
        return this.A04;
    }

    public final C69277Nid Azh() {
        return this.A02;
    }

    public final String BWg() {
        return this.A08;
    }

    public final RtcCallSource Bxh() {
        return this.A05;
    }

    public final boolean CGf() {
        return this.A0B;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A02)));
        return ((((((((AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A09(this.A0B, A072) + AnonymousClass7TG.A0C(this.A07)) * 31)) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public RtcCreateCallArgs(C69465Nm9 nm9, C69277Nid nid, RtcCallAudience rtcCallAudience, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallSource rtcCallSource, RtcIgNotification rtcIgNotification, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1U(nid, rtcCallAudience, rtcCallSource);
        this.A02 = nid;
        this.A03 = rtcCallAudience;
        this.A05 = rtcCallSource;
        this.A0B = z;
        this.A07 = rtcStartCoWatchPlaybackArguments;
        this.A0A = z2;
        this.A09 = z3;
        this.A00 = i;
        this.A06 = rtcIgNotification;
        this.A08 = str;
        this.A04 = rtcCallFunnelSessionId;
        this.A01 = nm9;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCreateCallArgs(e2eeCallType=");
        A1A.append(this.A02);
        A1A.append(", audience=");
        A1A.append(this.A03);
        A1A.append(", source=");
        A1A.append(this.A05);
        A1A.append(", withVideo=");
        A1A.append(this.A0B);
        A1A.append(", coWatchArguments=");
        A1A.append(this.A07);
        A1A.append(", startedInShhMode=");
        A1A.append(this.A0A);
        A1A.append(", isRedial=");
        A1A.append(this.A09);
        A1A.append(", notificationId=");
        A1A.append(this.A00);
        A1A.append(", igNotification=");
        A1A.append(this.A06);
        A1A.append(", notificationTag=");
        A1A.append(this.A08);
        A1A.append(", callFunnelSessionId=");
        A1A.append(this.A04);
        A1A.append(", xmaType=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
