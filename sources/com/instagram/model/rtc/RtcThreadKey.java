package com.instagram.model.rtc;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51975G9x;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectThreadKey;

public final class RtcThreadKey extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(76);
    public final DirectThreadKey A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public RtcThreadKey(DirectThreadKey directThreadKey, String str, String str2, String str3) {
        0qQ.A0B(directThreadKey, 1);
        this.A00 = directThreadKey;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        String str4 = directThreadKey.A00;
        if (str4 != null) {
            this.A02 = str4;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcThreadKey) {
                RtcThreadKey rtcThreadKey = (RtcThreadKey) obj;
                if (!0qQ.A0K(this.A00, rtcThreadKey.A00) || !0qQ.A0K(this.A04, rtcThreadKey.A04) || !0qQ.A0K(this.A01, rtcThreadKey.A01) || !0qQ.A0K(this.A03, rtcThreadKey.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A03);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcThreadKey(key=");
        A1A.append(this.A00);
        A1A.append(", openThreadId=");
        A1A.append(this.A04);
        A1A.append(", armadilloThreadId=");
        A1A.append(this.A01);
        A1A.append(", occamadilloThreadId=");
        return C51975G9x.A0i(this.A03, A1A);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RtcThreadKey(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r1 = this;
            r0 = 1
            X.0qQ.A0B(r2, r0)
            com.instagram.model.direct.DirectThreadKey r0 = X.C66581MXm.A0e(r2)
            if (r3 == 0) goto L_0x000c
            r0.A01 = r3
        L_0x000c:
            r1.<init>(r0, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.rtc.RtcThreadKey.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
