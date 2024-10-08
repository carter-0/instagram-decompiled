package com.facebook.smartcapture.camera;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.C51974G9v;
import X.C51975G9x;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class DialogTexts implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWZ(49);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public DialogTexts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        0qQ.A0B(str, 1);
        C51974G9v.A1S(str2, str3, str4, str5, str6);
        AnonymousClass7TF.A1F(str7, 7, str8);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A05 = str7;
        this.A04 = str8;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DialogTexts) {
                DialogTexts dialogTexts = (DialogTexts) obj;
                if (!0qQ.A0K(this.A03, dialogTexts.A03) || !0qQ.A0K(this.A02, dialogTexts.A02) || !0qQ.A0K(this.A01, dialogTexts.A01) || !0qQ.A0K(this.A00, dialogTexts.A00) || !0qQ.A0K(this.A07, dialogTexts.A07) || !0qQ.A0K(this.A06, dialogTexts.A06) || !0qQ.A0K(this.A05, dialogTexts.A05) || !0qQ.A0K(this.A04, dialogTexts.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03))))))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DialogTexts(rationaleTitle=");
        sb.append(this.A03);
        sb.append(", rationaleText=");
        sb.append(this.A02);
        sb.append(", rationaleOk=");
        sb.append(this.A01);
        sb.append(", rationaleCancel=");
        sb.append(this.A00);
        sb.append(", toSettingsTitle=");
        sb.append(this.A07);
        sb.append(", toSettingsText=");
        sb.append(this.A06);
        sb.append(", toSettingsOk=");
        sb.append(this.A05);
        sb.append(", toSettingsCancel=");
        return C51975G9x.A0i(this.A04, sb);
    }

    public DialogTexts() {
        this("", "", "", "", "", "", "", "");
    }
}
