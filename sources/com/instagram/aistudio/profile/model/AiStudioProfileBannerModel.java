package com.instagram.aistudio.profile.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C41848B3p;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AiStudioProfileBannerModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(16);
    public final List A00;
    public final String A01;

    public AiStudioProfileBannerModel(String str, List list) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiStudioProfileBannerModel) {
                AiStudioProfileBannerModel aiStudioProfileBannerModel = (AiStudioProfileBannerModel) obj;
                if (!0qQ.A0K(this.A01, aiStudioProfileBannerModel.A01) || !0qQ.A0K(this.A00, aiStudioProfileBannerModel.A00)) {
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
        Iterator A1F = C41848B3p.A1F(parcel, this.A00);
        while (A1F.hasNext()) {
            ((AiStudioProfileBannerPersonaModel) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }
}
