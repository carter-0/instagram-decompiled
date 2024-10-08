package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CY2;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GenAIPersonaBannerDictImpl extends AnonymousClass0T0 implements Parcelable, GenAIPersonaBannerDict {
    public static final Parcelable.Creator CREATOR = DE7.A00(81);
    public final GenAIMessagingData A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final GenAIPersonaBannerDictImpl F3M() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIPersonaBannerDictImpl) {
                GenAIPersonaBannerDictImpl genAIPersonaBannerDictImpl = (GenAIPersonaBannerDictImpl) obj;
                if (!0qQ.A0K(this.A00, genAIPersonaBannerDictImpl.A00) || !0qQ.A0K(this.A01, genAIPersonaBannerDictImpl.A01) || !0qQ.A0K(this.A02, genAIPersonaBannerDictImpl.A02) || !0qQ.A0K(this.A03, genAIPersonaBannerDictImpl.A03)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final GenAIMessagingData BFV() {
        return this.A00;
    }

    public final String Bbr() {
        return this.A02;
    }

    public final String Bgy() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGenAIPersonaBannerDict", CY2.A00(this));
    }

    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00))) + AnonymousClass7TG.A0E(this.A03);
    }

    public GenAIPersonaBannerDictImpl(GenAIMessagingData genAIMessagingData, String str, String str2, String str3) {
        AnonymousClass7TG.A1U(genAIMessagingData, str, str2);
        this.A00 = genAIMessagingData;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
