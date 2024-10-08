package com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.C51974G9v;
import X.C51975G9x;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class NudityReceiverEducationSafetyTipsViewModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(19);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NudityReceiverEducationSafetyTipsViewModel) {
                NudityReceiverEducationSafetyTipsViewModel nudityReceiverEducationSafetyTipsViewModel = (NudityReceiverEducationSafetyTipsViewModel) obj;
                if (this.A00 != nudityReceiverEducationSafetyTipsViewModel.A00 || !0qQ.A0K(this.A01, nudityReceiverEducationSafetyTipsViewModel.A01) || !0qQ.A0K(this.A02, nudityReceiverEducationSafetyTipsViewModel.A02) || !0qQ.A0K(this.A03, nudityReceiverEducationSafetyTipsViewModel.A03) || !0qQ.A0K(this.A04, nudityReceiverEducationSafetyTipsViewModel.A04) || !0qQ.A0K(this.A05, nudityReceiverEducationSafetyTipsViewModel.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31)))));
    }

    public NudityReceiverEducationSafetyTipsViewModel(String str, String str2, String str3, String str4, String str5, int i) {
        C51974G9v.A1S(str, str2, str3, str4, str5);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NudityReceiverEducationSafetyTipsViewModel(headlineImageDrawable=");
        A1A.append(this.A00);
        A1A.append(", headlineTitle=");
        A1A.append(this.A01);
        A1A.append(", safetyTipsBullet1=");
        A1A.append(this.A02);
        A1A.append(", safetyTipsBullet2=");
        A1A.append(this.A03);
        A1A.append(", safetyTipsBullet3=");
        A1A.append(this.A04);
        A1A.append(", safetyTipsBullet3Link=");
        return C51975G9x.A0i(this.A05, A1A);
    }
}
