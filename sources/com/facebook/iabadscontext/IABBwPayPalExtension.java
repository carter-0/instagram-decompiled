package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51975G9x;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class IABBwPayPalExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(0);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public IABBwPayPalExtension(String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(str, 3);
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A00 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABBwPayPalExtension) {
                IABBwPayPalExtension iABBwPayPalExtension = (IABBwPayPalExtension) obj;
                if (this.A02 != iABBwPayPalExtension.A02 || this.A03 != iABBwPayPalExtension.A03 || !0qQ.A0K(this.A01, iABBwPayPalExtension.A01) || !0qQ.A0K(this.A00, iABBwPayPalExtension.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A03, i * 31)) + AnonymousClass7TG.A0E(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IABBwPayPalExtension(acceleratePayPalLogin=");
        A1A.append(this.A02);
        A1A.append(", enableCta=");
        A1A.append(this.A03);
        A1A.append(", testVariant=");
        A1A.append(this.A01);
        A1A.append(", signedExternalOfferId=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
