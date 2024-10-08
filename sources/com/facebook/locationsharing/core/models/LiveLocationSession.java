package com.facebook.locationsharing.core.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C11367SPk;
import X.C273654mx;
import X.C51971G9r;
import X.C66584MXp;
import X.Pxg;
import X.Pxh;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class LiveLocationSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(27);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public LiveLocationSession(String str, String str2, String str3, String str4, long j, long j2, boolean z) {
        this.A00 = j;
        C11367SPk.A03(str, "groupishId");
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z;
        C11367SPk.A03(str3, "sessionId");
        this.A04 = str3;
        this.A01 = j2;
        C11367SPk.A03(str4, C273654mx.A00(421));
        this.A05 = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveLocationSession) {
                LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
                if (this.A00 != liveLocationSession.A00 || !0qQ.A0K(this.A02, liveLocationSession.A02) || !0qQ.A0K(this.A03, liveLocationSession.A03) || this.A06 != liveLocationSession.A06 || !0qQ.A0K(this.A04, liveLocationSession.A04) || this.A01 != liveLocationSession.A01 || !0qQ.A0K(this.A05, liveLocationSession.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (Pxh.A06(this.A01, ((C11367SPk.A00(((((((int) (j ^ (j >>> 32))) + 31) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03), this.A06) * 31) + C51971G9r.A0E(this.A04)) * 31) * 31) + C51971G9r.A0E(this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        String str = this.A03;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
    }

    public LiveLocationSession(Parcel parcel) {
        String readString;
        Pxh.A1H(this);
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A03 = readString;
        this.A06 = Pxg.A1U(parcel);
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A05 = parcel.readString();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LiveLocationSession{expirationTimeMillis=");
        A1A.append(this.A00);
        A1A.append(", groupishId=");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(450));
        A1A.append(this.A03);
        A1A.append(", optimisticSessionId=");
        A1A.append(this.A06);
        A1A.append(", sessionId=");
        A1A.append(this.A04);
        A1A.append(", startTimeMillis=");
        A1A.append(this.A01);
        A1A.append(", userAliasId=");
        return C66584MXp.A0a(this.A05, A1A);
    }
}
