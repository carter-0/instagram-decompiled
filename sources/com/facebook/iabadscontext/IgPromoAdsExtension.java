package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C51975G9x;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class IgPromoAdsExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(5);
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgPromoAdsExtension) {
                IgPromoAdsExtension igPromoAdsExtension = (IgPromoAdsExtension) obj;
                if (!0qQ.A0K(this.A00, igPromoAdsExtension.A00) || !0qQ.A0K(this.A02, igPromoAdsExtension.A02) || this.A03 != igPromoAdsExtension.A03 || !0qQ.A0K(this.A01, igPromoAdsExtension.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            ((IgPromoAdsPromoCode) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TG.A0E(this.A00) * 31)) + C41845B3m.A00(this.A01);
    }

    public IgPromoAdsExtension(List list, boolean z, String str, String str2) {
        this.A00 = str;
        this.A02 = list;
        this.A03 = z;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IgPromoAdsExtension(advertiserName=");
        A1A.append(this.A00);
        A1A.append(", promoCodes=");
        A1A.append(this.A02);
        A1A.append(", isAutofillEnabled=");
        A1A.append(this.A03);
        A1A.append(", footerSubtype=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
