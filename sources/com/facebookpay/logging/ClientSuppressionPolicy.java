package com.facebookpay.logging;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C21263XRi;
import X.C8933RGb;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class ClientSuppressionPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(3);
    public final C8933RGb A00;
    public final C21263XRi A01;
    public final String A02;

    public ClientSuppressionPolicy(C8933RGb rGb, C21263XRi xRi, String str) {
        0qQ.A0B(rGb, 3);
        this.A02 = str;
        this.A01 = xRi;
        this.A00 = rGb;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientSuppressionPolicy) {
                ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) obj;
                if (!(0qQ.A0K(this.A02, clientSuppressionPolicy.A02) && this.A01 == clientSuppressionPolicy.A01 && this.A00 == clientSuppressionPolicy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        C21263XRi xRi = this.A01;
        if (xRi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, xRi);
        }
        AnonymousClass7TE.A1T(parcel, this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, ((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClientSuppressionPolicy(eventName=");
        A1A.append(this.A02);
        A1A.append(", payloadField=");
        A1A.append(this.A01);
        A1A.append(", suppressionMode=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
