package com.instagram.aistudio.profile.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class AiStudioProfileBannerPersonaModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(17);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiStudioProfileBannerPersonaModel) {
                AiStudioProfileBannerPersonaModel aiStudioProfileBannerPersonaModel = (AiStudioProfileBannerPersonaModel) obj;
                if (!0qQ.A0K(this.A01, aiStudioProfileBannerPersonaModel.A01) || !0qQ.A0K(this.A02, aiStudioProfileBannerPersonaModel.A02) || !0qQ.A0K(this.A03, aiStudioProfileBannerPersonaModel.A03) || !0qQ.A0K(this.A00, aiStudioProfileBannerPersonaModel.A00) || !0qQ.A0K(this.A04, aiStudioProfileBannerPersonaModel.A04)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)))) + AnonymousClass7TG.A0E(this.A04);
    }

    public AiStudioProfileBannerPersonaModel(String str, String str2, String str3, String str4, String str5) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = str4;
        this.A04 = str5;
    }
}
