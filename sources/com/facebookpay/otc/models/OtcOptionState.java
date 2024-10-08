package com.facebookpay.otc.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C298525tb;
import X.C41845B3m;
import X.C51971G9r;
import X.C51975G9x;
import X.RED;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

public final class OtcOptionState implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(9);
    public final RED A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final boolean A04;

    public OtcOptionState(RED red, String str, String str2, Map map) {
        AnonymousClass7TG.A0w(1, str, red, str2);
        this.A01 = str;
        this.A03 = map;
        this.A00 = red;
        this.A02 = str2;
        RED red2 = RED.NON_OTC;
        boolean z = true;
        if (red == red2) {
            if (!map.isEmpty()) {
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (true) {
                    if (A0u.hasNext()) {
                        if (C51971G9r.A0p(A0u) != red2) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
        }
        this.A04 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtcOptionState) {
                OtcOptionState otcOptionState = (OtcOptionState) obj;
                if (!0qQ.A0K(this.A01, otcOptionState.A01) || !0qQ.A0K(this.A03, otcOptionState.A03) || this.A00 != otcOptionState.A00 || !0qQ.A0K(this.A02, otcOptionState.A02)) {
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
        Map map = this.A03;
        parcel.writeInt(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            AnonymousClass7TE.A1T(parcel, (C298525tb) A1J.getKey());
            AnonymousClass7TE.A1T(parcel, (RED) A1J.getValue());
        }
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A01))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OtcOptionState(otcSessionId=");
        A1A.append(this.A01);
        A1A.append(", componentOtcStates=");
        A1A.append(this.A03);
        A1A.append(", defaultComponentOtcState=");
        A1A.append(this.A00);
        A1A.append(", otcType=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
