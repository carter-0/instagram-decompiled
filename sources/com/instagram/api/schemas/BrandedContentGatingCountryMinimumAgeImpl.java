package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.CV5;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class BrandedContentGatingCountryMinimumAgeImpl extends AnonymousClass0T0 implements Parcelable, BrandedContentGatingCountryMinimumAge {
    public static final Parcelable.Creator CREATOR = new SWT(69);
    public final Integer A00;
    public final String A01;

    public final BrandedContentGatingCountryMinimumAgeImpl F0w() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrandedContentGatingCountryMinimumAgeImpl) {
                BrandedContentGatingCountryMinimumAgeImpl brandedContentGatingCountryMinimumAgeImpl = (BrandedContentGatingCountryMinimumAgeImpl) obj;
                if (!0qQ.A0K(this.A01, brandedContentGatingCountryMinimumAgeImpl.A01) || !0qQ.A0K(this.A00, brandedContentGatingCountryMinimumAgeImpl.A00)) {
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
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final String Arl() {
        return this.A01;
    }

    public final Integer BTM() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTBrandedContentGatingCountryMinimumAge", CV5.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BrandedContentGatingCountryMinimumAgeImpl(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
